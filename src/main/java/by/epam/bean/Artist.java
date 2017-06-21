package by.epam.bean;

import java.io.Serializable;

public class Artist extends Model {

    private Genre genre;
    private String title;
    private String description;

    public Artist() {
        super();
    }

    public Artist(int id) {
        super(id);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "genre=" + genre +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
