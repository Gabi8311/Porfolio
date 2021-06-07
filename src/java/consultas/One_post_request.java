package consultas;

import hibernate.Articulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Gabriel Moreno
 */
@WebServlet(name = "One_post_request", urlPatterns = {"/One_post_request"})
public class One_post_request extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
            SessionFactory sessionFactory;
        Configuration configuracion = new Configuration();

        configuracion.configure(); //Si da problemas aquí,tenemos un problema en el xml

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuracion.getProperties()).buildServiceRegistry();

        sessionFactory = configuracion.buildSessionFactory(serviceRegistry);//Crear el pool de sessiones que nos permite crear sesiones individuales
         Session sesion = sessionFactory.openSession();
         
        

        Articulo articulo = (Articulo) sesion.get(Articulo.class,id);//Esto es un select
        
        request.getSession().setAttribute("articulo", articulo);//Con esto se lo mando al JSP

        getServletContext().getRequestDispatcher("/Post.jsp").forward(request, response); //Y con esto le redirijo al JSP

        sesion.close();
        sessionFactory.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
