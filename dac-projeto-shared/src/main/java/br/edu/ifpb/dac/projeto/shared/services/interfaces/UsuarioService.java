
package br.edu.ifpb.dac.projeto.shared.services.interfaces;

import br.edu.ifpb.dac.projeto.shared.entidades.Usuario;
import java.util.List;

/**
 *
 * @author Edilva
 */
public interface UsuarioService {
    
    void novoUsuario(Usuario usuario);
    void editarUsuario(Usuario usuario);
    void removerUsuario(Usuario usuario);
    List<Usuario> getUsuarios();
    Usuario autenticar(String email, String senha);
}
