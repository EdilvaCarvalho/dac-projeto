
package br.edu.ifpb.dac.projeto.core.dao.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface UsuarioDAO {
    
    public void salvar(Usuario usuario);
    public void deletar(long id);
    public void editar(Usuario usuario);
    public List<Usuario> listar();
    public Usuario getUsuario(long id);
    public Usuario autenticar(String email, String senha);
}
