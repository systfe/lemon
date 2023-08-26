package javaproject;


public class test01 {
    public static void main(String[] args){
        asd a=new asd();
        asd s=new asd();
        a.start();
        
        s.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
/**
 * Innertest01
 */
class asd extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
    
    
}