package lesson5;


import java.io.IOException;
import java.util.Map;

public class App {
    private EventLogger eventLogger;
    private Client client;
    private Map<EventType,EventLogger> loggers;
    private EventLogger defaultLogger;

    public App(Client client, EventLogger eventLogger,Map<EventType,EventLogger> loggers) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.loggers = loggers;
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


    public void logEvent(EventType type,Event event) throws IOException {
        String message = event.getMsg().replace(String.valueOf(client.getId()), client.getFullName());
        event.setMsg(message);
        EventLogger eventLogger1 = loggers.get(type);
        if (eventLogger1 == null){
            eventLogger1 = eventLogger;
        }
        eventLogger1.logEvent(event);
    }
}
