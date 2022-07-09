package com.masc.external_api.controller;

import com.masc.external_api.entities.Advice;
import com.masc.external_api.entities.Slip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdviceController {

    @Autowired
    private RestTemplate restTemplate;

    
    @GetMapping("/")
    public ModelAndView getAdvice() {
        ModelAndView mv = new ModelAndView("Home");
        Advice advice = restTemplate.getForObject("https://api.adviceslip.com/advice", Advice.class);
        mv.addObject("advice", advice.getSlip().getAdvice());
        return mv;
    }

}
