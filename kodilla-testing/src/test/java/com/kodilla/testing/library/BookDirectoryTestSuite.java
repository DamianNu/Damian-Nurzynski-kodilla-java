package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@Nested
@ExtendWith(MockitoExtension.class)
@DisplayName("Book Directory Test Suit")
class BookDirectoryTestSuite {

    @Nested
    @DisplayName("Method : listBooksWithCondition ")
    class TestListBooksWithConditionFragmentShorterThan3 {
        private List<Book> generateListOfNBooks(int booksQuantity) {
            List<Book> resultList = new ArrayList<>();
            for (int n = 1; n <= booksQuantity; n++) {
                Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
        }

        @Mock
        private LibraryDatabase libraryDatabaseMock;

        @DisplayName("Test: List Books With Conditions Return List")
        @Test
        void testListBooksWithConditionsReturnList() {

            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        @DisplayName("Test: List Books With Condition More Than 20")
        @Test
        void testListBooksWithConditionMoreThan20() {

            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @DisplayName("Test: List Books With Condition Fragment Shorter Than 3")
        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }
@Nested
@DisplayName("Method : listBooksInHandsOf(LibraryUser libraryUser) ")
    class ListBooksInHandsOf{

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @DisplayName("Test: List Books In Hands Of when he has 0 book ")
    @Test
    void testListBooksInHandsOf() {

        //Given
        List<Book> resultHandsBookList0 = generateListOfBooks(0);
        List<Book> resultHandsBookList1 = generateListOfBooks(1);
        List<Book> resultHandsBookList5 = generateListOfBooks(5);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("Adam","Kowalski","9090213");
        LibraryUser user2 = new LibraryUser("Magda","Rybka","9090215");
        LibraryUser user3 = new LibraryUser("Jacek","Wiśnia","909016");
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultHandsBookList0);
        when(libraryDatabaseMock.listBooksInHandsOf(user2)).thenReturn(resultHandsBookList1);
        when(libraryDatabaseMock.listBooksInHandsOf(user3)).thenReturn(resultHandsBookList5);

        //When
        List<Book> theListOfHandsBooks0 = bookLibrary.listBooksInHandsOf(user1);
        List<Book> theListOfHandsBooks1 = bookLibrary.listBooksInHandsOf(user2);
        List<Book> theListOfHandsBooks5 = bookLibrary.listBooksInHandsOf(user3);

        //Then
        assertEquals(0, theListOfHandsBooks0.size());
        assertEquals(1, theListOfHandsBooks1.size());
        assertEquals(5, theListOfHandsBooks5.size());
        }
    }
}

