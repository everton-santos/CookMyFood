package com.everton.cookmyfood.models;

import java.io.Serializable;

public abstract class AbstractModel implements Serializable {

	protected abstract Serializable GetId();
}
