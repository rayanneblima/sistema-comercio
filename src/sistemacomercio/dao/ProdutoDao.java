/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacomercio.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import sistemacomercio.model.Produto;

/**
 *
 * @author vhviv
 */
public class ProdutoDao extends Dao<Produto> {
        @Override
        public CompletableFuture<Produto> get() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CompletableFuture<List<Produto>> getAll() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CompletableFuture insert(Produto model) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CompletableFuture remove(Produto model) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CompletableFuture<Boolean> validate() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}
