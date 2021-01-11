
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %><%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="iso-8859-2"%>

<!DOCTYPE html>
<html class="wide wow-animation smoothscroll scrollTo desktop landscape rd-navbar-static-linked" lang="en"><head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-2" />
    <!-- Site Title-->
    <title>Znany Trener</title>

    <meta name="format-detection" content="telephone=no">
    <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">

    <script type="text/javascript" async="" src="Gym_pliki/ec.js"></script>

	<script async="" src="Gym_pliki/gtm.js"></script>
	<script type="text/javascript" async="" src="Gym_pliki/ga.js"></script>

	
	<link rel="icon" href="images/favicon_1.ico" type="image/x-icon">
    <!-- Stylesheets-->
    <link rel="stylesheet" type="text/css" href="Gym_pliki/css.css">
    <link rel="stylesheet" href="Gym_pliki/style.css">

    <link rel="stylesheet" href="css/style.css">
   
    
    
    
    
    

<script type="text/javascript">
function przetwarzajj_dane (){
  var brakuje_danych = false;
  var formularz = document.forms[2];
  var napis = "";
    if (formularz.haslo.value== "")
  {
    napis += "Brak lub niepoprawne haslo\n"
    brakuje_danych = true;
  }
 var WzorMaila = /^[0-9a-z_.-]+@[0-9a-z.-]+\.[a-z]{2,3}$/i
    if (!WzorMaila.test(formularz.email.value))
  {
    napis += "Brak lub niepoprawny Adres email \n"
    brakuje_danych = true;
  }
  if (!brakuje_danych)
    return true;
  else{
     alert ("W formularzu znaleziono bledy:\n\n" + napis);
    return false;
  }
}
</script>
    
    
    
    
    
    </head>
 





  <body>
    <!-- Page-->
  <div class="page text-center">
      <div class="page-loader page-loader-variant-1 loaded">
        <div><img class="img-responsive" style="margin-top: -20px;margin-left: -18px;" src="images/logo-big.png" alt="" width="280" height="77">
          <div class="offset-top-41 text-center">
            <div class="spinner"></div>
          </div>
        </div>
      </div>
      <!-- Page Head-->
      <header class="page-head slider-menu-position">
        <!-- RD Navbar Transparent-->
        <div class="rd-navbar-wrap" style="height: 143px;">
          <nav class="rd-navbar container rd-navbar-floated rd-navbar-dark rd-navbar-static" data-md-device-layout="rd-navbar-fixed" data-lg-device-layout="rd-navbar-static" data-lg-auto-height="true" data-md-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-lg-stick-up="true">
            <div class="rd-navbar-inner">
              <!-- RD Navbar Top Panel-->
              <div class="rd-navbar-top-panel context-dark bg-danger">
                <div class="left-side">
                  <address class="contact-info text-left"><a href="tel:#"><span class="icon mdi mdi-cellphone-android"></span><span class="text-middle">500 - 100 - 100</span></a></address>
                </div>
                <div class="center">
                  <address class="contact-info text-left"><a href="mailto:znanytrener@znanytrener.pl"><span class="icon mdi mdi-map-marker-radius"></span><span class="text-middle">znanytrener@znanytrener.pl</span></a></address>
                </div>

              </div>
              <!-- RD Navbar Panel -->
              <div class="rd-navbar-panel">
                <!-- RD Navbar Toggle-->
                <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar, .rd-navbar-nav-wrap"><span></span></button>
                <!-- RD Navbar Top Panel Toggle-->
                <button class="rd-navbar-top-panel-toggle" data-rd-navbar-toggle=".rd-navbar, .rd-navbar-top-panel"><span></span></button>
                <!--Navbar Brand-->
                <div class="rd-navbar-brand"><a href="index.jsp"><img src="images/l.png" alt="" width="256" height="38"></a></div>
              </div>
              <div class="rd-navbar-menu-wrap">
                <div class="rd-navbar-nav-wrap">
                  <div class="rd-navbar-mobile-scroll">
                    <!--Navbar Brand Mobile-->
                    <div class="rd-navbar-mobile-brand"><a href="index.jsp"><img src="images/l.png" alt="" width="256" height="38"> </a></div>

                    <!-- RD Navbar Nav-->
                    <ul class="rd-navbar-nav">
                        
                        
                        
<li><a href="l_rezerwacje?id_user=<%= session.getAttribute("id_user") %>"><span>Zapisy</span></a></li>
<li><a href="l_dane?id_user=<%= session.getAttribute("id_user") %>"><span> Dane</span></a></li>    
<li><a href="l_opinie?id_user=<%= session.getAttribute("id_user") %>"><span> Opinie</span></a></li> 
<li><a href="l_silownie?id_user=<%= session.getAttribute("id_user") %>"> <span>Siłownie</span></a></li>
<li><a href="l_godziny?id_user=<%= session.getAttribute("id_user") %>"><span> Terminy</span></a></li>
<li><a href="l_zmiana?id_user=<%= session.getAttribute("id_user") %>"><span> Zmiana hasła</span></a></li>                  
<li ><a  href="logaut"><span>Wyloguj</span></a></li>                          
                        



    </ul>
                  </div>
                </div>
                <!--RD Navbar Search-->

              </div>
            </div>
          </nav>
        </div>
        <div class="context-dark">
          <!-- Modern Breadcrumbs-->
          <section>
            <div class="parallax-container breadcrumb-modern bg-gray-darkest" data-parallax-img="images/background-04-1920x750.jpg">
              <div class="parallax-content"> 
                <div class="shell section-top-98 section-bottom-34 section-md-bottom-66 section-md-98 section-lg-top-110 section-lg-bottom-41">
              

                </div>
              </div>
            </div>
          </section>
        </div>
      </header>
      <!-- Page Contents-->
      <main class="page-content">
          
          
          
          
                  <section class="section-98 section-sm-110" id="welcome">
          <div class="shell">
              
              <div id="r"><font color="blue"><%= session.getAttribute("imie") %> <%= session.getAttribute("nazwisko") %></font> - TRENER - zalogowany</div><br>

            <hr class="divider bg-red">
            <div class="range range-xs-center offset-top-66">
              <div class="cell-lg-8">
                  <p> <h4 class="text-danger offset-top-20">Trener zalogowany w systemie</h4></p>

              
              
         
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              </div>
            </div>

            
            
            
            
            
            
            
            
          </div>
        </section>
          
          
          
          
      </main>
      <!-- Page Footer-->
      <footer class="section-relative section-top-66 section-bottom-34 page-footer bg-gray-base context-dark">
        <div class="shell">
          <div class="range range-sm-center text-lg-left">
            <div class="cell-sm-12">
              <div class="range range-xs-center">


                <div class="cell-xs-10 cell-sm-3 offset-top-66 cell-sm-push-1 offset-sm-top-0 cell-sm-6 cell-lg-3 cell-lg-push-1">
                  <!-- Footer brand-->
                  <div class="footer-brand"><a href="index.jsp"><img src="images/l.png" alt="" width="256" height="38"></a></div>

                  <p class="text-darker offset-top-20">Znany Trener<span id="copyright-year">2021</span> </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </footer>
    </div>
    <!-- Global Mailform Output-->
    <div class="snackbars" id="form-output-global"></div>
    <!-- PhotoSwipe Gallery-->
    <div class="pswp" tabindex="-1" role="dialog" aria-hidden="true">
      <div class="pswp__bg"></div>
      <div class="pswp__scroll-wrap">
        <div class="pswp__container">
          <div class="pswp__item"></div>
          <div class="pswp__item"></div>
          <div class="pswp__item"></div>
        </div>
        <div class="pswp__ui pswp__ui--hidden">
          <div class="pswp__top-bar">
            <div class="pswp__counter"></div>
            <button class="pswp__button pswp__button--close" title="Close (Esc)"></button>
            <button class="pswp__button pswp__button--share" title="Share"></button>
            <button class="pswp__button pswp__button--fs" title="Toggle fullscreen"></button>
            <button class="pswp__button pswp__button--zoom" title="Zoom in/out"></button>
            <div class="pswp__preloader">
              <div class="pswp__preloader__icn">
                <div class="pswp__preloader__cut">
                  <div class="pswp__preloader__donut"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="pswp__share-modal pswp__share-modal--hidden pswp__single-tap">
            <div class="pswp__share-tooltip"></div>
          </div>
          <button class="pswp__button pswp__button--arrow--left" title="Previous (arrow left)"></button>
          <button class="pswp__button pswp__button--arrow--right" title="Next (arrow right)"></button>
          <div class="pswp__caption">
            <div class="pswp__caption__center"></div>
          </div>
        </div>
      </div>
    </div>
    <!-- Java script-->
    <script src="Gym_pliki/core.js"></script>
    <script src="Gym_pliki/script.js"></script>
	
	

  

	

</body>


