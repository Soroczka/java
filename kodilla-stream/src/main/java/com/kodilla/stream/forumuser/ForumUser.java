package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int idOfUser;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(final int idOfUser, final String username, final int posts,
                     final LocalDate dateOfBirth, final char sex) {
        this.idOfUser = idOfUser;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
        this.sex = sex;
    }

    public int getIdOfUser() {
        return idOfUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idOfUser=" + idOfUser +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
