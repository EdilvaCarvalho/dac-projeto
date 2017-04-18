
package br.edu.ifpb.dac.projeto.shared.services.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Vaga;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface VagaService {
    
    void novaVaga(Vaga vaga);
    void editarVaga(Vaga vaga);
    void removerVaga(Vaga vaga);
    List<Vaga> listarVagas();
    Vaga getVaga(long id);
}
