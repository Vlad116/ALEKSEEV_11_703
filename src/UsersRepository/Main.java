package UsersRepository;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        UsersRepositoryWriterReaderImpl usersRepositoryWriterReader = new UsersRepositoryWriterReaderImpl("C:\\Users\\Nadin\\Desktop\\ALEKSEEV_11_703\\userRepository.txt");

        usersRepositoryWriterReader.clear();

        User vlad = new User("VladKzn", "1241352", "Vladislav", "Alekseev");
        User dasha = new User("Dariya", "qwerty", "Darya", "Shagieva");
        User marsel = new User("MarselJavaDev", "HardPassword", "Marsel", "Sidikov");

        usersRepositoryWriterReader.save(vlad);
        usersRepositoryWriterReader.save(dasha);
        usersRepositoryWriterReader.save(marsel);

        User findTest = usersRepositoryWriterReader.findByLogin("MarselJavaDev");
        System.out.println(findTest.toString() + "Мы нашли его..." + "\n");

        List<User> userList = usersRepositoryWriterReader.findAll();
        User user2 = userList.get(0);
        User user3 = userList.get(1);

        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(userList.size());

        usersRepositoryWriterReader.deleteByLogin("Dariya");

        userList = usersRepositoryWriterReader.findAll();
        user2 = userList.get(0);
        user3 = userList.get(1);

        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(userList.size());

    }
}