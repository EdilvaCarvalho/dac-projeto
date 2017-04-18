
package br.edu.ifpb.dac.projeto.core.dao.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Avaliacao;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface AvaliacaoDAO {
    
    public void salvar(Avaliacao avaliacao);
    public void deletar(Avaliacao avaliacao);
    public void editar(Avaliacao avaliacao);
    public List<Avaliacao> listar();
    public List<Avaliacao> getAvaliacaoAvaliador(long id);
    public List<Avaliacao> getAvaliacaoCandidato(long id);
    public List<Avaliacao> getAvaliacaoVaga(long id);
    public Avaliacao getAvaliacao(long id);
}
