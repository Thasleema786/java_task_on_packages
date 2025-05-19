package com.company.app;
import com.company.hr.Employee;
import com.company.admin.Department;
public class CompanyApp{
           public static void main(String[] args){
                 Employee em=new Employee();
                 em.setId(121);
                 em.setName("Amarnath");
                 em.setSalary(100000);
                 Department depart=new Department();
                   depart.setDeptName("CSE");
                   depart.setId(200);
                   em.showEmployeeDetails();
                   System.out.println();
                   depart.showDepartmentDetails();
}
} 