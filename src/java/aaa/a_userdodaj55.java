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

@WebServlet(name="a_userdodaj55", urlPatterns={"/a_userdodaj55"})
public class a_userdodaj55 extends HttpServlet {
   static final String nazwaserwera="localhost";
    static final String nazwabazy="znanytrener";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";



    static final char[] hex_values={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
   /** Initializes the servlet.
     */
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; CHARSET=windows-1250");
        String imie=request.getParameter("imie");
        String nazwisko=request.getParameter("nazwisko");
  String haslo=request.getParameter("haslo");

        String email=request.getParameter("email");
        String telefon=request.getParameter("telefon");
        String id_miasto=request.getParameter("id_miasto");
        String ulica=request.getParameter("ulica");
        String numer=request.getParameter("numer");
        String kodpocztowy=request.getParameter("kodpocztowy");
String wiek=request.getParameter("wiek");
 String waga=request.getParameter("waga");
String wzrost=request.getParameter("wzrost");
String doswiadczenie=request.getParameter("doswiadczenie");
  


            Connection polaczenie;
            Statement sql;
            HttpSession session=request.getSession();

Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String da = sdf.format(date);

            try {

                 MessageDigest md=MessageDigest.getInstance("MD5");
                 byte[] tab_h = md.digest(request.getParameter("haslo").getBytes("iso8859-2"));


                 String haslo_kodowane=string_hex(tab_h);

                Class.forName("com.mysql.jdbc.Driver").newInstance();
         polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
      sql=polaczenie.createStatement();

               sql.executeUpdate("insert into trener(email,imie,nazwisko,ulica,haslo,id_miasto,nr_u,kod,telefon,dostep,blokada,wiek,wzrost,waga,doswiadczenie) values('"+email+"','"+imie+"','"+nazwisko+"','"+ulica+"','"+haslo_kodowane+"','"+id_miasto+"','"+numer+"','"+kodpocztowy+"','"+telefon+"','0','0','"+wiek+"','"+wzrost+"','"+waga+"','"+doswiadczenie+"');");



          response.sendRedirect("logowanie_rej2.jsp");
polaczenie.close();
                }

            catch (Exception e)
            {

             }
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
