package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;
  public class SchoolApp{
     public static void main(String[] args){
      School sc=new School();
         sc.setName("SBNRM");
         sc.setLocation("Ongole");
         Principal pri=new Principal();
          pri.setPrincipalName("YSR");
          pri.setExperienceYears(8);
           sc. showSchoolInfo();  
        System.out.println();
         pri.showPrincipalInfo();

           }
}