package com.irri.propertymanagement.controller;

import com.irri.propertymanagement.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/calculator")
public class CalculatorController {


   @GetMapping("/add") //http://localhost:8080/api/vi/calculator/add?num1=10&num2=15
    public Double add(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
        return num1+num2;
    }

    @GetMapping("/sub/{num1}/{num2}") //http://localhost:8080/api/vi/calculator/sub/90/9
    public Double subtract(@PathVariable("num1") Double num1 , @PathVariable("num2") Double num2){
       Double result= null;
       return result = num1-num2;
    }

    @PostMapping("/mul") //{"num1":9,"num2":8,"num3":70,"num41":20} num41 has a JsonProperty Annotation   // return data and status
    public  ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
       Double result =null;
       result = calculatorDTO.getNum1()* calculatorDTO.getNum2()+ calculatorDTO.getNum3()* calculatorDTO.getNum4();

        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
       return responseEntity;
    }

}
