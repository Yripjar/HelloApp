public class HelloApp {
    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Add all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            message = "Hello, " + names + "!";
        }

        System.out.println(message);
    }
}