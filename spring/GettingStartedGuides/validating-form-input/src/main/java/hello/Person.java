package hello;

/**
 * Created by junjaytan on 11/11/15.
 */

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

    // allow names between 2 and 30 chars long
    @Size(min=2, max=30)
    private String name;

    @NotNull // don't allow a null value
    @Min(18) // won't allow age < 18
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
