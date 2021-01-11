/*
 * To change this template, choose Tools | Templates
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

@WebServlet(name="logowanie", urlPatterns={"/logowanie"})
public class logowanie extends HttpServlet {
    static final String nazwaserwera="localhost";
    static final String nazwabazy="znanytrener";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";


     static final char[] hex_values={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};


    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }
    private static String string_hex(byte [] tablica)   {

        String wynik="";
        for (int i=0; i<tablica.length; i++)
        {
            wynik=wynik+hex_values[(tablica[i]>>4)&0x0f];
            wynik=wynik+hex_values[tablica[i]&0x0f];
        }
        return wynik;
    }

    //publiczna metoda wywoływana podczas niszczenia serwletu
    public void destroy() {

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         response.setContentType("CHARSET=windows-1250");
    String email = request.getParameter("email");
    String haslo = request.getParameter("haslo");

Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String da = sdf.format(date);

      try {

              Connection polaczenie;
      Statement sql;   Statement sql2;Statement sql3;
      HttpSession session=request.getSession();
  MessageDigest md=MessageDigest.getInstance("MD5");
               byte[] tab_h = md.digest(request.getParameter("haslo").getBytes("iso8859-2"));
      String haslo2=string_hex(tab_h);


      Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
      sql=polaczenie.createStatement(); sql2=polaczenie.createStatement();sql3=polaczenie.createStatement();


           ResultSet rs3 = sql3.executeQuery("SELECT blokada from trener where email='"+email+"';");
   if (rs3.next()){

           if (rs3.getString(1).compareTo("1")==0) {

                       polaczenie.close();
                       session.setAttribute("email",email);
      response.sendRedirect("blokadalog.jsp?email="+request.getParameter("email")+"");



           }
           else{






      ResultSet rs = sql.executeQuery("SELECT haslo,id_trener,imie,nazwisko,dostep from trener where email='"+email+"' AND blokada = '0';");


      if (rs.next()){
      if (0==haslo2.compareTo(rs.getString(1))){

   
                 
                  if (rs.getString(5).compareTo("1")!=0) {
                      
      String id_user = rs.getString(2);
      session.setAttribute("id_user",id_user);
      String imie = rs.getString(3);
      session.setAttribute("imie",imie);
      String nazwisko= rs.getString(4);
      session.setAttribute("nazwisko",nazwisko);


       polaczenie.close();
            response.sendRedirect("trener.jsp");  
                  }

                  else
                  {
                  
                         String id_user = rs.getString(2);
      session.setAttribute("id_user",id_user);
      String imie = rs.getString(3);
      session.setAttribute("imie",imie);
        String nazwisko= rs.getString(4);
      session.setAttribute("nazwisko",nazwisko);



  polaczenie.close();
            response.sendRedirect("admin.jsp");
                  
                  
                  }
                  
                  

 

             }

      else
      {
 
       polaczenie.close();
               session.setAttribute("email",email);
      response.sendRedirect("logowaniezlehaslo.jsp?email="+request.getParameter("email")+"");
      }
      }

      else
      {


        polaczenie.close();
         session.setAttribute("email",email);
      response.sendRedirect("logowanie3brakindentyfik.jsp?email="+request.getParameter("email")+"");
      }




           }

   }else{
                       polaczenie.close();      
                               session.setAttribute("email",email);
      response.sendRedirect("identbrak.jsp?email="+request.getParameter("email")+"");
   }









    }
      catch (Exception e)
      {
      }
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
