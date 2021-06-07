package hibernate;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
/**
 *
 * @author Gabriel Moreno
 */
@Entity
@Table(name = "Comentarios")
public class Comentario implements Serializable{
    @Id
    @Column(name = "id_comentario")
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Integer id_comentario;
    @Column(name = "texto")
    private String texto;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Persona persona;

    public Comentario() {
    }

    public Comentario(String texto, Persona persona) {
        this.texto = texto;
        this.persona = persona;
    }

    public Integer getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Integer id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    

    @Override
    public String toString() {
        return "Comentario:\n" + "Id:" + this.id_comentario + "\nTexto:" + this.texto + "\nPersona:" + this.persona;
    }
    
    
    
}
