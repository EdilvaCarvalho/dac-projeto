
package br.edu.ifpb.dac.projeto.shared.services.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Avaliacao;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface AvaliacaoService {
    
    void novaAvaliacao(Avaliacao avaliacao);
    void editarAvaliacao(Avaliacao avaliacao);
    void removerAvaliacao(Avaliacao avaliacao);
    List<Avaliacao> listarAvaliacoes();
    List<Avaliacao> listarAvaliacaoAvaliador(long id);
    List<Avaliacao> listarAvaliacaoCandidato(long id);
    List<Avaliacao> listarAvaliacaoVaga(long id);
    Avaliacao getAvaliacao(long id);
}
