package com.example.demoa.service;

import com.example.demoa.dto.PostDto;
import org.springframework.stereotype.Service;


public class PostService {

    public PostDto getPost(Integer id) {
        System.out.println("find post data from database by " + id);
        System.out.println("validate data from database");
        System.out.println("process data if necessary");

        return new PostDto(id, "title", "this is content", "seungwon");
    }
}
