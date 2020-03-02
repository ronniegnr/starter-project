package com.ronniegnr.basicapp.repository;

import com.ronniegnr.basicapp.model.Post;
import java.util.List;

public interface PostRepository {

    List<Post> findAll();

}
