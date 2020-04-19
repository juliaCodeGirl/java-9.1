package ru.netology.domain;

public class CommentsInfo {
    private int counter;
    private int canComment;//аналогично can_post
    private boolean openComments;//аналогично can_open
    private int groupsCanPost;//информация о том, могут ли сообщества комментировать запись;
    private boolean canClose;//может ли текущий пользователь закрыть комментарии к записи;

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


    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isOpenComments() {
        return openComments;
    }

    public void setOpenComments(boolean openComments) {
        this.openComments = openComments;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }
}
