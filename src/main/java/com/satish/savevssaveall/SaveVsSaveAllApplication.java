package com.satish.savevssaveall;

import com.satish.savevssaveall.service.SaveAllService;
import com.satish.savevssaveall.service.SaveService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SaveVsSaveAllApplication {

    private final SaveService saveService;
    private final SaveAllService saveAllService;

    public SaveVsSaveAllApplication(SaveService saveService, SaveAllService saveAllService) {
        this.saveService = saveService;
        this.saveAllService = saveAllService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SaveVsSaveAllApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            saveService.saveDocuments();
//			saveAllService.saveDocuments();
        };
    }

}
