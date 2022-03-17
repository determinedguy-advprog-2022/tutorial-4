package id.ac.ui.cs.advprog.tutorial4.core.code;

import id.ac.ui.cs.advprog.tutorial4.core.item.MembershipItem;

public class GiveawayMembershipCode extends GiveawayCode {
    public GiveawayMembershipCode(String code, String itemName, int itemAmount) {
        super(code, new MembershipItem(itemName), itemAmount);
    }
}
