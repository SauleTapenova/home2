package Home3;

import java.util.ArrayList;

public class Col {
    public static void main(String[] args) {
        ArrayList<Integer>list =  new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(1);
        System.out.println(list); 
    int min = list.get(0);
    int max = list.get(0);
    int sum = 0;
    for (Integer i: list) {
        if(i < min){
        min = i;
        }     
        if(i > max){
        max = i;
        }
        sum += i;
        
    } 
    float aver = (float)sum / list.size();   
    System.out.println("минимальное число: " + min);
    System.out.println("максимальное число: " + max);
    System.out.println("среднее арифметическое: " + aver);
    }}  
        

