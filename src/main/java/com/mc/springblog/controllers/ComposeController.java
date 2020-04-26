package com.mc.springblog.controllers;

import com.mc.springblog.dao.PostRepository;
import com.mc.springblog.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compose")
public class ComposeController {

    @Autowired
    PostRepository postRepo;

    @RequestMapping
    public String showComposePage(Model model){
        Post post = new Post();
        model.addAttribute("post", post);
        return "compose";
    }

    @PostMapping("/save")
    public String savePost(Model model, Post post){
        postRepo.save(post);
        return "redirect:/";
    }
}
