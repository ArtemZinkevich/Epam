package by.epam.bean;

import java.io.Serializable;

public class Bonus extends Model{


    private String title;
    private String description;
    private int discount;

    public Bonus() {
        super();
    }

    public Bonus(int id) {
        super(id);
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bonus bonus = (Bonus) o;

        if (discount != bonus.discount) return false;
        if (title != null ? !title.equals(bonus.title) : bonus.title != null) return false;
        return description != null ? description.equals(bonus.description) : bonus.description == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + discount;
        return result;
    }

    @Override
    public String toString() {
        return "Bonus{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                '}';
    }
}
