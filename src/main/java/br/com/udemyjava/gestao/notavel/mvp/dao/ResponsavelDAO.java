
package br.com.udemyjava.gestao.notavel.mvp.dao;

import br.com.udemyjava.gestao.notavel.mvp.model.Responsavel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author carol
 */
public class ResponsavelDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.udemyjava_gestao-notavel-mvp_jar_1.0-SNAPSHOTPU");
    
    public void salvar(Responsavel responsavel){
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(responsavel);
            em.getTransaction().commit();
        }
    }
    
}
