package org.cloud.demo1.model;

import java.io.Serializable;

import static org.jboss.seam.ScopeType.SESSION;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

@Entity
@Name("user")
@Scope(SESSION)
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1881413500711441951L;
    private String username;

    private String password;

    private int id;

    public User(int id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    public User() {
    }

    @NotNull
    @Size(min = 5, max = 15)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Size(min = 5, max = 15)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User(" + username + ")";
    }

}
