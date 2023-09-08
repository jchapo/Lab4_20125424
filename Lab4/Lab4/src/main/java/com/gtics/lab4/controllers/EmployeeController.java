package com.gtics.lab4.controllers;


import com.gtics.lab4.repository.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/empleados")
public class EmployeeController {

    final EmployeeRepository employeeRepository;


    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping(value = {"/list", ""})
    public String listar (Model model){
        model.addAttribute("page","pagempleados");
        model.addAttribute("employeelist",employeeRepository.findAll());

        return "empleados";}

    /*
    @GetMapping("/new")
    public String crear(Model model){
        model.addAttribute("crear",1);
        model.addAttribute("gu",1);

        return "gestionusuarios";}

    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/usuarios/list";
    }

    @GetMapping("/editar")
    public String formEditar(@RequestParam("id") int id, Model model) {

        Optional<Usuario> optional = usuarioRepository.findById(id);

        if(optional.isPresent()){ //existe un employee con ese ID
            Usuario usuario = optional.get();
            model.addAttribute("usuario",usuario);
            model.addAttribute("gu",1);

            return "gestionusuarios";
        }else{
            model.addAttribute("editar",1);
            return "gestionusuarios";
        }
    } */



}