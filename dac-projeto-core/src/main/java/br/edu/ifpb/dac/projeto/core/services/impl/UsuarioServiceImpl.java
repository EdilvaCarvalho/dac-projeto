
package br.edu.ifpb.dac.projeto.core.services.impl;

import br.edu.ifpb.dac.projeto.core.dao.interfaces.UsuarioDAO;
import br.edu.ifpb.dac.projeto.shared.entidades.Usuario;
import br.edu.ifpb.dac.projeto.shared.services.interfaces.UsuarioService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Edilva
 */
@Stateless
@Remote(UsuarioService.class)
public class UsuarioServiceImpl implements UsuarioService{
    
    @EJB
    private UsuarioDAO usuarioDAO;

    public UsuarioServiceImpl() {
    }

    public UsuarioServiceImpl(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public void novoUsuario(Usuario usuario) {
        usuarioDAO.salvar(usuario);
    }

    @Override
    public void editarUsuario(Usuario usuario) {
        usuarioDAO.editar(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        usuarioDAO.deletar(usuario.getId());
    }

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioDAO.listar();
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return usuarioDAO.autenticar(email, senha);
    }
    
}
