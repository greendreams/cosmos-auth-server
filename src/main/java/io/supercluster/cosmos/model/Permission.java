package io.supercluster.cosmos.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "PERMISSION")
public class Permission extends BaseIdEntity{

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
