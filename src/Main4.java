import java.util.Scanner;
public class Main4 {
    public static void main(String[]args){
        Scanner src =new Scanner(System.in);
        char ch=src.next().charAt(0);
        {
            if (ch-'A'>=0 && ch-'A'<26){
                System.out.println("大寫");
                System.out.println(Character.toString(ch).toLowerCase());
            }
            {
                if (ch - 'a' >= 0 && ch - 'a' < 26) {
                    System.out.println("小寫");
                    System.out.println(Character.toString(ch).toUpperCase());
                } else {
                    System.out.println("其他");
                }
            }}}}