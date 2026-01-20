import java.util.Arrays;

public class Swap {
    static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        swap(list,0,3);

        reverse(list);


        System.out.println(Arrays.toString(list));


    }
    static void reverse(int[]list){
        int start =0;
        int end =list.length-1;
        while(start<end){
            //swap
            swap(list,start,end);
            start++;
            end--;


        }

    }


    static void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

}
