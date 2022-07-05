package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> list = new ArrayList<>();

    public Forum() {
        list.add(new ForumUser(0,"jurek",'M',LocalDate.of(1997,03,1), 21));
        list.add(new ForumUser(1,"kasia",'K',LocalDate.of(2003,03,1), 0));
        list.add(new ForumUser(2,"liwia",'K',LocalDate.of(2005,03,1), 1));
        list.add(new ForumUser(3,"mikolaj",'M',LocalDate.of(1987,03,1), 31));
        list.add(new ForumUser(4,"mateusz",'M',LocalDate.of(1999,03,1), 42));
        list.add(new ForumUser(5,"grzegorz",'M',LocalDate.of(2000,03,1), 11));
        list.add(new ForumUser(6,"marta",'K',LocalDate.of(2008,03,1), 21));
        list.add(new ForumUser(8,"marcin",'M',LocalDate.of(1998,03,1), 0));
        list.add(new ForumUser(9,"julia",'K',LocalDate.of(2002,03,1), 15));
    }

    public List<ForumUser> getList() {
        return list;
    }
}
