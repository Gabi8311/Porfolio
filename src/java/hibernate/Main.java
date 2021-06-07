
package hibernate;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author gabri
 */
public class Main {
    
    public static void main(String[] args){
    
        SessionFactory sessionFactory;
        Configuration configuracion = new Configuration();

        configuracion.configure(); //Si da problemas aquí,tenemos un problema en el xml

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuracion.getProperties()).buildServiceRegistry();

        sessionFactory = configuracion.buildSessionFactory(serviceRegistry);//Crear el pool de sessiones que nos permite crear sesiones individuales
       
        Lenguaje lenguaje = new Lenguaje( "Javascript");
        Set<Lenguaje> lenguajes = new HashSet<>();
        lenguajes.add(lenguaje);
        Repositorio repo = new Repositorio( "Calle Tintín y Milú", "Madrid",3,lenguajes);
        
        Session sesion = sessionFactory.openSession();

        //Repositorio repo2 = (Repositorio) sesion.get(Repositorio.class, 1);//Esto es un select

      
    
        sesion.beginTransaction();
        sesion.save(repo);
        sesion.getTransaction().commit();

        sesion.close();
        sessionFactory.close();

    }
}
