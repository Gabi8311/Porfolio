package consultas;

import hibernate.Comentario;
import java.util.List;
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
public class ConsultasIniciales {

    public static List<Comentario> selectComentarios() {

        SessionFactory sessionFactory;
        Configuration configuracion = new Configuration();

        configuracion.configure(); //Si da problemas aquí,tenemos un problema en el xml

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuracion.getProperties()).buildServiceRegistry();

        sessionFactory = configuracion.buildSessionFactory(serviceRegistry);//Crear el pool de sessiones que nos permite crear sesiones individuales

        Session sesion = sessionFactory.openSession();

        sesion.beginTransaction();
        Query query = sesion.createQuery("SELECT c FROM Comentario c");
        List<Comentario> comments = query.list();

        sesion.close();
        sessionFactory.close();
        return comments;
    }
}
