package exercise2;

import java.util.*;

public class Exercise2
{
    static String isFunny(String s)
    {
        // Complete this function
        String r = new StringBuilder(s).reverse().toString();

        char[] sChars = s.toCharArray();
        char[] rChars = r.toCharArray();

        for (int i = 0; i < s.length() - 1; i++)
        {
            int s1 = (int) sChars[i];
            int s2 = (int) sChars[i + 1];
            int r1 = (int) rChars[i];
            int r2 = (int) rChars[i + 1];

            if (Math.abs(s2 - s1) != Math.abs(r2 - r1))
            {
                return "Not Funny";
            }
        }

        return "Funny";
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++)
        {
            String s = in.next();
            String result = isFunny(s);
            System.out.println(result);
        }
        in.close();
    }
}