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




@WebServlet(name="szukaj", urlPatterns={"/szukaj"})
public class szukaj extends HttpServlet {
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


     
        String id_miasto=request.getParameter("id_miasto");
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
"    <link rel=\"stylesheet\" href=\"Gym_pliki/style.css\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">" );


  out.write("<script type=\"text/javascript\">\n");
      out.write("function przetwarzajj_dane (){\n");
      out.write("  var brakuje_danych = false;\n");
      out.write("  var formularz = document.forms[2];\n");
      out.write("  var napis = \"\";\n");
      out.write("\n");
    
      out.write("  if (formularz.imie.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Imie\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      
      
      out.write("   if (formularz.ulica.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nie podano ulicy\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
          out.write("    var WzorTel = /^[0-9]{7,10}$/\n");
            out.write("  if (formularz.nazwisko.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nazwisko\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
            out.write("     var WzorUlica = /^[a-zA-Z]{3,20}$/\n");
      out.write("       var WzorKod = /^[0-9]{2}\\-[0-9]{3}$/;\n");
      
            out.write("  if (formularz.haslo.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Haslo\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      
       out.write("   if (formularz.miasto.value== \"\")\n");
      out.write("  {\n");
      out.write("    napis += \"Nie podano nazwy ulicy\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
      out.write("\n");
      
      
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
      
        out.write("         var WzorPesel = /^[0-9]{11}$/;\n");
      
          out.write("    if (!WzorPesel.test(formularz.pesel.value))\n");
      out.write("  {\n");
      out.write("    napis += \"Niepoprawny Pesel (11 cyfr) !\\n\"\n");
      out.write("    brakuje_danych = true;\n");
      out.write("  }\n");
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
"                    <div class=\"form-search-wrap\">\n" +
"                      <!-- RD Search Form-->\n" +
"                      <form class=\"form-search rd-search\" action=\"szuk2\" method=\"POST\">\n" +
"                        <div class=\"form-group\">\n" +
"                          <label class=\"form-label form-search-label form-label-sm rd-input-label\" for=\"rd-navbar-form-search-widget\">Podaj nazwisko trenera...</label>\n" +
"                          <input class=\"form-search-input input-sm form-control form-control-gray-lightest input-sm\" type=\"text\" name=\"s\" autocomplete=\"off\">\n" +
"                        </div>\n" +
"                        <button class=\"form-search-submit\" type=\"submit\"><span class=\"mdi mdi-magnify\"></span></button>\n" +
"                      </form>\n" +
"                    </div>\n" +
"                    <!-- RD Navbar Nav-->\n" +
"                    <ul class=\"rd-navbar-nav\">\n" +
"<li ><a href=\"index.jsp\"><span>Strona g&#322;ówna</span></a></li>\n" +
"<li class=\"active\"><a href=\"wyszukiwarkal\"><span>Szukaj trenera</span></a></li>  \n" +
"<li ><a href=\"logowanie.jsp\"><span>Panel klienta</span></a></li> \n" +
"<li ><a href=\"logowanie2.jsp\"><span>Panel trenera</span></a></li> \n" +
"\n" +
"\n" +
"    </ul>\n" +
"                  </div>\n" +
"                </div>\n" +
"                <!--RD Navbar Search-->\n" +
"                <div class=\"rd-navbar-search rd-navbar-search-top-panel\"><a class=\"rd-navbar-search-toggle mdi\" data-rd-navbar-toggle=\".rd-navbar-inner,.rd-navbar-search\" href=\"#\"><span></span></a>\n" +
"                  <form class=\"rd-navbar-search-form search-form-icon-right rd-search\" action=\"szuk2\" method=\"POST\" >\n" +
"                    <div class=\"form-group\">\n" +
"                      <label class=\"form-label rd-input-label\" for=\"rd-navbar-search-form-input\">Podaj nazwisko trenera...</label>\n" +
"                      <input class=\"rd-navbar-search-form-input form-control form-control-gray-lightest\"  type=\"text\" name=\"s\" autocomplete=\"off\">\n" +
"                    </div>\n" +
"                  </form>\n" +
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
"                  <h2 class=\"veil reveal-md-block offset-top-30\"><span class=\"big\">Szukaj trenera</span></h2>\n" +
"                  <ul class=\"list-inline list-inline-dashed\">\n" +

"                    </li>\n" +
"                  </ul>\n" +
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
"          <div class=\"shell\">\n" +
"            <h1>Lista trenerów dla miasta: ");
        
        
       
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);



 Statement mysql56;
mysql56=polaczenie.createStatement();
ResultSet rs56 = mysql56.executeQuery("select miasto from miasto where id_miasto='"+id_miasto+"' ");
  while(rs56.next())  {
      
   out.println(" "+rs56.getString(1)+" ");   
  }
out.write("                  </b></h1> <hr class=\"divider bg-danger\">\n" +
"            <div class=\"range range-xs-center offset-sm-top-66\">\n" +
"              <div class=\"cell-sm-10 cell-lg-12\">\n" +
"                <div class=\"range\">");
        
        
        
        
        
        
        




   Class.forName("com.mysql.jdbc.Driver").newInstance();
      polaczenie=DriverManager.getConnection("jdbc:mysql://"+nazwaserwera+"/"+nazwabazy+"?user="+nazwauzytkownika+"&password="+haslobazy);
 Statement mysql3;





 
   

 
mysql3=polaczenie.createStatement();
ResultSet rs3 = mysql3.executeQuery("select trener.imie,trener.nazwisko,trener.telefon from trener where trener.dostep='0' and trener.id_miasto='"+id_miasto+"'  order by trener.nazwisko ");

    if (rs3.next())
      {
        if (rs3.getString(1).compareTo("")!=0) {




                Statement sql;

                sql=polaczenie.createStatement();


ResultSet rs = sql.executeQuery("select trener.imie,trener.nazwisko,trener.telefon,trener.id_trener,dane.zdjecie from trener,dane where trener.dostep='0'  and trener.id_miasto='"+id_miasto+"'  and trener.id_trener=dane.id_trener order by trener.nazwisko ");






      while(rs.next())  {

   

   
       
out.write("                                 <div class=\"cell-sm-6 cell-lg-3 offset-top-66 offset-xs-top-0\">\n" +
"                    <!-- Box Member-->\n" +
"                    <div class=\"box-member\"><img class=\"img-responsive\" src=\""+rs.getString(5)+"\" alt=\"\"/>\n" +
"                      <h5 class=\"text-bold offset-top-20\"><a href=\"szukaj3?id_trener="+rs.getString(4)+"\">"+rs.getString(1)+" "+rs.getString(2)+"</a>\n" +
"                      </h5>\n" +
"                      <div class=\"box-member-wrap\">\n" +

"                      </div>\n" +
"                    </div>\n" +
"                  </div>");




      }


      out.write("   </div>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </section>   ");
      
      
      
      
      
                       }
      
      


      
      
      
      
      
      }

            else
      {

          
         out.write("                                 <div class=\"cell-sm-6 cell-lg-3 offset-top-66 offset-xs-top-0\">\n" +


"                      <div class=\"box-member-wrap\">\n" +

"                      </div>\n" +
"                    </div>\n" +
"                  </div>"); 
          
          
          
          
          
     out.write("\t\t\t\t<br><p>*** BRAK DANYCH ***   </p><br>\n");

        }



polaczenie.close();
        
        
        
        
out.write("           </div>\n" +
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
"                  <p class=\"text-darker offset-top-20\">Znany Trener<span id=\"copyright-year\">2021</span> </p>\n" +
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
