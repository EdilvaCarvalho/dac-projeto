
package br.edu.ifpb.dac.projeto.core.services.impl;

import br.edu.ifpb.dac.projeto.core.dao.interfaces.CandidatoDAO;
import br.edu.ifpb.dac.projeto.shared.entidades.Candidato;
import br.edu.ifpb.dac.projeto.shared.entidades.Vaga;
import br.edu.ifpb.dac.projeto.shared.services.interfaces.CandidatoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Edilva
 */
@Stateless
@Remote(CandidatoService.class)
public class CandidatoServiceImpl implements CandidatoService{
    
    @EJB
    private CandidatoDAO candidatoDAO;

    @Override
    public void novoCandidato(Candidato candidato) {
        candidatoDAO.salvar(candidato);
    }

    @Override
    public void editarCandidato(Candidato candidato) {
        candidatoDAO.editar(candidato);
    }

    @Override
    public void removerCandidato(Candidato candidato) {
        candidatoDAO.deletar(candidato.getId());
    }

    @Override
    public List<Candidato> getCandidatos() {
        return candidatoDAO.listar();
    }

    @Override
    public Candidato autenticar(String email, String senha) {
        return candidatoDAO.autenticar(email, senha);
    }

    @Override
    public List<Candidato> candidatosPorVaga(Vaga vaga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
