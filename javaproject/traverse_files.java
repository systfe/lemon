package javaproject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class traverse_files {
    static{
        PrintStream fos=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        try {
            fos = new PrintStream(new FileOutputStream("test.txt",true));
            Date d=new Date();
            System.setOut(fos);
            String string="Date:"+sdf.format(d);
            
            System.out.print(string);
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        //PrintStream ps=new PrintStream(new FileOutputStream("test.txt",true));
        //System.setOut(ps);
        
        getf("C:");
        getf("D:");
        getf("E:");
    }
    public static void getf(String s) throws IOException {
        File f=new File(s);
        if(f.isFile()) return;

        File[] fs=f.listFiles();
        if (fs==null || fs.length==0) return;
        for (File file : fs) {
            System.out.println(file.getAbsolutePath());
            getf(file.getAbsolutePath());
            
        }
    }
}
