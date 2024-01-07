package ShoppingPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //  it is going to return new object every time by default
public class ElectronicShop implements Shop{

    private ElectronicProduct electronicProduct;

    @Autowired
    @Qualifier("electronicProduct")//this is used to set the highest priority
    public void setElectronicProduct(ElectronicProduct electronicProduct) {
        this.electronicProduct = electronicProduct;
    }

    @Override
    public void getProductInformation() {
        electronicProduct.getProductInformation();
    }

    @Override
    public void getShopInformation() {
        System.out.println("SHOP NAME:- CROMA");
        System.out.println(" SHOP LOCATION:- MUMBAI");
    }
}
