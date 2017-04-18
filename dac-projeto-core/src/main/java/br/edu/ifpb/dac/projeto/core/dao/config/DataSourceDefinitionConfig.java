
package br.edu.ifpb.dac.projeto.core.dao.config;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;

/**
 *
 * @author Edilva
 */
@DataSourceDefinition(
        name = "java:app/projetoDac",
        className = "org.postgresql.Driver",
        url = "jdbc:postgresql://localhost:5432/projeto-dac",
        user = "postgres",
        password = "postgres"
)
@Stateless
public class DataSourceDefinitionConfig {
    
}
