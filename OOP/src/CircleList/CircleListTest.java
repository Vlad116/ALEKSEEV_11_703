package CircleList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CircleListTest {
    private CircleList circleList;

    @Before
    public void setUp() {
        circleList = new CircleList("members");
    }

    @Test
    public void testConstructor() {
        Participant current = circleList.getFirstParticipant();
        Boolean test = true;
        try {
            Scanner file = new Scanner(new File("members"));
            for (int i = 0; (i < circleList.size() || file.hasNext()) && test; i++) {
                String[] currentLine = file.nextLine().split(" ");
                if (!current.getName().equals(currentLine[0]) || !current.getGender().equals(currentLine[1])) {
                    test = false;
                }
                current = current.getNext();
            }
        } catch (FileNotFoundException e) {
            test = false;
        }
        assertTrue(test);
    }

    @Test
    public void testSize() {
        assertTrue(circleList.size() == 8);
    }

    @Test
    public void testDeleteOnFirstParticipant() {
        System.out.println("Тест удаления на первом элементе:");
        circleList.showList();
        Participant temp = circleList.getFirstParticipant().next;
        circleList.delete(circleList.getFirstParticipant().getName());
        circleList.showList();
        System.out.println();
        assertTrue((circleList.getFirstParticipant().getName().equals(temp.getName())) && circleList.size() == 7);
    }

    @Test
    public void testDeleteOnLastParticipant() {
        System.out.println("Тест удаления на последнем элементе:");
        String last = circleList.getLastParticipant().getName();
        circleList.showList();
        circleList.delete(last);
        circleList.showList();
        System.out.println();
        assertTrue(circleList.getLastParticipant().getName().equals(last) && circleList.size() == 7);
    }

    @Test
    public void testDeleteOnCenterParticipant() {
        System.out.println("Тест удаления на центральном элементе:");
        circleList.showList();
        circleList.delete("Goroshko");
        Participant currentParticipant = circleList.getFirstParticipant();
        int i = 0;
        boolean test = false;
        while (i < circleList.size()) {
            if (currentParticipant.getName().equals("Goroshko")) {
                test = true;
                break;
            }
            currentParticipant = currentParticipant.next;
            i++;
        }
        circleList.showList();
        System.out.println();
        assertFalse(test && circleList.size() == 7);
    }

    @Test
    public void testInsert() {
        System.out.println("Тест вставки:");
        Participant newParticipant = new Participant("Yulya", "female");
        int formerSize = circleList.size();
        circleList.insert(newParticipant);
        circleList.showList();
        System.out.println();
        assertTrue(circleList.getLastParticipant().getName().equals(newParticipant.getName()) && circleList.size() == ++formerSize);
    }

    @Test
    public void testLast() {
       Participant testParticipant = circleList.last(3);
       assertTrue(circleList.getLastParticipant().getName().equals(testParticipant.getName()));
    }

    @Test
    public void testGender() {
        System.out.println("Тест разделения на два списка по полу:");
        CircleList[] gender = circleList.gender();
        Participant maleCurrentParticipant = gender[0].getFirstParticipant();
        Participant femaleCurrentParticipant = gender[1].getFirstParticipant();
        boolean test = true;
        int summSize = 0;
        for (int i = 0; i < gender.length && test; i++) {
            summSize += gender[i].size();
            gender[i].showList();
            System.out.println();
            for (int j = 0; j < gender[i].size() && test; j++) {
                if (i == 0 && maleCurrentParticipant.getGender().equals("male")) {
                    maleCurrentParticipant = maleCurrentParticipant.next;
                } else if (i == 1 && femaleCurrentParticipant.getGender().equals("female")) {
                    femaleCurrentParticipant = femaleCurrentParticipant.next;
                } else {
                    test = false;
                }
            }
        }
        assertTrue(test && (circleList.size() == summSize));
    }


    @Test
    public void testSort() {
        System.out.println("Тест сортировки:");
        circleList.showList();
        circleList.sort("Dasha");
        circleList.showList();
        System.out.println();
        boolean test = true;
        Participant currentParticipant = circleList.getFirstParticipant().getNext();

        if (!circleList.getFirstParticipant().getName().equals("Dasha")) {
            test = false;
        }

        int i = 0;
        while (i < circleList.size() - 2 && test) {
            if (currentParticipant.compareTo(currentParticipant.next) > 0) {
                test = false;
            }
            currentParticipant = currentParticipant.next;
            i++;
        }
        assertTrue(test);
    }

    @Test
    public void testPutTheFirst() {
        circleList.putTheFirst("Goroshko");
        assertTrue(circleList.getFirstParticipant().getName().equals("Goroshko"));
    }
}
