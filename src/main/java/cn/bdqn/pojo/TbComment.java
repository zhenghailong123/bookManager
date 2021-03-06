package cn.bdqn.pojo;

/**
 * 评论类
 */
public class TbComment {
    private Integer id;//评论id
    private Integer user_id;//用户id
    private Integer book_id;//图书id
    private String content;//评论内容
    private String commentDate;//评论时间
    private Integer top;//评论星级

    @Override
    public String toString() {
        return "TbComment{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", book_id=" + book_id +
                ", content='" + content + '\'' +
                ", commentDate='" + commentDate + '\'' +
                ", top=" + top +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }
}