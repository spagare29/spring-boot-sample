package com.example.springbootsample;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SoftwareEngineer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String techstack;
    
    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, String techstack) {
        this.id = id;
        this.name = name;
        this.techstack = techstack;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTechstack() {
        return techstack;
    }
    public void setTechstack(String techstack) {
        this.techstack = techstack;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer [id=" + id + ", name=" + name + ", techstack=" + techstack + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, techstack);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SoftwareEngineer other = (SoftwareEngineer) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name)
                && Objects.equals(techstack, other.techstack);
    }

}