package com.booknotes.backend.models;

import jdk.jfr.events.CertificateId;

import javax.annotation.processing.Generated;
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
import java.util.Date;

@Entity
@Table(name = "note")

public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int noteId;

    @Column(nullable = false,
            unique = true)
    private String noteContents;

    @Column(nullable = false)
    private Date noteDate;

    private String notePagesRead;

    @ManyToOne
    @JoinColumn(name = "bookId"),
    nullable = false)
    private Book book;

public Note() {

    // required by JPA

}

public Note(String noteContents, String notePagesRead, Date noteDate, Book book)
{
    this.noteContents = noteContents;
    this.notePagesRead = notePagesRead;
    this.noteDate = noteDate;
    this.book = book;
}

public int getNoteId()
{
    return noteId;
}

public void setNoteId(int noteId)
{
    this.noteId = noteId;
}

public String getNoteContents()
{
    return noteContents;
}

public void setNoteContents(String noteContents)
{
    this.noteContents = noteContents;
}

public String getNotePagesRead()
{
    return notePagesRead;
}

public void setNotePagesRead(String notePagesRead)
{
    this.notePagesRead = notePagesRead;
}

public Date getNoteDate()
{
    return noteDate;
}

public void setNoteDate(Date noteDate)
{
    this.noteDate = noteDate;
}

public Book getBook()
{
    return book;
}

public void setBook(Book book)
{
    this.book = book;
}

}
