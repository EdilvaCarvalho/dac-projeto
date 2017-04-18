
package br.edu.ifpb.dac.projeto.web.producers;

import br.edu.ifpb.dac.projeto.shared.services.interfaces.UsuarioService;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Edilva
 */
@ApplicationScoped
public class UsuarioServiceProducer {
    
    private final String resource = "java:global/dac-projeto-core/UsuarioServiceImpl!br.edu.ifpb.dac.projeto.shared.services.interfaces.UsuarioService";
    
    @Default
    @Dependent
    @Produces
    public UsuarioService getUsuarioService() {
        return new ServiceLocator().lookup(resource, UsuarioService.class);
    }
}
