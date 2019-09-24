import java.util.ArrayList;

public class Task_2 {
    public ArrayList<Integer> find_all_prft_num(int end){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i <= end; i++){
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if(sum == i) result.add(i);
        }
        return result;
    }
}
