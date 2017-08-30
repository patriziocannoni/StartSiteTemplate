package br.com.cannoni.template.model.dto;

import java.io.Serializable;

/**
 * @author patrizio
 * @since 30/08/2017
 *
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -5056053752134874179L;

    private Long id;

    private String name;

    private String fullName;
    
    private String email;
    
    @Override
    public String toString() {
        return fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
