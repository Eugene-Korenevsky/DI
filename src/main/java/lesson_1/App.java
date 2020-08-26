package lesson_1;

public class App {
    private ConsoleEventLogger consoleEventLogger;
    private Client client;

    public Client getClient() {
        return client;
    }

    public ConsoleEventLogger getConsoleEventLogger() {
        return consoleEventLogger;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setConsoleEventLogger(ConsoleEventLogger consoleEventLogger) {
        this.consoleEventLogger = consoleEventLogger;
    }

    public void logEvent(String msg){
        String message = msg.replace(String.valueOf(client.getId()),client.getFullName());
        consoleEventLogger.logEvent(message);
    }
}
