package com.klu;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MaimApp {

 public static void main(String[] args) {
  
  SessionFactory factory = new Configuration().configure().buildSessionFactory();
  
  Session session = factory.openSession();
  
  Transaction tx = session.beginTransaction();
  
  Student s = new Student("Rakesh");
  
  session.save(s);
  
  tx.commit();
  
  session.close();
  factory.close();
  
  System.out.println("Student data inserted Successfully");

 }

}