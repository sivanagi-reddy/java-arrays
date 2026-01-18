import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums={3,4,2,1};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(2);
    	//arrays are muatable in java
        // strings are immuatable in java

    }
    static void change (int[] arr){
        arr[0]=99;


    }
}
