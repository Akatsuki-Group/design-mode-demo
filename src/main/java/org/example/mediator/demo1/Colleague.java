package org.example.mediator.demo1;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
