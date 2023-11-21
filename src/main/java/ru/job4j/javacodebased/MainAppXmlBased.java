package ru.job4j.javacodebased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainAppXmlBased {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("myPerson", Person.class);
        person.printNamesPets();
        context.close();
    }
}