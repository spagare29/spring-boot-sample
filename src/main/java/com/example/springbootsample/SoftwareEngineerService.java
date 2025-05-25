package com.example.springbootsample;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {

    // Add methods and logic as needed
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        // Add logic to add a software engineer
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new RuntimeException("Software Engineer with id " + id + " not found"));
    }

    public void deleteSoftwareEngineer(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }

    public void updateSoftwareEngineer(Integer id, SoftwareEngineer softwareEngineer) {
        
        //No need to find . its already handled by JPA
        // SoftwareEngineer engineer = softwareEngineerRepository.findById(id).orElseThrow(() -> new RuntimeException("Software Engineer with id " + id + " not found"));  
        // engineer.setName(softwareEngineer.getName());
        // engineer.setTechstack(softwareEngineer.getTechstack());
        softwareEngineerRepository.save(softwareEngineer);
    }


}
