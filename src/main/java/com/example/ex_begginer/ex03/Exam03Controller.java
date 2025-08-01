package com.example.ex_begginer.ex03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
@Autowired
private ServletContext application;
@RequestMapping("")
public String input(){
    return "exam03";
}
@RequestMapping("/result")
public String output(int item1,int item2,int item3){
    double tax = 0.1;
    int result1 = (int)((item1+item2+item3)*(1+tax));
    int result2 = item1+item2+item3;
    application.setAttribute("result1", result1);
    application.setAttribute("result2", result2);
    return "exam03-result";
}
}
