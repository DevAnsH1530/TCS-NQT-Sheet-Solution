import java.util.HashMap;
import java.util.Map;

public class Frequency_Of_Each_Element{
    public static void main(String[] args){
        int[] arr = {10,12,10,12,324,234};
        Map<Integer, Integer> mp = findFreqOfEachEl(arr);
        mp.forEach((k,v) -> System.out.println(k+"..."+v));
    }

    public static Map<Integer, Integer> findFreqOfEachEl(int[] arr){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i: arr){
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i)+1);
            }else
                mp.put(i, 1);
        }
        return mp;
    }
}