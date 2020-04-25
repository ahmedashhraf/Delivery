package p076c.p284e.p285a.p290n;

import com.pusher.java_websocket.exceptions.InvalidDataException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.apache.http.p549j0.C15430e;
import p212io.fabric.sdk.android.services.network.C14393i;

/* renamed from: c.e.a.n.b */
/* compiled from: Charsetfunctions */
public class C6776b {

    /* renamed from: a */
    public static CodingErrorAction f18861a = CodingErrorAction.REPORT;

    /* renamed from: a */
    public static byte[] m32431a(String str) {
        try {
            return str.getBytes(C15430e.f44596w);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static byte[] m32433b(String str) {
        try {
            return str.getBytes(C14393i.f42526a);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m32428a(byte[] bArr) {
        return m32429a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static String m32432b(byte[] bArr) throws InvalidDataException {
        return m32427a(ByteBuffer.wrap(bArr));
    }

    /* renamed from: a */
    public static String m32429a(byte[] bArr, int i, int i2) {
        try {
            return new String(bArr, i, i2, C15430e.f44596w);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m32427a(ByteBuffer byteBuffer) throws InvalidDataException {
        CharsetDecoder newDecoder = Charset.forName(C14393i.f42526a).newDecoder();
        newDecoder.onMalformedInput(f18861a);
        newDecoder.onUnmappableCharacter(f18861a);
        try {
            byteBuffer.mark();
            String charBuffer = newDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return charBuffer;
        } catch (CharacterCodingException e) {
            throw new InvalidDataException(1007, (Throwable) e);
        }
    }

    /* renamed from: a */
    public static void m32430a(String[] strArr) throws InvalidDataException {
        String str = "\u0000";
        m32432b(m32433b(str));
        m32428a(m32431a(str));
    }
}
