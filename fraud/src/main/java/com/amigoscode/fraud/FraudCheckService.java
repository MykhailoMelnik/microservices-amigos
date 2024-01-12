package com.amigoscode.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public boolean isFraudulentCustomer(Long idCustomer) {
        fraudCheckHistoryRepository.save(FraudCheckHistory.builder()
                .customerId(idCustomer)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build());
        return false;
    }

}
