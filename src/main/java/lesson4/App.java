package lesson4;


import java.io.IOException;

public class App {
    private EventLogger eventLogger;
    private Client client;

    public App(Client client, EventLogger eventLogger) {
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


    public void logEvent(Event event) throws IOException {
        String message = event.getMsg().replace(String.valueOf(client.getId()), client.getFullName());
        event.setMsg(message);
        eventLogger.logEvent(event);
    }
}
