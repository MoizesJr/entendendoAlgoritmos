public class App {
    public static void main(String[] args) throws Exception {
        String str = "Cuida menino";

        int totalString = str.length();
        char primeiro = str.charAt(0);
        char segunda = str.charAt(1);
        char ultimo = str.charAt(str.length() - 1);

        System.out.println(primeiro);
        System.out.println(segunda);
        System.out.println(totalString);
        System.out.println(ultimo);
    }
}
