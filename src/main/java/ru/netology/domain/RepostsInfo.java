package ru.netology.domain;

public class RepostsInfo {
    private int counter;
    private int canRepost;//можно сделать репост
    private int alreadyRepost;//аналогично user_reposted

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(int canRepost) {
        this.canRepost = canRepost;
    }

    public int getAlreadyRepost() {
        return alreadyRepost;
    }

    public void setAlreadyRepost(int alreadyRepost) {
        this.alreadyRepost = alreadyRepost;
    }
}
