package org.jcodec.common.tools;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.jivesoftware.smack.util.StringUtils;

public class MD5 {
    private static String digestToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (b2 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(b2));
        }
        return sb.toString();
    }

    public static MessageDigest getDigest() {
        try {
            return MessageDigest.getInstance(StringUtils.MD5);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String md5sum(byte[] bArr) {
        MessageDigest digest = getDigest();
        digest.update(bArr);
        return digestToString(digest.digest());
    }

    public static String md5sum(ByteBuffer byteBuffer) {
        MessageDigest digest = getDigest();
        digest.update(byteBuffer);
        return digestToString(digest.digest());
    }
}
