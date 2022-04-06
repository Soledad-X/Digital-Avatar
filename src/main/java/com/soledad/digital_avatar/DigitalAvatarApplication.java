package com.soledad.digital_avatar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/soledad/digital_avatar/mapper")
public class DigitalAvatarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalAvatarApplication.class, args);
    }

}
