package org.jivesoftware.smack.sasl;

import javax.security.auth.callback.CallbackHandler;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.AuthMechanism;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.Response;
import org.jivesoftware.smack.util.StringTransformer;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.Base64;

public abstract class SASLMechanism implements Comparable<SASLMechanism> {
    public static final String CRAMMD5 = "CRAM-MD5";
    public static final String DIGESTMD5 = "DIGEST-MD5";
    public static final String EXTERNAL = "EXTERNAL";
    public static final String GSSAPI = "GSSAPI";
    public static final String PLAIN = "PLAIN";
    private static StringTransformer saslPrepTransformer;
    protected String authenticationId;
    protected XMPPConnection connection;
    protected String host;
    protected String password;
    protected String serviceName;

    protected static String saslPrep(String str) {
        StringTransformer stringTransformer = saslPrepTransformer;
        return stringTransformer != null ? stringTransformer.transform(str) : str;
    }

    public static void setSaslPrepTransformer(StringTransformer stringTransformer) {
        saslPrepTransformer = stringTransformer;
    }

    protected static byte[] toBytes(String str) {
        return StringUtils.toBytes(str);
    }

    public final void authenticate(String str, String str2, String str3, String str4) throws SmackException, NotConnectedException {
        this.authenticationId = str;
        this.host = str2;
        this.serviceName = str3;
        this.password = str4;
        authenticateInternal();
        authenticate();
    }

    /* access modifiers changed from: protected */
    public void authenticateInternal() throws SmackException {
    }

    /* access modifiers changed from: protected */
    public abstract void authenticateInternal(CallbackHandler callbackHandler) throws SmackException;

    public final void challengeReceived(String str, boolean z) throws SmackException, NotConnectedException {
        Response response;
        byte[] evaluateChallenge = evaluateChallenge(Base64.decode(str));
        if (!z) {
            if (evaluateChallenge == null) {
                response = new Response();
            } else {
                response = new Response(Base64.encodeToString(evaluateChallenge));
            }
            this.connection.send(response);
        }
    }

    public abstract void checkIfSuccessfulOrThrow() throws SmackException;

    /* access modifiers changed from: protected */
    public byte[] evaluateChallenge(byte[] bArr) throws SmackException {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] getAuthenticationText() throws SmackException;

    public abstract String getName();

    public abstract int getPriority();

    public SASLMechanism instanceForAuthentication(XMPPConnection xMPPConnection) {
        SASLMechanism newInstance = newInstance();
        newInstance.connection = xMPPConnection;
        return newInstance;
    }

    /* access modifiers changed from: protected */
    public abstract SASLMechanism newInstance();

    public final int compareTo(SASLMechanism sASLMechanism) {
        return getPriority() - sASLMechanism.getPriority();
    }

    public void authenticate(String str, String str2, CallbackHandler callbackHandler) throws SmackException, NotConnectedException {
        this.host = str;
        this.serviceName = str2;
        authenticateInternal(callbackHandler);
        authenticate();
    }

    private final void authenticate() throws SmackException, NotConnectedException {
        byte[] authenticationText = getAuthenticationText();
        this.connection.send(new AuthMechanism(getName(), (authenticationText == null || authenticationText.length <= 0) ? "=" : Base64.encodeToString(authenticationText)));
    }
}
