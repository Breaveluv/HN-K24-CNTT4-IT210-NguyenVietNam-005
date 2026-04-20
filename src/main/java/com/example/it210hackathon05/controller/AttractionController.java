package com.example.it210hackathon05.controller;

import com.example.it210hackathon05.model.Attraction;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/attraction")

public class AttractionController {
    List<Attraction> attractionList = new ArrayList<>(
                    Arrays.asList(
                            new Attraction(1L,"Ha Long Bay","Quang Ninh","mat me",4.5,"https://statics.vinpearl.com/ha-long-bay-in-vietnam-1_1689180838.jpg"),
                            new Attraction(2L,"Ha Long Bay","Quang Ninh","mat me",4.5,"https://statics.vinpearl.com/ha-long-bay-in-vietnam-1_1689180838.jpg")


                    )
                    );

    @GetMapping("/attraction")
    public String showAttraction (Model model){
        model.addAttribute("attraction",attractionList);

        return "Attraction";
    }

    @GetMapping("/addAttraction")
    public String addAttraction(Model model){
        model.addAttribute("attraction",new Attraction());
        return "form-addAttraction";
    }

    @PostMapping("/addAttraction")
    public String addAttraction(
            @ModelAttribute("attraction")
            Attraction attraction){
        attractionList.add(attraction);
        return "redirect:/attraction";
    }

}
