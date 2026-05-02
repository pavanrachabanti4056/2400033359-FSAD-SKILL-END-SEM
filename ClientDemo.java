package com.klef.fsad.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class ClientDemo 
{
  public static void main(String[] args) 
  {
    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session s = sf.openSession();
    Transaction t = s.beginTransaction();

    Invoice i = new Invoice();
    i.setName("Pavan");
    i.setStatus("Paid");
    i.setDate(new Date());
    s.save(i);

    t.commit();

    Query q = s.createQuery("from Invoice");
    List<Invoice> list = q.list();

    for(Invoice inv : list)
      System.out.println(inv.getId()+" "+inv.getName()+" "+inv.getStatus());

    s.close();
    sf.close();
  }
}
