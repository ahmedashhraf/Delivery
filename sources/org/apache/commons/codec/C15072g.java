package org.apache.commons.codec;

import java.util.Comparator;

/* renamed from: org.apache.commons.codec.g */
/* compiled from: StringEncoderComparator */
public class C15072g implements Comparator {

    /* renamed from: a */
    private C15071f f43800a;

    public C15072g() {
    }

    public int compare(Object obj, Object obj2) {
        try {
            return ((Comparable) this.f43800a.mo46723a(obj)).compareTo((Comparable) this.f43800a.mo46723a(obj2));
        } catch (EncoderException unused) {
            return 0;
        }
    }

    public C15072g(C15071f fVar) {
        this.f43800a = fVar;
    }
}
