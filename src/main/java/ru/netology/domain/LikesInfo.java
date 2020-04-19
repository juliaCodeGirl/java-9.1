package ru.netology.domain;

public class LikesInfo {
    private int counter;
    private int canLikes;//аналогично can_likes
    private int userLikes;//аличие отметки «Мне нравится» от текущего пользователя
    private int canPublish;//нформация о том, может ли текущий пользователь сделать репост записи

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(int canLikes) {
        this.canLikes = canLikes;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
