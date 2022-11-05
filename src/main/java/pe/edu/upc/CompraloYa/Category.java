package pe.edu.upc.CompraloYa;

public class Category {
    //fields
    private int CategoryID;
    private String Name;
    private String Description;
    //constructor
    public Category(String name, String description){
        this.Name = name;
        this.Description = description;
        this.CategoryID = (int)(Math.random()*100+1);
    }
    //methods
    public int GetCategoryID(){
        return CategoryID;
    }
    public String GetCategoryName(){
        return Name;
    }
    public void ChangeCategoryName(String name){
        this.Name = name;
    }
    public String GetCategoryDescription(){
        return Description;
    }
    public void ChangeCategoryDescription(String description){
        this.Description=description;
    }
}
