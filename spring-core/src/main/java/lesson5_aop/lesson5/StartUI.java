package lesson5_aop.lesson5;/**
 * @author Sergey Zhernovoy
 * create on 18.09.2017.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartUI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop_lesson5.xml");
        Thinker thinker = (Thinker) context.getBean("volunteer");
        MindReader mindReader = (MindReader) context.getBean("magican");
        thinker.thinkOfSomethings("I have thougths: Hello Sergey ");
        System.out.println("Magic " + mindReader.getThougths());

    }
}

    