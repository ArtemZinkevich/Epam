package by.epam.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface FactoryDao {

    Connection getConnection() throws SQLException;

    ModelDao getUserDao(Connection connection);

}
