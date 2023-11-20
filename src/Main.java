public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ui logic = new ui();
        testClass test = new testClass(2, "lol");

        logic.start();
        boolean status = logic.isStatus();
        System.out.println(status);
    }
}