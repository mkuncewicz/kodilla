package com.kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        LocalDate date = LocalDate.now();

        Map<Integer, ForumUser> mapResult = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> date.getYear() - forumUser.getBrithday().getYear() > 20 ||
                        (date.getYear() - forumUser.getBrithday().getYear() == 20 &&
                        date.getDayOfMonth() - forumUser.getBrithday().getDayOfMonth() >= 0))
                .filter(forumUser -> forumUser.getNumbersOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getID, forumUser -> forumUser));

        System.out.println("Elements: " + mapResult.size());

            mapResult.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);

    }
}
