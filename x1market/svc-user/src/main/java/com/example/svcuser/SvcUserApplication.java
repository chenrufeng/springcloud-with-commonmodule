package com.example.svcuser;

import com.example.noweb.ComA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SvcUserApplication {

    public static void main(String[] args) {
        ComA ca = new ComA();
        SpringApplication.run(SvcUserApplication.class, args);
    }

}
