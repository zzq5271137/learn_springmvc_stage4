package com.mycomp.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Goods {

    private String name;
    private Double price;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
