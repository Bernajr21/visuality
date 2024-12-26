package com.visualy.nochevieja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistroController {
    @GetMapping("/registro")
    public String mostrarRegistro(
            @RequestParam(name = "nif", required = true) String nif,
            @RequestParam(name = "nombre", required = true) String nombre,
            Model model) {

        model.addAttribute("nif", nif);
        model.addAttribute("nombre", nombre);
        return "registro";
    }
}
