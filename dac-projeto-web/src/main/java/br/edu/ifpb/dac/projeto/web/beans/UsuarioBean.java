
package br.edu.ifpb.dac.projeto.web.beans;

import br.edu.ifpb.dac.projeto.shared.entidades.Usuario;
import br.edu.ifpb.dac.projeto.shared.services.interfaces.UsuarioService;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Edilva
 */
@Named
@SessionScoped
public class UsuarioBean implements Serializable{
    
    @Inject
    private UsuarioService usuarioService;
    private Usuario usuario = new Usuario();
    private String email;
    private String senha;
    
    public List<Usuario> listar(){
        return usuarioService.getUsuarios();
    }
    
    public Usuario autenticar(){
        return usuarioService.autenticar(this.email, this.senha);
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        
}
