package com.satish.savevssaveall.service;

import com.satish.savevssaveall.constraints.ApplicationConstant;
import com.satish.savevssaveall.entity.Book;
import com.satish.savevssaveall.repository.SaveRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SaveAllService {

    private final SaveRepository saveRepository;

    public SaveAllService(SaveRepository saveRepository) {
        this.saveRepository = saveRepository;
    }

    public void saveDocuments() {

        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < ApplicationConstant.bookCount; i++) {
            bookList.add(new Book(ApplicationConstant.BOOK_NAME + i, ApplicationConstant.AUTHOR_NAME + i, ApplicationConstant.TITLE + i, i));
        }

        Date start = new Date();
        saveRepository.saveAll(bookList);

        String timeTaken = ApplicationConstant.calculateTime(start, new Date());
        System.out.println(String.format("time taken %s", timeTaken));
    }
}
