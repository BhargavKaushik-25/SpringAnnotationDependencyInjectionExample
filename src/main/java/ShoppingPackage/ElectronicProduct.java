package ShoppingPackage;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ElectronicProduct implements Product
{

    @Override
    public void getProductInformation() {
        System.out.println("PRODUCT TYPE :- ELECTRONIC");
    }
}
