// give you an array and one number: return true if the array contains the number, false otherwise

import java.util.Arrays;

public class youNeedOne {

  public static boolean check(Object[] arr, Object n){
    return Arrays.asList(arr).contains(n);
  } 

}
