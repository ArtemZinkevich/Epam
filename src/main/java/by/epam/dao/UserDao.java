package by.epam.dao;

import by.epam.bean.User;

public interface UserDao  extends ModelDao{

    public User getByLogin();

}
