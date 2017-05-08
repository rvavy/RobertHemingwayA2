package com.example.controllers;

import com.example.domain.Bar;
import com.example.domain.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Robert Hemingway on 03/15/2017.
 */
 @Controller
 @RequestMapping("/bars")
 /* Controller class that handles the CRUD operations
-------------------------------------------------- */
 public class BarController {

     @Autowired
     private BarRepository repository;


    /* Shows the list of bars on the site from the repository
-------------------------------------------------- */
     @RequestMapping(value="", method=RequestMethod.GET)
     public String listBars(Model model) {
         model.addAttribute("bars", repository.findAll());
         return "bars/list";
     }

    /* Uses the ID selected to delete the Bar from the repository
-------------------------------------------------- */
    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        repository.delete(id);
        return new ModelAndView("redirect:/bars");
    }

    /* Direct to new.html to create a new bar
    -------------------------------------------------- */
    @RequestMapping(value="/new", method = RequestMethod.GET)
    public String newProject() {
        return "bars/new";
    }
 }
