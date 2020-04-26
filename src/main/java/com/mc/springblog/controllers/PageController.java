package com.mc.springblog.controllers;

import com.mc.springblog.dao.PostRepository;
import com.mc.springblog.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    PostRepository postRepo;

    @RequestMapping()
    public String showPage(@RequestParam("id") String title, Model model){
        Post post = postRepo.findByTitle(title);
        model.addAttribute("post", post);
        return "page";
    }
}
