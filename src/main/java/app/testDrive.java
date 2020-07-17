package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDrive {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Performer magician = (Performer) context.getBean("kenny");
        magician.perform();

    }
}
