package com.falemais.ShowMeTheCode.business;

import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import org.springframework.stereotype.Component;

@Component
public interface ICalculateBusiness {
    Double getTarifa (CalculateRequest request);
    Double getValorChamadaSemPlano (CalculateRequest request, Double tarifa);
    Double getValorChamadaComPlano (CalculateRequest request, Double tarifa);
}
