package com.labaik.vivification.service;

import com.labaik.vivification.converter.BenefactorMapper;
import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.dto.BenefactorDto;
import com.labaik.vivification.repository.BenefactorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BenefactorService {
   //private final BenefactorMapper benefactorMapper;
    private final BenefactorRepository benefactorRepository;

    public void register(BenefactorDto benefactorDto){
        System.out.println(benefactorDto);
        Benefactor benefactor=BenefactorMapper.INSTANCE.benefactorDtoToBenefactor(benefactorDto);
        System.out.println(benefactor.getFirstName());
        benefactorRepository.save(benefactor);
    }

}
