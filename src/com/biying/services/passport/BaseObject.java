package com.biying.services.passport;

import org.ksoap2.serialization.*;

public abstract class BaseObject implements KvmSerializable {

    protected static final String NAMESPACE = "http://services.xyz.com/";

    public BaseObject()
    {
        super();
    }

}
