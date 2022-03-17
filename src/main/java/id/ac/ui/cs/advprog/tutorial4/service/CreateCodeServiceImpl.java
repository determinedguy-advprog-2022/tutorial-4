package id.ac.ui.cs.advprog.tutorial4.service;

import id.ac.ui.cs.advprog.tutorial4.core.code.GenerateCodeFactory;
import id.ac.ui.cs.advprog.tutorial4.core.code.RedeemCode;
import id.ac.ui.cs.advprog.tutorial4.repository.RedeemCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CreateCodeServiceImpl implements CreateCodeService {

    private final RedeemCodeRepository redeemCodeRepository;

    @Override
    public RedeemCode createCode(String itemType, String codeType, String code, String itemName, Map<String, String> data) {
        GenerateCodeFactory generateCodeFactory = new GenerateCodeFactory();
        RedeemCode redeemCode = generateCodeFactory.generateCode(itemType, codeType, code, itemName, data);
        redeemCodeRepository.save(redeemCode);
        return redeemCode;
    }
}
