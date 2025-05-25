package com.example.springbootsample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootsample.SoftwareEngineer;
import com.example.springbootsample.SoftwareEngineerService;

@RestController
@RequestMapping("/api/v1/software-engineer")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;
    // Add your methods and logic here

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        
        // Sample data
        // return(List<SoftwareEngineer>) List.of(
        //     new SoftwareEngineer(1, "Alice", "Java"),
        //     new SoftwareEngineer(2, "Bob", "Python")
        // );
        return softwareEngineerService.getAllEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineerById(@PathVariable Integer id) {
        
        return softwareEngineerService.getEngineerById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        // Add logic to add a software engineer
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }

    @PutMapping("{id}")
    public void updateSoftwareEngineer(@PathVariable Integer id,@RequestBody SoftwareEngineer softwareEngineer) {
        // Add logic to update a software engineer
        softwareEngineerService.updateSoftwareEngineer(id, softwareEngineer);
    }

    @DeleteMapping("{id}")
    public void deleteSoftwareEngineer(@PathVariable   Integer id) {
        // Add logic to delete a software engineer
        softwareEngineerService.deleteSoftwareEngineer(id);
    }


}