package javaproject.计算器;

import java.util.*;

public class calculation {// 计算器程序
    public static void main(String[] args) {
        System.out.println("calculation1.0");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int numa = input.nextInt();
        System.out.println("请输入第二个数字");
        int numb = input.nextInt();
        System.out.println("请输入符号");
        input.nextLine();
        String fuhao = input.nextLine();
        System.out.println(operation.fourOperation(numa, numb, fuhao));
        
        input.close();
        System.exit(0);

    }
}

class operation {
    private static final String[] symbol_s = new String[] { "+", "-", "*", "/" };

    public operation() {
    }

    public static String fourOperation(int first_num, int second_num, String symbol) {
        int v = 0;
        if (symbol.equals(symbol_s[0])) {
            v = first_num + second_num;

        } else if (symbol.equals(symbol_s[1])) {
            v = first_num - second_num;
        } else if (symbol.equals(symbol_s[2])) {
            v = first_num * second_num;
        } else if (symbol.equals(symbol_s[3])) {
            try {
                v = first_num / second_num;
            } catch (ArithmeticException e) {
                System.out.println("除数不能为0");
            }
            
        } else {
            return "输入错误";
        }
        return String.valueOf(v);
    }

}
