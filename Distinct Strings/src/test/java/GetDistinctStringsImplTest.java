
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class GetDistinctStringsImplTest {
    private static final Object Uniqueset = null;

    @Test
    public void uniqueStringTest()  {
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> Uniqueset = obj1.get.distinctStrings(new ArrayList<>(Arrays.asList("java","java","c")));
        List<String> strList= new ArrayList<>();
        strList.add("c");
        strList.add("java");

        Assertions.assertEquals(strList,Uniqueset);
    }

    @Test
    public void similarStringTest() {
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> Uniqueset = obj1.get.distinctStrings(new ArrayList<>(Arrays.asList("java", "java", "c")));
        List<String> strList = new ArrayList<>();
        strList.add("c");
        strList.add("c");
        Assertions.assertNotEquals(strList, Uniqueset);

    }
     @Test
       public void emptyList(){
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> bb = obj1.get.distinctStrings(new ArrayList<>(Collections.emptyList()));
        List<String> aa = Collections.<String>emptyList();

        Assertions.assertEquals(aa,bb);


       }


       @Test
       public void check() throws NullPointerException{
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
           List<String> aa = new ArrayList<>();
           aa.add(null);
           Assertions.assertThrows(NullPointerException.class, () -> {
               obj1.get.distinctStrings(aa);
           });



       }
    }

