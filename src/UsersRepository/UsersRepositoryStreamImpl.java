package UsersRepository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

public class UsersRepositoryStreamImpl implements UsersRepository {
    private FileInputStream fileInputStream;
    private FileOutputStream fileOutputStream;

    public UsersRepositoryStreamImpl(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        this.fileInputStream = fileInputStream;
        this.fileOutputStream = fileOutputStream;
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
