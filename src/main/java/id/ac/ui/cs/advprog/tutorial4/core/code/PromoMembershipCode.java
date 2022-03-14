package id.ac.ui.cs.advprog.tutorial4.core.code;

import id.ac.ui.cs.advprog.tutorial4.core.item.MembershipItem;

public class PromoMembershipCode extends GiveawayCode {
    public PromoMembershipCode(String code, String itemName, int itemAmount) {
        super(code, new MembershipItem(itemName), itemAmount);
    }
}
