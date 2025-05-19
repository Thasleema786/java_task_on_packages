package com.library.app;
import com.library.books.Library;
import com.library.staff.Librarian;
public class LibraryApp{
         public static void main(String[] args){
           Library li=new Library();
            li.setLibraryName("The British Library");
            li.setTotalBooks(255);
          Librarian lib=new Librarian();
              lib.setLibrarianName("scriptoria");
              lib.setYearsOfExperience(20);
              li.showLibraryDetails();
            System.out.println();
             lib.showLibrarianInfo();
}
}
       