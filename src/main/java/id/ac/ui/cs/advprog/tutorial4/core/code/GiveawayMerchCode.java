package id.ac.ui.cs.advprog.tutorial4.core.code;

import id.ac.ui.cs.advprog.tutorial4.core.item.MerchItem;

public class GiveawayMerchCode extends GiveawayCode {
    public GiveawayMerchCode(String code, String itemName, int discountAmount) {
        super(code, new MerchItem(itemName), discountAmount);
    }
}
