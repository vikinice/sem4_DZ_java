/*1.Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.*/

import java.util.LinkedList;



public class zadacha1 {
    public static void main(String[] args) {
        LinkedList<Integer> linList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            linList.add(i, i);
        }
    linList.add(6);
    linList.add(7);
    System.out.println("Исходный список: " + linList);
    System.out.println("Перевернутый список: " + reverse(linList));
    }
    
    public static LinkedList<Integer> reverse(LinkedList<Integer> listInit) {
        LinkedList<Integer> resList = new LinkedList<>();
        for (int i = listInit.size() - 1; i > -1; i--) {
            resList.add(listInit.get(i));
        }
        return resList;
    }
}