package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.*;
import br.edu.ifpb.padroes.payment.PaymentService;

import java.nio.MappedByteBuffer;

public class Main {
    public static void main(String[] args) {

        PropertyContainer propertyContainer = new PropertyContainer();

        Apartment apartment = new Apartment();
        apartment.setAddress("Rua x");
        apartment.setBuilder("Apartamento construtura");
        apartment.setPrice(200000);
        propertyContainer.addProperty(apartment);

        Bungalow bungalow = new Bungalow();
        bungalow.setAddress("Rua y");
        bungalow.setBuilder("Bangalô construtura");
        bungalow.setPrice(150000);
        propertyContainer.addProperty(bungalow);


        Tenement tenement = new Tenement();
        tenement.setAddress("Rua y");
        tenement.setBuilder("Cortiço construtura");
        tenement.setPrice(100000);
        propertyContainer.addProperty(tenement);


        PaymentService paymentService = new PaymentService();

        System.out.println(propertyContainer.getPrice());

        // TODO - reduzir chamadas múltiplas para uma única chamada para o método pay() utilizando o padrão composite
        paymentService.pay(propertyContainer);
    }
}
