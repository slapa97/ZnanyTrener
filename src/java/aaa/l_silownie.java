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


@WebServlet(name="l_silownie", urlPatterns={"/l_silownie"})
public class l_silownie extends HttpServlet {
    static final String nazwaserwera="localhost";
    static final String nazwabazy="znanytrener";
    static final String nazwauzytkownika="admin";
    static final String haslobazy="admin";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      response.setContentType("text/html; CHARSET=windows-1250");
        PrintWriter out = response.getWriter();
         HttpSession session=request.getSession();

         String id_user=request.getParameter("id_user");
     

    Connection polaczenie;


              try {

  out.write("<!DOCTYPE html>\n" +
"<html class=\"wide wow-animation smoothscroll scrollTo desktop landscape rd-navbar-static-linked\" lang=\"en\"><head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-2\" />\n" +
"    <!-- Site Title-->\n" +
"    <title>Znany Trener</title>\n" +
"\n" +
"    <meta name=\"format-detection\" content=\"telephone=no\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, trener-scalable=0\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\n" +
"    <meta name=\"keywords\" content=\"GYM web design multipurpose template\">\n" +
"    <meta name=\"date\" content=\"Dec 26\">\n" +
"    <script type=\"text/javascript\" async=\"\" src=\"Gym_pliki/ec.js\"></script>\n" +
"\n" +
"	<script async=\"\" src=\"Gym_pliki/gtm.js\"></script>\n" +
"	<script type=\"text/javascript\" async=\"\" src=\"Gym_pliki/ga.js\"></script>\n" +
"\n" +
"	\n" +
"	<link rel=\"icon\" href=\"images/favicon_1.ico\" type=\"image/x-icon\">\n" +
"    <!-- Stylesheets-->\n" +
"    <link rel=\"stylesheet\" type=\"text/css\" href=\"Gym_pliki/css.css\">\n" +
"    \n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">" );

 
  out.write("<script type=\"text/javascript\">\n");
      out.write("function przetwarzajj_dane (){\n");
      out.write("  var brakuje_danych = false;\n");
      out.write("  var formularz = document.forms[0];\n");
      out.write("  var napis = \"\";\n");
      out.write("\n");
    
      out.write("  if (formularz.nazwa.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nazwa\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      
      
      out.write("   if (formularz.ulica.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nie podano ulicy\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
          out.write("    var WzorTel = /^[0-9]{7,10}$/\n");
           
            out.write("     var WzorUlica = /^[a-zA-Z]{3,20}$/\n");
      out.write("       var WzorKod = /^[0-9]{2}\\-[0-9]{3}$/;\n");
      
           
      

      
      
      out.write("      if (!WzorKod.test(formularz.kodpocztowy.value))\n");
      out.write("  {\n");
      out.write("    napis += \"Zly format kodu pocztowego 00-000.\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
      
      
      out.write("   if (formularz.numer.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Numer ulicy!!!\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      
      
     out.write("    if (!WzorTel.test(formularz.telefon.value))\n");
      out.write("  {\n");
      out.write("    napis += \"Telefon musi zawierac od 7 do 10 cyfr.\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      
      
      
      
      
      out.write("\n");
      out.write("\n");
      out.write("  if (!brakuje_danych)\n");
      out.write("    return true;\n");
      out.write("  else{\n");
      out.write("    alert (\"Bledy w formularzu to:\\n\\n\" + napis);\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      
      
      
out.write("</head>\n" +
" \n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"  <body>\n" +
"    <!-- Page-->\n" +
"  <div class=\"page text-center\">\n" +
"      <div class=\"page-loader page-loader-variant-1 loaded\">\n" +
"        <div><img class=\"img-responsive\" style=\"margin-top: -20px;margin-left: -18px;\" src=\"images/logo-big.png\" alt=\"\" width=\"280\" height=\"77\">\n" +
"          <div class=\"offset-top-41 text-center\">\n" +
"            <div class=\"spinner\"></div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"      <!-- Page Head-->\n" +
"      <header class=\"page-head slider-menu-position\">\n" +
"        <!-- RD Navbar Transparent-->\n" +
"        <div class=\"rd-navbar-wrap\" style=\"height: 143px;\">\n" +
"          <nav class=\"rd-navbar container rd-navbar-floated rd-navbar-dark rd-navbar-static\" data-md-device-layout=\"rd-navbar-fixed\" data-lg-device-layout=\"rd-navbar-static\" data-lg-auto-height=\"true\" data-md-layout=\"rd-navbar-fixed\" data-lg-layout=\"rd-navbar-static\" data-lg-stick-up=\"true\">\n" +
"            <div class=\"rd-navbar-inner\">\n" +
"              <!-- RD Navbar Top Panel-->\n" +
"              <div class=\"rd-navbar-top-panel context-dark bg-danger\">\n" +
"                <div class=\"left-side\">\n" +
"                  <address class=\"contact-info text-left\"><a href=\"tel:#\"><span class=\"icon mdi mdi-cellphone-android\"></span><span class=\"text-middle\">500 - 100 - 100</span></a></address>\n" +
"                </div>\n" +
"                <div class=\"center\">\n" +
"                  <address class=\"contact-info text-left\"><a href=\"mailto:znanytrener@znanytrener.pl\"><span class=\"icon mdi mdi-map-marker-radius\"></span><span class=\"text-middle\">znanytrener@znanytrener.pl</span></a></address>\n" +
"                </div>\n" +
"\n" +
"              </div>\n" +
"              <!-- RD Navbar Panel -->\n" +
"              <div class=\"rd-navbar-panel\">\n" +
"                <!-- RD Navbar Toggle-->\n" +
"                <button class=\"rd-navbar-toggle\" data-rd-navbar-toggle=\".rd-navbar, .rd-navbar-nav-wrap\"><span></span></button>\n" +
"                <!-- RD Navbar Top Panel Toggle-->\n" +
"                <button class=\"rd-navbar-top-panel-toggle\" data-rd-navbar-toggle=\".rd-navbar, .rd-navbar-top-panel\"><span></span></button>\n" +
"                <!--Navbar Brand-->\n" +
"                <div class=\"rd-navbar-brand\"><a href=\"index.jsp\"><img src=\"images/l.png\" alt=\"\" width=\"256\" height=\"38\"></a></div>\n" +
"              </div>\n" +
"              <div class=\"rd-navbar-menu-wrap\">\n" +
"                <div class=\"rd-navbar-nav-wrap\">\n" +
"                  <div class=\"rd-navbar-mobile-scroll\">\n" +
"                    <!--Navbar Brand Mobile-->\n" +
"                    <div class=\"rd-navbar-mobile-brand\"><a href=\"index.jsp\"><img src=\"images/l.png\" alt=\"\" width=\"256\" height=\"38\"> </a></div>\n" +

"                    <!-- RD Navbar Nav-->\n" +
"                    <ul class=\"rd-navbar-nav\">");
        
        
        
        
out.write("<li ><a  href=\"l_rezerwacje?id_user=");
out.print( session.getAttribute("id_user") );
out.write("\"><span>Zapisy</span></a></li>  "); 
        
        
  out.write("<li ><a  href=\"l_dane?id_user=");
out.print( session.getAttribute("id_user") );
out.write("\"><span>Dane</span></a></li>  ");  

out.write("<li ><a  href=\"l_opinie?id_user=");
out.print( session.getAttribute("id_user") );
out.write("\"><span>Opinie</span></a></li>  ");


out.write("<li class=\"active\"><a  href=\"l_silownie?id_user=");
out.print( session.getAttribute("id_user") );
out.write("\"><span>Si&#322;ownie</span></a></li>  ");


out.write("<li ><a  href=\"l_godziny?id_user=");
out.print( session.getAttribute("id_user") );
out.write("\"><span>Terminy</span></a></li>  ");




out.write("<li ><a  href=\"l_zmiana?id_user=");
out.print( session.getAttribute("id_user") );
out.write("\"><span>Zmiana has&#322;a</span></a></li>  ");        
        
   out.write("<li ><a  href=\"logaut\"><span>Wyloguj</span></a></li>  "); 


out.write("   </ul>\n" +
"                  </div>\n" +
"                </div>\n" +

"              </div>\n" +
"            </div>\n" +
"          </nav>\n" +
"        </div>\n" +
"        <div class=\"context-dark\">\n" +
"          <!-- Modern Breadcrumbs-->\n" +
"          <section>\n" +
"            <div class=\"parallax-container breadcrumb-modern bg-gray-darkest\" data-parallax-img=\"images/background-04-1920x750.jpg\">\n" +
"              <div class=\"parallax-content\"> \n" +
"                <div class=\"shell section-top-98 section-bottom-34 section-md-bottom-66 section-md-98 section-lg-top-110 section-lg-bottom-41\">\n" +


"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </section>\n" +
"        </div>\n" +
"      </header>\n" +
"      <!-- Page Contents-->\n" +
"      <main class=\"page-content\">\n" +
"          \n" +
"          \n" +
"          \n" +
"          \n" +
"                      <section class=\"section-98 section-sm-110\">\n" +
"          <div class=\"shell\">");
        out.write(" <div id=\"r\"><font color=\"blue\">");
      out.print( session.getAttribute("imie") );
      out.write(' ');
      out.print( session.getAttribute("nazwisko") );
out.write("</font> - TRENER - zalogowany </div><br>");
out.write("           <h1>Si&#322;ownie, w których pracuj&#281;</h1><div class=\"range range-xs-center offset-top-66\"><div class=\"cell-lg-8\"> ");
        
        
 
        
        
        
        
 
   Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
 Statement mysql3;





 
   

 
mysql3=polaczenie.createStatement();
ResultSet rs3 = mysql3.executeQuery("select id_silownia from silownia where id_trener='"+id_user+"' ");

    if (rs3.next())
      {
        if (rs3.getString(1).compareTo("")!=0) {




                Statement sql;

                sql=polaczenie.createStatement();


ResultSet rs = sql.executeQuery("select silownia.id_silownia,silownia.nazwa,silownia.kod,silownia.ulica,silownia.nr,silownia.telefon,silownia.stan,miasto.miasto from silownia,miasto where silownia.id_trener='"+id_user+"' and silownia.id_miasto=miasto.id_miasto");

out.println("                    \n" +
"                                <table class=\"table\">\n");
      out.write("    <thead>\n");
out.println("<tr><th>Lp.</th><th>Nazwa si&#322;owni</th><th><b>Adres</b></th><th><b>Telefon</b></th><th><b>Status</b></th><th></th></tr>");
 out.write("</thead>");





              int nr_wiersza=1;


      while(rs.next())  {

       out.println("<tr><td>"+ nr_wiersza + ".</td><td>"+rs.getString(2)+"</td><td>ul. "+rs.getString(4)+" "+rs.getString(5)+", "+rs.getString(3)+" "+rs.getString(8)+"</td><td>"+rs.getString(6)+"</td>");


   
       
       if  (rs.getString(7).compareTo("0")!=0)
      {
      out.print("<td ><i><b><font color=\"#cc3300\">zablokowane</font></b></i>&nbsp;&nbsp;</td>");
      out.print("<td><a class=\"btn btn-danger\" href=\"odblokuj?id_user="+request.getParameter("id_user")+"&id_zatrudnienie="+rs.getString(1)+"\">odblokuj</a></td></tr>");

      }
 
       else
       {
             out.print("<td ><i><b><font color=\"#339966\">odblokowane</font></b></i>&nbsp;&nbsp;</td>");
      out.print("<td><a class=\"btn btn-default\" href=\"zablokuj?id_user="+request.getParameter("id_user")+"&id_zatrudnienie="+rs.getString(1)+"\">zablokuj</a></td></tr>");    
       
       }
       
       
       




      

  nr_wiersza++;
      }

        out.println("</table>");
out.write("            \n" );
                       } }
      else
      {

     out.write("\t\t\t\t<br><span>*** BRAK DANYCH ***   </span><br>\n");

        }





polaczenie.close();











 
 
 
 
 
 out.write(" <div class=\"choose_heading_wrapper\">\n" +
"                   <br>     <h1 class=\"med_bottompadder20\">Dodaj dane si&#322;owni</h1>\n" +
"                        \n" +


"                        \n" +

"                    </div>\n" +
"   \n" +

"   \n" +
"               <div class=\"row\">\n" +
"			   \n" +
"		\n" +
"			   \n" +
"			   \n" +
"	  <form  method=\"post\" action=\"dodaj_zatrudnienie\" onsubmit=\"return przetwarzajj_dane()\">\n" +
"    <div class=\"range\"> ");


                     out.print("<div class=\"cell-lg-6 offset-top-20\">\n" +
"                      <div class=\"form-group\"><label for=\"name\"> Nazwa si&#322;owni: </label><input class=\"form-control\" id=\"name\" type='text' name='nazwa' tabindex=\"2\" ></div></div>");


  out.print("<div class=\"cell-lg-6 offset-top-20\">\n" +
"                      <div class=\"form-group\"><label>Ulica: </label>");
 out.print("<input class=\"form-control\" name=\"ulica\"  type=\"text\" /></div></div>");
  out.print("<div class=\"cell-lg-6 offset-top-20\">\n" +
"                      <div class=\"form-group\"><label>Numer:   </label>");
 out.print("<input class=\"form-control\" name=\"numer\"  type=\"text\" /></div></div>");
  out.print("<div class=\"cell-lg-6 offset-top-20\">\n" +
"                      <div class=\"form-group\"><label>Kod pocztowy: </label>");
 out.print("<input class=\"form-control\" name=\"kodpocztowy\"  type=\"text\" /></div></div>");
  out.print("<div class=\"cell-lg-6 offset-top-20\">\n" +
"                      <div class=\"form-group\"><label>Telefon: </label>");
 
  out.print("<input class=\"form-control\" name=\"telefon\"  type=\"text\" /></div></div>");
 
 
  
  

out.write("<div class=\"cell-lg-6 offset-top-20\">\n" +
"                      <div class=\"form-group\"><label > Miasto:</label><br/>  \n");



 out.write("<select  class=\"form-control\" name=\"id_miasto\">\n");


 
  
  
  
  
  
  
   
  Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);


Statement mysql33;



 
   

 
mysql33=polaczenie.createStatement();
ResultSet rs33 = mysql33.executeQuery("select id_miasto,miasto from miasto order by miasto ");

    while(rs33.next())  {


             out.write("<option value='"+rs33.getString(1)+"'> "+rs33.getString(2)+" \n");

    }
             
             

      

   out.write("</select></div></div>\n");
  

 
        out.print("<input class=\"form-control\" name=\"id_user\"  type=\"hidden\" value=\""+session.getAttribute("id_user")+"\" /> ");                    
      
  
        
        
        
        
        out.print("   </div>\n" +
"                  <div class=\"group-sm text-center text-lg-left offset-top-30\">\n" +
"                    <button class=\"btn btn-danger\" type=\"submit\">Dalej</button>\n" +
"   \n" +
"                  </div>");

  

                     out.print("   </form>");





    
    
    
    
    
    




 
      out.write(" </div>");
 










        
        
        
        
out.write("         </div> </div>   </div>\n" +
"            </div>\n" +
"\n" +
"            \n" +
"            \n" +
"            \n" +
"            \n" +
"            \n" +
"            \n" +
"            \n" +
"            \n" +
"          </div>\n" +
"        </section>\n" +
"          \n" +
"          \n" +
"          \n" +
"          \n" +
"      </main>\n" +
"      <!-- Page Footer-->\n" +
"      <footer class=\"section-relative section-top-66 section-bottom-34 page-footer bg-gray-base context-dark\">\n" +
"        <div class=\"shell\">\n" +
"          <div class=\"range range-sm-center text-lg-left\">\n" +
"            <div class=\"cell-sm-12\">\n" +
"              <div class=\"range range-xs-center\">\n" +
"\n" +
"\n" +
"                <div class=\"cell-xs-10 cell-sm-3 offset-top-66 cell-sm-push-1 offset-sm-top-0 cell-sm-6 cell-lg-3 cell-lg-push-1\">\n" +
"                  <!-- Footer brand-->\n" +
"                  <div class=\"footer-brand\"><a href=\"index.jsp\"><img src=\"images/l.png\" alt=\"\" width=\"256\" height=\"38\"></a></div>\n" +
"\n" +
"                  <p class=\"text-darker \">Znany Trener <span id=\"copyright-year\"> 2021</span> </p>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </footer>\n" +
"    </div>\n" +
"    <!-- Global Mailform Output-->\n" +
"    <div class=\"snackbars\" id=\"form-output-global\"></div>\n" +
"    <!-- PhotoSwipe Gallery-->\n" +
"    <div class=\"pswp\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n" +
"      <div class=\"pswp__bg\"></div>\n" +
"      <div class=\"pswp__scroll-wrap\">\n" +
"        <div class=\"pswp__container\">\n" +
"          <div class=\"pswp__item\"></div>\n" +
"          <div class=\"pswp__item\"></div>\n" +
"          <div class=\"pswp__item\"></div>\n" +
"        </div>\n" +
"        <div class=\"pswp__ui pswp__ui--hidden\">\n" +
"          <div class=\"pswp__top-bar\">\n" +
"            <div class=\"pswp__counter\"></div>\n" +
"            <button class=\"pswp__button pswp__button--close\" title=\"Close (Esc)\"></button>\n" +
"            <button class=\"pswp__button pswp__button--share\" title=\"Share\"></button>\n" +
"            <button class=\"pswp__button pswp__button--fs\" title=\"Toggle fullscreen\"></button>\n" +
"            <button class=\"pswp__button pswp__button--zoom\" title=\"Zoom in/out\"></button>\n" +
"            <div class=\"pswp__preloader\">\n" +
"              <div class=\"pswp__preloader__icn\">\n" +
"                <div class=\"pswp__preloader__cut\">\n" +
"                  <div class=\"pswp__preloader__donut\"></div>\n" +
"                </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"          <div class=\"pswp__share-modal pswp__share-modal--hidden pswp__single-tap\">\n" +
"            <div class=\"pswp__share-tooltip\"></div>\n" +
"          </div>\n" +
"          <button class=\"pswp__button pswp__button--arrow--left\" title=\"Previous (arrow left)\"></button>\n" +
"          <button class=\"pswp__button pswp__button--arrow--right\" title=\"Next (arrow right)\"></button>\n" +
"          <div class=\"pswp__caption\">\n" +
"            <div class=\"pswp__caption__center\"></div>\n" +
"          </div>\n" +
"        </div>\n" +
"      </div>\n" +
"    </div>\n" +
"    <!-- Java script-->\n" +
"    <script src=\"Gym_pliki/core.js\"></script>\n" +
"    <script src=\"Gym_pliki/script.js\"></script>\n" +
"	\n" +
"	\n" +
"\n" +
"  \n" +
"\n" +
"	\n" +
"\n" +
"</body>" );





            }
            catch (Exception e)
            {
            }
            finally {

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
