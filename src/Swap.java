import java.util.Arrays;

public class Swap {
    static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        swap(list,0,3);

        System.out.println(Arrays.toString(list));


    }

    static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
