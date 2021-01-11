
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
    <meta name="keywords" content="GYM web design multipurpose template">
    <meta name="date" content="Dec 26">
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
                    <div class="form-search-wrap">
                      <!-- RD Search Form-->
                      <form class="form-search rd-search" action="szuk2" method="POST">
                        <div class="form-group">
                          <label class="form-label form-search-label form-label-sm rd-input-label" for="rd-navbar-form-search-widget">Podaj nazwisko trenera...</label>
                          <input class="form-search-input input-sm form-control form-control-gray-lightest input-sm" type="text" name="s" autocomplete="off">
                        </div>
                        <button class="form-search-submit" type="submit"><span class="mdi mdi-magnify"></span></button>
                      </form>
                    </div>
                    <!-- RD Navbar Nav-->
                    <ul class="rd-navbar-nav">
<li ><a href="index.jsp"><span>Strona główna</span></a></li>
<li ><a href="wyszukiwarkal"><span>Szukaj trenera</span></a></li>  
<li class="active"><a href="logowanie.jsp"><span>Panel klienta</span></a></li> 
<li ><a href="logowanie2.jsp"><span>Panel trenera</span></a></li> 


    </ul>
                  </div>
                </div>
                <!--RD Navbar Search-->
                <div class="rd-navbar-search rd-navbar-search-top-panel"><a class="rd-navbar-search-toggle mdi" data-rd-navbar-toggle=".rd-navbar-inner,.rd-navbar-search" href="#"><span></span></a>
                  <form class="rd-navbar-search-form search-form-icon-right rd-search" action="szuk2" method="POST" >
                    <div class="form-group">
                      <label class="form-label rd-input-label" for="rd-navbar-search-form-input">Podaj nazwisko trenera...</label>
                      <input class="rd-navbar-search-form-input form-control form-control-gray-lightest"  type="text" name="s" autocomplete="off">
                    </div>
                  </form>
                </div>
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
                  <h2 class="veil reveal-md-block offset-top-30"><span class="big">Logowanie</span></h2>
                  <ul class="list-inline list-inline-dashed">
                    <li><a href="index.jsp">Strona główna</a></li>
                    <li>Rejestracja konta Klienta
                    </li>
                  </ul>
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
            <h1>Rejestracja konta Klienta</h1>
            <hr class="divider bg-red">
            <div class="range range-xs-center offset-top-66">
              <div class="cell-lg-8">
                      
                 <div class='success'>
                        <p>*** Konto zarejestrowane - zaloguj się ***</p>
                        </div>

              
              
                <form class=" text-left offset-top-50" action="logowanie2" method="POST" onsubmit="return przetwarzajj_dane()">
                  <div class="range">
                    <div class="cell-lg-6 offset-top-20">
                      <div class="form-group">
                        <label class="form-label form-label-outside" for="contact-us-name">Adres email:</label>
                        <input class="form-control" type="text" name="email">
                      </div>
                    </div>
                    <div class="cell-lg-6 offset-top-20">
                      <div class="form-group">
                        <label class="form-label form-label-outside" for="contact-us-email">Hasło:</label>
                        <input class="form-control"  type="password" name="haslo" >
                      </div>
                    </div>

                  </div>
                  <div class="group-sm text-center text-lg-left offset-top-30">
                    <button class="btn btn-danger" type="submit">Dalej</button>
   
                  </div>
                </form>
              
              
              
                            
              <div id="r"><a href="rejestracja.jsp" class="btn btn-default">Rejestracja nowego konta</a></div><br>
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
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


