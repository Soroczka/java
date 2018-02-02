package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public void addUser(final int idOfUser, final String username, final int posts, final LocalDate dateOfBirth, final char sex){

        listOfUsers.add(new ForumUser(idOfUser, username, posts, dateOfBirth, sex));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(listOfUsers);
    }

}
