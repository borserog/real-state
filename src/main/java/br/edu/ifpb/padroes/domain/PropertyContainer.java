package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class PropertyContainer implements Property {
    private ArrayList<Property> properties = new ArrayList<>();

    public void addProperty(Property property) {
        properties.add(property);
    }

    public void removeProperty(Property property) {
        properties.remove(property);
    }

    @Override
    public float getPrice() {
        return properties.stream().reduce(0.0f, (acc, property) -> acc + property.getPrice(), Float::sum);
    }
}
