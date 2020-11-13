package com.labaik.vivification;

import com.labaik.vivification.domain.user.Benefactor;
import com.labaik.vivification.domain.user.Poor;
import com.labaik.vivification.repository.BenefactorRepository;
import com.labaik.vivification.repository.PoorRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class VivificationApplication {
    @Autowired
      private  PoorRepository poorRepository;
    @Autowired
      private BenefactorRepository benefactorRepository;
    public static void main(String[] args) {
        SpringApplication.run(VivificationApplication.class, args);
    }

}
