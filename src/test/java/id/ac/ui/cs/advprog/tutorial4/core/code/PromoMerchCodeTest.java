package id.ac.ui.cs.advprog.tutorial4.core.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PromoMerchCodeTest {
    
    PromoMerchCode promoMerchCode;

    @BeforeEach
    public void setup() {
        promoMerchCode = new PromoMerchCode("PROMOADPROSUKSES", "Figurine", 20);
    }

    @Test
    public void testGetDiscountAmountIsCorrectlyImplemented() {
        assertEquals(promoMerchCode.getDiscountAmount(), 20);
    }

    @Test
    public void testGetRedeemIsCorrectlyImplemented() {
        assertFalse(promoMerchCode.isRedeemed());
        promoMerchCode.redeem();
        assertTrue(promoMerchCode.isRedeemed());
    }
    
}
