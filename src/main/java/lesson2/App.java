package lesson2;


public class App {
    private EventLogger eventLogger;
    private Client client;

    public App(lesson2.Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public Client getClient() {
        return client;
    }

    public EventLogger getEventLogger() {
        return eventLogger;
    }

    public void setEventLogger(EventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void logEvent(String msg) {
        String message = msg.replace(String.valueOf(client.getId()), client.getFullName());
        eventLogger.logEvent(message);
    }
}
