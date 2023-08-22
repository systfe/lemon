package javaproject.计算器;

import javax.swing.*;

public class calculation2 {
    public static void main(String[] args){
        JFrame frame = new JFrame("calculation2.0");
        JPanel panel=new JPanel();//创建画布

        JTextField fielda=new JTextField(10);
        JTextField fieldb=new JTextField(10);
        JTextField fieldc=new JTextField(10);//创建field，10：输入长度限制

        JButton B_ad=new JButton("+");
        JButton B_jian=new JButton("-");//创建button,标题
        JButton B_chen=new JButton("*");
        JButton B_chu=new JButton("/");

         panel.add(fielda);//添加至画布
        panel.add(fieldb);
        panel.add(fieldc);
        panel.add(B_ad);
        panel.add(B_jian);
        panel.add(B_chen);
        panel.add(B_chu); 
        frame.add(panel);//画布添加至窗口


        panel.setLayout(null);//清空原来的摆放位置
        fielda.setBounds(10, 10, 150, 20);//创建新的摆放位置
        fieldb.setBounds(10, 40, 150, 20);
        fieldc.setBounds(10, 190, 150, 20);
        B_ad.setBounds(10, 70, 50, 20);
        B_jian.setBounds(10, 100, 50, 20);
        B_chen.setBounds(10, 130, 50, 20);
        B_chu.setBounds(10, 160,50, 20);



        B_ad.addActionListener(e->{
            int num_a=Integer.parseInt(fielda.getText());
            int num_b=Integer.parseInt(fieldb.getText());
            fieldc.setText(operation.fourOperation(num_a, num_b, "+"));

        });
        B_jian.addActionListener(e->{
            int num_a=Integer.parseInt(fielda.getText());
            int num_b=Integer.parseInt(fieldb.getText());
            fieldc.setText(operation.fourOperation(num_a, num_b, "-"));

        });
        B_chen.addActionListener(e->{
            int num_a=Integer.parseInt(fielda.getText());
            int num_b=Integer.parseInt(fieldb.getText());
            fieldc.setText(operation.fourOperation(num_a, num_b, "*"));

        });
        B_chu.addActionListener(e->{
            int num_a=Integer.parseInt(fielda.getText());
            int num_b=Integer.parseInt(fieldb.getText());
            fieldc.setText(operation.fourOperation(num_a, num_b, "/"));

        });
        frame.setBounds(500, 260, 300, 260);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);//关闭窗口
    }
}
