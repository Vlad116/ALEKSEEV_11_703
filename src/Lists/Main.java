package Lists;

public class Main {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(18);
        list.add("Ильяс");
        list.add("Влад 195");
        list.add("Андрей");
        list.add(45);
        list.add(45);
        list.showList();
        list.addToBegin("Сидиков Марсель Рафаэльевич");
        list.addToBegin("Goroshko");
        list.showList();
        list.reverse();
        list.showList();
        list.remove("Goroshko");
        list.remove(18);
        list.remove(45);
        list.showList();
        System.out.println(list.get(2));
        System.out.println(list.indexOf("Влад 195"));
        System.out.println(list.contains("Goroshko"));
        System.out.println(list.contains("Андрей"));
        System.out.println(list.size());

        List secondList = new LinkedList<>();
        secondList.add("Даша");
        secondList.add("Ирина");
        secondList.add("Ильяс");
        LinkedList thirdList = new LinkedList<>();
        thirdList.add("Анита");
        thirdList.add("Денис");
        thirdList.add("Марсель");
        for (Object name : secondList) {
            System.out.println(name);
        }

        for (Object name : thirdList) {
            System.out.println(name);
        }
      /*  LinkedList<String> newLinkedList = LinkedList.merge(secondList, thirdList);

        for (String name : newLinkedList) {
            System.out.println(name);
        }*/
/*
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.addToBegin("Vlad");
        stringArrayList.addToBegin("Ilyas");
        stringArrayList.addToBegin("Dima");
        stringArrayList.addToBegin("Kazan");
        stringArrayList.addToBegin("Spain");
        stringArrayList.addToBegin("Russia");
        stringArrayList.add("Olymp");
        stringArrayList.add("KFU");
        stringArrayList.add("Marsel");
        stringArrayList.add("Orange");
        stringArrayList.add("Full");
        stringArrayList.showList();
        stringArrayList.reverse();
        stringArrayList.showList();
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList.contains("Vlad"));
        System.out.println(stringArrayList.get(3));
        System.out.println(stringArrayList.indexOf("Kazan"));
        stringArrayList.remove("Ilyas");
        stringArrayList.showList();
*/
    }
}
