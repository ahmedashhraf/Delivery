package org.jivesoftware.smack.sasl.core;

import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.security.auth.callback.CallbackHandler;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.ByteUtils;
import org.jivesoftware.smack.util.MAC;
import org.jivesoftware.smack.util.SHA1;
import org.jivesoftware.smack.util.stringencoder.Base64;
import p205i.p486d.p487a.p488c.C14056a;
import p205i.p486d.p487a.p488c.C14060c;

public class SCRAMSHA1Mechanism extends SASLMechanism {
    private static final C14056a<String, Keys> CACHE = new C14060c(10);
    private static final byte[] CLIENT_KEY_BYTES = SASLMechanism.toBytes("Client Key");
    private static final String DEFAULT_GS2_HEADER = "n,,";
    public static final String NAME = "SCRAM-SHA-1";
    private static final byte[] ONE = {0, 0, 0, 1};
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int RANDOM_ASCII_BYTE_COUNT = 32;
    private static final byte[] SERVER_KEY_BYTES = SASLMechanism.toBytes("Server Key");
    private String clientFirstMessageBare;
    private String clientRandomAscii;
    private byte[] serverSignature;
    private State state = State.INITIAL;

    /* renamed from: org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism$1 */
    static /* synthetic */ class C156281 {

        /* renamed from: $SwitchMap$org$jivesoftware$smack$sasl$core$SCRAMSHA1Mechanism$State */
        static final /* synthetic */ int[] f44988x569b47df = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism$State[] r0 = org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44988x569b47df = r0
                int[] r0 = f44988x569b47df     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism$State r1 = org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism.State.AUTH_TEXT_SENT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44988x569b47df     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism$State r1 = org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism.State.RESPONSE_SENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.sasl.core.SCRAMSHA1Mechanism.C156281.<clinit>():void");
        }
    }

    private static class Keys {
        /* access modifiers changed from: private */
        public final byte[] clientKey;
        /* access modifiers changed from: private */
        public final byte[] serverKey;

        public Keys(byte[] bArr, byte[] bArr2) {
            this.clientKey = bArr;
            this.serverKey = bArr2;
        }
    }

    private enum State {
        INITIAL,
        AUTH_TEXT_SENT,
        RESPONSE_SENT,
        VALID_SERVER_RESPONSE
    }

    private static String escape(String str) {
        double length = (double) str.length();
        Double.isNaN(length);
        StringBuilder sb = new StringBuilder((int) (length * 1.1d));
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == ',') {
                sb.append("=2C");
            } else if (charAt != '=') {
                sb.append(charAt);
            } else {
                sb.append("=3D");
            }
        }
        return sb.toString();
    }

    /* renamed from: hi */
    private static byte[] m68709hi(String str, byte[] bArr, int i) throws SmackException {
        byte[] bytes = str.getBytes();
        byte[] hmac = hmac(bytes, ByteUtils.concact(bArr, ONE));
        byte[] bArr2 = (byte[]) hmac.clone();
        for (int i2 = 1; i2 < i; i2++) {
            hmac = hmac(bytes, hmac);
            for (int i3 = 0; i3 < hmac.length; i3++) {
                bArr2[i3] = (byte) (bArr2[i3] ^ hmac[i3]);
            }
        }
        return bArr2;
    }

    private static byte[] hmac(byte[] bArr, byte[] bArr2) throws SmackException {
        try {
            return MAC.hmacsha1(bArr, bArr2);
        } catch (InvalidKeyException e) {
            throw new SmackException("SCRAM-SHA-1 HMAC-SHA1 Exception", e);
        }
    }

    private static boolean isPrintableNonCommaAsciiChar(char c) {
        boolean z = false;
        if (c == ',') {
            return false;
        }
        if (c >= ' ' && c < 127) {
            z = true;
        }
        return z;
    }

    private static Map<Character, String> parseAttributes(String str) throws SmackException {
        if (str.length() == 0) {
            return Collections.emptyMap();
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap(split.length, 1.0f);
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str2 = split[i];
            String str3 = "Invalid Key-Value pair: ";
            if (str2.length() >= 3) {
                char charAt = str2.charAt(0);
                if (str2.charAt(1) == '=') {
                    hashMap.put(Character.valueOf(charAt), str2.substring(2));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str2);
                    throw new SmackException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str2);
                throw new SmackException(sb2.toString());
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void authenticateInternal(CallbackHandler callbackHandler) throws SmackException {
        throw new UnsupportedOperationException("CallbackHandler not (yet) supported");
    }

    public void checkIfSuccessfulOrThrow() throws SmackException {
        if (this.state != State.VALID_SERVER_RESPONSE) {
            throw new SmackException("SCRAM-SHA1 is missing valid server response");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] evaluateChallenge(byte[] bArr) throws SmackException {
        byte[] bArr2;
        byte[] bArr3;
        String str = new String(bArr);
        int i = C156281.f44988x569b47df[this.state.ordinal()];
        if (i == 1) {
            Map parseAttributes = parseAttributes(str);
            String str2 = (String) parseAttributes.get(Character.valueOf('r'));
            if (str2 == null) {
                throw new SmackException("Server random ASCII is null");
            } else if (str2.length() > this.clientRandomAscii.length()) {
                if (str2.substring(0, this.clientRandomAscii.length()).equals(this.clientRandomAscii)) {
                    String str3 = (String) parseAttributes.get(Character.valueOf('i'));
                    if (str3 != null) {
                        try {
                            int parseInt = Integer.parseInt(str3);
                            String str4 = (String) parseAttributes.get(Character.valueOf('s'));
                            if (str4 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("c=");
                                sb.append(Base64.encode(DEFAULT_GS2_HEADER));
                                sb.append(",r=");
                                sb.append(str2);
                                String sb2 = sb.toString();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.clientFirstMessageBare);
                                sb3.append(',');
                                sb3.append(str);
                                sb3.append(',');
                                sb3.append(sb2);
                                byte[] bytes = SASLMechanism.toBytes(sb3.toString());
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(this.password);
                                sb4.append(',');
                                sb4.append(str4);
                                String sb5 = sb4.toString();
                                Keys keys = (Keys) CACHE.get(sb5);
                                if (keys == null) {
                                    byte[] hi = m68709hi(SASLMechanism.saslPrep(this.password), Base64.decode(str4), parseInt);
                                    bArr3 = hmac(hi, SERVER_KEY_BYTES);
                                    bArr2 = hmac(hi, CLIENT_KEY_BYTES);
                                    CACHE.put(sb5, new Keys(bArr2, bArr3));
                                } else {
                                    bArr3 = keys.serverKey;
                                    bArr2 = keys.clientKey;
                                }
                                this.serverSignature = hmac(bArr3, bytes);
                                byte[] hmac = hmac(SHA1.bytes(bArr2), bytes);
                                byte[] bArr4 = new byte[bArr2.length];
                                for (int i2 = 0; i2 < bArr4.length; i2++) {
                                    bArr4[i2] = (byte) (bArr2[i2] ^ hmac[i2]);
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(sb2);
                                sb6.append(",p=");
                                sb6.append(Base64.encodeToString(bArr4));
                                String sb7 = sb6.toString();
                                this.state = State.RESPONSE_SENT;
                                return SASLMechanism.toBytes(sb7);
                            }
                            throw new SmackException("SALT not send");
                        } catch (NumberFormatException e) {
                            throw new SmackException("Exception parsing iterations", e);
                        }
                    } else {
                        throw new SmackException("Iterations attribute not set");
                    }
                } else {
                    throw new SmackException("Received client random ASCII does not match client random ASCII");
                }
            } else {
                throw new SmackException("Server random ASCII is shorter then client random ASCII");
            }
        } else if (i == 2) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("v=");
            sb8.append(Base64.encodeToString(this.serverSignature));
            if (sb8.toString().equals(str)) {
                this.state = State.VALID_SERVER_RESPONSE;
                return null;
            }
            throw new SmackException("Server final message does not match calculated one");
        } else {
            throw new SmackException("Invalid state");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] getAuthenticationText() throws SmackException {
        this.clientRandomAscii = getRandomAscii();
        String saslPrep = SASLMechanism.saslPrep(this.authenticationId);
        StringBuilder sb = new StringBuilder();
        sb.append("n=");
        sb.append(escape(saslPrep));
        sb.append(",r=");
        sb.append(this.clientRandomAscii);
        this.clientFirstMessageBare = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(DEFAULT_GS2_HEADER);
        sb2.append(this.clientFirstMessageBare);
        String sb3 = sb2.toString();
        this.state = State.AUTH_TEXT_SENT;
        return SASLMechanism.toBytes(sb3);
    }

    public String getName() {
        return NAME;
    }

    public int getPriority() {
        return 110;
    }

    /* access modifiers changed from: 0000 */
    public String getRandomAscii() {
        char[] cArr = new char[32];
        int i = 0;
        while (i < 32) {
            char nextInt = (char) RANDOM.nextInt(128);
            if (isPrintableNonCommaAsciiChar(nextInt)) {
                int i2 = i + 1;
                cArr[i] = nextInt;
                i = i2;
            }
        }
        return new String(cArr);
    }

    public SCRAMSHA1Mechanism newInstance() {
        return new SCRAMSHA1Mechanism();
    }
}
