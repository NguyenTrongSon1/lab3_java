package lab3;

public class vd3 {
    public void setVal(int num1){
        num1 = num1 + 10;
    }
    public static void main (String[] args){
        int num1 = 10;

        vd3 obj = new vd3();

        obj.setVal(num1);
        System.out.println("value of num1 after invoking setVal is: " + num1);
    }
}
