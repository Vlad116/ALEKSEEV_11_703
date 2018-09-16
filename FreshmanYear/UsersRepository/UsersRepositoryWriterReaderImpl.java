package UsersRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryWriterReaderImpl implements UsersRepository {

    private File userRepositoryFile;

    public UsersRepositoryWriterReaderImpl(String filePath) {
        this.userRepositoryFile = new File(filePath);
    }

    @Override
    public void save(User user) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userRepositoryFile, true))) {
            String data = user.getLogin() + " " + user.getPassword() + " " + user.getFirstName() + " " + user.getSecondName();
            bufferedWriter.write(data);
            bufferedWriter.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void clear() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userRepositoryFile))) {
            bufferedWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteByLogin(String login) throws InterruptedException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userRepositoryFile, true))) {
            List<User> userList = findAll();

            User current;

            int i = 0;

            clear();
            while (i < userList.size()) {

                current = userList.get(i);

                if (!(current.getLogin().equals(login))) {
                    String data = current.getLogin() + " " + current.getPassword() + " " + current.getFirstName() + " " + current.getSecondName();
                    bufferedWriter.write(data);
                    bufferedWriter.append("\n");

                }
                i++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findByLogin(String login) {

        User wantedUser = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(userRepositoryFile))) {

            String data = bufferedReader.readLine();

            while (data != null) {

                String userData[] = data.split(" ");

                if (userData[0].equals(login)) {
                    wantedUser = new User(userData[0], userData[1], userData[2], userData[3]);
                }

                data = bufferedReader.readLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (wantedUser != null) {
            return wantedUser;
        } else {
            System.out.println("This user not find");
            return null;
        }
    }

    @Override
    public List<User> findAll() {

        List<User> users = new ArrayList<User>(10);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(userRepositoryFile))) {

            User user;
            String data = bufferedReader.readLine();

            while (data != null && data.charAt(0) != 0) {
                String userData[] = data.split(" ");
                users.add(user = new User(userData[0], userData[1], userData[2], userData[3]));
                data = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!users.isEmpty()) {
            return users;
        } else {
            System.out.println("File is empty");
            return null;
        }
    }

}