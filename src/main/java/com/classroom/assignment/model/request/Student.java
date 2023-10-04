package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String dp;

  public Student(String id, String name, String dp) {
    this.setId(id);
    this.setName(name);
    this.setDp(dp);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDp() {
    return this.dp;
  }

  public void setDp(String dp) {
    this.dp = dp;
  }


}
