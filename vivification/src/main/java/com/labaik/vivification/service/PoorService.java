package com.labaik.vivification.service;

import com.labaik.vivification.converter.PoorMapperImpls;
import com.labaik.vivification.domain.user.Poor;
import com.labaik.vivification.dto.PoorDto;
import com.labaik.vivification.repository.PoorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PoorService {
    private final PasswordEncoder encoder;
    private final PoorMapperImpls poorMapper;
    private final PoorRepository poorRepository;
    public void register(PoorDto poorDto){

        Poor poor= poorMapper.poorDtoToPoor(poorDto);
       Poor p1= poorRepository.findByNationality(poor.getNationality());
       Poor p2=poorRepository.findByAccount_Email(poor.getAccount().getEmail());
       if(p1==null && p2==null ){

           poor.getAccount().setPassword(encoder.encode(poor.getAccount().getPassword()));
           poorRepository.save(poor);
       }else if(p1!=null){
           throw new IllegalStateException("this user exist-nationality.");
       }else{
           throw new IllegalStateException("this user exist-email.");
       }
    }
}
