package id.ac.ui.cs.advprog.tutorial4.core.code;

import id.ac.ui.cs.advprog.tutorial4.core.util.RedeemCodeUtil;

import java.util.Map;

public class GenerateCodeFactory {
    public String randomCode(String customCode) {
        if (customCode.equals("")) {
            return RedeemCodeUtil.generateCode();
        }
        return customCode;
    }

    public RedeemCode generateCode(String itemType, String codeType, String code, String itemName, Map<String, String> data) {
        code = randomCode(code);
        if (itemType.equals("merch") && codeType.equals("promo")) {
            return new PromoMerchCode(code, itemName, Double.parseDouble(data.get("discount")));
        } else if (itemType.equals("merch") && codeType.equals("giveaway")) {
            return new GiveawayMerchCode(code, itemName, Integer.parseInt(data.get("amount")));
        } else if (itemType.equals("membership") && codeType.equals("promo")) {
            return new PromoMembershipCode(code, itemName, Double.parseDouble(data.get("discount")));
        } else if (itemType.equals("membership") && codeType.equals("giveaway")) {
            return new GiveawayMembershipCode(code, itemName, Integer.parseInt(data.get("amount")));
        } else {
            return null;
        }
    }
}
