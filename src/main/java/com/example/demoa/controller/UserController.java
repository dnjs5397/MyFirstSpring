package com.example.demoa.controller;

import com.example.demoa.dto.SpecialtyDto;
import com.example.demoa.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/paid")
    public String getPaidUser() {
        return "paidUser";
    }

    @RequestMapping(value = "/enterprise")
    public String getEnterpriseUser() {
        return "enterpriseUser";
    }

    @RequestMapping(value = "/user")
    public UserDto getUser() {

        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("sexKing", "5"));
        specialties.add(new SpecialtyDto("DDALKING", "6"));


        return new UserDto(1, "BOoRueng", "asdf@naver.com", specialties);
    }
}
