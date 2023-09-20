package com.senactds.cookiemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cookies")
public class CookiesController {

    // GRAVA COOKIES
    @RequestMapping("/grava")
    public String criaCookie(HttpServletResponse response) {
        Cookie novoCookie = new Cookie("user-id", "123abc");
        response.addCookie(novoCookie);
        return "criacookie";
    }

    // LÊ COOKIES
    @RequestMapping("/le")
    public String leCookie(@CookieValue(name = "user-id", defaultValue = "nenhum-valor") String userId, Model model) {
        model.addAttribute("userid", userId);
        return "lecookie";
    }

    //EXCLUI COOKIES
    @RequestMapping("/exclui")
    public String excluiCookie(HttpServletResponse response) {
        Cookie novoCookie = new Cookie("user-id", null);
        novoCookie.setMaxAge(0);
        response.addCookie(novoCookie);
        return "excluicookie";
    }
}
