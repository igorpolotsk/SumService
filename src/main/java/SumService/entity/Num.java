package SumService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "number")
public class Num extends SumService.entity.Entity {

    @Column(nullable = false, name = "name")
    private String name;

    @Column(name = "value")
    private Integer value;

    public Num() {}

    public Num(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}