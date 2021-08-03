package com.satish.savevssaveall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date")
    public Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    public Date updatedDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
//    @SequenceGenerator(name = "seqGen", sequenceName = "seq", initialValue = 1)
    private int id;
    private String name;
    private String authorName;
    private String title;
    private int cost;

    public Book(String name, String authorName, String title, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.title = title;
        this.cost = cost;
    }

    @PrePersist
    public void prePersist() {
        createdDate = new Date();
        updatedDate = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        updatedDate = new Date();
    }
}
