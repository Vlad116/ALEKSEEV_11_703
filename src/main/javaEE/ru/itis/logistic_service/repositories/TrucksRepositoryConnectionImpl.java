package ru.itis.logistic_service.repositories;

import lombok.SneakyThrows;
import ru.itis.logistic_service.mappers.RowMapper;
import ru.itis.logistic_service.models.Truck;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class TrucksRepositoryConnectionImpl implements TrucksRepository {

    private Connection connection;

    //language=SQL
    private static final String SQL_INSERT_QUERY = "INSERT INTO trucks(mark,registrationnumber )" +
            "VALUES (?, ?);";

    //language=SQL
    private static final String SQL_DELETE = "DELETE FROM trucks WHERE "
            + "id = ?";

    //language=SQL
    private static final String SQL_UPDATE_QUERY = " update trucks " +
            "SET mark = ?" + ", registrationnumber = ?" +
            " WHERE id = ?;";

    public TrucksRepositoryConnectionImpl(Connection connection) {
        this.connection = connection;
    }

    private RowMapper<Truck> truckRowMapper = resultSet -> Truck.builder()
            .mark(resultSet.getString("mark"))
            .registrationNumber(resultSet.getString("registrationnumber"))
            .id(resultSet.getLong("id"))
            .build();

    @Override
    public Truck findOne(Long id) {

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet =
                    statement.executeQuery("SELECT * FROM trucks WHERE id = " + id);
            resultSet.next();
            return truckRowMapper.rowMap(resultSet);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }

    @SneakyThrows
    @Override
    public void save(Truck model) {

        PreparedStatement statement = connection.prepareStatement(SQL_INSERT_QUERY, Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, model.getMark());
        statement.setString(2, model.getRegistrationNumber());
        statement.execute();

        ResultSet resultSet = statement.getGeneratedKeys();

        while (resultSet.next()) {
            model.setId(resultSet.getLong("id"));
        }

    }

    @SneakyThrows
    @Override
    public void update(Truck model) {
        PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_QUERY, Statement.NO_GENERATED_KEYS);

        statement.setString(1, model.getMark());
        statement.setString(2, model.getRegistrationNumber());
        statement.execute();

    }

    @SneakyThrows
    @Override
    public void delete(Long id) {

        PreparedStatement statement = connection.prepareStatement(SQL_DELETE);

    }

    @Override
    public List<Truck> findAll() {
        return null;
    }

    @Override
    public Truck findOneByRegistrationNumber(String registrationNumber) {
        return null;
    }

    @Override
    public List<Truck> findAllByMark(String mark) {
        return null;
    }

}
