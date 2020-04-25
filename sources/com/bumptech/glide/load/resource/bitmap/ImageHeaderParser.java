package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C1007o;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ImageHeaderParser {

    /* renamed from: b */
    private static final String f10470b = "ImageHeaderParser";

    /* renamed from: c */
    private static final int f10471c = 4671814;

    /* renamed from: d */
    private static final int f10472d = -1991225785;

    /* renamed from: e */
    private static final int f10473e = 65496;

    /* renamed from: f */
    private static final int f10474f = 19789;

    /* renamed from: g */
    private static final int f10475g = 18761;

    /* renamed from: h */
    private static final String f10476h = "Exif\u0000\u0000";

    /* renamed from: i */
    private static final byte[] f10477i;

    /* renamed from: j */
    private static final int f10478j = 218;

    /* renamed from: k */
    private static final int f10479k = 217;

    /* renamed from: l */
    private static final int f10480l = 255;

    /* renamed from: m */
    private static final int f10481m = 225;

    /* renamed from: n */
    private static final int f10482n = 274;

    /* renamed from: o */
    private static final int[] f10483o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private final C2959b f10484a;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a */
    private static class C2958a {

        /* renamed from: a */
        private final ByteBuffer f10485a;

        public C2958a(byte[] bArr) {
            this.f10485a = ByteBuffer.wrap(bArr);
            this.f10485a.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public void mo11743a(ByteOrder byteOrder) {
            this.f10485a.order(byteOrder);
        }

        /* renamed from: b */
        public int mo11744b(int i) {
            return this.f10485a.getInt(i);
        }

        /* renamed from: a */
        public int mo11741a() {
            return this.f10485a.array().length;
        }

        /* renamed from: a */
        public short mo11742a(int i) {
            return this.f10485a.getShort(i);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$b */
    private static class C2959b {

        /* renamed from: a */
        private final InputStream f10486a;

        public C2959b(InputStream inputStream) {
            this.f10486a = inputStream;
        }

        /* renamed from: a */
        public long mo11747a(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f10486a.skip(j2);
                if (skip <= 0) {
                    if (this.f10486a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: b */
        public int mo11748b() throws IOException {
            return ((this.f10486a.read() << 8) & C1007o.f4488f) | (this.f10486a.read() & 255);
        }

        /* renamed from: c */
        public short mo11749c() throws IOException {
            return (short) (this.f10486a.read() & 255);
        }

        /* renamed from: a */
        public int mo11746a(byte[] bArr) throws IOException {
            int length = bArr.length;
            while (length > 0) {
                int read = this.f10486a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        /* renamed from: a */
        public int mo11745a() throws IOException {
            return this.f10486a.read();
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = f10476h.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        f10477i = bArr;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.f10484a = new C2959b(inputStream);
    }

    /* renamed from: a */
    private static int m14166a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static boolean m14168a(int i) {
        return (i & f10473e) == f10473e || i == f10474f || i == f10475g;
    }

    /* renamed from: d */
    private byte[] m14169d() throws IOException {
        String str;
        short c;
        int b;
        long j;
        long a;
        do {
            short c2 = this.f10484a.mo11749c();
            str = f10470b;
            if (c2 != 255) {
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c2);
                    sb.toString();
                }
                return null;
            }
            c = this.f10484a.mo11749c();
            if (c == 218) {
                return null;
            }
            if (c == 217) {
                boolean isLoggable = Log.isLoggable(str, 3);
                return null;
            }
            b = this.f10484a.mo11748b() - 2;
            if (c != 225) {
                j = (long) b;
                a = this.f10484a.mo11747a(j);
            } else {
                byte[] bArr = new byte[b];
                int a2 = this.f10484a.mo11746a(bArr);
                if (a2 == b) {
                    return bArr;
                }
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to read segment data, type: ");
                    sb2.append(c);
                    sb2.append(", length: ");
                    sb2.append(b);
                    sb2.append(", actually read: ");
                    sb2.append(a2);
                    sb2.toString();
                }
                return null;
            }
        } while (a == j);
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to skip enough data, type: ");
            sb3.append(c);
            sb3.append(", wanted to skip: ");
            sb3.append(b);
            sb3.append(", but actually skipped: ");
            sb3.append(a);
            sb3.toString();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo11737a() throws java.io.IOException {
        /*
            r7 = this;
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$b r0 = r7.f10484a
            int r0 = r0.mo11748b()
            boolean r0 = m14168a(r0)
            r1 = -1
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            byte[] r0 = r7.m14169d()
            r2 = 0
            if (r0 == 0) goto L_0x001d
            int r3 = r0.length
            byte[] r4 = f10477i
            int r4 = r4.length
            if (r3 <= r4) goto L_0x001d
            r3 = 1
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            if (r3 == 0) goto L_0x0030
            r4 = 0
        L_0x0021:
            byte[] r5 = f10477i
            int r6 = r5.length
            if (r4 >= r6) goto L_0x0030
            byte r6 = r0[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0030:
            r2 = r3
        L_0x0031:
            if (r2 == 0) goto L_0x003d
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a r1 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a
            r1.<init>(r0)
            int r0 = m14167a(r1)
            return r0
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.mo11737a():int");
    }

    /* renamed from: b */
    public ImageType mo11738b() throws IOException {
        int b = this.f10484a.mo11748b();
        if (b == f10473e) {
            return ImageType.JPEG;
        }
        int b2 = ((b << 16) & C0886a.f4059c) | (this.f10484a.mo11748b() & 65535);
        if (b2 == f10472d) {
            this.f10484a.mo11747a(21);
            return this.f10484a.mo11745a() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((b2 >> 8) == f10471c) {
            return ImageType.GIF;
        } else {
            return ImageType.UNKNOWN;
        }
    }

    /* renamed from: c */
    public boolean mo11739c() throws IOException {
        return mo11738b().hasAlpha();
    }

    /* renamed from: a */
    private static int m14167a(C2958a aVar) {
        ByteOrder byteOrder;
        short a = aVar.mo11742a(6);
        String str = f10470b;
        if (a == f10474f) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a == f10475g) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
                sb.toString();
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.mo11743a(byteOrder);
        int b = aVar.mo11744b(10) + 6;
        short a2 = aVar.mo11742a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m14166a(b, i);
            short a4 = aVar.mo11742a(a3);
            if (a4 == 274) {
                short a5 = aVar.mo11742a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = aVar.mo11744b(a3 + 4);
                    if (b2 < 0) {
                        boolean isLoggable = Log.isLoggable(str, 3);
                    } else {
                        String str2 = " tagType=";
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(str2);
                            sb2.append(a4);
                            sb2.append(" formatCode=");
                            sb2.append(a5);
                            sb2.append(" componentCount=");
                            sb2.append(b2);
                            sb2.toString();
                        }
                        int i2 = b2 + f10483o[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > aVar.mo11741a()) {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i3);
                                    sb3.append(str2);
                                    sb3.append(a4);
                                    sb3.toString();
                                }
                            } else if (i2 >= 0 && i2 + i3 <= aVar.mo11741a()) {
                                return aVar.mo11742a(i3);
                            } else {
                                if (Log.isLoggable(str, 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a4);
                                    sb4.toString();
                                }
                            }
                        } else if (Log.isLoggable(str, 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a5);
                            sb5.toString();
                        }
                    }
                } else if (Log.isLoggable(str, 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code=");
                    sb6.append(a5);
                    sb6.toString();
                }
            }
        }
        return -1;
    }
}
