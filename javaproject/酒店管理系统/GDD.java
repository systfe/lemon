package javaproject.酒店管理系统;

public class GDD{
    public static void main(String[] args) {
        Hotel h=new Hotel();
        h.cx();
        h.order(212);
        h.order(307);
        h.cx();
        h.tf(307);
        
    }


}

class Hotel extends Object{
    private room[][] rooms=new room[t.length][12];  
    private static String[] t={"单人套房","单人套房","单人套房","单人套房","双人套房","总统套间"};
    public Hotel(){
        
        rooms=new room[t.length][12];    
        for (int i=0;i < rooms.length; i++){
            for (int j = 0; j < rooms[i].length; j++) {
                //System.out.println(j);
                rooms[i][j]=new room((i+1)*100+(j+1), t[i],false );
                
                
            
            }
        }

    }


    

    public void cx(){//查询
        for (room[] rw : rooms) {
            for (room rn : rw) {
                System.out.print(rn.toString()+" ");
            }
            System.out.println();
        }
    }

    public void order(int id){//订房
        if(rooms[id/100 -1][id%100 -1].getFree()==true){
            System.out.println("error");
        }else{
            rooms[id/100 -1][id%100 -1].setFree(true);
            System.out.println("成功");    
        }
        
    }
    public void tf(int id){//订房
        if(rooms[id/100 -1][id%100 -1].getFree()==false){
            System.out.println("error");
        }else{
            rooms[id/100 -1][id%100 -1].setFree(false);
            System.out.println("成功");    
            
        }
        
    }

    

    @Override
    public String toString() {
        return super.toString();
    }
}

class room extends Object{
    private int rid;
    private String type;
    private Boolean free;
    public room(){}
    public room(int rid,String type,Boolean free){
        this.free=free;
        this.rid=rid;
        this.type=type;

    }

    public void setFree(Boolean free) {
        this.free = free;
    }
    public void setRid(int rid) {
        this.rid = rid;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Boolean getFree() {
        return free;
    }
    public int getRid() {
        return rid;
    }
    public String getType() {
        return type;
    }
    //重写toString和equals方法
    public String toString() {
        return "["+ rid + "," + type + "," + (free?"有人":"空房") + "]";
    }
    
    
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null||getClass() != obj.getClass())return false;

        room other = (room) obj;
        if (rid != other.rid)
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (free == null) {
            if (other.free != null)
                return false;
        } else if (!free.equals(other.free))
            return false;

        return true;
    }
    
    
}
