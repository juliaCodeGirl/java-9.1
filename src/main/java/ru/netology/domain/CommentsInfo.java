package ru.netology.domain;

public class CommentsInfo {
    private Integer counter;//аналогично count
    private Integer canComment;//аналогично can_post
    private boolean openComments;//аналогично can_open
    private Integer groupsCanPost;//информация о том, могут ли сообщества комментировать запись;
    private boolean canClose;//может ли текущий пользователь закрыть комментарии к записи;

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Integer getCanComment() {
        return canComment;
    }

    public void setCanComment(Integer canComment) {
        this.canComment = canComment;
    }


    public Integer getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(Integer groupsCanPost) {
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
