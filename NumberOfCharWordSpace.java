package lab3;
import java.util.*;
public class NumberOfCharWordSpace {
	public static void main(String args[])
    {
           		int nl=1,nw=0, n=0;          
                char ch;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter text : ");
                String str=sc.nextLine();
                sc.close();
                for(int i=0;i<str.length();i++)
                {
                            ch=str.charAt(i);
                            if(ch=='\n'||ch=='.')
                            nl++;
                            else if(ch==' ')
                            nw++;
                            else n++;
                                                               
                }
                nl--;
                System.out.println("\nNumber of lines : "+ nl);
                System.out.println("\nNumber of words : "+(nl+nw));
                System.out.println("\nNumber of characters : "+n);
               

    }
}
