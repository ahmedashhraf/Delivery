package org.jivesoftware.smack.sasl.provided;

import javax.security.auth.callback.CallbackHandler;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.StringUtils;
import p205i.p486d.p487a.C14055b;

public class SASLExternalMechanism extends SASLMechanism {
    public static final String NAME = "EXTERNAL";

    /* access modifiers changed from: protected */
    public void authenticateInternal(CallbackHandler callbackHandler) throws SmackException {
    }

    public void checkIfSuccessfulOrThrow() throws SmackException {
    }

    /* access modifiers changed from: protected */
    public byte[] getAuthenticationText() throws SmackException {
        if (StringUtils.isNullOrEmpty(this.authenticationId)) {
            return null;
        }
        return SASLMechanism.toBytes(C14055b.m60639a(this.authenticationId, this.serviceName));
    }

    public String getName() {
        return "EXTERNAL";
    }

    public int getPriority() {
        return 510;
    }

    /* access modifiers changed from: protected */
    public SASLMechanism newInstance() {
        return new SASLExternalMechanism();
    }
}
