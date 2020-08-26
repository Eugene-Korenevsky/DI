import lesson6.Event;
import lesson6.EventType;
import lesson_1.App;
import lesson_1.Client;
import lesson_1.ConsoleEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws InterruptedException, IOException {
       // lesson1
     /*  App app = new App();
        Client client = new Client(1,"Igor Petrov");
        ConsoleEventLogger consoleEventLogger = new ConsoleEventLogger();
        app.setClient(client);
        app.setConsoleEventLogger(consoleEventLogger);
        app.logEvent("Some event for user 1");*/

      //lesson2
       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson2.xml");
        lesson2.App app = (lesson2.App) applicationContext.getBean("app");
        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");*/

       //lesson3
       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson3.xml");
        lesson3.App app = (lesson3.App) applicationContext.getBean("app");
        lesson3.Event event = (lesson3.Event) applicationContext.getBean("event");
        Thread.sleep(3000);
        lesson3.Event event1 = (lesson3.Event) applicationContext.getBean("event");
        app.logEvent(event);
        app.logEvent(event1);*/

       //lesson4
       /* ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson4.xml");
        lesson4.App app = (lesson4.App) applicationContext.getBean("app");
        lesson4.Event event = (lesson4.Event) applicationContext.getBean("event");
        Thread.sleep(3000);
        lesson4.Event event1 = (lesson4.Event) applicationContext.getBean("event");
        System.out.println(event);
        System.out.println(event1);
        app.logEvent(event);
        app.logEvent(event1);
        applicationContext.close();*/

       //lesson5
      /*  ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson5.xml");
        lesson5.App app = (lesson5.App) applicationContext.getBean("app");
        lesson5.Event event = (lesson5.Event) applicationContext.getBean("event");
        app.logEvent(EventType.ERROR,event);*/

      //lesson6

        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson6.xml");
        lesson6.App app = (lesson6.App) applicationContext.getBean("app");
        lesson6.Event event = (lesson6.Event) applicationContext.getBean("event");
        app.logEvent(EventType.FATAL,event);


    }
}
