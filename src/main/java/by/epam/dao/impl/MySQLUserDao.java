package by.epam.dao.impl;

import by.epam.bean.Model;
import by.epam.bean.User;
import by.epam.exeption.PersistException;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLUserDao extends AbstractJdbcDao {

    private static final Logger log = Logger.getLogger(MySQLUserDao.class);
    public MySQLUserDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getSelectQuery() {
        return "Select * FROM mediaserver.t_user";
    }

    @Override
    public String getCreateQuery() {
        return "INSERT INTO mediaserver.t_user " +
                "(user_login, user_password, user_name, user_surname, user_email, user_dataOfBirth) \n" +
                "VALUES (?, ?, ?, ?, ?, ?);";
    }

    @Override
    protected String getUpdateQuery() {
        return  "UPDATE mediaserver.t_user SET user_login = ?, user_password = ?, user_name = ?, user_surname = ?, " +
                "user_email = ?, user_dataOfBirth = ?, WHERE user_id= ?;";
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM mediaserver.t_USER WHERE user_id= ?;";
    }

    @Override
    protected List<Model> parseResultSet(ResultSet rs) {
        List<Model> list = new ArrayList<>();
        try {

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("user_id"));
                user.setLogin(rs.getString("user_login"));
                user.setPassword(rs.getString("user_password"));
                user.setName(rs.getString("user_name"));
                user.setSurname(rs.getString("user_surname"));
                user.setEmail(rs.getString("user_email"));
                user.setDateOfBirth(rs.getDate("user_dateOfBirth"));
                list.add(user);
            }
        } catch (SQLException e) {
            log.warn(e);
        }
        return list;
    }

    @Override
    protected void prepareStatementForUpdate(PreparedStatement statement, Model object) {

    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, Model object) throws PersistException {

    }

    @Override
    protected void prepareStatementForDelete(PreparedStatement statement, Model object) {

    }


    /*private static final Logger log = Logger.getLogger(MySQLUserDao.class);
    private static final String SQL_READ = "SELECT * FROM mediaserver.t_user WHERE user_id = ?;";
    private static final String SQL_GET_ALL = "SELECT * FROM mediaserver.t_user;";
    private static final String SQL_DELETE = "DELETE * FROM mediaserver.t_user WHERE user_id = ?;";

    private Connection connection = null;

    public MySQLUserDao(Connection connection) {
        log.trace("Open connection");
        this.connection = connection;
    }

    @Override
    public Model add(Model model) {
        return null;
    }

    public User getById(int key) {

        User user = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            log.trace("Create PreparedStatement");
            stm = connection.prepareStatement(SQL_READ);
            stm.setInt(1, key);
            try {
                log.trace("Get ResultSet");
                rs = stm.executeQuery();
                try {
                    rs.next();
                    log.trace("Create User to return");
                    user = new User();
                    user.setId(rs.getInt("user_id"));
                    user.setLogin(rs.getString("user_login"));
                    user.setPassword(rs.getString("user_password"));
                    user.setName(rs.getString("user_name"));
                    user.setSurname(rs.getString("user_surname"));
                    user.setEmail(rs.getString("user_email"));
                    user.setDateOfBirth(rs.getDate("user_dateOfBirth"));

                } finally {
                    try {
                        rs.close();
                        log.trace("ResultSet close");
                    } catch (SQLException e) {
                        log.warn("Cannot close ResultSet", e);
                    }
                }
            } finally {
                try {
                    stm.close();
                    log.trace("PreparedStatement close");
                } catch (SQLException e) {
                    log.warn("Cannot close PreparedStatement", e);
                }
            }
            //Нужно ли здесь закрывать Connection???? Или можно не закрывать его до окончания работы класса?

        } catch (SQLException e) {
            log.warn(e);
        }
        return user;
    }

    @Override
    public void update(Model model) {

    }

    @Override
    public void delete(Model model) {

    }

    public List<Model> getAll() {

        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Model> list = null;
        try {
            log.trace("Create PreparedStatement");
            stm = connection.prepareStatement(SQL_GET_ALL);
            try {
                log.trace("Get ResultSet");
                rs = stm.executeQuery();
                list = new ArrayList<Model>();
                try {
                    while (rs.next()) {
                        User user = new User();
                        user.setId(rs.getInt("user_id"));
                        user.setLogin(rs.getString("user_login"));
                        user.setPassword(rs.getString("user_password"));
                        user.setName(rs.getString("user_name"));
                        user.setSurname(rs.getString("user_surname"));
                        user.setEmail(rs.getString("user_email"));
                        user.setDateOfBirth(rs.getDate("user_dateOfBirth"));
                        list.add(user);
                    }
                } finally {
                    try {
                        rs.close();
                        log.trace("ResultSet close");
                    } catch (SQLException e) {
                        log.warn("Cannot close ResultSet", e);
                    }
                }
            } finally {
                try {
                    stm.close();
                    log.trace("PreparedStatement close");
                } catch (SQLException e) {
                    log.warn("Cannot close PreparedStatement", e);
                }
            }
        } catch (SQLException e) {
            log.warn(e);
        }
        return list;
    }

    @Override
    public User getByLogin() {
        return null;
    }*/
}