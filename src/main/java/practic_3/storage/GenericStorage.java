package practic_3.storage;

/**
 * Created by SergLion on 27.01.2017.
 */
public interface GenericStorage<K, V> {

    K add(V value);

    V get(K id);

    V delete(K id);

    boolean upDate(K id, V value);

}
