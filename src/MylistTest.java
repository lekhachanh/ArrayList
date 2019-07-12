public class MylistTest {
    public static void main(String[] args) {
        MyList <Integer> myList = new MyList<Integer>();
        System.out.println(myList.size());

        for (int i = 0; i < myList.size(); i++) {
            int n = (int) Math.floor(Math.random()*100);
            myList.add(n);
        }
    }
}
