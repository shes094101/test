import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        // write your code here
        Scanner src=new Scanner(System.in);
        int x=src.nextInt()%2;
        {if(x==1)
            System.out.println("Odd");
        else
            System.out.println("Even");}
    }
}
