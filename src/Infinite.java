import java.util.ArrayList;
import java.util.Scanner;

public class Infinite {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list =new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(4556);
        list.add(789);
        list.add(1);
        list.add(2);
        list.add(4556);
        list.add(789);
        list.add(1);
        list.add(2);
        list.add(4556);
        list.add(789);
        System.out.println(list.contains(654));


        list.set(0,99);

        list.remove(2);


       // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list[index]syntax will not work here

        }

        //time complexity is o(1)

        //System.out.println(list);










    }

}
