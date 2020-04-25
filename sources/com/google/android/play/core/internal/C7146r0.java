package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.play.core.internal.r0 */
final class C7146r0 extends C7145q0 {

    /* renamed from: b */
    private byte[] f20252b;

    public C7146r0(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f20252b = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f20252b;
    }
}
