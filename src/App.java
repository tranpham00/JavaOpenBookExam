import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Question 2 Main:
        /* 
        Vector2 vect = new Vector2(2, 5);
        System.out.println(vect.magnitude());
         
        Vector2 vect2 = new Vector2(2, 5);
        System.out.println(vect.isEqual(vect2));
        
        System.out.println(vect.add(vect2));
         
        System.out.println(vect.toString()); 
         */

        // Question 5 Main:
        /*
        Vector2 vect = new Vector2("string", 2, 5);
        System.out.println(vect.magnitude());
        System.out.println(vect.getDimension());
        */

        // Question 6 Main:
        /*
        Vector2 vect = new Vector2("string", 2, 5);
        Vector2 vect2 = new Vector2("string", 2, 5);
        Vector2 vect3 = (Vector2) vect.clone();

        System.out.println(vect.isEqual(vect2));
        System.out.println(vect.isEqual(vect3));
        System.out.println(vect == vect3);
        */

        // Question 7 Main:
        /* 
        Scanner scan = new Scanner(System.in);
        HashMap<String, MathObject> vectors = new HashMap<String, MathObject>();

        Vector2 vect1 = new Vector2("red", 3, 5);
        Vector2 vect2 = new Vector2("blue", 4, 8);
        Vector2 vect3 = new Vector2("purple", 2, 7);

        vectors.put(vect1.getDescription(), vect1);
        vectors.put(vect2.getDescription(), vect2);
        vectors.put(vect3.getDescription(), vect3);

        System.out.println("Give vector description: ");
        String input = scan.nextLine();
        if(input != null)
        {
            System.out.println(vectors.get(input));
        }
        else
        {
            System.out.println("Vector does not exist.");
        }

        for(String key : vectors.keySet())
        {
            System.out.println(key + ", " + vectors.get(key));
        }
        */
    }
}
