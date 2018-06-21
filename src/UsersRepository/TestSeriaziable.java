package UsersRepository;

import java.io.FileNotFoundException;
import java.util.List;

public class TestSeriaziable {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {

        User vlad = new User("VladKzn", "1241352", "Vladislav", "Alekseev");
        User dasha = new User("Dariya", "qwerty", "Darya", "Shagieva");
        User marsel = new User("MarselJavaDev", "HardPassword", "Marsel", "Sidikov");

        UsersRepositoryObjectsImpl usersRepositoryObjects = new UsersRepositoryObjectsImpl("C:\\Users\\Nadin\\Desktop\\ALEKSEEV_11_703\\usersRepositorySerializable.txt");

        usersRepositoryObjects.clear();

        usersRepositoryObjects.save(vlad);
        usersRepositoryObjects.save(dasha);
        usersRepositoryObjects.save(marsel);

        List<User> userList = usersRepositoryObjects.findAll();
        User user2 = userList.get(0);
        User user3 = userList.get(1);
        User user4 = userList.get(2);

        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(userList.size());

        User findTest = usersRepositoryObjects.findByLogin(marsel.getLogin());
        System.out.println(findTest.toString() + "Мы нашли его..." + "\n");
//        System.out.println("sf");
        usersRepositoryObjects.deleteByLogin("Dariya");
        System.out.println("After delete Dariya" + "\n");

        List<User> afterDeleteUserList = usersRepositoryObjects.findAll();
        user2 = afterDeleteUserList.get(0);
        user3 = afterDeleteUserList.get(1);

        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(afterDeleteUserList.size());

    }
}
