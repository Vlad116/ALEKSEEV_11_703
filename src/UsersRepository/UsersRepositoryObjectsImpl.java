package UsersRepository;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class UsersRepositoryObjectsImpl implements UsersRepository {
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    public UsersRepositoryObjectsImpl(ObjectInputStream objectInputStream, ObjectOutputStream objectOutputStream) {
        this.objectInputStream = objectInputStream;
        this.objectOutputStream = objectOutputStream;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteByLogin(String login) {

    }

    @Override
    public User findByLogin(String login) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
