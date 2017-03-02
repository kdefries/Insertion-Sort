import java.util.*;

public class SortTest
{
  public static void main(String[] args)
  {
    ArrayList<Integer> unsortedArray = new ArrayList<Integer>();
    
    unsortedArray.add(3);
    unsortedArray.add(0);
    unsortedArray.add(1);
    unsortedArray.add(7);
    unsortedArray.add(4);
    unsortedArray.add(5);
    unsortedArray.add(8);
    unsortedArray.add(6);
    unsortedArray.add(9);
    unsortedArray.add(2);
    InsertionSort is = new InsertionSort(unsortedArray);
    
    //Insertion Sort
    System.out.println("Initial Unsorted Array: ");
    for (int i : InsertionSort.getInputArray())
    {
      System.out.print(i + " ");
    }
    
    is.sortGivenArray();
    
    System.out.println("\n\nSorted Array using Insertion Sort: ");
    for (int i : InsertionSort.getInputArray())
    {
      System.out.print(i + " ");
    }
  }
}
