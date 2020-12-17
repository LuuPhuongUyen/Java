<!DOCTYPE html>
<!-- saved from url=(0045)http://us-123daycare.simplesite.com/410914810 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html lang="en-US" class=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact  - us-123daycare.simplesite.com</title>
        <meta property="og:site_name" content="Melanie&#39;s Day Care">
        <meta property="article:publisher" content="https://www.facebook.com/simplesite">
        <meta property="og:locale" content="en-US">
        <meta property="og:url" content="http://us-123daycare.simplesite.com/410914810">
        <meta property="og:title" content="Contact me">
        <meta property="og:description" content="Melanie&#39;s Day Care - 
              Address:
              City:
              Country:
              Tel: 123456
              Email: your-email@your-email.com">
        <meta property="og:updated_time" content="2017-01-04T04:34:43.6372788+00:00">
        <meta property="og:type" content="website">
        <meta name="robots" content="nofollow">

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Melanie&#39;s Day Care - http://us-123daycare.simplesite.com/">
        <link rel="stylesheet" type="text/css" href="./Contact_files/8597414.design.v26374.css">
        <link rel="canonical" href="http://us-123daycare.simplesite.com/410914810">
        <link rel="shortcut icon" href="data:image/x-icon;,">
        <link href="Contact_files/style.css" rel="stylesheet" type="text/css"/>
        <link href="Contact_files/8597414.design.v26374.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" async="" src="./Contact_files/analytics.js.download"></script><script async="" src="./Contact_files/gtm.js.download"></script><script type="text/javascript" src="./Contact_files/FrontendAppLocalePage.aspx"></script>
        <script type="text/javascript" src="./Contact_files/frontendApp.min.js.download"></script>
        <script type="text/javascript">if (typeof window.jQuery == "undefined") {
                (function () {
                    var a = document.createElement("script");
                    a.type = "text/javascript";
                    a.src = "/c/js/version3/frontendApp/init/frontendApp.min.js?_v=c3745b49b3583731aea941058c4b63a8";
                    document.getElementsByTagName('head')[0].appendChild(a);
                })();
            }</script>

        <script type="text/javascript">var css_simplesite_com_fallback_element = document.getElementById('css_simplesite_com_fallback');
            if (typeof css_simplesite_com_fallback_element !== 'undefined' && css_simplesite_com_fallback_element !== null) {
                var isVisible = css_simplesite_com_fallback_element.offsetParent !== null
                if (isVisible) {
                    var head = document.head, link = document.createElement('link');

                    link.type = 'text/css';
                    link.rel = 'stylesheet';
                    link.href = '{/d/designs/8597414.design.v26374.css}';

                    head.appendChild(link);
                }
            }</script>
        <style type="text/css">.fancybox-margin{margin-right:17px;}</style></head>
    <body data-pid="410914810" data-iid="">




        <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
            <div class="container-fluid header-wrapper " id="header"> <!-- this is the Header Wrapper -->
                <div class="container">
                    <div class="title-wrapper">
                        <div class="title-wrapper-inner">
                            <a rel="nofollow" class="logo " href="http://us-123daycare.simplesite.com/">
                            </a>
                            <div class="title ">
                                Melanie's Day Care
                            </div>
                            <div class="subtitle">
                                Welcome to my website
                            </div>
                        </div>
                    </div>  <!-- these are the titles -->
                    <div class="navbar navbar-compact">
                        <div class="navbar-inner">
                            <div class="container">
                                <!-- .btn-navbar is used as the toggle for collapsed navbar content -->
                                <a rel="nofollow" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse" title="Toggle menu">
                                    <span class="menu-name">Menu</span>
                                    <span class="menu-bars">
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </span>
                                </a>



                                <!-- Everything you want hidden at 940px or less, place within here -->
                                <div class="nav-collapse collapse">
                                    <ul class="nav" id="topMenu" data-submenu="horizontal">
                                        <li class=" active " style="">
                                            <a rel="nofollow" href="getHome">My front page</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="getAbout">About me</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="getPhoto">Photo album</a>
                                        </li><li class="  " style="">
                                            <a rel="nofollow" href="getContact">Contact </a>
                                        </li>                </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- this is the Menu content -->
                </div>
            </div>  <!-- this is the Header content -->

            <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
                <div class="container">
                    <div class="row-fluid content-inner">
                        <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                            <div class="wrapper contact">
                                <div class="heading">
                                    <h1 class="page-title">Contact me</h1>
                                </div>

                                <div class="content">
                                    <div class="section">
                                        <div class="content">
                                            <div class="span12 contact-text">
                                                <h4>Melanie's Day Care</h4>
                                                <p>Address: ${con.getAddress()}<br>City: ${con.getCity()}<br>Country: ${con.getCountry()}</p> <p>Tel: ${con.getPhone()}<br>Email: ${con.getEmail()}</p>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="content">
                                        <div class="alert alert-success hide">
                                            Thank you for your message.
                                        </div>
                                        <div class="alert alert-error hide">
                                            <button type="button" class="close">Ã</button>
                                        </div>
                                        
                                        <form action="getMessage">
                                            <div class="send">
                                                <p>Write your message here. Fill out the form:</p>
                                                <div class="row1">
                                                    <input type="text" name="username" placeholder="Write your name here" required="">
                                                    <input type="email" name="email" placeholder="Write your email here" required="">
                                                </div>
                                                <div class="row2">
                                                    <textarea name="message" placeholder="Write your message here" required=""></textarea>
                                                </div>
                                                <input type="submit" id="submit" name="submit" value="Send - Click here" href="getMessage">
                                            </div>
                                        </form>
                                    </div>

                                </div>


                            </div>
                        </div>
                        <div id="right" class="span3">
                            <div class="sidebar">
                                <div class="wrapper share-box">
                                    <style>    .wordwrapfix {
                                            word-wrap:break-word;
                                        }
                                    </style>
                                    <div class="heading wordwrapfix">
                                        <h4>Share this page</h4>
                                    </div>

                                    <div class="content"><span><ul>
                                                <li><a id="share-facebook" href="http://us-123daycare.simplesite.com/410914810#"><i class="icon-facebook-sign"></i><span>Share on Facebook</span></a></li>
                                                <li><a id="share-twitter" href="http://us-123daycare.simplesite.com/410914810#"><i class="icon-twitter-sign"></i><span>Share on Twitter</span></a></li>
                                                <li><a id="share-google-plus" href="http://us-123daycare.simplesite.com/410914810#"><i class="icon-google-plus-sign"></i><span>Share on Google+</span></a></li>    
                                            </ul></span></div>
                                </div>
                            </div>
                        </div>
                    </div>        
                </div>
            </div>  <!-- the controller has determined which view to be shown in the content -->

            <div class="container-fluid footer-wrapper" id="footer"> <!-- this is the Footer Wrapper -->
                <div class="container">
                    <div class="footer-info">
                        <div class="footer-powered-by">
                            <a rel="nofollow" href="http://www.simplesite.com/pages/receive.aspx?partnerkey=123i%3afooterbanner&amp;referercustomerid=10677859&amp;refererpageid=410914810">Created with SimpleSite</a>
                        </div>
                    </div>
                    <div class="footer-page-counter" style="display: block;">
                        <span class="footer-page-counter-item">0</span>

                        <span class="footer-page-counter-item">2</span>

                        <span class="footer-page-counter-item">4</span>

                        <span class="footer-page-counter-item">2</span>

                        <span class="footer-page-counter-item">1</span>

                        <span class="footer-page-counter-item">0</span>
                    </div>
                    <div id="css_simplesite_com_fallback" class="hide"></div>
                </div>
            </div>

            <!-- this is the Footer content -->
        </div>


        <input type="hidden" id="anti-forgery-token" value="vFZIp11QDd7w1cZjYdzwVVw3rTHgQi1lpMMqomvLq/qGfx85dADIn6rd+jb5+yvdIjnIKNejlFu6vxL7J8Np5e7g5yrI36losWXJkOuv169s22+Z/mKVySX+8iBmNTzgEHnWy/7MRLoBekjH3EpgI99d772eCmdJN7eG7tAqc/m4iWFE2sfSH8oY0Q3pJZcuhjM+blA+FzGTkoYvuddklk1q/4A0667VqYWgFZ7hNc8NO4Kw1Txa422/7pYh/UW67W3GdGTPhdbiuy5yZG8PFfcV3pshO8MZJZI4QqpmoSmbtrQpm9WTX4MbCbnQyM7h5NaUS9oN6X4rtQXeQ4JVwDzgCfuolg6kJOxKEjNy3wz2WXZRbIsB2tTp4Wbn2z/LdrPNntHwVwzfTEEC6rcr4VG6fEA2EcO5Uxbg7BjyH0Bn9EPtLOFY1DCGXowwYoFvfAm6Gt11N+r76oZiViZjtg==">


        <script>
            dataLayer = [{"SiteVer": "US", "MainOrUser": "UserPage", "PreOrFre": "Free", "Language": "en", "Culture": "en-US", "Instrumentation": "ShowPage", "Market": "DK"}];
        </script>
        <!-- Google Tag Manager -->
        <noscript>&lt;iframe src="//www.googletagmanager.com/ns.html?id=GTM-2MMH"
        height="0" width="0" style="display:none;visibility:hidden"&gt;&lt;/iframe&gt;</noscript>
        <script>(function (w, d, s, l, i) {
                {
                    w[l] = w[l] || [];
                    w[l].push({'gtm.start':
                                new Date().getTime(), event: 'gtm.js'});
                    var f = d.getElementsByTagName(s)[0],
                            j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : '';
                    j.async = true;
                    j.src =
                            '//www.googletagmanager.com/gtm.js?id=' + i + dl;
                    f.parentNode.insertBefore(j, f);
                }
            })(window, document, 'script', 'dataLayer', 'GTM-2MMH');</script>
        <!-- End Google Tag Manager -->


        <!-- Remove after blog exp concludes -->

        <div id="sm2-container" class="movieContainer high_performance" style="z-index: 10000; position: fixed; width: 8px; height: 8px; bottom: 0px; left: 0px; overflow: hidden; visibility: hidden;"><embed name="sm2movie" id="sm2movie" src="/Images/sm297/soundmanager2_flash9.swf" quality="high" allowscriptaccess="always" bgcolor="#ffffff" pluginspage="www.macromedia.com/go/getflashplayer" title="JS/Flash audio component (SoundManager 2)" type="application/x-shockwave-flash" wmode="transparent" haspriority="true"></div><div style="display: none; visibility: hidden;"><script type="text/javascript">var google_conversion_id = 1066686464, google_custom_params = window.google_tag_params, google_remarketing_only = !0;</script>
            <script type="text/javascript" src="./Contact_files/conversion.js.download"></script><iframe name="google_conversion_frame" title="Google conversion frame" width="300" height="13" src="./Contact_files/saved_resource.html" frameborder="0" marginwidth="0" marginheight="0" vspace="0" hspace="0" allowtransparency="true" scrolling="no"></iframe>
            <noscript></noscript>
        </div></body></html>