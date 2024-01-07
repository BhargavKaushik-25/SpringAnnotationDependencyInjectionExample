package ShoppingPackage;

import org.springframework.stereotype.Component;

@Component
public class GroceryProduct implements Product{

    @Override
    public void getProductInformation() {
        System.out.println("PRODUCT TYPE:- GROCERY PRODUCTS");
    }
}
