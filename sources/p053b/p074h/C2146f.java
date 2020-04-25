package p053b.p074h;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;

/* renamed from: b.h.f */
/* compiled from: ZipUtil */
final class C2146f {

    /* renamed from: a */
    private static final int f8536a = 22;

    /* renamed from: b */
    private static final int f8537b = 101010256;

    /* renamed from: c */
    private static final int f8538c = 16384;

    /* renamed from: b.h.f$a */
    /* compiled from: ZipUtil */
    static class C2147a {

        /* renamed from: a */
        long f8539a;

        /* renamed from: b */
        long f8540b;

        C2147a() {
        }
    }

    C2146f() {
    }

    /* renamed from: a */
    static long m11132a(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, AckRequest.ELEMENT);
        try {
            return m11133a(randomAccessFile, m11134a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static C2147a m11134a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - PlaybackStateCompat.f479n0;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(f8537b);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C2147a aVar = new C2147a();
                    aVar.f8540b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f8539a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File too short to be a zip file: ");
        sb.append(randomAccessFile.length());
        throw new ZipException(sb.toString());
    }

    /* renamed from: a */
    static long m11133a(RandomAccessFile randomAccessFile, C2147a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f8540b;
        randomAccessFile.seek(aVar.f8539a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(PlaybackStateCompat.f477l0, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(PlaybackStateCompat.f477l0, j));
        }
        return crc32.getValue();
    }
}
