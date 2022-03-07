public class TestDeIgualdad {
    public static void main(String[] args) {
        String s1 = "prueba";
        String s2 = "prueba"; // se le asigna el mismo objeto
        // que a s1
        String s3 = new String("prueba"); // otro objeto igual
        boolean test1 = (s1 == s2); // son el mismo objeto
        boolean test2 = (s1 == s3); // no son el mismo
        boolean test3 = (s1.equals(s2)); // contienen lo mismo
        boolean test4 = (s1.equals(s3)); // contienen lo mismo
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}