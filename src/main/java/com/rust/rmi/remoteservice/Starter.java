 /*
  * Package com.rust.rmi.remoteservice
  * FileName: Starter
  * Author:   Rust
  * Date:     2018/10/25 22:58
  */
 package com.rust.rmi.remoteservice;

 import com.rust.rmi.service.PersonService;
 import com.rust.rmi.service.PersonServiceImpl;

 import java.net.MalformedURLException;
 import java.rmi.Naming;
 import java.rmi.RemoteException;
 import java.rmi.registry.LocateRegistry;

 /**
  * @author Rust
  */
 public class Starter {
  public static void main(String[] args) {
   try {
    PersonService personService = new PersonServiceImpl();
    //注册通讯端口
    LocateRegistry.createRegistry(8888);
    //注册通讯路径
    Naming.rebind("rmi://127.0.0.1:8888/PersonService", personService);
    System.out.println("Service starting");
   } catch (RemoteException | MalformedURLException e) {
    e.printStackTrace();
   }


  }
 }
