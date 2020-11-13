package com.labaik.vivification.controller;

import com.labaik.vivification.dto.PoorDto;
import com.labaik.vivification.service.PoorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController

@RequestMapping("poor")
@RequiredArgsConstructor
public class PoorController {
    private final PoorService poorService;
    @PostMapping("/register")
    public void register(@RequestBody PoorDto poorDto){
        poorService.register(poorDto);
    }
    @GetMapping
    public ModelAndView getHomepage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("homepage");
        return modelAndView;
    }
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("loginpage");
        return modelAndView;
    }
}
