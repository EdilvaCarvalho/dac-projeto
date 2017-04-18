
package br.edu.ifpb.dac.projeto.shared.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@SequenceGenerator(name = "seq_avaliacao", sequenceName = "seq_avaliacao_id", allocationSize = 1)
@Table(name = "avaliacao")
public class Avaliacao implements Comparable<Avaliacao>, Serializable{
    
    @Id
    @GeneratedValue(generator = "seq_avaliacao", strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne
    private Usuario avaliador;
    @OneToOne
    private Candidato candidato;
    @OneToOne
    private Vaga vaga;
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate data;
    private LocalTime hora;
    private double nota;
    @Enumerated(EnumType.STRING)
    private StatusAvaliacao status;

    public Avaliacao(long id, Usuario avaliador, Candidato candidato, Vaga vaga, LocalDate data, LocalTime hora, double nota, StatusAvaliacao status) {
        this.id = id;
        this.avaliador = avaliador;
        this.candidato = candidato;
        this.vaga = vaga;
        this.data = data;
        this.hora = hora;
        this.nota = nota;
        this.status = status;
    }

    public Avaliacao(Usuario avaliador, Candidato candidato, Vaga vaga, LocalDate data, LocalTime hora, double nota, StatusAvaliacao status) {
        this.avaliador = avaliador;
        this.candidato = candidato;
        this.vaga = vaga;
        this.data = data;
        this.hora = hora;
        this.nota = nota;
        this.status = status;
    }

    public Avaliacao() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Usuario avaliador) {
        this.avaliador = avaliador;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public StatusAvaliacao getStatus() {
        return status;
    }

    public void setStatus(StatusAvaliacao status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Avaliacao other = (Avaliacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Avaliacao o) {
        return this.getData().compareTo(o.getData());
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "id=" + id + ", avaliador=" + avaliador + ", candidato=" + candidato + ", vaga=" + vaga + ", data=" + data + ", hora=" + hora + ", nota=" + nota + ", status=" + status + '}';
    }

}
