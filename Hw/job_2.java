package Hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Arrays;


public class job_2 {

    
 
    public static void main(String[] args) {
        File file = new File("b.txt");
        try {
                FileWriter pw = new FileWriter(file, true);
                int temp;
                int[]arr = {2, 1, 6, 3, 9, 24, 5, 0};
                pw.write(("Исходный массив: " + Arrays.toString(arr)));
                pw.write("\n");
               
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 1; j < arr.length - i; j++) {
                        if(arr[j-1] > arr[j]) { 
                           pw.write("Промежуточный результат "  +  (i + 1)  +  " итерации "  +  Arrays.toString(arr)); 
                           pw.write("\n");
                            temp = arr[j - 1];         
                            arr[j - 1] = arr[j];
                            arr[j] = temp;
                        }    
                    }
                }
                
                pw.write("Отсортированный массив: " +  Arrays.toString(arr));
                
                pw.close();
            }
        catch (IOException e) {
                    System.out.println("ERROR ");
        }
    }    
}    
