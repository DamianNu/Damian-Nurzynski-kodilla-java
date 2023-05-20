package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@Nested
@ExtendWith(MockitoExtension.class)
@DisplayName("Forum Statistic Test Suit")
class ForumStatisticTestSuite {

    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Start of testing");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Completion of all tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    private List<String> generateUserNames(int userQuantity) {
        List<String> resultList = new ArrayList<>();
        if (userQuantity > 0) {
            for (int i = 1; i <= userQuantity; i++) {
                String user = "user" + i;
                resultList.add(user);
            }
            return resultList;
        } else {
            return resultList;
        }
    }
    private int newPostsCount(int postNumber) {
        return postNumber;
    }
    private int newCommentsCount(int commentsNumber) {
        return commentsNumber;
    }


            @Mock
            private Statistics statisticsMock;

            @DisplayName("Test: Calculate Adv Statistics when number of posts = 0")
            @Test
            void testcalculateAdvStatistics_whenNumberOfPosts0() {

                // Given
                ForumStatistics forumStatistics = new ForumStatistics();
                when(statisticsMock.postsCount()).thenReturn(newPostsCount(0));
                when(statisticsMock.usersNames()).thenReturn(generateUserNames(1));
                forumStatistics.calculateAdvStatistics(statisticsMock);

                // When
                int result = forumStatistics.getNumberOfPosts();

                // Then
                assertEquals(0,result);
            }

            @DisplayName("Test: Calculate Adv Statistics when number of posts = 1000")
            @Test
            void testcalculateAdvStatistics_whenNumberOfPosts1000() {

                // Given
                ForumStatistics forumStatistics = new ForumStatistics();
                when(statisticsMock.commentsCount()).thenReturn(newCommentsCount(1));
                when(statisticsMock.postsCount()).thenReturn(newPostsCount(1000));
                when(statisticsMock.usersNames()).thenReturn(generateUserNames(1));
                forumStatistics.calculateAdvStatistics(statisticsMock);

                // When
                int result = forumStatistics.getNumberOfPosts();

                // Then
                assertEquals(1000,result);
            }

            @DisplayName("Test: Calculate Adv Statistics when number of comments = 0")
            @Test
            void testcalculateAdvStatistics_whenNumberOfComments0() {

                // Given
                ForumStatistics forumStatistics = new ForumStatistics();
                when(statisticsMock.commentsCount()).thenReturn(newCommentsCount(0));
                when(statisticsMock.postsCount()).thenReturn(newPostsCount(1));
                when(statisticsMock.usersNames()).thenReturn(generateUserNames(10));
                forumStatistics.calculateAdvStatistics(statisticsMock);

                // When
                int result = forumStatistics.getNumberOfComments();

                // Then
                assertEquals(0,result);
            }

            @DisplayName("Test: Calculate Adv Statistics When the number of comments < the number of posts,")
            @Test
            void testcalculateAdvStatistics_whenCommentsLessThanPosts() {

                // Given
                ForumStatistics forumStatistics = new ForumStatistics();
                when(statisticsMock.commentsCount()).thenReturn(newCommentsCount(10));
                when(statisticsMock.postsCount()).thenReturn(newPostsCount(100));
                when(statisticsMock.usersNames()).thenReturn(generateUserNames(1));
                forumStatistics.calculateAdvStatistics(statisticsMock);

                // When
                double result = forumStatistics.getAverageCommentsPerPosts();

                // Then
                assertTrue(result<1);
            }

            @DisplayName("Test: Calculate Adv Statistics When are more comments than posts,")
            @Test
            void testcalculateAdvStatistics_whenAreMoreCommentsThanPosts() {

                // Given
                ForumStatistics forumStatistics = new ForumStatistics();
                when(statisticsMock.commentsCount()).thenReturn(newCommentsCount(100));
                when(statisticsMock.postsCount()).thenReturn(newPostsCount(10));
                when(statisticsMock.usersNames()).thenReturn(generateUserNames(20));
                forumStatistics.calculateAdvStatistics(statisticsMock);

                // When
                double result = forumStatistics.getAverageCommentsPerPosts();

                // Then
                assertEquals(10,result);
            }

            @DisplayName("Test: Calculate Adv Statistics When there are no forum users,")
            @Test
            void testcalculateAdvStatistics_whenThereAreNoForumUsers() {

                // Given
                ForumStatistics forumStatistics = new ForumStatistics();
                when(statisticsMock.usersNames()).thenReturn(generateUserNames(0));
                forumStatistics.calculateAdvStatistics(statisticsMock);

                // When
                int result = forumStatistics.getNumberOfUser();

                // Then
                assertTrue(result==0);
            }

            @DisplayName("Test: Calculate Adv Statistics When there are 100 forum users ,")
            @Test
            void testcalculateAdvStatistics_whenThereAre100ForumUsers() {

                // Given
                ForumStatistics forumStatistics = new ForumStatistics();
                when(statisticsMock.commentsCount()).thenReturn(newCommentsCount(10));
                when(statisticsMock.postsCount()).thenReturn(newPostsCount(10));
                when(statisticsMock.usersNames()).thenReturn(generateUserNames(100));
                forumStatistics.calculateAdvStatistics(statisticsMock);

                // When
                double result = forumStatistics.getNumberOfUser();

                // Then
                assertEquals(100,result);
            }

    }

