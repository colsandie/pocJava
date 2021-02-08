package com.neoris.os.poc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User
 * Descripcion:
 * <p>
 * <p>
 * Control de versiones:
 * Version  Date/Hour               	  By                 				Company     Description
 * -------  -------------------     	  ----------------    				--------    -----------------------------------------------------------------
 * 1.0      08/02/2021/10:20 a. m.         [Diego Colchado S.]              NEORIS	    Creacion de clase User.java
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;

    public User(){
        this.name = "";
        this.email = "";
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Getter del atributo id
     *
     * @return atributo id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter del atributo id
     *
     * @param id para asingar el id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter del atributo name
     *
     * @return atributo name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter del atributo email
     *
     * @return atributo email
     */
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
