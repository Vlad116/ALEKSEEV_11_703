package UsersRepository;

import java.io.FileNotFoundException;
import java.util.List;

/*Описать интерфейс UsersRepository - интерфейс для работы с объектами типа User
 * (логин, пароль, имя, фамилия)
 */

public interface UsersRepository {
    void save(User user) throws FileNotFoundException;

    void deleteByLogin(String login) throws InterruptedException;

    User findByLogin(String login);

    List<User> findAll() throws FileNotFoundException, ClassNotFoundException;
}
