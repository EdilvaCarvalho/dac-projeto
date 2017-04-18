
package br.edu.ifpb.dac.projeto.shared.services.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Candidato;
import br.edu.ifpb.dac.projeto.shared.entidades.Vaga;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface CandidatoService {
    
    void novoCandidato(Candidato candidato);
    void editarCandidato(Candidato candidato);
    void removerCandidato(Candidato candidato);
    List<Candidato> getCandidatos();
    Candidato autenticar(String email, String senha);
    List<Candidato> candidatosPorVaga(Vaga vaga);
}
