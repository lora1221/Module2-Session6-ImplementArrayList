import javax.crypto.spec.DESedeKeySpec;
import javax.xml.bind.annotation.XmlType;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(7);
        myList.add(0, 0);
        myList.add(1, 1);
        myList.add(3, 3);
        myList.add(4, 4);
        myList.add(4, 5);
        myList.add(6, 6);
        myList.add(6, 77);
//        System.out.println(myList.get(7));
        myList.printArray();


    }
}
