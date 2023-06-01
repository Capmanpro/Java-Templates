import java.util.Arrays;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {
        int[] a = {1,3,1,8,8,3,1,7,7,2,1,4};
        Function<int[], String> minValue = arr ->
        {
            String str="";
            Arrays.sort(arr);
            int len = 1;
            for(int i = 1; i < arr.length;i ++)
            {
                if(arr[i] != arr[i-1])
                {
                    len++;
                }
            }
            int []res = new int[len];
            res[0] = arr[0];
            int n = 1;
            for(int i = 1; i < arr.length; i++)
            {
                if(arr[i] == arr[i-1])
                {
                    continue;
                }
                if(arr[i] != arr[i-1])
                {
                    res[n] = arr[i];
                    n++;
                }
            }
            for(int i = 0;i< res.length;i++) {
                str = str + String.valueOf(res[i]);
            }
            return str;
        };
        System.out.println(minValue.apply(a));
    }
}