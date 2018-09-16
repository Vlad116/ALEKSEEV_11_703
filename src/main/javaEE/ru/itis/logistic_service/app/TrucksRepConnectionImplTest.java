package ru.itis.logistic_service.app;

import lombok.SneakyThrows;
import ru.itis.logistic_service.models.Truck;
import ru.itis.logistic_service.repositories.TrucksRepository;
import ru.itis.logistic_service.repositories.TrucksRepositoryConnectionImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class TrucksRepConnectionImplTest {

    // данные для подключения
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "logistic";
    private static final String URL = "jdbc:postgresql://localhost:5432/logistic_service";

    @SneakyThrows
    public static void main(String[] args) {
        Connection connection =
                DriverManager.getConnection(URL, USERNAME, PASSWORD);
        TrucksRepository trucksRepository = new TrucksRepositoryConnectionImpl(connection);
        Truck maz = Truck.builder()
                .mark("MAZ")
                .registrationNumber("3BMK25RU116")
                .build();



        trucksRepository.save(maz);
        System.out.println(trucksRepository.findOne(1L));
        Truck mazUP = trucksRepository.findOne(1L);
        mazUP.setRegistrationNumber("3ITIS703RU116");
        trucksRepository.update(mazUP);
        System.out.println();
//        User marselUP = usersRepository.findOneByEmail("sidikov.marsel@gmail.com");
//        System.out.println(marselUP);
//        marselUP.setPhoneNumber("+79882929979");
////        System.out.println(marselUP);
//        usersRepository.update(marselUP);
//        System.out.println(usersRepository.findOneByEmail("sidikov.marsel@gmail.com"));
//
//        System.out.println(usersRepository.findOneByPhoneNumber("+79882929979"));
//        System.out.println(usersRepository.findAllByFirstName("Ivan"));
//        usersRepository.delete(4L);
        System.out.println(trucksRepository.findAll());


    }
}
