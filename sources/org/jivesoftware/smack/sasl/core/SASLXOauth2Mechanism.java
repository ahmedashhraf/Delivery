package org.jivesoftware.smack.sasl.core;

import javax.security.auth.callback.CallbackHandler;
import org.apache.http.C15470v;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.stringencoder.Base64;

public class SASLXOauth2Mechanism extends SASLMechanism {
    public static final String NAME = "X-OAUTH2";

    /* access modifiers changed from: protected */
    public void authenticateInternal(CallbackHandler callbackHandler) throws SmackException {
        throw new UnsupportedOperationException("CallbackHandler not (yet) supported");
    }

    public void checkIfSuccessfulOrThrow() throws SmackException {
    }

    /* access modifiers changed from: protected */
    public byte[] getAuthenticationText() throws SmackException {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        sb.append(this.authenticationId);
        sb.append(0);
        sb.append(this.password);
        return Base64.encode(SASLMechanism.toBytes(sb.toString()));
    }

    public String getName() {
        return NAME;
    }

    public int getPriority() {
        return C15470v.f44640C;
    }

    public SASLXOauth2Mechanism newInstance() {
        return new SASLXOauth2Mechanism();
    }
}
