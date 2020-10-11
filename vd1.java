package lab3;

import java.sql.SQLOutput;

public class vd1 {
    public void add(int num1,int num2){
        int num3;
        num3 = num1 + num2;
        System.out.println("addition is" + num3);
    }
    public void sub(int num1,int num2){
        int num3;
        num3 = num1 - num2;
        System.out.println("result after subtraction is: " + num3);
    }
    public void mul(int num1,int num2){
        int num3;
        num3 = num1 * num2;
        System.out.println("result after multi is: " + num3);
    }
    public void div(int num1,int num2){
        int num3;
        num3 = num1 / num2;
        System.out.println("result after division is: " + num3);
    }
    public static void main(String[] args){
        vd1 objCalc = new vd1();

        objCalc.add(4,4);
        objCalc.mul(3,4);
    }
}
