package ru.netology.domain;

public class CommentsInfo {
private int counter;
private int canComment;
private int openComments;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCanComment() {
        return canComment;
    }

    public void setCanComment(int canComment) {
        this.canComment = canComment;
    }

    public int getOpenComments() {
        return openComments;
    }

    public void setOpenComments(int openComments) {
        this.openComments = openComments;
    }
}
