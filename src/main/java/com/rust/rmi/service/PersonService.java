 /*
  * Package com.rust.rmi.service
  * FileName: PersonService
  * Author:   Rust
  * Date:     2018/10/25 22:54
  */
 package com.rust.rmi.service;

 import com.rust.rmi.model.PersonEntity;

 import java.rmi.Remote;
 import java.rmi.RemoteException;
 import java.util.List;

 /**
  * @author Rust
  */
 public interface PersonService extends Remote {
  List<PersonEntity> getList() throws RemoteException;
 }
