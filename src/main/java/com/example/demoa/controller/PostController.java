package com.example.demoa.controller;


import com.example.demoa.dto.PostDto;
import com.example.demoa.service.PostService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public PostDto getPost(@RequestParam Integer id) {
        PostDto result = postService.getPost(id);
        return result;
    }

    @PostMapping
    public String savePost(@RequestBody PostDto postDto) {
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());

        return "POST /post";
    }

    @PutMapping
    public String updatePost() {
        return "PUT /post";
    }

    @DeleteMapping
    public String deletePost() {
        return "DELETE /post";
    }
}
