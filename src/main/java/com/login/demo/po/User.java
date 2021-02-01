package com.login.demo.po;

import javax.persistence.*;

/**
 * @ProjectName: Test
 * @Package: com.login.demo.po
 * @ClassName: User
 * @Author: qiuhen
 * @Description: 用户类
 * @Date: 2021/1/31 14:34
 * @Version: 1.0
 */
@Entity
@Table(name = "User")
public class User {

    public User() {

    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

