package com.ronniegnr.basicapp.service;

import com.ronniegnr.basicapp.model.Post;
import com.ronniegnr.basicapp.repository.PostRepository;
import com.ronniegnr.basicapp.repository.PostRepositoryImpl;

import java.util.List;

public class PostServiceImpl implements PostService {

    private PostRepository postRepository = new PostRepositoryImpl();

    public List<Post> findAll() {
        return postRepository.findAll();
    }

}
