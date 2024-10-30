package day13;

import day12.task3.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<String> subscriptions;
    private List<String> friends;

    public User(String username) {
        this.username = username;
        List<String> subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<String> getSubscriptions() {
        return subscriptions;
    }
    public void subscribe(User user){
        subscriptions.add(username);
    }
    public boolean isSubscribed(User user){
        for (int i = 0; i < subscriptions.size(); i++) {
            if (username.equals(user.getUsername())){
                return true;
            }

        }
        return false;
    }
    public boolean isFriend(User user){
        for (int i = 0; i < friends.size(); i++) {
            if (username.equals(user.getUsername())){
                return true;
            }

        }
        return false;
    }
    public void sendMessage(User user, String text){

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
