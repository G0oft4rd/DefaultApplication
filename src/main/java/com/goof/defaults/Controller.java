package com.goof.defaults;

/**
 * A simple generic Controller for a specific Service type
 *
 * @param <S> The service type
 */
public abstract class Controller<S extends Service> {
    private final S service;

    public Controller(S service) {
        this.service = service;
    }
}
