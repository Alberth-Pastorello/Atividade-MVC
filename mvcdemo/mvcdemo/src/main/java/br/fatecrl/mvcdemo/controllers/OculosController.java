package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Oculos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/oculos")
public class OculosController {

    public List<Oculos> oculos = new ArrayList<Oculos>();

    public OculosController() {
        oculos.add(new Oculos("14524", "Oculos de sol", 300, 200));
        oculos.add(new Oculos("45976", "Oculos de grau", 200, 150));
        oculos.add(new Oculos("67854", "Oculos anti-reflexo", 450, 400));
        oculos.add(new Oculos("54972", "Oculos de natação", 125, 100));
    }

    @GetMapping
    public String getOculos(Model model) {
        model.addAttribute("oculos", oculos);
        return "oculos";
    }
}