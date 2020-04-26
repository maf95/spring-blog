package com.mc.springblog.dao;

import com.mc.springblog.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Override
    List<Post> findAll();

    Post findByTitle( String title);
}
