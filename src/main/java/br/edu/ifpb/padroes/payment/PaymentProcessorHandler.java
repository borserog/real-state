package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public interface PaymentProcessorHandler {

    public abstract void process(Property property);
    public abstract void setNext(PaymentProcessorHandler next);

}
