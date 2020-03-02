package com.ronniegnr.basicapp;

import com.ronniegnr.basicapp.model.Post;
import com.ronniegnr.basicapp.service.PostService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BasicApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PostService postService = context.getBean("postService", PostService.class);
        List<Post> posts = postService.findAll();
        System.out.println(posts);
    }
}
