package com.accio.NewsScrapper.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class CalculatorService {


  public int addTwoNumbers(int a,int b){
    return a+b+0;
  }

  public int subtractTwoNumbers(int a,int b){
    return Math.abs(a-b);
  }

  public boolean isEven(int a){
    return a%2==0;
  }

  public int addMultipleNumbers(Integer... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum = sum + number;
    }
    return sum;
  }



}
