import java.util.ArrayList;

public class InsertionSort
{
  private static ArrayList<Integer> inputArray = new ArrayList<Integer>();
  public static int counter;
  
  public static ArrayList<Integer> getInputArray()
  {
    return inputArray;
  }
  
  public InsertionSort(ArrayList<Integer> inputArray)
  {
    InsertionSort.inputArray = inputArray;
  }
  
  public static int getCounter()
  {
    return counter;
  }
  
  public void sortGivenArray()
  {
    for (int i = 1; i < inputArray.size(); i++)
    {
      int key = inputArray.get(i);
     
      for (int j = i-1; j >= 0; j--)
      { //Shifting Each Element to its Right
        if (key < inputArray.get(j))
        {
          counter++;
          inputArray.set(j + 1, inputArray.get(j));
          
          // Special case when all elements are less than key
          if (j == 0)
          {
            inputArray.set(0, key);
          }
        }
        else
        {
          inputArray.set(j + 1, key);
          break;
        }
      }
    }
  }
}