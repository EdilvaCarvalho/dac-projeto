
package br.edu.ifpb.dac.projeto.core.dao.impl;

import br.edu.ifpb.dac.projeto.core.dao.interfaces.CandidatoDAO;
import br.edu.ifpb.dac.projeto.shared.entidades.Candidato;
import br.edu.ifpb.dac.projeto.shared.entidades.Vaga;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Edilva
 */
@Stateless
@Local(CandidatoDAO.class)
public class CandidatoDAOJpaImpl implements CandidatoDAO{
    
    @PersistenceContext(unitName = "projeto-dacPU")
    private EntityManager entityManager;

    @Override
    public void salvar(Candidato candidato) {
        entityManager.persist(candidato);
    }

    @Override
    public void deletar(long id) {
        Candidato c = entityManager.find(Candidato.class, id);
        entityManager.remove(c.getId());
    }

    @Override
    public void editar(Candidato candidato) {
        Candidato c = entityManager.find(Candidato.class, candidato.getId());
        c.setUsuario(candidato.getUsuario());
        c.setEndereco(candidato.getEndereco());
        c.setCurriculo(candidato.getCurriculo());
        c.setPreferencia(candidato.getPreferencia());
        c.setGithub(candidato.getGithub());
        c.setLinkedin(candidato.getLinkedin());
    }

    @Override
    public List<Candidato> listar() {
        TypedQuery<Candidato> query = entityManager
                .createQuery("SELECT c FROM Candidato c", Candidato.class);
        return query.getResultList();
    }

    @Override
    public Candidato getCandidato(long id) {
        Candidato c = entityManager.find(Candidato.class, id);
        return c;
    }

    @Override
    public Candidato autenticar(String email, String senha) {
        Query q = entityManager.createQuery("SELECT c FROM Candidato c WHERE"
                + " c.usuario.email = :email AND c.usuario.senha = :senha");
        q.setParameter("email", email);
        q.setParameter("senha", senha);
        Candidato c = (Candidato) q.getSingleResult();
        return c;
    }

    @Override
    public List<Candidato> candidatosPorVaga(Vaga vaga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
