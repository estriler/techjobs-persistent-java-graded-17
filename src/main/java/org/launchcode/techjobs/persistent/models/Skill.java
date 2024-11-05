package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 200)
    public String description;

    //no-arg constructor
    public Skill(){}

}
