import java.util.ArrayList;

public class List {

    public String owner;

    public  ArrayList<String> Shoes = new ArrayList<>();

    public void setOwner(String name){
        this.owner=name+"Owns the Following shoes: \n";
    }

    public String getOwner(){
        return owner;

    }

    public void setShoes(String brand_name){
        this.Shoes.add(brand_name);
    }

    // we need to call it public ArrayList inorder to be able to print the array list
    //otherwise we can't be able to print it (for example if we call it
    // public String getShoes() the function return shoes will be error)
    public ArrayList getShoes(){
        return Shoes;
    }


}
