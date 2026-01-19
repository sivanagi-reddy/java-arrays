import java.util.Arrays;
import java.util.Scanner;

public class Input {

         public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
                 //array of primitives
             int [] arr= new int[5];
             arr[0]=23;
             arr[1]=45;
             arr[2]=233;
             arr[3]=543;
             arr[4]=3;
             System.out.println(arr[3]);

           /*  for(int i=0;i<arr.length;i++){
                 arr[i]=sc.nextInt();



             }
             System.out.println(Arrays.toString(arr));// it converts the array into string and then it prints the array

*/


      //       for(int i=0;i<arr.length;i++){
       //          System.out.print(arr[i]+" ");


         //    }
             for(int i : arr){// for every element in array , print the element
                 System.out.print(i + " ");// here i represents element of the array
             }

        //     System.out.println(arr[5]); // index out of bound error

             //array of objects
             String [] str = new String[4];
             for (int i = 0; i < str.length; i++) {
                 str[i] = sc.next();

             }
             System.out.println(Arrays.toString(str));
             str[1]="kunal";
             System.out.println(Arrays.toString(str));
         }
}
