package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        // Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("J.R.R. Tolkien", "Władca Pierścieni", 1954, "843.351");
        Book book2 = new Book("George R.R. Martin", "Pieśń lodu i ognia", 1996, "843.908");
        Book book3 = new Book("Paulo Coelho", "Alchemik", 1988, "843.914");
        Book book4 = new Book("Orhan Pamuk", "Czas i miejsce", 2008, "843.919");
        Book book5 = new Book("J.D. Salinger", "Buszujący w zbożu", 1951, "843.924");
        Book book6 = new Book("Harper Lee", "Złamana dzbanuszek", 1960, "843.925");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        // When
        int medianBooks = medianAdapter.publicationYearMedian(books);

        // Then
        assertEquals(1988, medianBooks);
    }
}