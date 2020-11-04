package com.labaik.vivification.controller;

import com.labaik.vivification.dto.BenefactorDto;
import com.labaik.vivification.service.BenefactorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("benefactor")
@RequiredArgsConstructor
public class BenefactorController {
    private final BenefactorService benefactorService;
    @PostMapping("/register")
    public void register(@RequestBody BenefactorDto benefactorDto){
        benefactorService.register(benefactorDto);
    }
}
