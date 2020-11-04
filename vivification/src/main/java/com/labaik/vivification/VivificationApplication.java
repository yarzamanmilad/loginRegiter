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

public class VivificationApplication implements CommandLineRunner {
    @Autowired
      private  PoorRepository poorRepository;
    @Autowired
      private BenefactorRepository benefactorRepository;
    public static void main(String[] args) {
        SpringApplication.run(VivificationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Poor poor=new Poor();
        poor.setFirstName("milad");
        poorRepository.save(poor);
      Poor poor1=   poorRepository.findByFirstName(poor.getFirstName()).orElseThrow(() -> new IllegalStateException());
        //System.out.println(poors.get(0).getFirstName()+"/////////");
        List<Poor> poorList=new ArrayList<>();
        poorList.add(poor1);

        Benefactor benefactor=new Benefactor()
                .setFirstName("ahmad")
                .setLastName("Yarzaman");
              //  .setPoors(poorList);

       // System.out.println(benefactorRepository.findAll().get(0).getPoors().get(0).getFirstName());

                ;
        benefactorRepository.save(benefactor);

    }
}
