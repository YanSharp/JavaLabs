import java.util.ArrayList;

public class Task_3 {
    public String build_pyram(int h){
        String pyramid_s = new String();
        for(int i = 0; i < h; i++){
            int j = h - 1;
            for(;j > i; j --)
                pyramid_s +=" ";
            for(;j > 0; j --)
                pyramid_s += Integer.toString(i-j+1);
            pyramid_s += Integer.toString(i+1);
            for(;j < i; j ++)
                pyramid_s += Integer.toString(i-j);
            for(;j < (h-1); j++)
                pyramid_s +=" ";
            pyramid_s += "\n";
        }
        //System.out.print(pyramid_s);
        return pyramid_s;
    }
}
