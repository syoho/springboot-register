package com.example.register;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserInfoController {

    @GetMapping("/")
    public String start(){
        return "input";

    }

    @RequestMapping("/confirm")
    public ModelAndView register
            (@ModelAttribute RegisterBean registerBean , ModelAndView modelAndView){
        modelAndView.addObject("registerBean",registerBean);
        modelAndView.setViewName("confirm.html");
        return modelAndView;
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute RegisterBean registerBean, Model model) {
        model.addAttribute("registerBean", registerBean);
        return "success";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    //添加映射 /input 的方法，返回 input.html 页面
    @GetMapping("/input")
    public String showInputPage() {
        return "input";
    }

}







//    @GetMapping("/userinfo")
//    public String userInfo(Model model) {
//        model.addAttribute("userInfo", new UserInfo());
//        return "userinfo";
//    }

//    @PostMapping("/userinfo")
//    public String userInfoSubmit(@ModelAttribute UserInfo userInfo) {
//        return "redirect:/confirm";
//    }
//
//    @GetMapping("/confirm")
//    public String confirm(@ModelAttribute UserInfo userInfo, Model model) {
//        model.addAttribute("userInfo", userInfo);
//        return "confirm";
//    }
//
//    @GetMapping("/success")
//    public String success() {
//        return "success";
//    }