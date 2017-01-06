package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by sang on 17-1-6.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    PersonRepository personRepository;

    @CachePut(value = "people", key = "#person.id")
    @Override
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key为" + p.getId() + "数据做了缓存");
        return p;
    }

    @CacheEvict(value = "people")
    @Override
    public void remove(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
        personRepository.delete(id);
    }

    @Cacheable(value = "people", key = "#person.id")
    @Override
    public Person findOne(Person person) {
        Person p = personRepository.findOne(person.getId());
        System.out.println("为id、key为" + p.getId() + "数据做了缓存");
        return p;
    }
}
