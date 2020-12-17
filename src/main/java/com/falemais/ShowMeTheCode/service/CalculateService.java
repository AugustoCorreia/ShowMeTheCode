package com.falemais.ShowMeTheCode.service;

import com.falemais.ShowMeTheCode.business.ICalculateBusiness;
import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import com.falemais.ShowMeTheCode.dto.CalculateResponse;
import com.falemais.ShowMeTheCode.mapper.CalculateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService{
    @Autowired
    ICalculateBusiness calculateBusiness;

    @Override
    public CalculateResponse calc(CalculateRequest request)  {
        Double tarifa = calculateBusiness.getTarifa(request);
        Double valorSemPlano;
        Double valorComPlano;
        if (tarifa!= null) {
             valorSemPlano = calculateBusiness.getValorChamadaSemPlano(request, tarifa);
             valorComPlano = calculateBusiness.getValorChamadaComPlano(request, tarifa);
        }else{
            valorSemPlano = null;
            valorComPlano = null;
        }
         return CalculateMapper.createCalculateResponse(request,valorSemPlano,valorComPlano);
    }
}
