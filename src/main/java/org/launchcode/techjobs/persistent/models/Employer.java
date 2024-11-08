package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required.")
    @Size(min = 1,max = 50, message = "Location length must be within 1 to 50 characters.")
    public String location;

    //no-arg constructor
    public Employer(){}

    public @NotBlank @Size(min = 1, max = 50) String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(min = 1, max = 50) String location) {
        this.location = location;
    }
}
