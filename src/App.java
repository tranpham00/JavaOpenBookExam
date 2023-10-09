public class App {
    public static void main(String[] args) throws Exception {
        //Question 2 Main:
        /* Vector2 vect = new Vector2(2, 5);
         * System.out.println(vect.magnitude());
         *
         * Vector2 vect2 = new Vector2(2, 5);
         * System.out.println(vect.isEqual(vect2));
         *
         * System.out.println(vect.add(vect2));
         *
         * System.out.println(vect.toString());
         * 
         */

        // Question 5 Main:
        Vector2 vect = new Vector2("string", 2, 5);
        System.out.println(vect.magnitude());
        System.out.println(vect.getDimension());
    }
}
