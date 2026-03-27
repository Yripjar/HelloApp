public class HelloApp {
    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        }

        System.out.println(message);
    }
}