package br.com.udemyjava.gestao.notavel.mvp;

import br.com.udemyjava.gestao.notavel.mvp.dao.ResponsavelDAO;
import br.com.udemyjava.gestao.notavel.mvp.model.Responsavel;

/**
 *
 * @author carol
 */
public class MainTeste {


    public static void main(String[] args) {

        Responsavel r1 = new Responsavel("Carol", "testecpf", "testetelefone");
        ResponsavelDAO responsavelDao = new ResponsavelDAO();
            
        responsavelDao.salvar(r1);
        
    }
}
