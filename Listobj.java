import java.util.ArrayList;

public class Listobj {
    public static void main (String args[]){

     //Creating object for class List which has our methods.
        List o1 = new List();


        o1.setOwner("Jules ");


        //assign values to our Array
        o1.setShoes("Nike");
        o1.setShoes("FiLA");
        o1.setShoes("Puma");
        o1.setShoes("cat");
        o1.setShoes("timber");
        
        //we check if everything is working well
        System.out.println(o1.getOwner());
        System.out.println(o1.getShoes());




    }
}

