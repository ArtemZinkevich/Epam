package by.epam.bean;

import java.io.Serializable;

public class Genre extends Model {

    private String title;
    private String discription;

    public Genre() {
        super();
    }

    public Genre(int id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (!(o instanceof Genre)) return false;

        Genre genre = (Genre) o;

        if (title != null ? !title.equals(genre.title) : genre.title != null) return false;
        return discription != null ? discription.equals(genre.discription) : genre.discription == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (discription != null ? discription.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "title='" + title + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}
