package practic_4.sample;

import lombok.Data;

/**
 * Created by SergLion on 03.02.2017.
 */
@Data
public class Pepe {
    private String name;
    private int age;

    public Pepe(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
