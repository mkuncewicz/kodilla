package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int ID;
    private final String nickname;
    private final char sex;
    private final LocalDate brithday;
    private int numbersOfPosts;

    public ForumUser(int ID, String nickname, char sex, LocalDate brithday, int numbersOfPosts) {
        this.ID = ID;
        this.nickname = nickname;
        this.sex = sex;
        this.brithday = brithday;
        this.numbersOfPosts = numbersOfPosts;
    }

    public int getID() {
        return ID;
    }

    public String getNickname() {
        return nickname;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBrithday() {
        return brithday;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    public void setNumbersOfPosts(int numbersOfPosts) {
        this.numbersOfPosts = numbersOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", brithday=" + brithday +
                ", numbersOfPosts=" + numbersOfPosts +
                '}';
    }
}
