public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ui logic = new ui();
        logic.start();
        boolean status = logic.status;
        System.out.println(status);
    }


}