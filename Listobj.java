import java.util.ArrayList;

public class Listobj {
    public static void main (String args[]){

       // ArrayList<String> Shoes = new ArrayList<>();
        List o1 = new List();


        String f = "";


        o1.setOwner("Jules own the following shoes");

       // o1.getOwner();

        o1.setShoes("Nike");
        o1.setShoes("FiLA");
        o1.setShoes("Puma");
        o1.setShoes("cat");
        o1.setShoes("timber");


        System.out.println(o1.getOwner());
        System.out.println(o1.getShoes());

      /*  for(int i=0; i<o1.Shoes.size();i++){

                String brand =  o1.Shoes.get(i);

                f +=brand+" ";

        }

        o1.getShoes(f);

        System.out.println(o1.getShoes(f));*/


    }
}
