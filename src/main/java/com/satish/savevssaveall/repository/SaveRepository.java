package com.satish.savevssaveall.repository;

import com.satish.savevssaveall.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveRepository extends JpaRepository<Book, Integer> {

}
