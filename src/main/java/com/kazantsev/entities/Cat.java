package com.kazantsev.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="cats")
public class Cat {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String type;

}
