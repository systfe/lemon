package javaproject.用户注册系统;
import java.util.*;

public class service{
    private pd Pd;
    public service(){}
    public service(String user,String password) throws UserInputException{
        if (user==null||password==null) {
            throw new NullPointerException("用户名或密码为空");
        } else if(user.length()<4){
            throw new UserInputException(password+":用户名不能小于4位");
        }else if(user.length()>13){
            throw new UserInputException(password+":用户名不能大于13位");
        }
        this.Pd=new pd(user,password);
        System.out.println("注册成功！,欢迎"+user);
        
    }
    public void setPd(pd pd) {
        Pd = pd;
    }
    public pd getPd() {
        return Pd;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String user = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        try {
            new service(user,password);
        } catch (UserInputException e) {
            e.printStackTrace();
        }finally{
            scanner.close();
        }
        
        
    }

    
}






class pd {
    private String user;
    private String password;
    public pd(){}
    public pd(String user,String password){
        this.user = user;
        this.password = password;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        pd other = (pd) obj;
        return (user != other.user ||password != other.password)?false:true;
    }
    @Override
    public String toString() {
        return "pd ["+this.user+","+this.password+"]";
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    


    
}

class UserInputException extends Exception{
    public UserInputException(){}
    public UserInputException(String msg){super(msg);}

}
