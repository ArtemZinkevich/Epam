package by.epam.bean;

import java.io.Serializable;
import java.sql.Time;

public class Song extends Model {


    private Album album;
    private String title;
    private Time duration;
    private int price;

    public Song() {
    }

    public Song(int id) {
        super(id);
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;

        Song song = (Song) o;

        if (price != song.price) return false;
        if (album != null ? !album.equals(song.album) : song.album != null) return false;
        if (title != null ? !title.equals(song.title) : song.title != null) return false;
        return duration != null ? duration.equals(song.duration) : song.duration == null;
    }

    @Override
    public int hashCode() {
        int result = album != null ? album.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "album=" + album +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
