package javaproject;
import java.util.*;

public class caisz {
    private static int caiNum;
    public static void main(String[] args) {
        int number = 100;
        Value a = new Value(number);
       cain b = new cain(a);
        Scanner s = new Scanner(System.in);
        do {
            System.out.print(">>>");
            caiNum = s.nextInt();
            b.cai(caiNum);
        } while (number != caiNum);
        s.close();
        System.exit(0);
    }
}
class Value {
    private int v;
    public Value() {
    }
    public Value(int v) {
        this.v = v;
    }
    public int getV() {
        return v;
    }
    public void setV(int v) {
        this.v = v;
    }
}
class cain {
    private Value a;
    public cain() {}
    public cain(Value a) {
        this.a = a;
    }
    public Value getA() {
        return a;
    }
    public void setA(Value a) {
        this.a = a;
    }
    public void cai(int caiNum) {
        int csz = this.getA().getV();// a.getV();
        if (caiNum == csz) {
            System.out.println("ok");
        } else if (caiNum >= csz) {
            System.out.println("big");
        } else if (caiNum <= csz) {
            System.out.println("small");
        }
    }
}
