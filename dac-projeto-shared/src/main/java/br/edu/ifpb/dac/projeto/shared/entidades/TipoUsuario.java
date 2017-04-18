
package br.edu.ifpb.dac.projeto.shared.entidades;

/**
 *
 * @author Edilva
 */
public enum TipoUsuario {
    
    GERENTE("Gestor"), 
    AVALIADOR("Avaliador"), 
    CANDIDATO("Candidato");
    
    private final String descricao;

    private TipoUsuario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
