package by.epam.bean;

import java.io.Serializable;

public class Album extends Model {

    private Artist artist;
    private String title;
    private int year;
    private String discription;

    public Album() {
        super();
    }

    public Album(int id) {
        super(id);
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (year != album.year) return false;
        if (artist != null ? !artist.equals(album.artist) : album.artist != null) return false;
        if (title != null ? !title.equals(album.title) : album.title != null) return false;
        return discription != null ? discription.equals(album.discription) : album.discription == null;
    }

    @Override
    public int hashCode() {
        int result = artist != null ? artist.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (discription != null ? discription.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist=" + artist +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", discription='" + discription + '\'' +
                '}';
    }
}
