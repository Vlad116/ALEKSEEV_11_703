package Lists;

import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("Даша");
//        list.add("Ирина");
//        list.add("Ильяс, просто так");
//        list.add("Анита");
//        list.add("Денис");
//        list.add("Марсель");
//
////        Iterator<String> iterator = list.iterator();
////
////        while (iterator.hasNext()) {
////            System.out.println(iterator.next());
////        }
//
//        for (String name : list) {
//            System.out.println(name);
//        }
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(7);
        integerList.add(6);
        integerList.add(5);
        integerList.add(4);
        integerList.add(3);
        integerList.add(2);
        integerList.add(0);
        integerList.add(1);
        integerList.remove(7);
        integerList.remove(1);

        IntComp intComp = new IntComp();
//       integerList.stream().filter(x -> x % 2 == 0);
        integerList.stream().map(x -> x + 3).filter(x -> x % 2 == 1).sorted(intComp);

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class IntComp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
//            if (o1 == o2) {
//                return 0;
//            }
//            if (o1 > o2)
//                return 1;
//            if (o2 > o1)
//                return -1;
//            return 0;
        return o1 - o2;
    }
}
