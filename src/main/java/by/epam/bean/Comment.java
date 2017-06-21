package by.epam.bean;

import java.io.Serializable;
import java.sql.Time;

public class Comment extends Model {

    private User user;
    private Song song;
    private String commentText;
    private Time commentTime;

    public Comment() {
        super();
    }

    public Comment(int id) {
        super(id);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Time getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Time commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (user != null ? !user.equals(comment.user) : comment.user != null) return false;
        if (song != null ? !song.equals(comment.song) : comment.song != null) return false;
        if (commentText != null ? !commentText.equals(comment.commentText) : comment.commentText != null) return false;
        return commentTime != null ? commentTime.equals(comment.commentTime) : comment.commentTime == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (song != null ? song.hashCode() : 0);
        result = 31 * result + (commentText != null ? commentText.hashCode() : 0);
        result = 31 * result + (commentTime != null ? commentTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "user=" + user +
                ", song=" + song +
                ", commentText='" + commentText + '\'' +
                ", commentTime=" + commentTime +
                '}';
    }
}
