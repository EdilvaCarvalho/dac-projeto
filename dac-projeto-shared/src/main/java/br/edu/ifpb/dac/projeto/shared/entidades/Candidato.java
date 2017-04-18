
package br.edu.ifpb.dac.projeto.shared.entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Edilva
 */
@Entity
@SequenceGenerator(name = "seq_candidato", sequenceName = "seq_candidato_id", allocationSize = 1)
@Table(name = "candidato")
public class Candidato implements Comparable<Candidato>, Serializable{
    @Id
    @GeneratedValue(generator = "seq_candidato", strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Usuario usuario;
    @Column(name = "curriculo", length = 200, nullable = false)
    private String curriculo;
    @Column(name = "preferencia", length = 80, nullable = false)
    private String preferencia;
    @Column(name = "linkedin", length = 200, nullable = false)
    private String linkedin;
    @Column(name = "github", length = 200, nullable = false)
    private String github;
    @Embedded
    private Endereco endereco;

    public Candidato(Usuario usuario, String curriculo, String preferencia, String linkedin, String github, Endereco endereco) {
        this.usuario = usuario;
        this.curriculo = curriculo;
        this.preferencia = preferencia;
        this.linkedin = linkedin;
        this.github = github;
        this.endereco = endereco;
    }

    public Candidato(long id, Usuario usuario, String curriculo, String preferencia, String linkedin, String github, Endereco endereco) {
        this.id = id;
        this.usuario = usuario;
        this.curriculo = curriculo;
        this.preferencia = preferencia;
        this.linkedin = linkedin;
        this.github = github;
        this.endereco = endereco;
    }
    
    public Candidato() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public int compareTo(Candidato o) {
        return this.getUsuario().getNome().compareTo(o.getUsuario().getNome());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 83 * hash + Objects.hashCode(this.usuario);
        hash = 83 * hash + Objects.hashCode(this.curriculo);
        hash = 83 * hash + Objects.hashCode(this.preferencia);
        hash = 83 * hash + Objects.hashCode(this.linkedin);
        hash = 83 * hash + Objects.hashCode(this.github);
        hash = 83 * hash + Objects.hashCode(this.endereco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Candidato other = (Candidato) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.curriculo, other.curriculo)) {
            return false;
        }
        if (!Objects.equals(this.preferencia, other.preferencia)) {
            return false;
        }
        if (!Objects.equals(this.linkedin, other.linkedin)) {
            return false;
        }
        if (!Objects.equals(this.github, other.github)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Candidato{" + "id=" + id + ", usuario=" + usuario + ", curriculo=" + curriculo + ", preferencia=" + preferencia + ", linkedin=" + linkedin + ", github=" + github + ", endereco=" + endereco + '}';
    }
    
}
