package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumDatabaseTestSuite {


    @Mock
    private Statistics statistics;


    public List<String> generatorUsers(int users){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < users; i++){
            list.add(new String());
        }
        return list;
    }

    @Test
    void numbersOfPost0(){
        //Given
        ForumDatabase forumDatabase = new ForumDatabase();
        List<String> list = generatorUsers(100);
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumDatabase.calculateAdvStatistics(statistics);

        //Then
        Assertions.assertEquals(0,forumDatabase.getPosts());
        Assertions.assertEquals(0.0, forumDatabase.getAvgCommentsOnPost());
        Assertions.assertEquals(0.0, forumDatabase.getAvgPostsOnUser());
    }

    @Test
    void numersOfPosts1000(){
        //Given
        ForumDatabase forumDatabase = new ForumDatabase();
        List<String> list = generatorUsers(100);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(list);
        //When
        forumDatabase.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(1000,forumDatabase.getPosts());
        Assertions.assertEquals(10.0,forumDatabase.getAvgPostsOnUser());
        Assertions.assertEquals(0.1,forumDatabase.getAvgCommentsOnPost());
    }

    @Test
    void numbersOfComm0(){
        //Given
        ForumDatabase forumDatabase = new ForumDatabase();
        List<String> list = generatorUsers(100);
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        //When
        forumDatabase.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0, forumDatabase.getComments());
        Assertions.assertEquals(0, forumDatabase.getAvgCommentsOnUser());
        Assertions.assertEquals(0, forumDatabase.getAvgCommentsOnPost());
    }

    @Test
    void commLessPosts(){
        //Given
        ForumDatabase forumDatabase = new ForumDatabase();
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(50);
        //When
        forumDatabase.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0.5,forumDatabase.getAvgCommentsOnPost());
    }

    @Test
    void commMorePosts(){
        //Given
        ForumDatabase forumDatabase = new ForumDatabase();
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(200);
        //When
        forumDatabase.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(2,forumDatabase.getAvgCommentsOnPost());
    }

    @Test
    void numbersOfUsers0(){
        //Given
        ForumDatabase forumDatabase = new ForumDatabase();
        List<String> list = generatorUsers(0);
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumDatabase.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(0, forumDatabase.getUsers());
        Assertions.assertEquals(0, forumDatabase.getAvgCommentsOnUser());
        Assertions.assertEquals(0, forumDatabase.getAvgPostsOnUser());
    }
    @Test
    void numbersOfUsers100(){
        //Given
        ForumDatabase forumDatabase = new ForumDatabase();
        List<String> list = generatorUsers(100);
        when(statistics.usersNames()).thenReturn(list);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        //When
        forumDatabase.calculateAdvStatistics(statistics);
        //Then
        Assertions.assertEquals(100, forumDatabase.getUsers());
        Assertions.assertEquals(1, forumDatabase.getAvgCommentsOnUser());
        Assertions.assertEquals(1, forumDatabase.getAvgPostsOnUser());
    }

}
