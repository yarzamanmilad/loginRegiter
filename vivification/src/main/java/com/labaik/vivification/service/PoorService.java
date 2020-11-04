package com.labaik.vivification.service;

import com.labaik.vivification.converter.PoorMapper;
import com.labaik.vivification.domain.user.Poor;
import com.labaik.vivification.dto.PoorDto;
import com.labaik.vivification.repository.PoorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PoorService {
    private final PoorRepository poorRepository;
    public void register(PoorDto poorDto){
        Poor poor= PoorMapper.instance.poorDtoToPoor(poorDto);
        poorRepository.save(poor);
    }
}
