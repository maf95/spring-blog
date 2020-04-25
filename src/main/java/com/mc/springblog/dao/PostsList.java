package com.mc.springblog.dao;

import com.mc.springblog.models.Post;

import java.util.List;

public class PostsList {

    private List<Post> posts;

    public void addPost(Post post){
        posts.add(post);
    }
}
