package ComponentAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//This is example of implicit creation of object using annotation

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. CRICKET");
        System.out.println("2. CHESS");
        System.out.println("3. VIDEO GAME");
        System.out.println("ENTER YOUR CHOICE");
        int choice = scanner.nextInt();

        Game game = null;

         switch (choice){
             case 1:
                game = context.getBean("cricket", Game.class);
                break;
             case 2:
                game = context.getBean("chess", Game.class);
                break;
             case 3:
                game = context.getBean("videoGame", Game.class);
                break;
             default:
                 System.out.println("INVALID CHOICE");
                 break;
        }

        if (game != null){
            game.getGameType();
            game.getGameInformation();
        }else {
            System.out.println("SOMETHING WENT WRONG");
        }
    }
}
