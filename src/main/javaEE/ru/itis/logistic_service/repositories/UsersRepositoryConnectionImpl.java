package ru.itis.logistic_service.repositories;

import lombok.SneakyThrows;
import ru.itis.logistic_service.models.User;
import ru.itis.logistic_service.mappers.RowMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersRepositoryConnectionImpl implements UsersRepository {

    private Connection connection;

    //language=SQL
    private static final String SQL_INSERT_QUERY = "INSERT INTO logistic_service_user(email, hash_password, first_name, last_name, address, phonenumber  )" +
            "VALUES (?, ?, ?, ?, ?, ?);";

//    //language=SQL
//    private static final String SQL_DELETE = "DELETE FROM logistic_service_user WHERE "
//            + "id = ?";
//
//    //language=SQL
//    private static final String SQL_UPDATE_QUERY = " update logistic_service_user " +
//            "SET email = ?" + ", hash_password = ?" +
//            ",first_name = ?" + ",last_name = ?" +
//            ",address = ?" + ",phonenumber = ?" +
//            " WHERE id = ?;";

    public UsersRepositoryConnectionImpl(Connection connection) {
        this.connection = connection;
    }


    private RowMapper<User> userRowMapper = resultSet -> User.builder()
            .email(resultSet.getString("email"))
            .hashPassword(resultSet.getString("hash_password"))
            .firstName(resultSet.getString("first_name"))
            .lastName(resultSet.getString("last_name"))
            .address(resultSet.getString("address"))
            .phoneNumber(resultSet.getString("phonenumber"))
            .id(resultSet.getLong("id"))
            .build();

    @Override
    public User findOne(Long id) {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM logistic_service_user WHERE id = " + id);
            resultSet.next();
            return userRowMapper.rowMap(resultSet);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }

    @SneakyThrows
    @Override
    public void save(User model) {

        PreparedStatement statement = connection.prepareStatement(SQL_INSERT_QUERY, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, model.getEmail());
        statement.setString(2, model.getHashPassword());
        statement.setString(3, model.getFirstName());
        statement.setString(4, model.getLastName());
        statement.setString(5, model.getAddress());
        statement.setString(6, model.getPhoneNumber());
        statement.execute();

        ResultSet resultSet = statement.getGeneratedKeys();

        while (resultSet.next()) {
            model.setId(resultSet.getLong("id"));
        }

    }

    @Override
    @SneakyThrows

    public void update(User model) {

        Statement statement = connection.createStatement();

        int resultSet =
                statement.executeUpdate("UPDATE logistic_service_user " +
                        "SET email = '" + model.getEmail() + "',hash_password = '" + model.getHashPassword() +
                        "',first_name = '" + model.getFirstName() + "',last_name = '" + model.getLastName() +
                        "',address = '" + model.getAddress() + "',phonenumber = '" + model.getPhoneNumber() + "'" +
                        "WHERE id = " + model.getId() + ';');
        System.out.println(resultSet);
    }

    @Override
    public void delete(Long id) {

        try {
            Statement statement = connection.createStatement();

            int resultSet =
                    statement.executeUpdate("DELETE FROM logistic_service_user WHERE id = " + id + ";");

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    //laguage=SQL
    public List<User> findAll() {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM logistic_service_user");
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                User newUser = userRowMapper.rowMap(resultSet);
                users.add(newUser);
            }
            return users;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    //language=SQL
    public User findOneByPhoneNumber(String phoneNumber) {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM logistic_service_user WHERE phonenumber = '" + phoneNumber + "';");
            resultSet.next();
            return userRowMapper.rowMap(resultSet);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    public User findOneByEmail(String email) {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM logistic_service_user WHERE email = '" + email + "';");
            resultSet.next();
            return userRowMapper.rowMap(resultSet);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    @SneakyThrows
    //language=SQL
    public List<User> findAllByFirstName(String firstName) {

        Statement statement = connection.createStatement();
        ResultSet resultSet =
                statement.executeQuery("SELECT * FROM logistic_service_user WHERE first_name = '" + firstName + "';");
        List<User> users = new ArrayList<>();

        while (resultSet.next()) {
            User newUser = userRowMapper.rowMap(resultSet);
            users.add(newUser);
        }
        return users;

    }

}