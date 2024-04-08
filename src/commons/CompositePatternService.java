package commons;

import java.util.List;

import patterns.composite.model.AirPods;
import patterns.composite.model.Box;
import patterns.composite.model.Laptop;
import patterns.composite.model.Mobile;
import patterns.composite.model.Product;

public class CompositePatternService implements DesignPatternService {

    @Override
    public void runExample() {
        testCompositePattern();
    }

    private void testCompositePattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("COMPOSITE DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n\n");

        Product redmeMobile = new Mobile(1, "Redme note 8 pro", 7999);
        Product realmeMobile = new Mobile(2, "Realme note 9 pro", 16999);
        Product pocoMobile = new Mobile(3, "Poco m11", 13999);

        Product boat = new AirPods(4, "Boat wireless", 1899);
        Product jbl = new AirPods(5, "JBL wireless", 2499);
        Product boult = new AirPods(6, "Boult wireless", 1299);
        
        Product lenovo = new Laptop(7, "Lenovo ideapad 330s", 48999);
        Product mac = new Laptop(8, "Mac book pro", 89999);
        Product dell = new Laptop(9, "Dell", 56999);

        List<Product> productList1 = List.of(redmeMobile, boat, mac);

        Product b1 = new Box(10, productList1);
    
        List<Product> productList2 = List.of(dell, b1);

        Product b2 = new Box(11, productList2);
        
        List<Product> productList3 = List.of(realmeMobile, jbl, b2);
        
        Product product = new Box(12, productList3);

        System.out.println("-------------------------------------------------");
        System.out.printf("%s\t%-30s\t%s\n", "ID", "NAME", "PRICE");
        System.out.println("-------------------------------------------------");
        System.out.println("Total cost of the product is: " + product.getPrice());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }
}
