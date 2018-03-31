package CircleList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CircleList implements List {

    private Participant firstParticipant;
    private Participant lastParticipant;
    private int count;

    /* Создание кольцевого списка с помощью считывания информации из текстового файла*/

    public CircleList() {
        this.count = 0;
    }

    public Participant getFirstParticipant() {
        return firstParticipant;
    }

    public Participant getLastParticipant() {
        return lastParticipant;
    }

    public CircleList(String filename) {
        try {
            File file = new File(filename);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String strLine;
            while ((strLine = reader.readLine()) != null) {
                String firstParticipantData[] = strLine.split(" ");
                Participant newParticipant = new Participant(firstParticipantData[0], firstParticipantData[1]);
                if (firstParticipant == null) {
                    firstParticipant = newParticipant;
                    lastParticipant = newParticipant;
                } else {
                    lastParticipant.next = newParticipant;
                    lastParticipant = newParticipant;
                }
                count++;
            }
            lastParticipant.next = firstParticipant;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*Начав отчет с первого, удаляя каждого k-го. Установить последнего оставшегося участника */
    Participant last(int k) {
        Participant currentParticipant = firstParticipant;
        int n = 1;
        while (count > (k - 1)) {
            if (n % k == 0) {
                this.delete(currentParticipant.getName());
            } else {
                currentParticipant = currentParticipant.next;
            }
            n++;
        }
        return currentParticipant;
    }

    /* Из списка участников построить два списка, состоящих соответственно из мужчин и женщин.
       Метод возвращает ссылки на соответствующие подсписки.*/
    CircleList[] gender() {
        CircleList male = new CircleList();
        CircleList female = new CircleList();
        CircleList[] gender = {male, female};
        Participant currentParticipant = firstParticipant;
        for (int i = 0; i < count; i++) {
            if (currentParticipant.getGender().equals("male")) {
                male.insert(new Participant(currentParticipant.getName(), currentParticipant.getGender()));
            } else {
                female.insert(new Participant(currentParticipant.getName(), currentParticipant.getGender()));
            }
            currentParticipant = currentParticipant.next;
        }
        return gender;
    }

    /* Количество участников */
    @Override
    public int size() {
        return count;
    }

    /* вывод содержимого листа на экран; */
    @Override
    public void showList() {
        Participant currentParticipant = firstParticipant;
        for (int i = 0; i < count - 1; i++) {
            System.out.print(currentParticipant.getName() + " " + currentParticipant.getGender() + ", ");
            currentParticipant = currentParticipant.next;
        }
        System.out.print(currentParticipant.getName() + " " + currentParticipant.getGender() + ".");
        System.out.println();
    }

    /* вставка нового участника в список;*/

    public void insert(Participant p) {
        if (firstParticipant == null) {
            firstParticipant = p;
            lastParticipant = p;
        } else {
            lastParticipant.next = p;
            lastParticipant = p;
        }
        count++;
    }

    /* удаление участника из списка по имени; */
    @Override
    public void delete(String name) {
        Participant currentParticipant = firstParticipant;
        if (currentParticipant.getName().equals(name)) {
            firstParticipant = firstParticipant.next;
            count--;
            return;
        }
        int i = 0;
        while (i < count) {
            if (currentParticipant.next.getName().equals(name)) {
                currentParticipant.next = currentParticipant.next.next;
                count--;
                break;
            }
            currentParticipant = currentParticipant.next;
            i++;
        }
    }

    /* выбрав некоторый элемент с именем name в качестве начального, провести сортировку исходного списка */

    public void putTheFirst(String name) {
        Participant currentParticipant = firstParticipant;
        int i = 0;
        while (i < count) {
            if (currentParticipant.next.getName().equals(name)) {
                firstParticipant = currentParticipant.next;
                break;
            } else {
                currentParticipant = currentParticipant.next;
            }
            i++;
        }
    }

    @Override
    public void sort(String name) {
        CircleList[] stack = new CircleList[32];
        this.lastParticipant.next = null;
        Participant currentParticipant = firstParticipant;
        stack[0] = new CircleList();
        Participant toAdd = new Participant(currentParticipant.getName(), currentParticipant.getGender());
        currentParticipant = currentParticipant.next;
        stack[0].insert(toAdd);
        stack[1] = new CircleList();
        toAdd = new Participant(currentParticipant.getName(), currentParticipant.getGender());
        currentParticipant = currentParticipant.next;
        stack[1].insert(toAdd);
        int currentPosition = 1;
        while (currentParticipant != null) {
            if (currentPosition != 0) {
                if (stack[currentPosition].count == stack[currentPosition - 1].count) {
                    stack[currentPosition - 1] = merge(stack[currentPosition], stack[currentPosition - 1]);
                    stack[currentPosition] = null;
                    currentPosition--;
                } else {
                    currentPosition++;
                    stack[currentPosition] = new CircleList();
                    toAdd = new Participant(currentParticipant.getName(), currentParticipant.getGender());
                    currentParticipant = currentParticipant.next;
                    stack[currentPosition].insert(toAdd);
                }
            } else {
                currentPosition++;
                stack[currentPosition] = new CircleList();
                toAdd = new Participant(currentParticipant.getName(), currentParticipant.getGender());
                currentParticipant = currentParticipant.next;
                stack[currentPosition].insert(toAdd);
            }
        }
        for (int i = currentPosition; i > 0; i--) {
            stack[i - 1] = merge(stack[i - 1], stack[i]);
        }
        firstParticipant = stack[0].firstParticipant;
        lastParticipant = stack[0].lastParticipant;
        lastParticipant.next = firstParticipant;
        Participant temp = firstParticipant;
        for (int i = 0; i < this.size(); i++) {
            if (temp.getName().equals(name)) {
                break;
            }
            temp = temp.next;
        }
        delete(temp.getName());
        Participant newParticipant = temp;
        newParticipant.next = firstParticipant;
        firstParticipant = newParticipant;
        count++;
    }

    public static CircleList merge(CircleList firstList, CircleList secondList) {
        CircleList merged = new CircleList();
        Participant toAddParticipant;
        //firstList.showList();
        //secondList.showList();
        firstList.lastParticipant.next = null;
        secondList.lastParticipant.next = null;
        Participant currentFirst = firstList.firstParticipant;
        Participant currentSecond = secondList.firstParticipant;
        while (currentFirst != null && currentSecond != null) {
            if (currentFirst.compareTo(currentSecond) < 0) {
                toAddParticipant = new Participant(currentFirst.getName(), currentFirst.getGender());
                merged.insert(toAddParticipant);
                currentFirst = currentFirst.next;
            } else {
                toAddParticipant = new Participant(currentSecond.getName(), currentSecond.getGender());
                merged.insert(toAddParticipant);
                currentSecond = currentSecond.next;
            }
        }
        while (currentFirst != null) {
            toAddParticipant = new Participant(currentFirst.getName(), currentFirst.getGender());
            merged.insert(toAddParticipant);
            currentFirst = currentFirst.next;
        }
        while (currentSecond != null) {
            toAddParticipant = new Participant(currentSecond.getName(), currentSecond.getGender());
            merged.insert(toAddParticipant);
            currentSecond = currentSecond.next;
        }
        merged.lastParticipant.next = merged.firstParticipant;
        //merged.showList();
        return merged;
    }
}