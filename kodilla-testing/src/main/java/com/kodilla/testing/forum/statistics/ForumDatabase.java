package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class ForumDatabase {

    private int Users;
    private int Posts;
    private int Comments;

    private double avgPostsOnUser;
    private double avgCommentsOnUser;
    private double avgCommentsOnPost;


    public ForumDatabase() {

    }

    public void calculateAdvStatistics(Statistics statistics){
        this.Users = statistics.usersNames().size();
        this.Posts = statistics.postsCount();
        this.Comments = statistics.commentsCount();
        if(this.Posts < 1 || this.Users < 1){
            this.avgPostsOnUser = 0;
        }else {
            this.avgPostsOnUser = (double) this.Posts / (double) this.Users;
        }
        if(this.Comments < 1 || this.Users < 1){
            this.avgCommentsOnUser = 0;
        }else {
            this.avgCommentsOnUser = (double) this.Comments / (double) this.Users;
        }
        if(this.Comments < 1 || this.Posts < 1){
            this.avgCommentsOnPost = 0;
        }else {
            this.avgCommentsOnPost = (double) this.Comments / (double) this.Posts;
        }
    }


    public void showStatistics(){
        System.out.println("numbersOfUsers: " + Users + "\n numbersOfPosts: " + Posts + "\n numbersOfComments: " + Comments
             +  "\n avgPostsOnUser: " + avgPostsOnUser  + "\n avgCommentsOnUser: " + avgCommentsOnUser + "\n avgCommentsOnPost: " + avgCommentsOnPost);
    }

    public int getUsers() {
        return Users;
    }

    public void setUsers(int users) {
        this.Users = users;
    }

    public int getPosts() {
        return Posts;
    }

    public void setPosts(int posts) {
        this.Posts = posts;
    }

    public int getComments() {
        return Comments;
    }

    public void setComments(int comments) {
        this.Comments = comments;
    }

    public double getAvgPostsOnUser() {
        return avgPostsOnUser;
    }

    public void setAvgPostsOnUser(double avgPostsOnUser) {
        this.avgPostsOnUser = avgPostsOnUser;
    }

    public double getAvgCommentsOnUser() {
        return avgCommentsOnUser;
    }

    public void setAvgCommentsOnUser(double avgCommentsOnUser) {
        this.avgCommentsOnUser = avgCommentsOnUser;
    }

    public double getAvgCommentsOnPost() {
        return avgCommentsOnPost;
    }

    public void setAvgCommentsOnPost(double avgCommentsOnPost) {
        this.avgCommentsOnPost = avgCommentsOnPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumDatabase that = (ForumDatabase) o;
        return Users == that.Users && Posts == that.Posts && Comments == that.Comments && Double.compare(that.avgPostsOnUser, avgPostsOnUser) == 0 && Double.compare(that.avgCommentsOnUser, avgCommentsOnUser) == 0 && Double.compare(that.avgCommentsOnPost, avgCommentsOnPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Users, Posts, Comments, avgPostsOnUser, avgCommentsOnUser, avgCommentsOnPost);
    }
}
