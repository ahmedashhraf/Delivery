package org.jivesoftware.smack.sasl;

import javax.security.auth.callback.CallbackHandler;
import org.jivesoftware.smack.SmackException;

public class SASLAnonymous extends SASLMechanism {
    public static final String NAME = "ANONYMOUS";

    /* access modifiers changed from: protected */
    public void authenticateInternal(CallbackHandler callbackHandler) throws SmackException {
    }

    public void checkIfSuccessfulOrThrow() throws SmackException {
    }

    /* access modifiers changed from: protected */
    public byte[] getAuthenticationText() throws SmackException {
        return null;
    }

    public String getName() {
        return NAME;
    }

    public int getPriority() {
        return 500;
    }

    public SASLAnonymous newInstance() {
        return new SASLAnonymous();
    }
}
