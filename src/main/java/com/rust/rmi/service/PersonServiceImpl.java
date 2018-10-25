 /*
  * Package com.rust.rmi.service
  * FileName: PersonServiceImpl
  * Author:   Rust
  * Date:     2018/10/25 22:56
  */
 package com.rust.rmi.service;

 import com.rust.rmi.model.PersonEntity;

 import java.rmi.RemoteException;
 import java.rmi.server.UnicastRemoteObject;
 import java.util.LinkedList;
 import java.util.List;

 /**
  * @author Rust
  */
 public class PersonServiceImpl extends UnicastRemoteObject implements PersonService {
  private static final long serialVersionUID = -4723482766636223122L;

  public PersonServiceImpl() throws RemoteException {
   super();
  }

  @Override
  public List<PersonEntity> getList() throws RemoteException {
   System.out.println("Get Person Start!");
   List<PersonEntity> personList= new LinkedList<>();

   PersonEntity person1=new PersonEntity();
   person1.setAge(25);
   person1.setId(0);
   person1.setName("Leslie");
   personList.add(person1);

   PersonEntity person2=new PersonEntity();
   person2.setAge(25);
   person2.setId(1);
   person2.setName("Rose");
   personList.add(person2);

   return personList;
  }
 }
