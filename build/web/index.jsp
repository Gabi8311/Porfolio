<%@page import="consultas.ConsultasIniciales"%>
<%@page import="java.util.List"%>
<%@page import="hibernate.Comentario"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home</title>
        <link rel="icon" type="image/png" href="images/favicon.PNG" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
              integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@900&family=Raleway:wght@300;500;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
        <script src="js/all.js"></script>
        <script src=" https://use.fontawesome.com/a34asdfsd.js." crossorigin="anonymous"></script>
    </head>

    <body class="my-bg" id="body">

        <div class="fake-bg"></div>

        <header class="navigation row" id="header-nav">

            <div class="col-1">
                <a href="index.jsp" class="mt-2 ml-5">
                    <img src="images/logoGM.PNG" alt="LogoGM" class="my-logo">
                </a>
            </div>

            <nav class="col-6 col-lg-11">
                <input type="checkbox" id="hamburguer-toggle">
                <label for="hamburguer-toggle" class="hamburguer">
                    <span class="bar"></span>
                </label>

                <ul class="nav-list shadow-text">
                    <li><a href="index.jsp" class="active">Home</a></li>
                    <li><a href="Educacion.jsp">Educación</a></li>
                    <li><a href="Repos_request">Proyectos</a></li>
                    <li><a href="Experiencia.jsp">Experiencia</a></li>
                    <li><a href="Post_request">Blog</a></li>
                    <li><a href="Contacto.jsp">Contacto</a></li>
                </ul>
            </nav>
        </header>  

        <div class="cursor"></div>
        
        <section class="meteor">
            <h1 class="h1" data-text="Gabriel Moreno">Gabriel Moreno</h1>
            <section class="header-home" id="header">
                <div class="animated-area"></div>
            </section>
        </section>

        <input type="checkbox" id="switch" onchange="changeToDarkMode()">
        <label for="switch"></label>

        <div class="developer fadeInUp" data-delay="800ms">
            <img src="images/dibu_foto.PNG" alt="Mi_foto" class="mi-foto shadow-text-purple">
            <h2 class="front-end">Desarrollador Front-End</h2>
        </div>
        
        <main class="container my-5 main-padding" id="main">

            <section class="row centro p-3 text-center reveal fadeInLeft centro" data-delay="800ms" id="section-educacion">
                <div class="col-12 col-lg-6">
                    <img src="https://images.idgesg.net/images/idge/imported/imageapi/2019/12/13/19/certification_education_knowledge_learning_silhouette_with_graduation_cap_with_abstract_technology_imagery_nodes_blocks_blockchain_by_monsitj_gettyimages-961656326_1200x800-100766597-large-100780539-large-100824062-large.jpg" alt="Foto_educación" class="rounded-pill img-fluid img-shadow reduce">
                </div>
                <div class="col-12 col-lg-6">
                    <h4 class="h4 mb-3"><span class="brackets align-middle">{</span> Educación <span class="brackets align-middle">}</span></h4>
                    <p class="paragraph">"No se están teniendo en cuenta las necesidades del animal. El ser humano se ha enfocado en ser
                        profesional y no en tener familia. Por eso quieren llenar ese vacío con los animales. Pero los
                        animales se sienten incompletos porque no son seres humanos y tienen otras necesidades físicas y
                        psicológicas.</p>
                    <div class="contenedor">
                        <a href="Educacion.jsp" class="font-weight-bolder">Ver más</a><i class="fas fa-user-graduate ml-3"></i>
                        <div class="bg"></div>
                    </div>
                </div>
            </section>

            <hr class="aire">

            <section class="row centro p-3 text-center reveal fadeInRight centro" data-delay="800ms">
                <div class="col-12 col-lg-6">
                    <h4 class="h4 mb-3"><span class="brackets align-middle">{</span> Proyectos <span class="brackets align-middle">}</span></h4>
                    <p class="paragraph">"No se están teniendo en cuenta las necesidades del animal. El ser humano se ha enfocado en ser
                        profesional y no en tener familia. Por eso quieren llenar ese vacío con los animales. Pero los
                        animales se sienten incompletos porque no son seres humanos y tienen otras necesidades físicas y
                        psicológicas.</p>
                    <div class="contenedor">
                        <a href="Proyectos.jsp" class="font-weight-bolder">Ver más</a><i class="fas fa-laptop-code ml-3"></i>
                        <div class="bg"></div>
                    </div>
                </div>
                <div class="col-12 col-lg-6">
                    <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--V0ekZaVJ--/c_imagga_scale,f_auto,fl_progressive,h_900,q_auto,w_1600/https://thepracticaldev.s3.amazonaws.com/i/h68x0up43hmknl5tjcww.jpg" alt="Foto_proyectos" class="rounded-pill img-fluid img-shadow reduce">
                </div>
            </section>

            <hr class="aire">

            <section class="row centro p-3 text-center reveal fadeInLeft mb-5 pb-5 centro" data-delay="800ms">
                <div class="col-12 col-lg-6">
                    <img src="https://speaktocode.com/wp-content/uploads/2021/02/top-programming-languages.jpg" alt="Foto_skills" class="rounded-pill img-fluid img-shadow">
                </div>
                <div class="col-12 col-lg-6">
                    <h4 class="h4 mb-3"><span class="brackets align-middle">{</span> Habilidades <span class="brackets align-middle">}</span></h4>
                    <p class="paragraph">"No se están teniendo en cuenta las necesidades del animal. El ser humano se ha enfocado en ser
                        profesional y no en tener familia. Por eso quieren llenar ese vacío con los animales. Pero los
                        animales se sienten incompletos porque no son seres humanos y tienen otras necesidades físicas y
                        psicológicas.</p>
                    <div class="contenedor">
                        <a href="Experiencia.jsp" class="font-weight-bolder">Ver más</a><i class="fas fa-code ml-3"></i>
                        <div class="bg"></div>
                    </div>
                </div>
            </section>

            <section class="darken border-top border-bottom reveal fadeInRight aire centro" data-delay="800ms">

                <div class="row centro text-center change-background" data-color="rgb(20,20,20)">
                    <div class="col-12 col-lg-6">
                        <h4 class="mb-3 p-blog"><span class="brackets align-middle">{</span> BLOG <span class="brackets align-middle">}</span></h4>
                        <p class="paragraph text-white">"No se están teniendo en cuenta las necesidades del animal. El ser humano se ha enfocado en ser
                            profesional y no en tener familia. Por eso quieren llenar ese vacío con los animales. Pero los
                            animales se sienten incompletos porque no son seres humanos y tienen otras necesidades físicas y
                            psicológicas.</p>
                        <div class="contenedor">
                            <a href="Blog.jsp" class="font-weight-bolder">Ver más</a><i class="far fa-edit ml-3"></i>
                            <div class="bg"></div>
                        </div>
                    </div>
                    <div class="col-12 col-lg-6">
                        <img src="images/blog.jpg" alt="" class="rounded img-fluid border-0 img-shadow-white">
                    </div>
                </div>
            </section>

            <section class="row centro p-3 text-center reveal fadeInLeft centro" data-delay="800ms">
                <div class="col-12 col-lg-6">
                    <img src="https://img.freepik.com/foto-gratis/imagen-primer-plano-manos-masculinas-smartphone-icono-telefono-correo-electronico-telefono-movil-direccion-contactenos-conexion-concepto-marketing-correo-electronico_20693-316.jpg?size=626&ext=jpg" alt="Foto_contacto" class="rounded img-fluid img-shadow reduce">
                </div>
                <div class="col-12 col-lg-6">
                    <h4 class="h4 mb-3 "><span class="brackets align-middle">{</span> Contacto <span class="brackets align-middle">}</span></h4>
                    <p class="paragraph">"No se están teniendo en cuenta las necesidades del animal. El ser humano se ha enfocado en ser
                        profesional y no en tener familia. Por eso quieren llenar ese vacío con los animales. Pero los
                        animales se sienten incompletos porque no son seres humanos y tienen otras necesidades físicas y
                        psicológicas.</p>
                    <div class="contenedor">
                        <a href="Contacto.jsp" class="font-weight-bolder">Ver más</a><i class="fas fa-mobile-alt ml-3"></i>
                        <div class="bg"></div>
                    </div>
                </div>
            </section>

            <hr class="aire">

            <section class="row ml-5 pl-2 text-center">
                <% List<Comentario> comentarios = ConsultasIniciales.selectComentarios();
                    for (Comentario comentario : comentarios) {%>
                <div class="col-12 col-md-6 col-lg-4 card-180 my-5">
                    <div class="card-side front">
                        <div class="content">
                            <h5><i class="fas fa-quote-left mr-2 reduce"></i><%=comentario.getTexto()%> <i class="fas fa-quote-right ml-2 reduce"></i></h5>
                            <img src="<%=comentario.getPersona().getLink_foto()%>" class="reduce"/>
                        </div>
                    </div>
                    <div class="card-side back">
                        <div>
                            <h2><%=comentario.getPersona().getNombre()%></h2>
                            <hr class="bg-light">
                            <h3><%=comentario.getPersona().getDefinicion()%></h3>
                        </div>
                    </div>
                </div>
                <%}%>
            </section>

        </main>

        <div class="container-up">
            <a href="#header" class="animated-word text-decoration-none text-secondary"><i class="fas fa-angle-up"></i><br>Volver Arriba</a>
        </div>

        <footer class="row text-center border-top border-secondary">
            <div class="col-12 col-lg-3 mt-5">
                <img src="images/logoGM.PNG" alt="LogoGM" class="logo-abajo">
            </div>

            <div class="col-12 col-lg-6 mt-2">
                <h3 class="font-weight-bolder">Mi Porfolio</h3>
                <h6 class="my-2 span">© Gabriel Moreno</h6>
                <h6 class="span">2021 | Madrid | Diseñador de Aplicaciones Multiplataforma</h6>
            </div> 

            <div class="social col-md col-xl-3 mb-2">
                <a class="btn linkedin" href="https://www.linkedin.com/in/gabriel-moreno-fernandez/" target="_blank" rel="noopener noreferrer"><i class="fab fa-linkedin-in"></i></a>
                <a class="btn github" href="https://github.com/Gabi8311" target="_blank"><i class="fab fa-github" rel="noopener noreferrer"></i></a>
                <a class="btn instagram" href="https://www.instagram.com/gabi_mf83/" target="_blank"><i class="fab fa-instagram" rel="noopener noreferrer"></i></a>
                <a class="btn facebook" href="https://www.facebook.com/gabriel.morenofernandez" target="_blank" rel="noopener noreferrer"><i class="fab fa-facebook-f"></i></a>
            </div>


            <div class="col-12">
                <ul class="nav justify-content-center">
                    <li class="nav-item span">
                        <a class="nav-link" href="#" data-toggle="modal" data-target="#contact">CONTACTO</a>
                    </li>
                    <div class="modal fade text-center mt-5" id="contact" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header text-dark text-center">
                                    <h3 class="modal-title font-weight-bold" id="exampleModalLabel">Contacto</h3>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body text-dark font-weight-bolder"><i class="fas fa-mobile-alt mr-2"></i>
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
        <script src="js/home.js"></script>
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