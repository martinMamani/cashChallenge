package com.mpm.cashApiRestFul.models;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;
@Getter
@Setter

@Entity
@Table(name="prestamo")
public class LoanModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idloan")
    private Long id;
    @Column(name = "total")
    private Double total;

    @ManyToOne
    @JoinColumn(name="idusuario")
    private UserModel usuario;

    public UserModel getUser(){
        return usuario;
    }
    public void setUser(UserModel newUser){
        this.usuario=newUser;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getTotal(){
        return total;
    }
    public void setTotal(Double monto){
        this.total=monto;
    }
    
}
