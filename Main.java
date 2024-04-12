public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main <server/client>");
            System.exit(1);
        }

        String mode = args[0].toLowerCase();

        switch (mode) {
            case "server":
                startServer();
                break;
            case "client":
                startClient();
                break;
            default:
                System.out.println("Invalid mode. Use 'server' or 'client'.");
                System.exit(1);
        }
    }

    private static void startServer() {
        System.out.println("Starting the server...");
        // Server setup and start logic here
        EditorServer server = new EditorServer();
        server.start();
    }

    private static void startClient() {
        System.out.println("Starting the client...");
        // Client setup and start logic here
        EditorClient client = new EditorClient();
        client.start();
    }
}
