/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;
import java.io.*;
import java.net.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author
 */
@WebServlet(name="rejestracja2", urlPatterns={"/rejestracja2"})
public class rejestracja2 extends HttpServlet {
   
    static final String nazwaserwera="localhost";
    static final String nazwabazy="znanytrener";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";
   
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    public void destroy() {

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
 
        PrintWriter out = response.getWriter();
       response.setContentType("CHARSET=windows-1250");
    String email = request.getParameter("email");

    String id_user = request.getParameter("id_user");


      Connection polaczenie;
      Statement sql;
      HttpSession session=request.getSession();
      try {

      Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
      sql=polaczenie.createStatement();
      ResultSet rs = sql.executeQuery("SELECT email,id_trener from trener where email='"+email+"';");


      if (rs.next()){
      if (0==email.compareTo(rs.getString(1))){

      response.sendRedirect("rejestracja33.jsp");
polaczenie.close();


      }
      else
      {


         session.setAttribute("email",email);
      response.sendRedirect("a_userdodaj44?email="+request.getParameter("email")+"");
polaczenie.close();
      }}
      else
      {
            session.setAttribute("email",email);
      response.sendRedirect("a_userdodaj44?email="+request.getParameter("email")+"");
polaczenie.close();
      }}
      catch (Exception e)
      {}
      finally {}





    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
