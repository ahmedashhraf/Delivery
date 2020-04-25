package kotlin.p508io;

import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.C14730m;
import kotlin.C14734o;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14443g1;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p214b1.p216u.C14496y0;
import kotlin.p214b1.p216u.C14498z0;
import kotlin.p505f1.C14557l;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0012H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0013H\b\u001a\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0014H\b\u001a\t\u0010\u0015\u001a\u00020\nH\b\u001a\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\rH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0012H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0013H\b\u001a\u0011\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0014H\b\u001a\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u001a\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u001a\u001a\u00020\r*\u00020\u001bH\u0002\u001a\f\u0010\u001c\u001a\u00020\u000f*\u00020\u001bH\u0002\u001a\f\u0010\u001d\u001a\u00020\n*\u00020\u001eH\u0002\u001a$\u0010\u001f\u001a\u00020\r*\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006$"}, mo24990d2 = {"BUFFER_SIZE", "", "LINE_SEPARATOR_MAX_LENGTH", "decoder", "Ljava/nio/charset/CharsetDecoder;", "getDecoder", "()Ljava/nio/charset/CharsetDecoder;", "decoder$delegate", "Lkotlin/Lazy;", "print", "", "message", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "inputStream", "Ljava/io/InputStream;", "containsLineSeparator", "Ljava/nio/CharBuffer;", "dequeue", "flipBack", "Ljava/nio/Buffer;", "tryDecode", "byteBuffer", "Ljava/nio/ByteBuffer;", "charBuffer", "isEndOfStream", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
@C6055e(name = "ConsoleKt")
/* renamed from: kotlin.io.c */
/* compiled from: Console.kt */
public final class C14694c {

    /* renamed from: a */
    static final /* synthetic */ C14557l[] f42928a = {C14443g1.m62436a((C14496y0) new C14498z0(C14443g1.m62442c(C14694c.class, "kotlin-stdlib"), "decoder", "getDecoder()Ljava/nio/charset/CharsetDecoder;"))};

    /* renamed from: b */
    private static final int f42929b = 32;

    /* renamed from: c */
    private static final int f42930c = 2;

    /* renamed from: d */
    private static final C14730m f42931d = C14734o.m63889a((C6069a<? extends T>) C14695a.f42932a);

    /* renamed from: kotlin.io.c$a */
    /* compiled from: Console.kt */
    static final class C14695a extends C14448i0 implements C6069a<CharsetDecoder> {

        /* renamed from: a */
        public static final C14695a f42932a = new C14695a();

        C14695a() {
            super(0);
        }

        /* renamed from: p */
        public final CharsetDecoder m63729p() {
            return Charset.defaultCharset().newDecoder();
        }
    }

    /* renamed from: a */
    private static final CharsetDecoder m63701a() {
        C14730m mVar = f42931d;
        C14557l lVar = f42928a[0];
        return (CharsetDecoder) mVar.getValue();
    }

    @C6041f
    /* renamed from: a */
    private static final void m63708a(Object obj) {
        System.out.print(obj);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63723b(Object obj) {
        System.out.println(obj);
    }

    @C6004e
    /* renamed from: c */
    public static final String m63727c() {
        InputStream inputStream = System.in;
        C14445h0.m62453a((Object) inputStream, "System.`in`");
        return m63700a(inputStream, m63701a());
    }

    @C6041f
    /* renamed from: a */
    private static final void m63706a(int i) {
        System.out.print(i);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63721b(int i) {
        System.out.println(i);
    }

    @C6041f
    /* renamed from: a */
    private static final void m63707a(long j) {
        System.out.print(j);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63722b(long j) {
        System.out.println(j);
    }

    @C6041f
    /* renamed from: a */
    private static final void m63702a(byte b) {
        System.out.print(Byte.valueOf(b));
    }

    @C6041f
    /* renamed from: b */
    private static final void m63717b(byte b) {
        System.out.println(Byte.valueOf(b));
    }

    @C6041f
    /* renamed from: a */
    private static final void m63710a(short s) {
        System.out.print(Short.valueOf(s));
    }

    @C6041f
    /* renamed from: b */
    private static final void m63724b(short s) {
        System.out.println(Short.valueOf(s));
    }

    @C6041f
    /* renamed from: a */
    private static final void m63703a(char c) {
        System.out.print(c);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63718b(char c) {
        System.out.println(c);
    }

    @C6041f
    /* renamed from: a */
    private static final void m63711a(boolean z) {
        System.out.print(z);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63725b(boolean z) {
        System.out.println(z);
    }

    @C6041f
    /* renamed from: a */
    private static final void m63705a(float f) {
        System.out.print(f);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63720b(float f) {
        System.out.println(f);
    }

    @C6041f
    /* renamed from: a */
    private static final void m63704a(double d) {
        System.out.print(d);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63719b(double d) {
        System.out.println(d);
    }

    @C6041f
    /* renamed from: a */
    private static final void m63712a(char[] cArr) {
        System.out.print(cArr);
    }

    @C6041f
    /* renamed from: b */
    private static final void m63726b(char[] cArr) {
        System.out.println(cArr);
    }

    @C6004e
    /* renamed from: a */
    public static final String m63700a(@C6003d InputStream inputStream, @C6003d CharsetDecoder charsetDecoder) {
        C14445h0.m62478f(inputStream, "inputStream");
        C14445h0.m62478f(charsetDecoder, "decoder");
        if (charsetDecoder.maxCharsPerByte() <= ((float) 1)) {
            ByteBuffer allocate = ByteBuffer.allocate(32);
            CharBuffer allocate2 = CharBuffer.allocate(2);
            StringBuilder sb = new StringBuilder();
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            do {
                allocate.put((byte) read);
                C14445h0.m62453a((Object) allocate, "byteBuffer");
                C14445h0.m62453a((Object) allocate2, "charBuffer");
                if (m63714a(charsetDecoder, allocate, allocate2, false)) {
                    if (m63713a(allocate2)) {
                        break;
                    } else if (!allocate2.hasRemaining()) {
                        sb.append(m63715b(allocate2));
                    }
                }
                read = inputStream.read();
            } while (read != -1);
            m63714a(charsetDecoder, allocate, allocate2, true);
            charsetDecoder.reset();
            int position = allocate2.position();
            char c = allocate2.get(0);
            char c2 = allocate2.get(1);
            if (position != 1) {
                if (position == 2) {
                    if (!(c == 13 && c2 == 10)) {
                        sb.append(c);
                    }
                    if (c2 != 10) {
                        sb.append(c2);
                    }
                }
            } else if (c != 10) {
                sb.append(c);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Encodings with multiple chars per byte are not supported".toString());
    }

    @C6041f
    /* renamed from: b */
    private static final void m63716b() {
        System.out.println();
    }

    /* renamed from: b */
    private static final char m63715b(@C6003d CharBuffer charBuffer) {
        charBuffer.flip();
        char c = charBuffer.get();
        charBuffer.compact();
        return c;
    }

    /* renamed from: a */
    private static final boolean m63714a(@C6003d CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, CharBuffer charBuffer, boolean z) {
        int position = charBuffer.position();
        byteBuffer.flip();
        CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
        if (decode.isError()) {
            decode.throwException();
        }
        boolean z2 = charBuffer.position() > position;
        if (z2) {
            byteBuffer.clear();
        } else {
            m63709a((Buffer) byteBuffer);
        }
        return z2;
    }

    /* renamed from: a */
    private static final boolean m63713a(@C6003d CharBuffer charBuffer) {
        return charBuffer.get(1) == 10 || charBuffer.get(0) == 10;
    }

    /* renamed from: a */
    private static final void m63709a(@C6003d Buffer buffer) {
        buffer.position(buffer.limit());
        buffer.limit(buffer.capacity());
    }
}
