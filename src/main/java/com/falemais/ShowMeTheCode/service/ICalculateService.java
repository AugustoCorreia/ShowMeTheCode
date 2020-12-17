package com.falemais.ShowMeTheCode.service;

import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import com.falemais.ShowMeTheCode.dto.CalculateResponse;
import org.springframework.stereotype.Component;

@Component
public interface ICalculateService {
    CalculateResponse calc (CalculateRequest request) throws Exception;
}
