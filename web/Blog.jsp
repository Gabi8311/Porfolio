<%@page import="hibernate.Categoria"%>
<%@page import="java.util.List"%>
<%@page import="hibernate.Articulo"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Blog</title>
        <link rel="icon" type="image/png" href="images/favicon.PNG" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@900&family=Raleway:wght@300;500;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
        <script src="js/all.js"></script>
        <script src="https://kit.fontawensome.com/dd8c49730d.js" crossorigin="anonymous"></script>
    </head>

    <body class="black">

        <header class="navigation row" id="header-nav">
            <div class="col-1">
                <a href="index.jsp" class=" mt-2 ml-5">
                    <img src="images/logoGM.PNG" alt="LogoGM" class="my-logo">
                </a>
            </div>

            <nav class="col-11">
                <input type="checkbox" id="hamburguer-toggle">
                <label for="hamburguer-toggle" class="hamburguer">
                    <span class="bar"></span>
                </label>

                <ul class="nav-list text-danger shadow-text">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="Educacion.jsp">Educación</a></li>
                    <li><a href="Repos_request">Proyectos</a></li>
                    <li><a href="Experiencia.jsp">Experiencia</a></li>
                    <li><a href="Post_request" class="active">Blog</a></li>
                    <li><a href="Contacto.jsp">Contacto</a></li>
                </ul>

            </nav>
        </header>  

        <div class="cursor"></div>

        <section class="caja section">
            <img src="images/blog6.jpg" alt="Fondo_arriba" class="fondo_arriba_bis mb-5">
        </section>

        <p class="parrafo margin-blog">Mis post más destacados</p>

        <main class="container">
            <section class="text-center mb-5 row" data-color="rgb(20,20,20)">
                <% List<Articulo> posts = (List) request.getSession().getAttribute("posts");%>
                <%for (Articulo post : posts) {%>
                <div class="col-12 col-md-12 col-lg-6 card my-4 border-secondary enlarge card-blog" style="width: 40%">
                    <div class="card-header border-secondary post-header">
                        <%for (Categoria categoria : post.getCategorias()) {%>
                        <span class="ml-3"><%=categoria.getNombre()%></span> | 
                        <%=post.getFecha()%>

                        <% }%>
                    </div>
                    <div class="card-body bg-light">
                        <h5 class="card-title font-weight-bold text-secondary"><%=post.getTitulo()%></h5>

                        <div class="main-button center-button">
                            <div class="button-border center-button">
                                <a href="One_post_request?id=<%=post.getId_articulo()%>" value="" name="id_num" class="text-decoration-none fs-6">Ver Post<i class="fas fa-sign-in-alt ml-2"></i></a>                                <div class="d1"></div>
                                <div class="d2"></div>
                                <div class="d3"></div>
                                <div class="d4"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <% }%>
            </section>

        </main>

        <footer class="row text-center border-top border-secondary">
            <div class="col-12 col-lg-3 mt-5">
                <img src="images/logoGM.PNG" alt="LogoGM" class="logo-abajo">
            </div>

            <div class="col-12 col-lg-6 mt-2">
                <h3>Mi Porfolio</h3>
                <h6 class="my-2 span">© Gabriel Moreno</h6>
                <h6 class="span">2021 | Madrid | Diseñador de Aplicaciones Multiplataforma</h6>
            </div> 

            <div class="social col-md col-xl-3 mb-2">
                <a class="btn linkedin" href="https://www.linkedin.com/in/gabriel-moreno-fernandez/" target="_blank" rel="noopener noreferrer"><i class="fab fa-linkedin-in"></i></a>
                <a class="btn github" href="https://github.com/Gabi8311" target="_blank" rel="noopener noreferrer"><i class="fab fa-github"></i></a>
                <a class="btn instagram" href="https://www.instagram.com/gabi_mf83/" target="_blank" rel="noopener noreferrer"><i class="fab fa-instagram"></i></a>
                <a class="btn facebook" href="https://www.facebook.com/gabriel.morenofernandez" target="_blank" rel="noopener noreferrer"><i class="fab fa-facebook-f"></i></a>
            </div>

            <div class="col-12">
                <ul class="nav justify-content-center">
                    <li class="nav-item span">
                        <a class="nav-link" href="#" data-toggle="modal" data-target="#contact">Contacto</a>
                    </li>
                    <div class="modal fade text-center mt-5" id="contact" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header text-dark text-center">
                                    <h4 class="modal-title" id="exampleModalLabel">Contacto</h4>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body text-dark"><i class="fas fa-mobile-alt mr-2"></i>
                                    Móvil: 629-504-333
                                    <br><i class="far fa-envelope mr-2"></i>
                                    gabidam1920@gmail.com
                                </div>
                                <div class="modal-footer"></div>
                            </div>
                        </div>
                    </div>
                </ul>
            </div>

        </footer>


        <script src="js/index.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous">
        </script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
                integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
        </script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
                integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous">
        </script>
    </body>

</html>