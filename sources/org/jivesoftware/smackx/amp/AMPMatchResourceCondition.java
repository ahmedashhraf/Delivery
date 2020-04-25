package org.jivesoftware.smackx.amp;

import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Condition;

public class AMPMatchResourceCondition implements Condition {
    public static final String NAME = "match-resource";
    private final Value value;

    public enum Value {
        any,
        exact,
        other
    }

    public AMPMatchResourceCondition(Value value2) {
        if (value2 != null) {
            this.value = value2;
            return;
        }
        throw new NullPointerException("Can't create AMPMatchResourceCondition with null value");
    }

    public static boolean isSupported(XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return AMPManager.isConditionSupported(xMPPConnection, NAME);
    }

    public String getName() {
        return NAME;
    }

    public String getValue() {
        return this.value.toString();
    }
}
