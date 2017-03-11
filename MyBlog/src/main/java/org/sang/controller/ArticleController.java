package org.sang.controller;

import org.sang.entity.Article;
import org.sang.entity.Category;
import org.sang.entity.User;
import org.sang.service.ArticleService;
import org.sang.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tautua.markdownpapers.Markdown;
import org.tautua.markdownpapers.parser.ParseException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

/**
 * Created by sang on 17-3-8.
 */
@Controller
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Article> articles = articleService.getFirst10Article();
        for (Article article : articles) {
            System.out.println(article.getCategory());
        }
        model.addAttribute("articles", articles);
        return "views/index";
    }

    @RequestMapping("/column/{displayName}/{category}")
    public String column(@PathVariable("category") String category,Model model,@PathVariable("displayName") String displayName) {
        model.addAttribute("articles", articleService.getArticlesByCategoryName(category));
        model.addAttribute("displayName", displayName);
        return "views/columnPage";
    }

    @RequestMapping("/detail/{id}/{category}")
    public String detail(@PathVariable("id") Long id, Model model) {
        Article article = articleService.getArticleById(id);
        System.out.println(article.getContent());
        Markdown markdown = new Markdown();
        try {
            StringWriter out = new StringWriter();
            markdown.transform(new StringReader(article.getContent()), out);
            out.flush();
            article.setContent(out.toString());
            System.out.println("------------------");
            System.out.println(article.getContent());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        model.addAttribute("article", article);
        return "views/detail";
    }

    @RequestMapping("/sang")
    public String admin(Model model) {
        model.addAttribute("articles", articleService.getFirst10Article());
        return "admin/index";
    }

    @RequestMapping("/sang/login")
    public String login() {
        return "admin/login";
    }

    @RequestMapping(value = "/sang/dologin", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, User user, Model model) {
        System.out.println("user.getUsername():" + user.getUsername() + ";user.getPassword():" + user.getPassword());
        if (userService.login(user.getUsername(), user.getPassword())) {
            request.getSession().setAttribute("user", user);
            model.addAttribute("user", user);
            return "redirect:/sang";
        } else {
            model.addAttribute("error", "用户名或密码错误");
            return "admin/login";
        }
    }

//    private String returnAdminIndex(Model model) {
//        model.addAttribute("articles", articleService.getFirst10Article());
//        return "redirect:/sang";
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/sang/dologin")
    public String doLogin(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute("user") == null) {
            return "admin/login";
        }
        return "redirect:/sang";
    }

    @RequestMapping("/sang/write")
    public String write(Model model) {
        List<Category> categories = articleService.getCategories();
        categories.remove(0);
        model.addAttribute("categories", categories);
        return "admin/write";
    }

    @RequestMapping(value = "/sang/write", method = RequestMethod.POST)
    public String write(Article article) {
        if (article.getId() == 0l) {
            articleService.writeBlog(article);
        } else {
            articleService.updateBlog(article);
        }
        return "redirect:/sang";
    }

    @RequestMapping("/sang/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        articleService.deleteArticleById(id);
        return "redirect:/sang";
    }

    @RequestMapping("/sang/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        Article article = articleService.getArticleById(id);
        model.addAttribute("article", article);
        return "admin/write";
    }
}
