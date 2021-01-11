/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.security.MessageDigest;


import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

 
    
    @WebServlet(name="B", urlPatterns={"/B"})
public class B extends HttpServlet {
    static final String nazwaserwera="localhost";
    static final String nazwabazy="znanytrener";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";  
 
    
    
    
    
    
   private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
    
    
       
          
          
  
    
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
String file_name = null;



response.setContentType("text/html");
PrintWriter out = response.getWriter();
boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
if(!isMultipartContent){
    return;
}
FileItemFactory factory = new DiskFileItemFactory();
ServletFileUpload upload = new ServletFileUpload(factory);
try {
    List<FileItem> fields = upload.parseRequest(request);
    Iterator <FileItem> it  = fields.iterator(); 
    if(!it.hasNext()) {
        return;
    }
    while(it.hasNext()) {
        FileItem fileItem = it.next();
        boolean isFormFIeld =fileItem.isFormField();
        if(isFormFIeld) {
            if(file_name ==null) {
                if(fileItem.getFieldName().equals("file_name")) {
                    file_name = fileItem.getString();
                }
            }
        }else {
            if(fileItem.getSize()>0) {
                
                
                
                
          Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
String da = sdf.format(date);      
                
      
                
                fileItem.write(new File("C:\\ZnanyTrener\\web\\uploadedfiles\\"+da));
          
       
                            Connection polaczenie;
            Statement sql;
            HttpSession session=request.getSession();
              
            
            
             String id_user = (String) session.getAttribute("id_user");        
            
   response.setContentType("text/html;charset=UTF-8");
 
       
            
             Class.forName("com.mysql.jdbc.Driver").newInstance();
         polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
      sql=polaczenie.createStatement();

      
      
      
      
      
      
      
      
      Statement mysql3;
      
      
      mysql3=polaczenie.createStatement();
ResultSet rs3 = mysql3.executeQuery("select id_dane from dane where id_trener='"+id_user+"' ");

    if (rs3.next())
      {
        
          
          
                   
               
                            sql.executeUpdate("update dane set zdjecie=('uploadedfiles/"+da+"') where id_trener=('"+id_user+"');");
                       response.sendRedirect("l_dane?id_user="+id_user+"");
               
          
          
      }
      
      
      
      
      
      
      
      
      
      else
    {
      
      
      
                sql.executeUpdate("insert into dane (zdjecie,id_trener) values('uploadedfiles/"+da+"','"+id_user+"');");


    }


      
      
      


        response.sendRedirect("l_dane?id_user="+id_user+"");
polaczenie.close();        
                
                
                
                
                
                
            
            }
        }
    }
} catch(Exception e) {
    e.printStackTrace();
}finally {

    out.close();
}
}
}  