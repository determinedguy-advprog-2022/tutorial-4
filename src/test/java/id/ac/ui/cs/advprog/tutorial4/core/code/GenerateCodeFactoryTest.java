package id.ac.ui.cs.advprog.tutorial4.core.code;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class GenerateCodeFactoryTest {

    @InjectMocks
    private GenerateCodeFactory generateCodeFactory;

    @Test
    public void testRandomCodeWithEmptyStringIsCorrectlyImplemented() {
        String generatedCode = generateCodeFactory.randomCode("");
        assertNotEquals("", generatedCode);
    }

    @Test
    public void testRandomCodeWithCustomCodeIsCorrectlyImplemented() {
        String customCode = generateCodeFactory.randomCode("BISMILLAHADPRONILAIA");
        assertEquals("BISMILLAHADPRONILAIA", customCode);
    }

    @Test
    public void testGeneratePromoMerchCode() {
        Map<String, String> data = new HashMap<>();
        data.put("discount", "25");
        RedeemCode code = generateCodeFactory.generateCode("merch", "promo",
                "PROMOLULUSADPRO", "Figurine", data);
        assertEquals("PROMOLULUSADPRO", code.getCode());
    }

    @Test
    public void testGenerateGiveawayMerchCode() {
        Map<String, String> data = new HashMap<>();
        data.put("amount", "69");
        RedeemCode code = generateCodeFactory.generateCode("merch", "giveaway",
                "GIVEAWAYNILAIADPROA", "Mouse Pad", data);
        assertEquals("GIVEAWAYNILAIADPROA", code.getCode());
    }

    @Test
    public void testGeneratePromoMembershipCode() {
        Map<String, String> data = new HashMap<>();
        data.put("discount", "25");
        RedeemCode code = generateCodeFactory.generateCode("membership", "promo",
                "PROMONILAIA", "Figurine", data);
        assertEquals("PROMONILAIA", code.getCode());
    }

    @Test
    public void testGenerateGiveawayMembershipCode() {
        Map<String, String> data = new HashMap<>();
        data.put("amount", "99");
        RedeemCode code = generateCodeFactory.generateCode("membership", "giveaway",
                "GIVEAWAYFORNILAIA", "Plushie", data);
        assertEquals("GIVEAWAYFORNILAIA", code.getCode());
    }

    @Test
    public void testGenerateNullCode() {
        Map<String, String> data = new HashMap<>();
        data.put("amount", "6969");
        RedeemCode code = generateCodeFactory.generateCode("merchandise", "giveaway",
                "JANGANDIPAKAI", "Figurine", data);
        assertNull(code);
    }

}
