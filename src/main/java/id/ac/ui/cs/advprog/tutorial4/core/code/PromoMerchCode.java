package id.ac.ui.cs.advprog.tutorial4.core.code;

import id.ac.ui.cs.advprog.tutorial4.core.item.MerchItem;

public class PromoMerchCode extends PromoCode {
    public PromoMerchCode(String code, String itemName, double discountAmount) {
        super(code, new MerchItem(itemName), discountAmount);
    }
}