package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Dylan Murphy", 'M', LocalDate.of(1995, 1, 13), 5500));
        forumUserList.add(new ForumUser(2, "Aimeer Murpher", 'M', LocalDate.of(1999,12,17), 0));
        forumUserList.add(new ForumUser(2, "Aimee Murphy", 'F', LocalDate.of(1999,12,17), 0));
        forumUserList.add(new ForumUser(33, "Phoebe Pearson", 'M',LocalDate.of(2012,12,12), 15));
        forumUserList.add(new ForumUser(555, "Madelynn Carson", 'F',LocalDate.of(1909,12,11), 1));
    }

    public List<ForumUser> getUserList() {
        return forumUserList;
    }
}
