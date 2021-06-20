package hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Gabriel Moreno
 */
@Entity
@Table(name = "Personas")
public class Persona implements Serializable{
 
    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer id_persona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "definicion")
    private String definicion;
    @Column(name = "link_foto")
    private String link_foto;
   
    
    public Persona() {
    }

    public Persona(String nombre, String definicion, String link_foto) {
        this.nombre = nombre;
        this.definicion = definicion;
        this.link_foto = link_foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_admin(Integer id_admin) {
        this.id_persona = id_persona;
    } 

    public String getLink_foto() {
        return link_foto;
    }

    public void setLink_foto(String link_foto) {
        this.link_foto = link_foto;
    }
    
    @Override
    public String toString() {
        return "Persona --> Id: " + this.id_persona + "- Nombre: " + this.nombre + "\n Definición: " + this.definicion;
    }

}

