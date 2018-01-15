package com.jianyujianyu.entity;

import javax.persistence.*;

/**
 * Created by lujianyu on 2018/1/15.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String password;
}
