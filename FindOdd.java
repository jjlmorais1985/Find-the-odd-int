import java.util.ArrayList;

public class FindOdd {
  public static int findIt(int[] a) {
    System.out.print(a);
    int counter = 0;
    int odd = 0;
    
    for (int i = 0; i < a.length; i++){
      int nb_count = 0;
      for (int j = 0; j < a.length; j++){
        if (a[i] == a[j])
          nb_count++;
      }    
      if ((nb_count % 2) != 0)
        odd = a[i];
    }
    return odd;
  }
}
