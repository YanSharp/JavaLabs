import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;

public class Lab1_test {

    @Test
    public void Task_2(){
        Integer[] expect = new Integer[] {6, 28};
        Task_2 test = new Task_2();
        ArrayList<Integer> res = test.find_all_prft_num(30);
        assertEquals(expect,res.toArray());
    }

    @Test
    public void Task_3(){
        Task_3 test = new Task_3();
        String s = test.build_pyram(4);
        assertEquals("   1   \n  121  \n 12321 \n1234321\n", s);
    }

}
