package UsersRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryObjectsImpl implements UsersRepository {
    private File userRepositoryFile = null;

    public UsersRepositoryObjectsImpl(String filePath) {
        this.userRepositoryFile = new File(filePath);
    }

    @Override
    public void save(User user) throws FileNotFoundException {

        try {
            List<User> users = findAll();

            if (users == null) {
                users = new ArrayList<User>();
            }

            users.add(user);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(userRepositoryFile));

            objectOutputStream.writeObject(users);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clear() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userRepositoryFile))) {
            bufferedWriter.write("");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByLogin(String login) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(userRepositoryFile));
            List<User> users = findAll();
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(userRepositoryFile));
            for (User user : users) {
                if (user.getLogin().equals(login)) {
                    users.remove(user);
                }
            }

            outputStream.writeObject(users);
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findByLogin(String login) {

        List<User> userList = findAll();

        for (User user : userList) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }

        System.out.println("This user not find");
        return null;
    }


    @Override
    public List<User> findAll() {

        try {
            FileInputStream fileInputStream = new FileInputStream(userRepositoryFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List users = ((List<User>) objectInputStream.readObject());
            return users;
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

}