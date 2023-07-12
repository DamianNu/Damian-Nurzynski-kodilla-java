package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //given
        //creating the BookLibrary
        Book book1 = new Book("Krótka historia czasu", "Stephen Hawking", LocalDate.of(1995, 1, 3));
        Book book2 = new Book("Wstrząsające dzieło kulejącego geniusza", "Dave Eggers", LocalDate.of(1988, 06, 22));
        Book book3 = new Book("Oddech, oczy, pamięć", "Edwidge Danticat", LocalDate.of(2011, 11, 18));
        Book book4 = new Book("Tłumacz chorób", "Jhumpa Lahiri", LocalDate.of(1999, 2, 12));
        Book book5 = new Book("Słońce też wschodzi", "Ernest Hemingway", LocalDate.of(2001, 1, 7));
        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);


        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), clonedLibrary.getBooks());
        assertNotEquals(clonedLibrary.getBooks(), deepClonedLibrary.getBooks());

    }
}
