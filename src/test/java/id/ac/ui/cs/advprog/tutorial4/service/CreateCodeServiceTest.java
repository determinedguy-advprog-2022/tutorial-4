package id.ac.ui.cs.advprog.tutorial4.service;

import id.ac.ui.cs.advprog.tutorial4.core.code.GenerateCodeFactory;
import id.ac.ui.cs.advprog.tutorial4.core.code.RedeemCode;
import id.ac.ui.cs.advprog.tutorial4.repository.RedeemCodeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CreateCodeServiceTest {

    @Mock
    private RedeemCodeRepository redeemCodeRepository;

    CreateCodeServiceImpl createCodeService;

    @BeforeEach
    public void setup() {
        createCodeService = new CreateCodeServiceImpl(redeemCodeRepository);
    }

    @Test
    public void whenCreateCodeShouldCallSave() {
        Map<String, String> data = new HashMap<>();
        data.put("discount", "80");
        RedeemCode redeemCode = createCodeService.createCode("merch", "promo", "BISMILLAHLULUS",
                "Figurine", data);
        verify(redeemCodeRepository, times(1)).save(redeemCode);
    }

    @Test
    public void whenCreateCodeShouldSameAsGenerateCode() {
        Map<String, String> data = new HashMap<>();
        data.put("amount", "3");
        RedeemCode redeemCode = createCodeService.createCode("merch", "giveaway",
                "AYOLULUSADPRO", "Mouse Pad", data);
        GenerateCodeFactory generateCodeFactory = new GenerateCodeFactory();
        RedeemCode redeemCodeFactory = generateCodeFactory.generateCode("merch", "giveaway",
                "AYOLULUSADPRO", "Mouse Pad", data);
        assertEquals(redeemCode.getCode(), redeemCodeFactory.getCode());
    }

}
