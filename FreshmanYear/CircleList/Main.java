package CircleList;

public class Main {
    public static void main(String[] args) {
        CircleList circleList = new CircleList("members");
        System.out.println("Размер списка равен " + circleList.size());
        circleList.showList();
        circleList.sort("Marsel");
        System.out.println("Первым становиться переданный в sort, остальные сортируются по лексикографическому принципу:");
        circleList.showList();
        System.out.println();
        System.out.println("Удалили Айдара:");
        circleList.delete("Aidar");
        circleList.showList();
        System.out.println();
        Participant newParticipant = new Participant("Marina", "female");
        circleList.insert(newParticipant);
        System.out.println("Добавили Марину:");
        circleList.showList();
        System.out.println();
        //System.out.println(circleList.last(2).toString());*/
        System.out.println("Разделили на два списка по половому признаку:");
        System.out.println();
        CircleList[] gender = circleList.gender();
        gender[0].showList();
        gender[1].showList();
    }
}