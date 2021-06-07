package hibernate;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Gabriel Moreno
 */
@Entity
@Table(name = "Repositorios")
public class Repositorio implements Serializable{
    @Id
    @Column(name = "id_repositorio")
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer id_repositorio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "link")
    private String link;
    @Column(name = "num_visitas")
    private Integer num_visitas;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "Repositorios_Lenguajes",joinColumns = {@JoinColumn(name = "FK_REPOSITORIO")},
    inverseJoinColumns = {@JoinColumn(name = "FK_LENGUAJE")})       
    private Set<Lenguaje>lenguajes;

    public Repositorio() {
    }

    public Repositorio(String nombre,String link, Integer num_visitas, Set<Lenguaje> lenguajes) {
        this.nombre = nombre;
        this.link = link;
        this.num_visitas = num_visitas;
        this.lenguajes = lenguajes;
    }

    public Integer getId_repositorio() {
        return id_repositorio;
    }

    public void setId_repositorio(Integer id_repositorio) {
        this.id_repositorio = id_repositorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getNum_visitas() {
        return num_visitas;
    }

    public void setNum_visitas(Integer num_visitas) {
        this.num_visitas = num_visitas;
    }

    public Set<Lenguaje> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(Set<Lenguaje> lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Repositorio --> ID " + this.id_repositorio + ", Nombre: " + this.nombre + ", Link: " + this.link + ", Nº de Visitas: " + this.num_visitas + ",\n Lenguajes: " + this.lenguajes;
    }
    
    

    
}
