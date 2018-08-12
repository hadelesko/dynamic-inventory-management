package org.launchcode.inventorymanagement.models;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static org.springframework.boot.SpringApplication.run;
@Entity
public class User {
    private int user_id;

    @NotNull
    @Size(min= 4, message="Not less than 4characters")
    private String name;
    @Email
    private String email;

    @Size(min=4,  message="Not less than 4characters")
    private String password;

    private String verify;

    //OneToMany
    //@JoinColumn//(name = "user_id")
    //private List<Material> materials=new ArrayList<>();

    public User(){}
    public User(int user_id){
        this.user_id=user_id;

    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

/*    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }*/
}
