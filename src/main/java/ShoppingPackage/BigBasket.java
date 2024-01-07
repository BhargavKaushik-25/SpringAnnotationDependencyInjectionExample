package ShoppingPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //it is going to return only one object every time
public class BigBasket implements Shop
{

    private GroceryProduct groceryProduct;

    @Autowired
    @Qualifier("groceryProduct")
    public void setGroceryProduct(GroceryProduct groceryProduct) {
        this.groceryProduct = groceryProduct;
    }

    @Override
    public void getProductInformation() {
        groceryProduct.getProductInformation();
    }

    @Override
    public void getShopInformation() {
        System.out.println("SHOP NAME :- BIG BASKET");
        System.out.println(" SHOP LOCATION:- BANGALORE");
    }
}
