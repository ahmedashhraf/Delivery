package org.jivesoftware.smack.sasl.provided;

import javax.security.auth.callback.CallbackHandler;
import kotlin.p217i1.C14662d0;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.ByteUtils;
import org.jivesoftware.smack.util.MD5;
import org.jivesoftware.smack.util.StringUtils;

public class SASLDigestMD5Mechanism extends SASLMechanism {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String INITAL_NONCE = "00000001";
    public static final String NAME = "DIGEST-MD5";
    private static final String QOP_VALUE = "auth";
    private static boolean verifyServerResponse = true;
    private String cnonce;
    private String digestUri;
    private String hex_hashed_a1;
    private String nonce;
    private State state = State.INITIAL;

    /* renamed from: org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism$1 */
    static /* synthetic */ class C156291 {

        /* renamed from: $SwitchMap$org$jivesoftware$smack$sasl$provided$SASLDigestMD5Mechanism$State */
        static final /* synthetic */ int[] f44989xa1fe489b = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism$State[] r0 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44989xa1fe489b = r0
                int[] r0 = f44989xa1fe489b     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism$State r1 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.INITIAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44989xa1fe489b     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism$State r1 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.RESPONSE_SENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.C156291.<clinit>():void");
        }
    }

    private enum DigestType {
        ClientResponse,
        ServerResponse
    }

    private enum State {
        INITIAL,
        RESPONSE_SENT,
        VALID_SERVER_RESPONSE
    }

    static {
        Class<SASLDigestMD5Mechanism> cls = SASLDigestMD5Mechanism.class;
    }

    private String calcResponse(DigestType digestType) {
        StringBuilder sb = new StringBuilder();
        if (digestType == DigestType.ClientResponse) {
            sb.append("AUTHENTICATE");
        }
        sb.append(':');
        sb.append(this.digestUri);
        String encodeHex = StringUtils.encodeHex(MD5.bytes(sb.toString()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.hex_hashed_a1);
        sb2.append(':');
        sb2.append(this.nonce);
        sb2.append(':');
        sb2.append(INITAL_NONCE);
        sb2.append(':');
        sb2.append(this.cnonce);
        sb2.append(':');
        sb2.append("auth");
        sb2.append(':');
        sb2.append(encodeHex);
        return StringUtils.encodeHex(MD5.bytes(sb2.toString()));
    }

    public static String quoteBackslash(String str) {
        return str.replace("\\", "\\\\");
    }

    public static void setVerifyServerResponse(boolean z) {
        verifyServerResponse = z;
    }

    /* access modifiers changed from: protected */
    public void authenticateInternal(CallbackHandler callbackHandler) throws SmackException {
        throw new UnsupportedOperationException("CallbackHandler not (yet) supported");
    }

    public void checkIfSuccessfulOrThrow() throws SmackException {
        if (verifyServerResponse && this.state != State.VALID_SERVER_RESPONSE) {
            throw new SmackException("DIGEST-MD5 no valid server response");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] evaluateChallenge(byte[] bArr) throws SmackException {
        String str;
        if (bArr.length != 0) {
            String[] split = new String(bArr).split(",");
            int i = C156291.f44989xa1fe489b[this.state.ordinal()];
            String str2 = "=";
            if (i == 1) {
                for (String split2 : split) {
                    String[] split3 = split2.split(str2);
                    String str3 = "";
                    String replaceFirst = split3[0].replaceFirst("^\\s+", str3);
                    String str4 = split3[1];
                    String str5 = "\"";
                    if ("nonce".equals(replaceFirst)) {
                        if (this.nonce == null) {
                            this.nonce = str4.replace(str5, str3);
                        } else {
                            throw new SmackException("Nonce value present multiple times");
                        }
                    } else if ("qop".equals(replaceFirst)) {
                        String replace = str4.replace(str5, str3);
                        if (!replace.equals("auth")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unsupported qop operation: ");
                            sb.append(replace);
                            throw new SmackException(sb.toString());
                        }
                    } else {
                        continue;
                    }
                }
                if (this.nonce != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.authenticationId);
                    sb2.append(':');
                    sb2.append(this.serviceName);
                    sb2.append(':');
                    sb2.append(this.password);
                    byte[] bytes = MD5.bytes(sb2.toString());
                    this.cnonce = StringUtils.randomString(32);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(':');
                    sb3.append(this.nonce);
                    sb3.append(':');
                    sb3.append(this.cnonce);
                    byte[] concact = ByteUtils.concact(bytes, SASLMechanism.toBytes(sb3.toString()));
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("xmpp/");
                    sb4.append(this.serviceName);
                    this.digestUri = sb4.toString();
                    this.hex_hashed_a1 = StringUtils.encodeHex(MD5.bytes(concact));
                    String calcResponse = calcResponse(DigestType.ClientResponse);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("username=\"");
                    sb5.append(quoteBackslash(this.authenticationId));
                    sb5.append(C14662d0.f42850a);
                    sb5.append(",realm=\"");
                    sb5.append(this.serviceName);
                    sb5.append(C14662d0.f42850a);
                    sb5.append(",nonce=\"");
                    sb5.append(this.nonce);
                    sb5.append(C14662d0.f42850a);
                    sb5.append(",cnonce=\"");
                    sb5.append(this.cnonce);
                    sb5.append(C14662d0.f42850a);
                    sb5.append(",nc=");
                    sb5.append(INITAL_NONCE);
                    sb5.append(",qop=auth");
                    sb5.append(",digest-uri=\"");
                    sb5.append(this.digestUri);
                    sb5.append(C14662d0.f42850a);
                    sb5.append(",response=");
                    sb5.append(calcResponse);
                    sb5.append(",charset=utf-8");
                    byte[] bytes2 = SASLMechanism.toBytes(sb5.toString());
                    this.state = State.RESPONSE_SENT;
                    return bytes2;
                }
                throw new SmackException("nonce value not present in initial challenge");
            } else if (i == 2) {
                if (verifyServerResponse) {
                    int length = split.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            str = null;
                            break;
                        }
                        String[] split4 = split[i2].split(str2);
                        String str6 = split4[0];
                        str = split4[1];
                        if ("rspauth".equals(str6)) {
                            break;
                        }
                        i2++;
                    }
                    if (str == null) {
                        throw new SmackException("No server response received while performing DIGEST-MD5 authentication");
                    } else if (!str.equals(calcResponse(DigestType.ServerResponse))) {
                        throw new SmackException("Invalid server response  while performing DIGEST-MD5 authentication");
                    }
                }
                this.state = State.VALID_SERVER_RESPONSE;
                return null;
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new SmackException("Initial challenge has zero length");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] getAuthenticationText() throws SmackException {
        return null;
    }

    public String getName() {
        return "DIGEST-MD5";
    }

    public int getPriority() {
        return JpegConst.RST2;
    }

    public SASLDigestMD5Mechanism newInstance() {
        return new SASLDigestMD5Mechanism();
    }
}
