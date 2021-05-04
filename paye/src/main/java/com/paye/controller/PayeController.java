package com.paye.controller;

import com.paye.model.PayeModel;
import com.paye.service.PayeService;

@RestController
public class PayeController {
    @Autowired
    PayeService payeService;  //Service which will do all data retrieval/manipulation work


    //-------------------Calculate tax --------------------------------------------------------

    @RequestMapping(value = "/paye/", method = RequestMethod.GET)
    public double calculateTax(@RequestBody PayeModel payeModel) {


        return payeService.incomeTax(payeModel.salary,payeModel.year,payeModel.age,payeModel.medicalAid);
    }
}
