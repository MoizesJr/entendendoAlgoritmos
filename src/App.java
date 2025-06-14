public class App {

    public static void regressiva(int i) {
        System.out.println(i);
        if (i <= 1) {
            return;
        } else {
            regressiva(i - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        regressiva(3);
    }
}
