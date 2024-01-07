package DependencyInjection1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. FRONTEND DEVELOPMENT");
        System.out.println("2. BACKEND DEVELOPMENT");
        System.out.println(" ENTER YOUR CHOICE");
        int choice = scanner.nextInt();

        Development development = null;

        if (choice == 1){
            development = context.getBean("UI", FrontEndDevelopment.class);
        } else if (choice == 2) {
            development = context.getBean("JAVA", BackEndDevelopment.class);
        }else {
            System.out.println("INVALID CHOICE");
        }

        if (development != null){
            development.getCourseData();
            development.getSubjectInformation();
        }
    }
}
