package ru.itis.logistic_service.app;

import lombok.SneakyThrows;
import ru.itis.logistic_service.models.User;
import ru.itis.logistic_service.repositories.UsersRepository;
import ru.itis.logistic_service.repositories.UsersRepositoryConnectionImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Optional;

public class UsersRepConnectionImplTest {


    // данные для подключения
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "logistic";
    private static final String URL = "jdbc:postgresql://localhost:5432/logistic_service";

    @SneakyThrows
    public static void main(String[] args) {
        Connection connection =
                DriverManager.getConnection(URL, USERNAME, PASSWORD);
        UsersRepository usersRepository = new UsersRepositoryConnectionImpl(connection);

        User marsel = User.builder()
                .firstName("Marsel")
                .lastName("Sid")
                .email("upalsharnanogu@mail.ru")
                .hashPassword("$2a$04$haa5TuuxGMha5EsBtXunbOlioV4W0GmhJ5Qbpqx6S9tQHcz2YDaD.")
                .build();

        System.out.println(usersRepository.findOne(2L));


        usersRepository.save(marsel);

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
        System.out.println(usersRepository.findAll());


    }

}
