package hibernate;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Gabriel Moreno
 */
@Entity
@Table(name = "Lenguajes")
public class Lenguaje implements Serializable {
    @Id
    @Column(name = "id_lenguaje")
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer id_lenguaje;
    @Column(name = "nombre")
    private String nombre;
    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="lenguajes") 
    Set<Repositorio>repositorios;

    public Lenguaje() {
    }

    public Lenguaje(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_lenguaje() {
        return id_lenguaje;
    }

    public void setId_lenguaje(Integer id_lenguaje) {
        this.id_lenguaje = id_lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Repositorio> getRepositorios() {
        return repositorios;
    }

    public void setRepositorios(Set<Repositorio> repositorios) {
        this.repositorios = repositorios;
    }
    
    

    @Override
    public String toString() {
        return "Lenguaje --> Nombre:" + this.nombre + ",\n Repositorios: " + this.repositorios;
    }
    
    
}
