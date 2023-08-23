import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myobj.nextInt();
        int num_copy = num;
        int new_num=0;
        while(num_copy != 0)
        {
            int digit = num_copy%10;
            new_num = new_num*10 + digit;
            num_copy = num_copy/10;
        }
        if(new_num==num)
        {
            System.out.println(num+" is a palindrome");
        }
        else
        {
            System.out.println(num+" is not a palindrome");
        }
    }
    
}
