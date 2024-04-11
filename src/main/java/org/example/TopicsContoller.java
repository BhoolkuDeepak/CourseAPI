package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TopicsContoller {
    @RequestMapping("/topics")
    public List<Topics> getAlltopics(){
        return Arrays.asList(new Topics("Spring","SpringFramework","SpringFramework Description"),
                new Topics("SpringBoot","SpringBootFramework","SpringBoot Framework Description"),
                new Topics("Hibernate","HibernateFramework","HibernateFramework Description"),
                new Topics("Hibernate","HibernateFramework","HibernateFramework Description")
                );
    }

}
