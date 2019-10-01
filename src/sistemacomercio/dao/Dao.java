/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacomercio.dao;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import sistemacomercio.model.Model;

/**
 *
 * @author vhviv
 */
public abstract class Dao<T extends Model> {

        Connection connection = new Connection();

        abstract public CompletableFuture<T> get();

        abstract public CompletableFuture<List<T>> getAll();

        abstract public CompletableFuture insert(T model);

        abstract public CompletableFuture remove(T model);

        abstract public CompletableFuture<Boolean> validate();
}
