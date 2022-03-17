package id.ac.ui.cs.advprog.tutorial4.core.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GiveawayMembershipCodeTest {

    GiveawayMembershipCode giveawayMembershipCode;

    @BeforeEach
    public void setup() {
        giveawayMembershipCode = new GiveawayMembershipCode("GIVEAWAYSYUKURANADPRO", "Figurine", 15);
    }

    @Test
    public void testGetItemAmountIsCorrectlyImplemented() {
        assertEquals(giveawayMembershipCode.getItemAmount(), 15);
    }

    @Test
    public void testGetRedeemIsCorrectlyImplemented() {
        assertFalse(giveawayMembershipCode.isRedeemed());
        giveawayMembershipCode.redeem();
        assertTrue(giveawayMembershipCode.isRedeemed());
    }

}
