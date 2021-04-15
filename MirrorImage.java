package lab3;

import java.util.*;
public class MirrorImage {
     public static void main(String[] ar)
     {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String: ");
            String str = sc.next();
            sc.close();
            StringBuffer sbr = new StringBuffer(str);
            sbr.append('|');
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            sbr.append(sb);
            System.out.println(sbr.toString());
     }
}