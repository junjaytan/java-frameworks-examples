package example.xml;

import com.google.inject.Guice;
import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import java.net.URL;
import org.apache.logging.log4j.*;

public class Main {
    public static void main(String[] args) {

        final URL xmlUrl = ClassLoader.getSystemClassLoader().getResource("phone.xml");

        Injector injector = Guice.createInjector(new AbstractModule() {
            protected void configure() {
                bind(Contacts.class).to(SimCard.class);
                install(new XmlBeanModule(xmlUrl));
            }
        });

        Phone phone = injector.getInstance(Phone.class);

        if (phone.getContacts() == null) {
            throw new AssertionError();
        } else {
            System.out.println("It worked!");
        }
    }
}