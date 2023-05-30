package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Oculos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/oculos")
public class OculosAPI {

    public List<Oculos> oculos = new ArrayList<Oculos>();

    public OculosAPI() {
        oculos.add(new Oculos("14524", "Oculos de sol", 300, 200));
        oculos.add(new Oculos("45976", "Oculos de grau", 200, 150));
        oculos.add(new Oculos("67854", "Oculos anti-reflexo", 450, 400));
        oculos.add(new Oculos("54972", "Oculos de natação", 125, 100));
    }

    @GetMapping
    public List<Oculos> getOculos() {
        return oculos;
    }

}
