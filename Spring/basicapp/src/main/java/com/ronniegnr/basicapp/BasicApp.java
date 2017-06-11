package com.ronniegnr.basicapp;

import com.ronniegnr.basicapp.model.Post;
import com.ronniegnr.basicapp.service.PostService;
import com.ronniegnr.basicapp.service.PostServiceImpl;

import java.util.List;

public class BasicApp {
    public static void main(String[] args) {
        PostService postService = new PostServiceImpl();
        List<Post> posts = postService.findAll();
        System.out.println(posts);
    }
}
