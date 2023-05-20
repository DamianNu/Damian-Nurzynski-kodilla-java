package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
    userList.add(new ForumUser(10001,"Marek",'M', LocalDate.of(1985,11,22),3));
    userList.add(new ForumUser(10002,"Dawid",'M', LocalDate.of(1986,9,18),0));
    userList.add(new ForumUser(10003,"Olga",'F', LocalDate.of(1989,8,7),17));
    userList.add(new ForumUser(10004,"Basia",'F', LocalDate.of(1988,4,4),2));
    userList.add(new ForumUser(10005,"Wojtel",'M', LocalDate.of(2010,11,22),0));
    userList.add(new ForumUser(10006,"Paulina",'F', LocalDate.of(2005,1,14),53));
    userList.add(new ForumUser(10007,"Bogusz",'M', LocalDate.of(1993,2,21),8));
    }

     public List<ForumUser> getUserList(){
         return new ArrayList<>(userList);
    }
}

