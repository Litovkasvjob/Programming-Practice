package practic_7.dao.api;

import practic_7.model.Entity;

import java.util.List;

/**
 * Created by SergLion on 21.02.2017.
 */
public interface Dao<K, T extends Entity<K>> {

    List<T> getAll();

    T getById(K key);

    void save(T entity);

    void delete(K key);

    void update(T entity);
}
