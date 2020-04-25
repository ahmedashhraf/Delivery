package org.jivesoftware.smack.p557sm;

import java.math.BigInteger;

/* renamed from: org.jivesoftware.smack.sm.SMUtils */
public class SMUtils {
    private static long MASK_32_BIT = BigInteger.ONE.shiftLeft(32).subtract(BigInteger.ONE).longValue();

    public static long calculateDelta(long j, long j2) {
        return (j - j2) & MASK_32_BIT;
    }

    public static long incrementHeight(long j) {
        return (j + 1) & MASK_32_BIT;
    }
}
