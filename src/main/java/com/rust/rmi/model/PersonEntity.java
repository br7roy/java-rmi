 /*
  * Package com.rust.rmi.model
  * FileName: PersonEntity
  * Author:   Rust
  * Date:     2018/10/25 22:53
  */
 package com.rust.rmi.model;

 import java.io.Serializable;

 /**
  * @author Rust
  */
 public class PersonEntity implements Serializable {
  private static final long serialVersionUID = -6135889987742972038L;
  private int id;
  private String name;
  private int age;

  public int getId() {
   return id;
  }

  public void setId(int id) {
   this.id = id;
  }

  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public int getAge() {
   return age;
  }

  public void setAge(int age) {
   this.age = age;
  }

  @Override
  public String toString() {
   return "PersonEntity{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", age=" + age +
           '}';
  }
 }
