package org.sang.entity;

/**
 * Created by sang on 17-3-10.
 */
public class Comments {
    private long id;
    private long articleId;
    private String commIp;
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getCommIp() {
        return commIp;
    }

    public void setCommIp(String commIp) {
        this.commIp = commIp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
