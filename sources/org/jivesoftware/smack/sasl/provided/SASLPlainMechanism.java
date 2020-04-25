package org.jivesoftware.smack.sasl.provided;

import javax.security.auth.callback.CallbackHandler;
import org.apache.http.C15470v;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.ByteUtils;

public class SASLPlainMechanism extends SASLMechanism {
    public static final String NAME = "PLAIN";

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
        byte[] bytes = SASLMechanism.toBytes(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(0);
        sb2.append(this.password);
        return ByteUtils.concact(bytes, SASLMechanism.toBytes(sb2.toString()));
    }

    public String getName() {
        return "PLAIN";
    }

    public int getPriority() {
        return C15470v.f44640C;
    }

    public SASLPlainMechanism newInstance() {
        return new SASLPlainMechanism();
    }
}
