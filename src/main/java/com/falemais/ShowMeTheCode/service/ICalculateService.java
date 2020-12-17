package com.falemais.ShowMeTheCode.service;

import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import com.falemais.ShowMeTheCode.dto.CalculateResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface ICalculateService {
    CalculateResponse calc (CalculateRequest request) throws Exception;
}
