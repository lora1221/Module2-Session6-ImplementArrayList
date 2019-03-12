import javax.crypto.spec.DESedeKeySpec;
import javax.xml.bind.annotation.XmlType;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);
        myList.add(0, 0);
        myList.add(1, 1);
        myList.add(3, 3);
        myList.add(4, 4);
        myList.add(4, 5);
        myList.add(4, 5);
        myList.add(4, 5);
        myList.add(4, 99);
        myList.add(4, 100);
        myList.add(6, 6);
        myList.add(6, 77);
        myList.add(33,22222);

        myList.printArray();


    }
}
