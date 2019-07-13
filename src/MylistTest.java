public class MylistTest {
    public static void main(String[] args) {
        MyList <Integer> myList = new MyList<Integer>();
        myList.add(0, 10);
        myList.add(1, 20);
        MyList<Integer> myList1 = (MyList<Integer>) myList.clone();
        for (int i = 0; i<myList1.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList1.isContains(10));
        System.out.println(myList1.indexOf(20));
    }


}

