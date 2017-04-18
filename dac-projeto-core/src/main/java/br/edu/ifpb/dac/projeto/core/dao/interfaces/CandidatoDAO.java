
package br.edu.ifpb.dac.projeto.core.dao.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Candidato;
import br.edu.ifpb.dac.projeto.shared.entidades.Vaga;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface CandidatoDAO {
    
    public void salvar(Candidato candidato);
    public void deletar(long id);
    public void editar(Candidato candidato);
    public List<Candidato> listar();
    public Candidato getCandidato(long id);
    public Candidato autenticar(String email, String senha);
    public List<Candidato> candidatosPorVaga(Vaga vaga);
}
