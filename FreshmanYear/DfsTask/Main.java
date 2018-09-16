package DfsTask;

public class Main {
    public static void main(String[] args) {
        DFSTask analyzer = new DFSTask();
        analyzer.readMatrix("dfsInputData.txt");
        analyzer.analyze();
//        boolean mk[] = analyzer.getMarks();
//
//        int i = 0;
//
//        while (i < mk.length) {
//            System.out.println(mk[i]);
//            i++;
//        }

    }
}
