
package br.edu.ifpb.dac.projeto.shared.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Edilva
 */
@Embeddable
public class Endereco implements Serializable{
    
    @Column(name = "estado", length = 20, nullable = false)
    private String estado;
    @Column(name = "cidade", length = 50, nullable = false)
    private String cidade;
    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;
    @Column(name = "rua", length = 50, nullable = false)
    private String rua;
    @Column(name = "numero", length = 5, nullable = false)
    private String numero;

    public Endereco(String estado, String cidade, String bairro, String rua, String numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "estado=" + estado + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + '}';
    }
    
}
