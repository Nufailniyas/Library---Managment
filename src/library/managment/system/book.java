/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.managment.system;
import java.sql.Time;
/**
 *
 * @author ICTSTUDENT
 */
public class book {
         private String Title;
	 private String Book_Number;
	 private String Author;
	 private String Price;
         private String Department;
         
         public book(String Title,String Book_Number,String Author,String Price,String Department)
    {
        this.Title=Title;
        this.Book_Number=Book_Number;
        this.Author=Author;
        this.Price=Price;
        this.Department=Department;
    }
         public String getTitle()
    {
        return Title;
    }
    public String getBook_Number()
    {
        return Book_Number;
    }
    public String getAuthor()
    {
        return Author;
    }
    public String getPrice()
    {
        return Price;
    }
     public String getDepartment()
    {
        return Department;
    }
}
