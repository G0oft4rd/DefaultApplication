package com.goof.defaults;

import javax.validation.constraints.NotNull;

/**
 * Abstract generic model
 */
public abstract class Model {
    @NotNull
    protected String id;
}
