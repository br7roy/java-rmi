 /*
  * Package com.rust.rmi.remoteclient
  * FileName: Starter
  * Author:   Rust
  * Date:     2018/10/25 23:00
  */
 package com.rust.rmi.remoteclient;

 import com.rust.rmi.model.PersonEntity;
 import com.rust.rmi.service.PersonService;

 import java.net.MalformedURLException;
 import java.rmi.Naming;
 import java.rmi.NotBoundException;
 import java.rmi.RemoteException;
 import java.util.List;

 /**
  * @author Rust
  */
 public class Starter {
	 public static void main(String[] args) {
		 //调用远程对象，注意RMI路径与接口必须与服务器配置一致
		 try {
			 PersonService personService = (PersonService) Naming.lookup("rmi://127.0.0.1:8888/PersonService");
			 List<PersonEntity> list = personService.getList();
			 list.forEach(System.out::println);
		 } catch (NotBoundException | MalformedURLException | RemoteException e) {
			 e.printStackTrace();
		 }
	 }
 }
