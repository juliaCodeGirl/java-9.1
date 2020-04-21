package ru.netology.domain;

public class Post {
    private String text;
    private Integer ownerID;
    private Integer fromID;//идентификатор автора записи
    private Integer createdBy;//идентификатор администратора, который опубликовал запись
    private Integer postID;//аналогично записи id в док-ах
    private Integer date;
    private Integer replyOwnedId;//идентификатор владельца записи, в ответ на которую была оставлена текущая
    private Integer replyPostId;//идентификатор записи, в ответ на которую была оставлена текущая
    private Integer friendsOnly;//если запись была создана с опцией «Только для друзей»
    private Integer canDelete;
    private Integer isPin;//аналогично is_pinned
    private Integer canPin;//информация о том, может ли текущий пользователь закрепить запись
    private Integer isFavorite;
    private Integer markedAsAds;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;//тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private Integer signerId;//идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private Integer canEdit;//информация о том, может ли текущий пользователь редактировать запись
    private Integer postponedId;//идентификатор отложенной записи.
    private Geo geo;
    private PostSource postSourInteger;

    public Post() {
    }

    public Integer getFromID() {
        return fromID;
    }

    public void setFromID(Integer fromID) {
        this.fromID = fromID;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getReplyOwnedId() {
        return replyOwnedId;
    }

    public void setReplyOwnedId(Integer replyOwnedId) {
        this.replyOwnedId = replyOwnedId;
    }

    public Integer getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(Integer replyPostId) {
        this.replyPostId = replyPostId;
    }

    public Integer getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(Integer friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public Integer getCanPin() {
        return canPin;
    }

    public void setCanPin(Integer canPin) {
        this.canPin = canPin;
    }


    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Integer getSignerId() {
        return signerId;
    }

    public void setSignerId(Integer signerId) {
        this.signerId = signerId;
    }

    public Integer getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Integer canEdit) {
        this.canEdit = canEdit;
    }

    public Integer getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(Integer postponedId) {
        this.postponedId = postponedId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }

    public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Integer canDelete) {
        this.canDelete = canDelete;
    }

    public Integer isPin() {
        return isPin;
    }

    public void setPin(Integer pin) {
        isPin = pin;
    }

    public Integer isFavorite() {
        return isFavorite;
    }

    public void setFavorite(Integer favorite) {
        isFavorite = favorite;
    }

    public Integer isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(Integer markedAsAds) {
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

}

