package Home3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Spis {
    public static void main(String[] args) {
        Random rend = new Random();
        ArrayList<Integer>list  = new ArrayList<>();
            for (int i = 0; i < 8; i++){
                int res = rend.nextInt(-20, 20);
                list.add(res);
            }
            System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0){
                    list.remove(i);
                }
                else{
                    i++;
                }
            }
            System.out.println(list);
    }
}
    
