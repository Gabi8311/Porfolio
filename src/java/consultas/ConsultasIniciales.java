/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import hibernate.Comentario;
import hibernate.Persona;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author gabri
 */
public class ConsultasIniciales {

    public static void insertComentarios() {

        Persona p1 = new Persona("Elon Musk", "Emprendedor,Magnate,Inventor");
        Persona p2 = new Persona("Bill Gates", "Fundador de Microsoft");
        Persona p3 = new Persona("Mark Zuckerberg", "Programador,Empresario,Fundador de Facebook");

        Comentario c1 = new Comentario("Este chaval viene muy fuerte.Es el próximo yo,pero en pobre", p1);
        Comentario c2 = new Comentario("Necesitamos en el mundo más gente como este chico", p2);
        Comentario c3 = new Comentario("Estoy esperando que acabe el Grado Superior para hacerle una oferta", p3);

        SessionFactory sessionFactory;
        Configuration configuracion = new Configuration();

        configuracion.configure(); //Si da problemas aquí,tenemos un problema en el xml

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
                configuracion.getProperties()).buildServiceRegistry();

        sessionFactory = configuracion.buildSessionFactory(serviceRegistry);//Crear el pool de sessiones que nos permite crear sesiones individuales

        Session sesion = sessionFactory.openSession();

        sesion.beginTransaction();
        sesion.save(c1);
        sesion.save(c2);
        sesion.save(c3);
        sesion.getTransaction().commit();

        sesion.close();
        sessionFactory.close();

    }

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

    public static void truncate_table() {
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

        for (Comentario c : comments) {
            sesion.delete(c);
        }

        sesion.getTransaction().commit();

        sesion.close();
        sessionFactory.close();

    }
}
