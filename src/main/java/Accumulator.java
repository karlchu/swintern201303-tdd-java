import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: kchu
 * Date: 5/03/13
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Accumulator {
    Map<String, Integer> productCodes = new HashMap<String, Integer>();

    public int getLineItemsCount() {
        return productCodes.size();
    }

    public void addToCart(String productCode) {
        if (productCodes.containsKey(productCode)) {
            Integer oldQuantity = productCodes.get(productCode);
            productCodes.put(productCode, oldQuantity + 1);
        } else  {
            productCodes.put(productCode, 1);
        }
    }

    public int getProductQuantity(String productCode) {
        if (!productCodes.containsKey(productCode)) return 0;
        return productCodes.get(productCode);
    }
}
