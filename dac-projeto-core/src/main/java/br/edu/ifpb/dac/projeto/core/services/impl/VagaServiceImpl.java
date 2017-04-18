
package br.edu.ifpb.dac.projeto.core.services.impl;

import br.edu.ifpb.dac.projeto.shared.entidades.Vaga;
import br.edu.ifpb.dac.projeto.shared.services.interfaces.VagaService;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Edilva
 */
@Stateless
@Remote(VagaService.class)
public class VagaServiceImpl implements VagaService{

    @Override
    public void novaVaga(Vaga vaga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarVaga(Vaga vaga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerVaga(Vaga vaga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vaga> listarVagas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vaga getVaga(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
