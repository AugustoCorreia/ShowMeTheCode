package com.falemais.ShowMeTheCode.mapper;

import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import com.falemais.ShowMeTheCode.dto.CalculateResponse;
import org.springframework.stereotype.Component;

@Component
public class CalculateMapper {
    private static String STATUS_OK = "OK";
    private static String STATUS_ERRO = "ERRO!";

    public static CalculateResponse createCalculateResponse(CalculateRequest request,Double valorSemPlano,Double valorComPlano){

        CalculateResponse calculateResponse = new CalculateResponse();
        calculateResponse.setCodOrigem(request.getCodOrigem());
        calculateResponse.setCodDestino(request.getCodDestino());
        calculateResponse.setPlano(request.getPlano());
        calculateResponse.setTempoLigacao(request.getTempoLigacao());
        calculateResponse.setValorComPlano(valorComPlano);
        calculateResponse.setValorSemPlano(valorSemPlano);
        calculateResponse.setStatus(STATUS_OK);

        return calculateResponse;
    }
}
