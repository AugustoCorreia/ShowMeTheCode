package com.falemais.ShowMeTheCode.business;

import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import org.springframework.stereotype.Component;

@Component
public class CalculateBusiness implements ICalculateBusiness{
    private String COD_011 = "011";
    private String COD_016 = "016";
    private String COD_017 = "017";
    private String COD_018 = "018";

    @Override
    public Double getTarifa(CalculateRequest request) {

        if(request.getCodOrigem().equals(COD_011) ){

            if (request.getCodDestino().equals(COD_016)){
                return 1.9;
            }else if (request.getCodDestino().equals(COD_017)){
                return 1.7;
            }else if (request.getCodDestino().equals(COD_018)){
                return 0.9;
            }else{
                return null;
            }

        } else if (request.getCodOrigem().equals(COD_016) && request.getCodDestino().equals(COD_011)){
            return 2.9;
        }else if (request.getCodOrigem().equals(COD_017) && request.getCodDestino().equals(COD_011)){
            return 2.7;
        }else if (request.getCodOrigem().equals(COD_018) && request.getCodDestino().equals(COD_011)){
            return 1.9;
        }else{
            return null;
        }
    }

    @Override
    public Double getValorChamadaSemPlano(CalculateRequest request, Double tarifa) {
        return request.getTempoLigacao() * tarifa;
    }

    @Override
    public Double getValorChamadaComPlano(CalculateRequest request, Double tarifa) {
        Double tarifa10 = tarifa + (tarifa*0.1);
        Integer tempoFinal = request.getTempoLigacao() - request.getPlano().getTempoGratis();
            if (tempoFinal > 0){
                return tempoFinal * tarifa10;
            }else {
                return 0.0;
            }
    }
}
