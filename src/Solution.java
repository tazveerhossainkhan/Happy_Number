import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> values = new HashSet<>();
        //int rem,div;
        /*while(n != 1)
        {
            rem = n % 10;
            div = n / 10;
            n = (rem*rem) + (div*div);
            if(values.contains(n))
            {
                return false;
            }
            values.add(n);
        }
        return true;
    }*/
        while(n!=1)
        {
            int current = n;
            int sum = 0;
            while(current !=0)
            {
                sum = sum + (current % 10) * (current % 10);
                current = current /10;
            }
                if(values.contains(sum)){
                    return false;
                }
                values.add(sum);
                n= sum;
        }
        return true;
    }
    public static void main (String[]args){
        int n;
        n = 2;
        Solution a = new Solution();
        a.isHappy(n);
        System.out.printf("%B", a);
    }
}