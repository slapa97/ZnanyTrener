
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
    </head>
 









 <body class="">
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
<li class="active"><a href="index.jsp"><span>Strona główna</span></a></li>
<li ><a href="wyszukiwarkal"><span>Szukaj trenera</span></a></li>  
<li ><a href="logowanie.jsp"><span>Panel klienta</span></a></li> 
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
        <!--Swiper-->
        <div class="swiper-container swiper-slider swiper-container-horizontal" data-loop="true" data-height="100vh" data-dragable="false" data-min-height="480px" data-autoplay="5000" style="height: 910px;">
          <div class="swiper-wrapper text-center" style="transition-duration: 0ms; transform: translate3d(-5709px, 0px, 0px);">
		  <div class="swiper-slide swiper-slide-duplicate" data-slide-bg="images/background-03-1920x1280.jpg" data-preview-bg="images/background-03-1920x1280.jpg" style="background-image: url(&quot;images/background-03-1920x1280.jpg&quot;); background-size: cover; width: 1903px;" data-swiper-slide-index="2">
              <div class="swiper-caption swiper-parallax" data-speed="0.5" data-fade="true">
                <div class="swiper-slide-caption">
                  <div class="shell">
                    <div class="range range-lg-center">
                      <div class="cell-lg-12">
                        <div class="text-extra-big text-bold text-italic text-uppercase not-animated" data-caption-animate="fadeInUp" data-caption-delay="300">You can go the distance</div>
                      </div>
                      <div class="cell-lg-8 offset-top-10">
                        <h5 class="hidden reveal-xs-block text-light not-animated" data-caption-animate="fadeInUp" data-caption-delay="500">Clients
 of our gym receive not only necessary equipment for their workouts but 
also friendly support in achieving their number one training goal.</h5>
                        <div class="offset-top-20 offset-xs-top-50"><a class="btn btn-danger btn-anis-effect not-animated" href="#" data-waypoint-to="#welcome" data-caption-animate="fadeInUp" data-caption-delay="800"><span class="btn-text">get started</span></a></div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="swiper-slide" id="page-loader" data-slide-bg="images/background-01-1920x1280.jpg" data-preview-bg="images/background-01-1920x1280.jpg" style="background-image: url(&quot;images/background-01-1920x1280.jpg&quot;); background-size: cover; width: 1903px;" data-swiper-slide-index="0"> 
              <div class="swiper-caption swiper-parallax" data-speed="0.5" data-fade="true">
                <div class="swiper-slide-caption">
                  <div class="shell">
                    <div class="range range-lg-center">
                      <div class="cell-lg-12">
                        <div class="text-extra-big text-bold text-italic text-uppercase not-animated" data-caption-animate="fadeInUp" data-caption-delay="300">Znany Trener</div>
                      </div>
                      <div class="cell-lg-8 offset-top-10">
                        <h5 class="hidden reveal-xs-block text-light not-animated" data-caption-animate="fadeInUp" data-caption-delay="500">
                          Szukasz Trenera Personalnego... Wybybierz miejscowość..
                        </h5>
                        <div class="offset-top-20 offset-xs-top-50">
                            
                            
                            
                <form action="szukaj" method="POST" onsubmit="return przetwarzajj_dane()">
             
             <select class="form-control" name="id_miasto"> 
             
                  
        

             <%
  try {
    Class.forName("org.gjt.mm.mysql.Driver");
  } catch(java.lang.ClassNotFoundException e) {
    System.err.print("ClassNotFoundException: ");
    System.err.print(e.getMessage());
  }
  try {
    String url = "jdbc:mysql://localhost/znanytrener";
   Connection con = DriverManager.getConnection(url,"admin","admin");
    Statement stmt = con.createStatement();
    String retrieveString = "Select id_miasto, miasto from miasto order by miasto;";
    ResultSet rs = stmt.executeQuery(retrieveString);
                         if (rs.next())
                            {
Statement stmt2 = con.createStatement();
 String retrieveString2 = "Select id_miasto, miasto from miasto order by miasto;";
ResultSet rs2 = stmt2.executeQuery(retrieveString2);
   while(rs2.next()) {



    %>
                 
      
        <option value="<%= rs2.getString(1)%>"><%= rs2.getString(2)%>
      
  


   <% } }
      else
      { %>

    <%
        }

    stmt.close();
    con.close();

  } catch(SQLException e) {
    System.err.print("SQLException: ");
    System.err.print(e.getMessage());
  }

%>

          
             </select>           
                 
                 

             
<br>
                              <button class="btn btn-danger">Szukaj</button>
              
                                        
     </form>                  
                            

                        
                        
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>


  </div>
          <div class="swiper-button swiper-button-prev swiper-parallax mdi mdi-chevron-left"></div>
          <div class="swiper-button swiper-button-next swiper-parallax mdi mdi-chevron-right"></div>
          <div class="swiper-pagination swiper-pagination-clickable"><span class="swiper-pagination-bullet"></span><span class="swiper-pagination-bullet"></span><span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span></div>
        </div>
      </header>










      <!-- Page Contents-->
      <main class="page-content">
        <!--Welcome-->
        <section class="section-98 section-sm-110" id="welcome">
          <div class="shell">
            <h1>Witamy</h1>
            <hr class="divider bg-red">
            <div class="range range-xs-center offset-top-66">
              <div class="cell-lg-8">
                <p>Witamy na naszej stronie internetowej! Mamy nadzieję, że docenisz 
                    nasze usługi i możliwości, które oferujemy klientom. Tutaj są niektóre z nich:</p>
              </div>
            </div>
            <div class="range offset-top-98">
              <div class="cell-sm-8 cell-sm-preffix-2 cell-md-4 cell-md-preffix-0">
                <!-- Icon Box Type 5-->
                <div class="box-icon box-icon-bordered"><span class="icon icon-outlined icon-sm icon-dark-filled mdi mdi-account-multiple"></span>
                  <h4 class="text-danger offset-top-20">Wykwalifikowani trenerzy</h4>
                  <p>Nasi trenerzy posiadają wieloletnie doświadczenie w różnych rodzajach fitnessu i sporcie.</p>
                </div>
              </div>
              <div class="cell-sm-8 cell-sm-preffix-2 cell-md-4 cell-md-preffix-0 offset-top-98 offset-md-top-0">
                <!-- Icon Box Type 5-->
                <div class="box-icon box-icon-bordered"><span class="icon icon-outlined icon-xs icon-dark-filled mdi mdi-thumb-up"></span>
                  <h4 class="text-danger offset-top-20">Indywidualne podejście</h4>
                  <p>Każdy klient GYM ma spersonalizowany program treningu i żywienia.
Nowoczesny sprzęt fitness</p>
                </div>
              </div>
              <div class="cell-sm-8 cell-sm-preffix-2 cell-md-4 cell-md-preffix-0 offset-top-98 offset-md-top-0">
                <!-- Icon Box Type 5-->
                <div class="box-icon box-icon-bordered"><span class="icon icon-outlined icon-sm icon-dark-filled mdi mdi-dumbbell"></span>
                  <h4 class="text-danger offset-top-20">Szukasz trenera?</h4>
                  <p>U nas znajdziesz trenera personalnego i umówisz się na trening.</p>
                </div>
              </div>
            </div>
          </div>
        </section>
        <!-- Offers-->

        <!-- Latest Blog Posts-->
        <section class="section-98 section-110 bg-lilac">
          <div class="shell">
            <h1>Wiadomośći</h1>
            <hr class="divider bg-danger">
            <div class="range range-xs-center">
              <div class="cell-sm-10 cell-md-6">
                <!-- Post Boxed--><a class="reveal-block" href="#">
                  <div class="post post-boxed">
                    <!-- Post media-->
                    <header class="post-media"><img class="img-responsive" src="Gym_pliki/post-01-570x321.jpg" alt="" width="570" height="321"></header>
                    <!-- Post content-->
                    <section class="post-content text-left">
                      <div class="post-tags group-xs">
                     <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Fitness</span>
                     <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Kulturystyka </span>
                      </div>
                      <div class="post-body">
                        <!-- Post Title-->
                        <div class="post-title">
                          <h4>Szukasz Trenera Personalnego?</h4>
                          
                        </div>

                      </div>
                    </section>
                  </div></a>
              </div>
              <div class="cell-sm-10 cell-md-6 offset-top-66 offset-sm-top-30 offset-md-top-0">
                <!-- Post Boxed--><a class="reveal-block" href="#">
                  <div class="post post-boxed">
                    <!-- Post media-->
                    <header class="post-media"><img class="img-responsive" src="Gym_pliki/post-02-570x321.jpg" alt="" width="570" height="321"></header>
                    <!-- Post content-->
                    <section class="post-content text-left">
                      <div class="post-tags group-xs">
                    <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Fitness</span>
                     <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Kulturystyka </span>
                      </div>
                      <div class="post-body">
                        <!-- Post Title-->
                        <div class="post-title">
                          <h4>Szukasz Trenera Personalnego?</h4>
                        </div>

                      </div>
                    </section>
                  </div></a>
              </div>
              <div class="range-spacer veil reveal-md-block offset-top-30"></div>
              <div class="cell-sm-10 cell-md-6 offset-top-66 offset-sm-top-30 offset-md-top-0">
                <!-- Post Boxed--><a class="reveal-block" href="#">
                  <div class="post post-boxed">
                    <!-- Post media-->
                    <header class="post-media"><img class="img-responsive" src="Gym_pliki/post-03-570x321.jpg" alt="" width="570" height="321"></header>
                    <!-- Post content-->
                    <section class="post-content text-left">
                      <div class="post-tags group-xs">
                <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Fitness</span>
                     <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Kulturystyka </span>
                      </div>
                      <div class="post-body">
                        <!-- Post Title-->
                        <div class="post-title">
                          <h4>Szukasz Trenera Personalnego?</h4>
                        </div>
        
                      </div>
                    </section>
                  </div></a>
              </div>
              <div class="cell-sm-10 cell-md-6 offset-top-66 offset-sm-top-30 offset-md-top-0">
                <!-- Post Boxed--><a class="reveal-block" href="#">
                  <div class="post post-boxed">
                    <!-- Post media-->
                    <header class="post-media"><img class="img-responsive" src="Gym_pliki/post-04-570x321.jpg" alt="" width="570" height="321"></header>
                    <!-- Post content-->
                    <section class="post-content text-left">
                      <div class="post-tags group-xs">
             <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Fitness</span>
                     <span class="label-custom label-lg-custom label-neon-carrot text-regular text-italic text-capitalize">Kulturystyka </span>
                      </div>
                      <div class="post-body">
                        <!-- Post Title-->
                        <div class="post-title">
                          <h4>Szukasz Trenera Personalnego?</h4>
                        </div>
      
                      </div>
                    </section>
                  </div></a>
              </div>
            </div>
          </div>
        </section>
        <!-- Testimonials-->

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


</html>