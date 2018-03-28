package exercise1;

import java.util.*;

public class Exercise1
{
    static int getSockPairs(int n, int[] ar)
    {
        // Complete this function
        Set<Integer> colors = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            Integer color = ar[i];
            if (colors.contains(color))
            {
                colors.remove(color);
                count++;
            }
            else
            {
                colors.add(color);
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++)
        {
            c[i] = in.nextInt();
        }
        int result = getSockPairs(n, c);
        System.out.println(result);
        in.close();
    }
}