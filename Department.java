package com.company.admin;
public class Department{
      private String deptName;
      private int id;
  public void setDeptName(String deptName){
       this.deptName=deptName;
}
  public void setId(int id){
       this.id=id;
}
public String getDeptName(){
       return deptName;
}
public int getId(){
       return id;
}
      public void showDepartmentDetails(){
          System.out.println("Department Name:"+deptName);
          System.out.println("Department Id:"+id);
}
}

