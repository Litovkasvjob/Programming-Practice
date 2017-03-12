package practic_3.storage;

import practic_3.model.Human;

/**
 * Created by SergLion on 29/01/2017.
 */
public class App {
    public static void main(String[] args) {
        GenericStorageImpl<Long, Human> humanGenericStorage = new GenericStorageImpl<>();
        //humanGenericStorage.add(new Human("ggg", 23));

        System.out.println(humanGenericStorage.get(new Long(0)));
    }
}
