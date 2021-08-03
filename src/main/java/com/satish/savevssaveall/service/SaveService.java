package com.satish.savevssaveall.service;

import com.satish.savevssaveall.constraints.ApplicationConstant;
import com.satish.savevssaveall.entity.Book;
import com.satish.savevssaveall.repository.SaveRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SaveService {

    private final SaveRepository saveRepository;

    public SaveService(SaveRepository saveRepository) {
        this.saveRepository = saveRepository;
    }

    public void saveDocuments() {
        Date start = new Date();

        for (int i = 0; i < ApplicationConstant.bookCount; i++) {
            saveRepository.save(new Book(ApplicationConstant.BOOK_NAME, ApplicationConstant.AUTHOR_NAME, ApplicationConstant.TITLE, 1000));
        }

        String timeTaken = ApplicationConstant.calculateTime(start, new Date());
        System.out.println(String.format("time taken %s", timeTaken));
    }
}
