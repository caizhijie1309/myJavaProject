package com.example.demo.Model;

/**
 * Created by Cookie on 2018/1/22.
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="logintable")
public class UserLogin {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name="login_name")
    private  String loginName;

    @NotNull
    @Column(name="login_password")
    private  String loginPassword;

    public UserLogin(){}

    public UserLogin(String a, String b){
        this.loginName = a;
        this.loginPassword = b;
    }

//Getter and Setter
}