package com.falemais.ShowMeTheCode.controller;

import com.falemais.ShowMeTheCode.dto.CalculateRequest;
import com.falemais.ShowMeTheCode.dto.CalculateResponse;
import com.falemais.ShowMeTheCode.service.ICalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CalculateController {

    @Autowired
    private ICalculateService calculateService;

    @GetMapping(path = "/calc")
    public CalculateResponse Calc (@RequestBody CalculateRequest calculateRequest) throws Exception {
        return calculateService.calc(calculateRequest);
    }
    @GetMapping(path = "/tst")
    public String tst(){
        return "ONLINE!";
    }

}
