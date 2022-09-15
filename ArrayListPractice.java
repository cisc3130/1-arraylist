import java.util.*;
//Java Project for Implementation of ArrayLists
public class ArrayListPractice {
    public static void main (String[] args) {

    int size = 10;

    ArrayList<Integer> num = new ArrayList<Integer>(size);  
    
    add(num);
    System.out.println("Original ArrayList: " + num);
    addMiddle(num, size);
    removeElement(num,size);
    removeLast(num,size);
}
//Method to add the elements into the ArrayList
public static void add(ArrayList<Integer> num) {

    num.add(3);
    num.add(6);
    num.add(12);
    num.add(12);
    num.add(1153);
    num.add(119);
    num.add(252);
    num.add(23);
    num.add(1);
    num.add(-6);
    num.add(3);
    num.add(3);
    num.add(3);


    
}
//Method that adds an element to the middle of the ArrayList
public static void addMiddle(ArrayList<Integer> num, int size) {

    num.add(size/2, 8);
    System.out.println("Middle Element Inserted: " + num);
}
//RMethod that removes the specified element that is defined by numRemove
public static void removeElement(ArrayList<Integer> num, int size) {

    int index = 0;
    int numRemove = 252;
    //Iterates through the ArrayList to find the desired element
    for (int i = 0; i <= size - 1; i++)
        if (num.get(i) == numRemove)
        index = i;
    
    num.remove(index);
    System.out.println("Selected Element has been removed: " + num);
}
//Method that removes the last element of the ArrayList
public static void removeLast (ArrayList<Integer> num, int size) {

    num.remove(size - 1);
    System.out.println("Removed the last element of the list: " + num);

}
    }
