package lab3;

import java.util.*;

public class IntegerSum {
	public static void main(String args[]) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line of integers :");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            sum = sum + n;
        }
        System.out.println("Sum of the integers is: " + sum);
    }
}