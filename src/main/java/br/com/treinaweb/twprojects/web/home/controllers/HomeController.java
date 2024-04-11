package br.com.treinaweb.twprojects.web.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index() {
        return "home/index";
    }

    @GetMapping("/format-data")
    public ModelAndView formatData() {
        var model = Map.of(
                "date", LocalDate.of(2024, 4, 7),
                "dateTime", LocalDateTime.of(2024, 4, 8, 14, 27),
                "currency", 1024.51,
                "percent", 2.0 / 100
        );
        return new ModelAndView("dados-formatados", model);
    }


}
