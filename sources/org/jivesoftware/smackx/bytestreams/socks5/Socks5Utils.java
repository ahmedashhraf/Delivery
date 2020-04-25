package org.jivesoftware.smackx.bytestreams.socks5;

import java.io.DataInputStream;
import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.util.SHA1;

class Socks5Utils {
    Socks5Utils() {
    }

    public static String createDigest(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return SHA1.hex(sb.toString());
    }

    public static byte[] receiveSocks5Message(DataInputStream dataInputStream) throws IOException, SmackException {
        byte[] bArr = new byte[5];
        dataInputStream.readFully(bArr, 0, 5);
        if (bArr[3] == 3) {
            byte b = bArr[4];
            byte[] bArr2 = new byte[(b + 7)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            dataInputStream.readFully(bArr2, bArr.length, b + 2);
            return bArr2;
        }
        throw new SmackException("Unsupported SOCKS5 address type");
    }
}
