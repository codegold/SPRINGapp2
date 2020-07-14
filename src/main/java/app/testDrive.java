package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDrive {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Performer performer = (Performer) context.getBean("poeticDuke");
//        performer.perform();

//        Performer kenny = (Performer) context.getBean("kenny2");
//        kenny.perform();
//        System.out.println();

        Performer magician = (Performer) context.getBean("harry");
        magician.perform();

        Performer stewie = (Performer) context.getBean("stewie");
        stewie.perform();

        System.out.println();
        Performer duke = (Performer) context.getBean("duke");
        duke.perform();
    }
}
