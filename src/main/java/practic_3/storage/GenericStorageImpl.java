package practic_3.storage;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by SergLion on 27.01.2017.
 */
public class GenericStorageImpl<K extends Long, V> implements GenericStorage<K, V> {


    private K id = (K) new Long(0);
    private List<Node<K, V>> nodeList = new ArrayList<>();


    @Data
    private class Node <K,V> {


        public Node(K id, V value) {
            setId(id);
            setValue(value);
        }

        K id;
        V value;
    }





    @Override
    public K add(V value) {
        nodeList.add(new Node<>(id, value));
        id = (K) Long.valueOf(id.longValue() + 1);
        return id;
    }

    @Override
    public V get(K id) {
        for (Node<K, V> kvNode : nodeList) {
            if (kvNode.getId().equals(id)) {
                return kvNode.getValue();
            }
        }
        return null;
    }

    @Override
    public V delete(K id) {
        V value = null;
        for (int i = 0; i < nodeList.size(); i++) {
            if (nodeList.get(i).getId().equals(id)) {
                value = nodeList.get(i).getValue();
                nodeList.remove(i);
            }
        }
        return value;
    }

    @Override
    public boolean upDate(K id, V value) {
        return false;
    }
}
