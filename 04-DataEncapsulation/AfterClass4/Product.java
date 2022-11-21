
public class Product{
    
    private String name;
    private boolean vegetarian;
    
    Product(String name, boolean vegetarian){
        this.name=name;
        this.vegetarian=vegetarian;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public boolean getVegetarian(){
        return vegetarian;
    }
    
    public void setVegetarian(boolean vegetarian){
        this.vegetarian=vegetarian;
    }
}
