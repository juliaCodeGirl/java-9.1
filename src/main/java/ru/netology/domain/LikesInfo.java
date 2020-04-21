package ru.netology.domain;

public class LikesInfo {
    private Integer counter;
    private Integer canLikes;//аналогично can_likes
    private Integer userLikes;//наличие отметки «Мне нравится» от текущего пользователя
    private Integer canPublish;//информация о том, может ли текущий пользователь сделать репост записи

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Integer getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(Integer canLikes) {
        this.canLikes = canLikes;
    }

    public Integer getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(Integer userLikes) {
        this.userLikes = userLikes;
    }

    public Integer getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
