package com.adenki.smpp.message.param;


/**
 * Abstract base descriptor which all SMPPAPI parameter descriptors
 * extend from.
 * @version $Id: AbstractDescriptor.java 452 2009-01-15 16:56:36Z orank $
 * @since 0.4.0
 */
public abstract class AbstractDescriptor implements ParamDescriptor {
    private static final long serialVersionUID = 2L;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        return getClass().isAssignableFrom(obj.getClass());
    }

    @Override
    public int hashCode() {
        return getClass().getName().hashCode();
    }
}
