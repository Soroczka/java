package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum(){

        listOfUsers.add(new ForumUser(0, "username_0", 20,
                LocalDate.of(1958, 05, 13), 'M'));
        listOfUsers.add(new ForumUser(1, "username_1", 2,
                LocalDate.of(1978, 01, 14), 'M'));
        listOfUsers.add(new ForumUser(2, "username_2", 0,
                LocalDate.of(1990, 07, 18),'F'));
        listOfUsers.add(new ForumUser(3, "username_3", 74,
                LocalDate.of(1984, 11, 24), 'M'));
        listOfUsers.add(new ForumUser(4, "username_4", 3,
                LocalDate.of(1999, 12, 2), 'F'));
        listOfUsers.add(new ForumUser(5, "username_5", 17,
                LocalDate.of(2002, 4, 02), 'M'));

    }

    public List<ForumUser> getList(){
        return new ArrayList<>(listOfUsers);
    }
}
