import java.util.List;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    
    // 1 solution:
    List<Object> res = new ArrayList<>();
    for(Object c : list){
      if(c instanceof Integer) res.add(c);
    }    
    return res;
  }
}

// 2
import java.util.stream.Collectors;
import java.util.List;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    // 2 sol: using stream
    return list.stream().filter(item -> item instanceof Integer).collect(Collectors.toList());
  }
}
