package p433d.p434a.p435a.p437h;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: d.a.a.h.a */
/* compiled from: NameUtil */
public class C12194a {
    /* renamed from: a */
    public static int m54829a(String str) {
        return str.length() + 2;
    }

    /* renamed from: b */
    public static byte[] m54833b(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (String ascii : str.split("[.。．｡]")) {
            byte[] bytes = IDN.toASCII(ascii).getBytes();
            dataOutputStream.writeByte(bytes.length);
            dataOutputStream.write(bytes);
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static boolean m54832a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        try {
            return Arrays.equals(m54833b(str), m54833b(str2));
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m54830a(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            int readUnsignedByte2 = ((readUnsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte2));
            return m54831a(bArr, readUnsignedByte2, hashSet);
        } else if (readUnsignedByte == 0) {
            return "";
        } else {
            byte[] bArr2 = new byte[readUnsignedByte];
            dataInputStream.readFully(bArr2);
            String unicode = IDN.toUnicode(new String(bArr2));
            String a = m54830a(dataInputStream, bArr);
            if (a.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(unicode);
                sb.append(".");
                sb.append(a);
                unicode = sb.toString();
            }
            return unicode;
        }
    }

    /* renamed from: a */
    public static String m54831a(byte[] bArr, int i, HashSet<Integer> hashSet) {
        byte b = bArr[i] & 255;
        if ((b & 192) == 192) {
            int i2 = ((b & 63) << 8) + (bArr[i + 1] & 255);
            if (!hashSet.contains(Integer.valueOf(i2))) {
                hashSet.add(Integer.valueOf(i2));
                return m54831a(bArr, i2, hashSet);
            }
            throw new IllegalStateException("Cyclic offsets detected.");
        } else if (b == 0) {
            return "";
        } else {
            int i3 = i + 1;
            String str = new String(bArr, i3, b);
            String a = m54831a(bArr, i3 + b, hashSet);
            if (a.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".");
                sb.append(a);
                str = sb.toString();
            }
            return str;
        }
    }
}
