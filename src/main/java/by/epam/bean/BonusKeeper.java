package by.epam.bean;

public class BonusKeeper extends Model {

    private Bonus bonus;
    private User user;

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BonusKeeper)) return false;

        BonusKeeper that = (BonusKeeper) o;

        if (bonus != null ? !bonus.equals(that.bonus) : that.bonus != null) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = bonus != null ? bonus.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BonusKeeper{" +
                "bonus=" + bonus +
                ", user=" + user +
                '}';
    }
}
