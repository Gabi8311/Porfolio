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
@Table(name = "Categorias")
public class Categoria  implements Serializable {
    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer id_categoria;
    @Column(name = "nombre")
    private String nombre;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "Articulos_Categorias",joinColumns = {@JoinColumn(name = "FK_CATEGORIA")},
    inverseJoinColumns = {@JoinColumn(name = "FK_ARTICULO")})
    private Set<Articulo>articulos;

    public Categoria() {
    }

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Categoria --> ID: "  + this.id_categoria + ", Nombre: " + this.nombre + ",\n Artículos: " + this.articulos;
    }
    
    
    
}
