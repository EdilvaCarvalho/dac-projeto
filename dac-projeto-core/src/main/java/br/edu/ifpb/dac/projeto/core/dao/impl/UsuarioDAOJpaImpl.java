
package br.edu.ifpb.dac.projeto.core.dao.impl;

import br.edu.ifpb.dac.projeto.core.dao.interfaces.UsuarioDAO;
import br.edu.ifpb.dac.projeto.shared.entidades.Usuario;
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
@Local(UsuarioDAO.class)
public class UsuarioDAOJpaImpl implements UsuarioDAO{
    
    @PersistenceContext(unitName = "projeto-dacPU")
    private EntityManager entityManager;

    @Override
    public void salvar(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public void deletar(long id) {
        Usuario u = entityManager.find(Usuario.class, id);
        entityManager.remove(u.getId());
    }

    @Override
    public void editar(Usuario usuario) {
        Usuario u = entityManager.find(Usuario.class, usuario.getId());
        u.setNome(usuario.getNome());
        u.setEmail(usuario.getEmail());
        u.setSenha(usuario.getSenha());
        u.setTelefone(usuario.getTelefone());
        u.setTipo(usuario.getTipo());
        u.setAcesso(usuario.getAcesso());
        u.setDataNasc(usuario.getDataNasc());
    }

    @Override
    public List<Usuario> listar() {
        TypedQuery<Usuario> query = entityManager
                .createQuery("SELECT u FROM Usuario u", Usuario.class);
        return query.getResultList();
    }

    @Override
    public Usuario getUsuario(long id) {
        Usuario u = entityManager.find(Usuario.class, id);
        return u;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        Query q = entityManager.createQuery("SELECT u FROM Usuario u WHERE"
                + " u.email = :email AND u.senha = :senha");
        q.setParameter("email", email);
        q.setParameter("senha", senha);
        Usuario u = (Usuario) q.getSingleResult();
        return u;
    }
    
}
