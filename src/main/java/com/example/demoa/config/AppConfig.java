package com.example.demoa.config;


import com.example.demoa.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //설정 정보
public class AppConfig {

    @Bean
    public PostService postService() {
        return new PostService();
    }
}
