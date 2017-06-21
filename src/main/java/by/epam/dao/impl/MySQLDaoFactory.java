package by.epam.dao.impl;

import by.epam.dao.FactoryDao;
import by.epam.dao.ModelDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDaoFactory implements FactoryDao{

    private String user = "root";
    private String password = "1234";
    private String url = "jdbc:mysql://localhost/mediaserver?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String driver = "com.mysql.jdbc.Driver";

    public MySQLDaoFactory() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public ModelDao getUserDao(Connection connection) {
        return new MySQLUserDao(connection);
    }
}
