package com.mpm.cashApiRestFul.models;
import java.io.Serializable;
import java.util.List;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="usuario")
public class UserModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idusuario",unique = true,nullable = false)
    private Long id;
    @Column(name="email")
    private String email;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;

    
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    private List<LoanModel> prestamos;

    public List<LoanModel> getLoans(){
        return this.prestamos;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String nombre) {
        this.firstName = nombre;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String nombre) {
        this.lastName = nombre;
    }


}
