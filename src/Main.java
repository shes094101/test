import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("請輸入數字(0~100)");
        Scanner scn=new Scanner(System.in);
        float x=scn.nextFloat();
        if (x>0&&x<100){System.out.println("輸入正確");}
        else{System.out.println("錯誤");}
        if (x>=90&&x<99){System.out.println("A");}
        if (x>=80&&x<89){System.out.println("B");}
        if (x>=70&&x<79){System.out.println("C");}
        if (x>=60&&x<69){System.out.println("D");}
        if (x<60){System.out.println("F 你被當了");}

    }}
