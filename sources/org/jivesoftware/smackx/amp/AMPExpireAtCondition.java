package org.jivesoftware.smackx.amp;

import java.util.Date;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smackx.amp.packet.AMPExtension.Condition;
import p205i.p486d.p487a.C14051a;

public class AMPExpireAtCondition implements Condition {
    public static final String NAME = "expire-at";
    private final String value;

    public AMPExpireAtCondition(Date date) {
        if (date != null) {
            this.value = C14051a.m60622a(date);
            return;
        }
        throw new NullPointerException("Can't create AMPExpireAtCondition with null value");
    }

    public static boolean isSupported(XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return AMPManager.isConditionSupported(xMPPConnection, NAME);
    }

    public String getName() {
        return NAME;
    }

    public String getValue() {
        return this.value;
    }

    public AMPExpireAtCondition(String str) {
        if (str != null) {
            this.value = str;
            return;
        }
        throw new NullPointerException("Can't create AMPExpireAtCondition with null value");
    }
}
