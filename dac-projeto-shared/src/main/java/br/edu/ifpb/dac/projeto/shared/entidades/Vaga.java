
package br.edu.ifpb.dac.projeto.shared.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
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
@SequenceGenerator(name = "seq_vaga", sequenceName = "seq_vaga_id", allocationSize = 1)
@Table(name = "vaga")
public class Vaga implements Comparable<Vaga>, Serializable{
    
    @Id
    @GeneratedValue(generator = "seq_vaga", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "cargo", length = 60, nullable = false)
    private String cargo;
    @Column(name = "descricao", length = 150, nullable = false)
    private String descricao;
    @Column(name = "horario", length = 60, nullable = false)
    private String horario;
    @Column(name = "regime_de_contratacao", length = 60, nullable = false)
    private String regimeDeContratacao;
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    @OneToOne
    @Column(name = "gestor", nullable = false)
    private Usuario gestor;
    private List<Candidato> candidatos = new ArrayList<>();

    public Vaga(long id, String cargo, String descricao, String horario, String regimeDeContratacao, int quantidade, Usuario gestor, List<Candidato> candidatos) {
        this.id = id;
        this.cargo = cargo;
        this.descricao = descricao;
        this.horario = horario;
        this.regimeDeContratacao = regimeDeContratacao;
        this.quantidade = quantidade;
        this.gestor = gestor;
        this.candidatos = candidatos;
    }

    public Vaga(String cargo, String descricao, String horario, String regimeDeContratacao, int quantidade, Usuario gestor) {
        this.cargo = cargo;
        this.descricao = descricao;
        this.horario = horario;
        this.regimeDeContratacao = regimeDeContratacao;
        this.quantidade = quantidade;
        this.gestor = gestor;
    }

    public Vaga() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getRegimeDeContratacao() {
        return regimeDeContratacao;
    }

    public void setRegimeDeContratacao(String regimeDeContratacao) {
        this.regimeDeContratacao = regimeDeContratacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Usuario getGerente() {
        return gestor;
    }

    public void setGerente(Usuario gestor) {
        this.gestor = gestor;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + Objects.hashCode(this.cargo);
        hash = 79 * hash + Objects.hashCode(this.descricao);
        hash = 79 * hash + Objects.hashCode(this.horario);
        hash = 79 * hash + Objects.hashCode(this.regimeDeContratacao);
        hash = 79 * hash + this.quantidade;
        hash = 79 * hash + Objects.hashCode(this.gestor);
        hash = 79 * hash + Objects.hashCode(this.candidatos);
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
        final Vaga other = (Vaga) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.regimeDeContratacao, other.regimeDeContratacao)) {
            return false;
        }
        if (!Objects.equals(this.gestor, other.gestor)) {
            return false;
        }
        if (!Objects.equals(this.candidatos, other.candidatos)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Vaga o) {
        return this.getCargo().compareTo(o.getCargo());
    }

    @Override
    public String toString() {
        return "Vaga{" + "id=" + id + ", cargo=" + cargo + ", descricao=" + descricao + ", horario=" + horario + ", regimeDeContratacao=" + regimeDeContratacao + ", quantidade=" + quantidade + ", gestor=" + gestor + ", candidatos=" + candidatos + '}';
    }
    
}
