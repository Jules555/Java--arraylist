import java.util.ArrayList;

public class List {

    public String owner;

    public  ArrayList<String> Shoes = new ArrayList<>();

    public void setOwner(String name){
        this.owner=name;
    }

    public String getOwner(){
        return owner;

    }

    public void setShoes(String brandname){
        this.Shoes.add(brandname);
    }

    /*public String getShoes(String good){
        return good;
    }*/ 

    public ArrayList getShoes(){
        return Shoes;
    }


}
