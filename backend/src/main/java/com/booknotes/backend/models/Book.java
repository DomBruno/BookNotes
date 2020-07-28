package com.booknotes.backend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Book")

public class Book {
    @Id
    @GeneratedValue(Strategy = GenerationType.AUTO)
    private int bookId;

    @Column(nullable = false,
            unique = true)
    private String bookTitle;

    private String bookAuthorLast;

    @Column(nullable = false,
            unique = true)
    private String bookAuthorFirst;

    private int bookPagesTotal;

    @column(unique = true)
    private String bookIsbn;

    @OneToMany(mappedBy = "book",
            cascade = CascadeType.ALL,
            // when adding, reading, updating, and delete, the operations should affect the notes table as well)
            orphanRemoval = true)
            // if we find a note that has a reference to an book that does not exist, delete that note record
            private List<Note> notes = new ArrayList<>();

    public Book()
    {
        // required by JPA
    }

    public int getBookId()
    {
        return bookId;
    }

    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthorLast()
    {
        return bookAuthorLast;
    }

    public void setBookAuthorLast(String bookAuthorLast)
    {
        this.bookAuthorLast = bookAuthorLast;
    }

    public String getBookAuthorFirst()
    {
        return bookAuthorFirst;
    }

    public void setBookAuthorFirst(String bookAuthorFirst)
    {
        this.bookAuthorFirst = bookAuthorFirst;
    }

    public int getBookPagesTotal()
    {
        return bookPagesTotal;
    }

    public void setBookPagesTotal(int bookPagesTotal)
    {
        this.bookPagesTotal = bookPagesTotal;
    }

    public List<Note> getNotes()
    {
        return notes;
    }

    public void setNotes(List<Note> notes)
    {
        this.notes = notes;
    }


}
