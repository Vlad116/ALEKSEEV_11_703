package ClassWork.Motorist;

import java.io.*;

public class MotoristDataAnalazy {

    void printStat(String firstFile, String secondFile) throws IOException {

        FileReader fileReaderUsers = new FileReader(firstFile);
        FileReader fileReaderCars = new FileReader(secondFile);

        BufferedReader fisrtBufferedReaderUsers = new BufferedReader(fileReaderUsers);
        BufferedReader secondBufferedReaderCars = new BufferedReader(fileReaderCars);


        int usersLineCount = 0;
        int carsLineCount = 0;

        fisrtBufferedReaderUsers.mark(1000);
        String usersLine;
        usersLine = fisrtBufferedReaderUsers.readLine();
        while ((usersLine = fisrtBufferedReaderUsers.readLine()) != null) {
            usersLineCount++;
        }
        fisrtBufferedReaderUsers.reset();

        secondBufferedReaderCars.mark(1000);
        String carsLine;
        carsLine = secondBufferedReaderCars.readLine();
        while ((carsLine = secondBufferedReaderCars.readLine()) != null) {
            carsLineCount++;
        }
        secondBufferedReaderCars.reset();

        int[] ages = new int[101];
        User[] users = new User[usersLineCount];
        Car[] cars = new Car[carsLineCount];

        usersLine = fisrtBufferedReaderUsers.readLine();
        carsLine = secondBufferedReaderCars.readLine();

        int i = 0;
        do {
            String data[] = usersLine.split(" ");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            int age = Integer.parseInt(data[2]);
            User userFromFile = new User(id, data[1], age);
            users[i] = userFromFile;
            i++;
        } while (i < usersLineCount && ((usersLine = fisrtBufferedReaderUsers.readLine()) != null));
        fisrtBufferedReaderUsers.close();

        int j = 0;
        do {
            String data[] = carsLine.split(" ");
            int id = Integer.parseInt(data[0]);
            int owner_id = Integer.parseInt(data[2]);
            Car carFromFile = new Car(id, data[1], owner_id);
            cars[j] = carFromFile;
            j++;
        } while (j < carsLineCount && ((carsLine = secondBufferedReaderCars.readLine()) != null));
        secondBufferedReaderCars.close();

        for (i = 0; i < usersLineCount; i++) {
            for (j = 0; j < carsLineCount; j++) {
                if (users[i].getId() == cars[j].getOwner_id()) {
                    ages[users[i].getAge()]++;
                }
            }
        }

        for (int n = 0; n < ages.length; n++) {
            if (ages[n] != 0) {
                System.out.println("Возраст: " + n + " Кол-во машин: " + ages[n]);
            }
        }
    }
}


