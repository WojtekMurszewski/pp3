
public class Mug{
    
    private String color;
    private int capacity;
    private boolean handle;
    
    Mug(String color,int capacity,boolean handle){
        this.color=color;
        this.capacity=capacity;
        this.handle=handle;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public void setCapacity(){
        this.capacity=capacity;
    }
    
    public boolean getHandle(){
        return handle;
    }
    
    public void setHandle(){
        this.handle=handle;
    }
}
