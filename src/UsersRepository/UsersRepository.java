package UsersRepository;

import java.util.List;

/*Описать интерфейс UsersRepository - интерфейс для работы с объектами типа User
 * (логин, пароль, имя, фамилия)
 */

public interface UsersRepository {
    void save(User user);

    void deleteByLogin(String login);

    User findByLogin(String login);

    List<User> findAll();
}
