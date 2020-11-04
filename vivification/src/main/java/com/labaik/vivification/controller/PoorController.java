package com.labaik.vivification.controller;

import com.labaik.vivification.dto.PoorDto;
import com.labaik.vivification.service.PoorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("poor")
@RequiredArgsConstructor
public class PoorController {
    private final PoorService poorService;
    @PostMapping("/register")
    public void register(@RequestBody PoorDto poorDto){
        poorService.register(poorDto);
    }
}
