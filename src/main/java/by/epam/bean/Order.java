package by.epam.bean;

import java.sql.Timestamp;

public class Order extends Model{


    private User user;
    private Song song;
    private int payment;
    private Timestamp data;

    public Order() {
    }

    public Order(int id) {
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

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (payment != order.payment) return false;
        if (user != null ? !user.equals(order.user) : order.user != null) return false;
        if (song != null ? !song.equals(order.song) : order.song != null) return false;
        return data != null ? data.equals(order.data) : order.data == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (song != null ? song.hashCode() : 0);
        result = 31 * result + payment;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", song=" + song +
                ", payment=" + payment +
                ", data=" + data +
                '}';
    }
}
