
package br.edu.ifpb.dac.projeto.core.dao.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Vaga;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface VagaDAO {
    
    public void salvar(Vaga vaga);
    public void deletar(long id);
    public void editar(Vaga vaga);
    public List<Vaga> listar();
    public Vaga getVaga(long id);
}
