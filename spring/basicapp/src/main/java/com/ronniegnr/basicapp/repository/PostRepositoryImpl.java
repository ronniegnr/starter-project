package com.ronniegnr.basicapp.repository;

import com.ronniegnr.basicapp.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {

    // dummy repository method to generate to entity object
    public List<Post> findAll() {
        List<Post> posts = new ArrayList<Post>();

        Post post1 = new Post();
        post1.setId(1L);
        post1.setTitle("This is first post");
        post1.setDescription("This is description of first post");

        Post post2 = new Post();
        post2.setId(2L);
        post2.setTitle("This is second post");
        post2.setDescription("This is description of second post");

        posts.add(post1);
        posts.add(post2);

        return posts;
    }

}
