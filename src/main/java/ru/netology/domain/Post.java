package ru.netology.domain;

public class Post {
    private String text;
    private int ownerID;
    private int fromID;//идентификатор автора записи
    private int createdBy;//идентификатор администратора, который опубликовал запись
    private int postID;//аналогично записи id в док-ах
    private int date;
    private int replyOwnedId;//идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;//идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly;//если запись была создана с опцией «Только для друзей»
    private boolean canDelete;
    private boolean isPin;//аналогично is_pinned
    private int canPin;//информация о том, может ли текущий пользователь закрепить запись
    private boolean canComplaint;//не увидела в док-ах ВК
    private boolean isFavorite;
    private boolean markedAsAds;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private int postType;//тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private int signerId;//идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int canEdit;//информация о том, может ли текущий пользователь редактировать запись
    private int postponedId;//идентификатор отложенной записи.
    private Geo geo;
    private PostSource postSource;

    public Post() {
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnedId() {
        return replyOwnedId;
    }

    public void setReplyOwnedId(int replyOwnedId) {
        this.replyOwnedId = replyOwnedId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }


    public int getPostType() {
        return postType;
    }

    public void setPostType(int postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isPin() {
        return isPin;
    }

    public void setPin(boolean pin) {
        isPin = pin;
    }

    public boolean isCanComplaint() {
        return canComplaint;
    }

    public void setCanComplaint(boolean canComplaint) {
        this.canComplaint = canComplaint;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }


    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }
}

