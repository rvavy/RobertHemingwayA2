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
 @RequestMapping("/bars/map")

 /* Controller class that handles the CRUD operations
-------------------------------------------------- */
 public class MapController {


    /* Direct to new.html to create a new bar
    -------------------------------------------------- */
    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public String newProject() {
        return "bars/map";
    }
}
