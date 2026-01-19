import java.util.Arrays;
import java.util.Scanner;
public class Multidimension {
    static void main() {
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //adding rows is mandatory and entering the colums is not mandatory
      Scanner sc = new Scanner(System.in);
     //  int[][] arr = new int[3][];

      //  int [] [] avi2d={
        //        {1,2,3},//oth index
          //      {7, 6},//
            //    {9,3,2,4}

        //};
        //input
         int [] [] arr =new int[3][4];
        System.out.println(arr.length);

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col=0; col<arr[row].length;col++){
                arr [row][col]=sc.nextInt();
            }






        }
        //OUTPUT
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] +" ");

            }
            System.out.println();
        }

        //output
        for (int row = 0; row <arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

        for(int [] a:arr){
            System.out.println(Arrays.toString(a));
        }






    }
}
