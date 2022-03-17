package id.ac.ui.cs.advprog.tutorial4.core.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GiveawayMerchCodeTest {

    GiveawayMerchCode giveawayMerchCode;

    @BeforeEach
    public void setup() {
        giveawayMerchCode = new GiveawayMerchCode("GIVEAWAYTUTORIAL4", "Plushie", 45);
    }

    @Test
    public void testGetItemAmountIsCorrectlyImplemented() {
        assertEquals(giveawayMerchCode.getItemAmount(), 45);
    }

    @Test
    public void testGetRedeemIsCorrectlyImplemented() {
        assertFalse(giveawayMerchCode.isRedeemed());
        giveawayMerchCode.redeem();
        assertTrue(giveawayMerchCode.isRedeemed());
    }

}
