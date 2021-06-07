package consultas;

import hibernate.Repositorio;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Gabriel Moreno
 */
@WebServlet(name = "Repos_request", urlPatterns = {"/Repos_request"})
public class Repos_request extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SessionFactory sessionFactory;
        Configuration configuracion = new Configuration();

        configuracion.configure(); //Si da problemas aquí,tenemos un problema en el xml

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuracion.getProperties()).buildServiceRegistry();

        sessionFactory = configuracion.buildSessionFactory(serviceRegistry);//Crear el pool de sessiones que nos permite crear sesiones individuales

        Session sesion = sessionFactory.openSession();
        
        Query query = sesion.createQuery("SELECT r FROM Repositorio r ORDER BY r.num_visitas desc");
        List<Repositorio> repos = query.list();
        
        request.getSession().setAttribute("repos", repos);//Con esto se lo mando al JSP

        getServletContext().getRequestDispatcher("/Proyectos.jsp").forward(request, response); //Y con esto le redirijo al JSP

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
