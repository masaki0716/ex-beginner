package com.example.ex_begginer.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {
@Autowired
private HttpSession session;
@RequestMapping("")
public String input(){
    return "exam02";
}
@RequestMapping("/result")
public String output(int num1,int num2,Model model){
    int result = num1+num2;
    session.setAttribute("num1",num1);
    session.setAttribute("num2",num2);
    session.setAttribute("result",result);
    return "exam02-result";
}
@RequestMapping("/result2")
public String output2(){
    return "exam02-result2";
}
}
