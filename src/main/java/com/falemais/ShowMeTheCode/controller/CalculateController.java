package com.falemais.ShowMeTheCode.controller;

import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import com.falemais.ShowMeTheCode.dto.CalculateResponse;
import com.falemais.ShowMeTheCode.service.ICalculateService;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CalculateController {

    @Autowired
    private ICalculateService calculateService;

    @ApiOperation(value = "Retorna Resultado do Calculo")
    @PostMapping(path = "/calc")
    public CalculateResponse Calc (@RequestBody CalculateRequest calculateRequest) throws Exception {
        return calculateService.calc(calculateRequest);
    }
    @GetMapping(path = "/on")
    public String tst(){
        return "ONLINE!";
    }

}
