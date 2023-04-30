package com.goof.defaults;

/**
 * A simple generic Service for a given repository type
 * @param <R> The repository type
 */
public abstract class Service<R extends Repository> {
    private final R repository;

    public Service(R repository) {
        this.repository = repository;
    }
}
