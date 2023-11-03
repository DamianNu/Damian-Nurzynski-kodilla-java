package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> booksMap = bookSet.stream()
                .collect(Collectors.toMap(k -> new BookSignature(k.getSignature()),
                        v -> new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(v.getAuthor(), v.getTitle(), v.getPublicationYear())));
        return medianPublicationYear(booksMap);
    }
}
