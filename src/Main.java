class Main{

    static void main() {
        //Q: store a roll number
   int a =19;

   //Q: store a person's name
        String name ="kunal kushwaha";

        // Q: store 5 roll numbers
        int rno1 =23;
        int rno2 = 55;
        int rno3 = 18;

        //syntax
        // datatypte [] variable_name = new datatype[size];
        //store 5 roll numbers;
      //  int [] rnos = new int[5];
        //or directly
     //   int [] rnos2={23, 12, 45,32,15};
        int[] ros;// declaration of array. ros is getting defined
        ros = new int[5];//initialisation :actually here object is being created in the memory(heap)

        //System.out.println( ros[1]); it gives 0 for int
        String [] arr=new String[4];
        System.out.println( arr[0]);// it gives null because it's string

        String str=null;
        System.out.println(arr[0]);









    }

}
