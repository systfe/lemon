package javaproject.餐厅;

public class restaurant{
    public static void main(final String[] args){
        
        Menu cooka=new cook1();
        customer customer=new customer(cooka);
        customer.other("荔枝拼盘");
        
    }
}


class customer{
    private Menu menu;
    public customer(){}
    public customer(Menu menu){
        this.menu=menu;
    }

    public void other(String s){
        //Menu m= this.getMenu();
        if(s=="西红柿炒只因蛋"){
            menu.西红柿炒只因蛋();
        }else if(s=="九转大肠"){
            menu.九转大肠();
        }else if(s=="香精煎鱼"){
            menu.香精煎鱼();
        }else if(s=="荔枝拼盘"){
            menu.荔枝拼盘();
        }else{
            System .out.println(s+"没有");
        }
        
        
    }


    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
}

class cook1 implements Menu{
    public cook1(){}
    public void 西红柿炒只因蛋(){
        System.out.println("Z      西红柿炒只因蛋");
    }
    public void 九转大肠(){
        System.out.println("Z      九转大肠");
    }
    public void 香精煎鱼(){
        System.out.println("Z      香精煎鱼");
    }
    public void 荔枝拼盘(){
        System.out.println("Z      荔枝拼盘");
    }

}
class cook2 implements Menu{
    public cook2(){}
    public void 荔枝拼盘(){
        System.out.println("X      荔枝拼盘");
    }
    public void 西红柿炒只因蛋(){
        System.out.println("X      西红柿炒只因蛋");
    }
    public void 九转大肠(){
        System.out.println("X      九转大肠");
    }
    public void 香精煎鱼(){
        System.out.println("X      香精煎鱼");
    }
}


