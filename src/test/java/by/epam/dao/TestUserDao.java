package by.epam.dao;

import by.epam.bean.Model;
import by.epam.bean.User;
import by.epam.dao.impl.AbstractJdbcDao;
import by.epam.dao.impl.MySQLDaoFactory;
import by.epam.dao.impl.MySQLUserDao;
import by.epam.exeption.PersistException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestUserDao {


    @Test
    public void testGetAll() throws SQLException, PersistException {

        FactoryDao daoFactory = new MySQLDaoFactory();
        List<Model> list;
        Connection con = daoFactory.getConnection();
        MySQLUserDao dao = new MySQLUserDao(con);
        list = dao.getAll();
        con.close();
        System.out.println(list);
        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void testGetId() throws SQLException, PersistException {
        FactoryDao daoFactory = new MySQLDaoFactory();
        Model user = new User();
        Connection con = daoFactory.getConnection();
        MySQLUserDao dao = new MySQLUserDao(con);
        user = dao.getById(3);
        con.close();
        System.out.println(user);
    }
}
