package id.ac.ui.cs.advprog.tutorial4.core.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PromoMembershipCodeTest {
    
    PromoMembershipCode promoMembershipCode;

    @BeforeEach
    public void setup() {
        promoMembershipCode = new PromoMembershipCode("PROMOMAHASISWAADPRO", "Figurine", 50);
    }

    @Test
    public void testGetDiscountAmountIsCorrectlyImplemented() {
        assertEquals(promoMembershipCode.getDiscountAmount(), 50);
    }

    @Test
    public void testGetRedeemIsCorrectlyImplemented() {
        assertFalse(promoMembershipCode.isRedeemed());
        promoMembershipCode.redeem();
        assertTrue(promoMembershipCode.isRedeemed());
    }
    
}
