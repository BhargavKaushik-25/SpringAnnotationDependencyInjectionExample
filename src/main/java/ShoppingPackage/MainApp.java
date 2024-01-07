package ShoppingPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. ELECTRONIC SHOP");
        System.out.println("2. BIG BASKET");
        System.out.println("ENTER YOUR CHOICE");
        int choice = scanner.nextInt();

        Shop shop = null;

        if (choice == 1){
            shop = context.getBean("electronicShop", ElectronicShop.class);
        } else if (choice == 2) {
            shop = context.getBean("bigBasket", BigBasket.class);
        }else {
            System.out.println("INVALID CHOICE");
        }

        if (shop != null){
            shop.getShopInformation();
            shop.getProductInformation();
        }else{
            System.out.println("SOMETHING WENT WRONG");
        }

        //we have used scope == prototype therefore every time address is new
        Shop s1 = context.getBean("electronicShop", ElectronicShop.class);
        Shop s2 = context.getBean("electronicShop", ElectronicShop.class);

        System.out.println( s1 == s2);

        // we have user scope == singleton therefore same and one object is returned or same address is present
        Shop s3 = context.getBean("bigBasket", BigBasket.class);
        Shop s4 = context.getBean("bigBasket", BigBasket.class);

        System.out.println( s3 == s4);

    }
}
