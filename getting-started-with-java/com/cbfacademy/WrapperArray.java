package com.cbfacademy;

public class WrapperArray {

    public static void main(String... args) {
        int[] int_elements = {7, 4, 9, 3, 007, 266, 21, 45};
        System.out.println(int_elements.length);

           // Create an array to hold 12 float elements
           float[] floatArray = new float[12];

           // Initialize the array with float values
           for (int i = 0; i < floatArray.length; i++) {
               floatArray[i] = (float) (i + 1) * 1.2f;
           }
   
           // Print the elements of the float array
           for (float element : floatArray) {
               System.out.println(element);

        //float[] floatArray = new float[5];

        double[] db_elements = {2.4d, 45.7d, 9.0d, 1.2d, 0.75d};
        System.out.println(db_elements.length);

        // double[] db_elements = {2.4d, 45.7d, 9.0d, 1.2d, 0.75d};
        // System.out.println(db_elements.length);



    
    }
    
}

}
