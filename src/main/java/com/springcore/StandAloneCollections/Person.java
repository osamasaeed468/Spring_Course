package com.springcore.StandAloneCollections;

import java.util.List;

public class Person {
    private List<String> friendsName;



    public List<String> getFriendsName() {
        return friendsName;
    }

    public void setFriendsName(List<String> friendsName) {
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friendsName=" + friendsName +
                '}';
    }
}
