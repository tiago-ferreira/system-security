package br.com.mio.di.bao.systemsecurity.model;


import io.swagger.annotations.ApiModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@ApiModel
@Entity
public class System {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    @Length(max = 100, message = "The description cannot be more than 100 characters.")
    private String description;
    @NotNull
    @Length(max = 10, message = "The description cannot be more than 10 characters.")
    private String sigla;

    @Email(message = "Invalid Email.")
    @Length
    private String email;
    @Length(max = 50, message = "The description cannot be more than 50 characters.")
    private String url;

    public System() {
    }

    public System(Integer id, @NotNull @Length(max = 100, message = "The description cannot be more than 100 characters.") String description, @NotNull @Length(max = 10, message = "The description cannot be more than 10 characters.") String sigla, @Email(message = "Invalid Email.") @Length String email, @Length(max = 50, message = "The description cannot be more than 50 characters.") String url) {
        this.id = id;
        this.description = description;
        this.sigla = sigla;
        this.email = email;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
