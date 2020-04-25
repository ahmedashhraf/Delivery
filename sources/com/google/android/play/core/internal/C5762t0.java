package com.google.android.play.core.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.core.p034l.C0986h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: com.google.android.play.core.internal.t0 */
public class C5762t0 implements C5735b0 {

    /* renamed from: a */
    private final ByteBuffer f16622a;

    public C5762t0(ByteBuffer byteBuffer) {
        this.f16622a = byteBuffer.slice();
    }

    /* renamed from: a */
    private static int m25279a(int i, int i2) {
        return m25296b(m25295b(i), m25295b(i2));
    }

    /* renamed from: a */
    private static long m25280a(long j) {
        return ((j + PlaybackStateCompat.f483r0) - 1) / PlaybackStateCompat.f483r0;
    }

    /* renamed from: a */
    private static long m25281a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: a */
    private static long m25282a(ByteBuffer byteBuffer, long j) throws C7127c {
        m25287a(byteBuffer);
        long a = m25281a(byteBuffer, byteBuffer.position() + 16);
        if (a < j) {
            m25287a(byteBuffer);
            if (m25281a(byteBuffer, byteBuffer.position() + 12) + a == j) {
                return a;
            }
            throw new C7127c("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        StringBuilder sb = new StringBuilder(122);
        sb.append("ZIP Central Directory offset out of range: ");
        sb.append(a);
        sb.append(". ZIP End of Central Directory offset: ");
        sb.append(j);
        throw new C7127c(sb.toString());
    }

    /* renamed from: a */
    private static Pair<ByteBuffer, Long> m25283a(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        if (i < 0 || i > 65535) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("maxCommentSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, length - 22)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        m25287a(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && (allocate.getShort(i2 + 20) & 65535) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    /* renamed from: a */
    private static Pair<ByteBuffer, Long> m25284a(RandomAccessFile randomAccessFile, long j) throws IOException, C7127c {
        if (j >= 32) {
            ByteBuffer allocate = ByteBuffer.allocate(24);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j - ((long) allocate.capacity()));
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                long j2 = allocate.getLong(0);
                if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                    StringBuilder sb = new StringBuilder(57);
                    sb.append("APK Signing Block size out of range: ");
                    sb.append(j2);
                    throw new C7127c(sb.toString());
                }
                int i = (int) (8 + j2);
                long j3 = j - ((long) i);
                if (j3 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(i);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 == j2) {
                        return Pair.create(allocate2, Long.valueOf(j3));
                    }
                    StringBuilder sb2 = new StringBuilder(103);
                    sb2.append("APK Signing Block sizes in header and footer do not match: ");
                    sb2.append(j4);
                    sb2.append(" vs ");
                    sb2.append(j2);
                    throw new C7127c(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("APK Signing Block offset out of range: ");
                sb3.append(j3);
                throw new C7127c(sb3.toString());
            }
            throw new C7127c("No APK Signing Block before ZIP Central Directory");
        }
        StringBuilder sb4 = new StringBuilder(87);
        sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
        sb4.append(j);
        throw new C7127c(sb4.toString());
    }

    /* renamed from: a */
    private static ByteBuffer m25285a(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            } else {
                StringBuilder sb = new StringBuilder(41);
                sb.append("end > capacity: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(capacity);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("end < start: ");
            sb2.append(i2);
            sb2.append(" < 8");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static void m25286a(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }

    /* renamed from: a */
    private static void m25287a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: a */
    private static void m25288a(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        long j4 = j;
        if (!map.isEmpty()) {
            C7124a aVar = new C7124a(fileChannel, 0, j);
            C7124a aVar2 = new C7124a(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            m25287a(duplicate);
            int position = duplicate.position() + 16;
            if (j4 < 0 || j4 > 4294967295L) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("uint32 value of out range: ");
                sb.append(j4);
                throw new IllegalArgumentException(sb.toString());
            }
            duplicate.putInt(duplicate.position() + position, (int) j4);
            C5762t0 t0Var = new C5762t0(duplicate);
            int[] iArr = new int[map.size()];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] a = m25291a(iArr, new C5735b0[]{aVar, aVar2, t0Var});
                while (i < iArr.length) {
                    int i3 = iArr[i];
                    Map<Integer, byte[]> map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), a[i])) {
                        i++;
                    } else {
                        throw new SecurityException(String.valueOf(m25301c(i3)).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: a */
    private static boolean m25289a(int i) {
        if (!(i == 513 || i == 514 || i == 769)) {
            switch (i) {
                case C0986h.f4407i /*257*/:
                case 258:
                case 259:
                case 260:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static X509Certificate[] m25290a(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        SecurityException securityException;
        ByteBuffer b = m25298b(byteBuffer);
        ByteBuffer b2 = m25298b(byteBuffer);
        byte[] c = m25302c(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = -1;
        int i2 = 0;
        while (b2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer b3 = m25298b(b2);
                if (b3.remaining() >= 8) {
                    int i3 = b3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (m25289a(i3)) {
                        if (i == -1 || m25279a(i3, i) > 0) {
                            bArr = m25302c(b3);
                            i = i3;
                        }
                    }
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Failed to parse signature record #");
                sb.append(i2);
                throw new SecurityException(sb.toString(), e);
            }
        }
        if (i != -1) {
            String e2 = m25305e(i);
            Pair f = m25307f(i);
            String str = (String) f.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) f.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(e2).generatePublic(new X509EncodedKeySpec(c));
                Signature instance = Signature.getInstance(str);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(b);
                if (instance.verify(bArr)) {
                    b.clear();
                    ByteBuffer b4 = m25298b(b);
                    ArrayList arrayList2 = new ArrayList();
                    byte[] bArr2 = null;
                    int i4 = 0;
                    while (b4.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer b5 = m25298b(b4);
                            if (b5.remaining() >= 8) {
                                int i5 = b5.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr2 = m25302c(b5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e3) {
                            StringBuilder sb2 = new StringBuilder(42);
                            sb2.append("Failed to parse digest record #");
                            sb2.append(i4);
                            throw new IOException(sb2.toString(), e3);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int b6 = m25295b(i);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(b6), bArr2);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr2)) {
                            ByteBuffer b7 = m25298b(b);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (b7.hasRemaining()) {
                                i6++;
                                byte[] c2 = m25302c(b7);
                                try {
                                    arrayList3.add(new C7146r0((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(c2)), c2));
                                } catch (CertificateException e4) {
                                    StringBuilder sb3 = new StringBuilder(41);
                                    sb3.append("Failed to decode certificate #");
                                    sb3.append(i6);
                                    throw new SecurityException(sb3.toString(), e4);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(c, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(String.valueOf(m25301c(b6)).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e5) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27);
                sb4.append("Failed to verify ");
                sb4.append(str);
                sb4.append(" signature");
                throw new SecurityException(sb4.toString(), e5);
            }
        } else if (i2 == 0) {
            securityException = new SecurityException("No signatures found");
            throw securityException;
        } else {
            securityException = new SecurityException("No supported signatures found");
            throw securityException;
        }
    }

    /* renamed from: a */
    private static byte[][] m25291a(int[] iArr, C5735b0[] b0VarArr) throws DigestException {
        int i;
        String str;
        int[] iArr2 = iArr;
        C5735b0[] b0VarArr2 = b0VarArr;
        long j = 0;
        long j2 = 0;
        for (C5735b0 d : b0VarArr2) {
            j2 += m25280a(d.mo23031d());
        }
        if (j2 < 2097151) {
            int i2 = (int) j2;
            byte[][] bArr = new byte[iArr2.length][];
            int i3 = 0;
            while (true) {
                i = 1;
                if (i3 >= iArr2.length) {
                    break;
                }
                byte[] bArr2 = new byte[((m25303d(iArr2[i3]) * i2) + 5)];
                bArr2[0] = 90;
                m25286a(i2, bArr2, 1);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[iArr2.length];
            int i4 = 0;
            while (true) {
                str = " digest not supported";
                if (i4 >= iArr2.length) {
                    break;
                }
                String c = m25301c(iArr2[i4]);
                try {
                    messageDigestArr[i4] = MessageDigest.getInstance(c);
                    i4++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(String.valueOf(c).concat(str), e);
                }
            }
            int length = b0VarArr2.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < length) {
                C5735b0 b0Var = b0VarArr2[i5];
                long j3 = j;
                byte[][] bArr4 = bArr;
                long d2 = b0Var.mo23031d();
                while (d2 > j) {
                    int min = (int) Math.min(d2, PlaybackStateCompat.f483r0);
                    m25286a(min, bArr3, i);
                    for (MessageDigest update : messageDigestArr) {
                        update.update(bArr3);
                    }
                    long j4 = j3;
                    try {
                        b0Var.mo23030a(messageDigestArr, j4, min);
                        int i8 = 0;
                        while (i8 < iArr2.length) {
                            int i9 = iArr2[i8];
                            byte[] bArr5 = bArr3;
                            byte[] bArr6 = bArr4[i8];
                            int d3 = m25303d(i9);
                            int i10 = length;
                            MessageDigest messageDigest = messageDigestArr[i8];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr6, (i6 * d3) + 5, d3);
                            if (digest == d3) {
                                i8++;
                                bArr3 = bArr5;
                                length = i10;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        int i11 = length;
                        long j5 = (long) min;
                        long j6 = j4 + j5;
                        d2 -= j5;
                        i6++;
                        C5735b0[] b0VarArr3 = b0VarArr;
                        bArr3 = bArr3;
                        i = 1;
                        j3 = j6;
                        j = 0;
                    } catch (IOException e2) {
                        IOException iOException = e2;
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i6);
                        sb2.append(" of section #");
                        sb2.append(i7);
                        throw new DigestException(sb2.toString(), iOException);
                    }
                }
                byte[] bArr7 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                int i12 = length;
                i7++;
                i5++;
                b0VarArr2 = b0VarArr;
                bArr = bArr4;
                j = 0;
                i = 1;
            }
            byte[][] bArr8 = bArr;
            byte[][] bArr9 = new byte[iArr2.length][];
            int i13 = 0;
            while (i13 < iArr2.length) {
                int i14 = iArr2[i13];
                byte[] bArr10 = bArr8[i13];
                String c2 = m25301c(i14);
                try {
                    bArr9[i13] = MessageDigest.getInstance(c2).digest(bArr10);
                    i13++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(String.valueOf(c2).concat(str), e3);
                }
            }
            return bArr9;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j2);
        throw new DigestException(sb3.toString());
    }

    /* renamed from: a */
    private static X509Certificate[][] m25292a(RandomAccessFile randomAccessFile) throws C7127c, SecurityException, IOException {
        return m25294a(randomAccessFile.getChannel(), m25297b(randomAccessFile));
    }

    /* renamed from: a */
    public static X509Certificate[][] m25293a(String str) throws C7127c, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, AckRequest.ELEMENT);
        try {
            X509Certificate[][] a = m25292a(randomAccessFile);
            randomAccessFile.close();
            return a;
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static X509Certificate[][] m25294a(FileChannel fileChannel, C7144p0 p0Var) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer b = m25298b(p0Var.f20246a);
                int i = 0;
                while (b.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m25290a(m25298b(b), (Map<Integer, byte[]>) hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m25288a(hashMap, fileChannel, p0Var.f20247b, p0Var.f20248c, p0Var.f20249d, p0Var.f20250e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    /* renamed from: b */
    private static int m25295b(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case C0986h.f4407i /*257*/:
                        case 259:
                            break;
                        case 258:
                        case 260:
                            break;
                        default:
                            String str = "Unknown signature algorithm: 0x";
                            String valueOf = String.valueOf(Long.toHexString((long) i));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m25296b(int i, int i2) {
        String str = "Unknown digestAlgorithm2: ";
        if (i != 1) {
            if (i != 2) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown digestAlgorithm1: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 == 1) {
                return 1;
            } else {
                if (i2 == 2) {
                    return 0;
                }
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append(str);
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else if (i2 == 1) {
            return 0;
        } else {
            if (i2 == 2) {
                return -1;
            }
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append(str);
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.play.core.internal.C7144p0 m25297b(java.io.RandomAccessFile r12) throws java.io.IOException, com.google.android.play.core.internal.C7127c {
        /*
            android.util.Pair r0 = m25300c(r12)
            java.lang.Object r1 = r0.first
            r10 = r1
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            r0 = 20
            long r0 = r8 - r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0029
            r12.seek(r0)
            int r0 = r12.readInt()
            r1 = 1347094023(0x504b0607, float:1.36246794E10)
            if (r0 != r1) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x004c
            long r6 = m25282a(r10, r8)
            android.util.Pair r12 = m25284a(r12, r6)
            java.lang.Object r0 = r12.first
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r4 = r12.longValue()
            java.nio.ByteBuffer r3 = m25304d(r0)
            com.google.android.play.core.internal.p0 r12 = new com.google.android.play.core.internal.p0
            r11 = 0
            r2 = r12
            r2.<init>(r3, r4, r6, r8, r10, r11)
            return r12
        L_0x004c:
            com.google.android.play.core.internal.c r12 = new com.google.android.play.core.internal.c
            java.lang.String r0 = "ZIP64 APK not supported"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C5762t0.m25297b(java.io.RandomAccessFile):com.google.android.play.core.internal.p0");
    }

    /* renamed from: b */
    private static ByteBuffer m25298b(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m25299b(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: b */
    private static ByteBuffer m25299b(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static Pair<ByteBuffer, Long> m25300c(RandomAccessFile randomAccessFile) throws IOException, C7127c {
        Pair<ByteBuffer, Long> pair;
        if (randomAccessFile.length() < 22) {
            pair = null;
        } else {
            pair = m25283a(randomAccessFile, 0);
            if (pair == null) {
                pair = m25283a(randomAccessFile, 65535);
            }
        }
        if (pair != null) {
            return pair;
        }
        long length = randomAccessFile.length();
        StringBuilder sb = new StringBuilder(102);
        sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
        sb.append(length);
        sb.append(" bytes");
        throw new C7127c(sb.toString());
    }

    /* renamed from: c */
    private static String m25301c(int i) {
        if (i == 1) {
            return C14248i.f42026i;
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private static byte[] m25302c(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: d */
    private static int m25303d(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    private static ByteBuffer m25304d(ByteBuffer byteBuffer) throws C7127c {
        m25306e(byteBuffer);
        ByteBuffer a = m25285a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i = 0;
        while (a.hasRemaining()) {
            i++;
            if (a.remaining() >= 8) {
                long j = a.getLong();
                String str = " size out of range: ";
                String str2 = "APK Signing Block entry #";
                if (j < 4 || j > 2147483647L) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append(str2);
                    sb.append(i);
                    sb.append(str);
                    sb.append(j);
                    throw new C7127c(sb.toString());
                }
                int i2 = (int) j;
                int position = a.position() + i2;
                if (i2 > a.remaining()) {
                    int remaining = a.remaining();
                    StringBuilder sb2 = new StringBuilder(91);
                    sb2.append(str2);
                    sb2.append(i);
                    sb2.append(str);
                    sb2.append(i2);
                    sb2.append(", available: ");
                    sb2.append(remaining);
                    throw new C7127c(sb2.toString());
                } else if (a.getInt() == 1896449818) {
                    return m25299b(a, i2 - 4);
                } else {
                    a.position(position);
                }
            } else {
                StringBuilder sb3 = new StringBuilder(70);
                sb3.append("Insufficient data to read size of APK Signing Block entry #");
                sb3.append(i);
                throw new C7127c(sb3.toString());
            }
        }
        throw new C7127c("No APK Signature Scheme v2 block in APK Signing Block");
    }

    /* renamed from: e */
    private static String m25305e(int i) {
        if (i == 513 || i == 514) {
            return "EC";
        }
        if (i == 769) {
            return "DSA";
        }
        switch (i) {
            case C0986h.f4407i /*257*/:
            case 258:
            case 259:
            case 260:
                return "RSA";
            default:
                String str = "Unknown signature algorithm: 0x";
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: e */
    private static void m25306e(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* renamed from: f */
    private static Pair<String, ? extends AlgorithmParameterSpec> m25307f(int i) {
        if (i == 513) {
            return Pair.create("SHA256withECDSA", null);
        }
        if (i == 514) {
            return Pair.create("SHA512withECDSA", null);
        }
        if (i == 769) {
            return Pair.create("SHA256withDSA", null);
        }
        switch (i) {
            case C0986h.f4407i /*257*/:
                PSSParameterSpec pSSParameterSpec = new PSSParameterSpec(C14248i.f42026i, "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                return Pair.create("SHA256withRSA/PSS", pSSParameterSpec);
            case 258:
                PSSParameterSpec pSSParameterSpec2 = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                return Pair.create("SHA512withRSA/PSS", pSSParameterSpec2);
            case 259:
                return Pair.create("SHA256withRSA", null);
            case 260:
                return Pair.create("SHA512withRSA", null);
            default:
                String str = "Unknown signature algorithm: 0x";
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public void mo23030a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f16622a) {
            int i2 = (int) j;
            this.f16622a.position(i2);
            this.f16622a.limit(i2 + i);
            slice = this.f16622a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    /* renamed from: d */
    public long mo23031d() {
        return (long) this.f16622a.capacity();
    }
}
