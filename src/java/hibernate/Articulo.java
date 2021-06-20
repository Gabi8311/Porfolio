package hibernate;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "Articulos")
public class Articulo implements Serializable {
    @Id
    @Column(name = "id_articulos")
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer id_articulo;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "texto")
    private String texto;
    @Column(name = "fecha")
    private Date fecha; 
    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="articulos")        
    private Set<Categoria>categorias;

    public Articulo() {
    }

    public Articulo(String titulo, String texto, Date fecha) {
        this.titulo = titulo;
        this.texto = texto;
        this.fecha = fecha;
    }

    public Integer getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(Integer id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Articulo --> ID" + this.id_articulo + ", Título:" + this.titulo + "\n Texto: " + this.texto + "\n Fecha: " + this.fecha + ",Categorías:" + this.categorias;
    }
    
    
}
