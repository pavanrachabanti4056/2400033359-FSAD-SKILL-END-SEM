package com.klef.fsad.exam;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="invoice")
public class Invoice 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String status;

  @Temporal(TemporalType.DATE)
  private Date date;

  // getters and setters
  public int getId() { return id; }
  public void setId(int id) { this.id = id; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public String getStatus() { return status; }
  public void setStatus(String status) { this.status = status; }

  public Date getDate() { return date; }
  public void setDate(Date date) { this.date = date; }
}
