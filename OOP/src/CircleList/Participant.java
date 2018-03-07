package CircleList;

public class Participant implements Comparable<Participant> {
    private String name;
    private String gender;
    Participant next;

    Participant(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    Participant() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Participant getNext() {
        return next;
    }

    public int compareTo(Participant participant) {

        int len1 = this.getName().length();
        int len2 = participant.getName().length();
        int lim = Math.min(len1, len2);
        char v1[] = getName().toCharArray();
        char v2[] = participant.getName().toCharArray();

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }


    @Override
    public String toString() {
        return name + ", " + gender;
    }
}
