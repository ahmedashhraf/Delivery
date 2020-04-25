package com.google.android.play.core.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.q0 */
class C7145q0 extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f20251a;

    public C7145q0(X509Certificate x509Certificate) {
        this.f20251a = x509Certificate;
    }

    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f20251a.checkValidity();
    }

    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f20251a.checkValidity(date);
    }

    public int getBasicConstraints() {
        return this.f20251a.getBasicConstraints();
    }

    public Set<String> getCriticalExtensionOIDs() {
        return this.f20251a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f20251a.getEncoded();
    }

    public byte[] getExtensionValue(String str) {
        return this.f20251a.getExtensionValue(str);
    }

    public Principal getIssuerDN() {
        return this.f20251a.getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return this.f20251a.getIssuerUniqueID();
    }

    public boolean[] getKeyUsage() {
        return this.f20251a.getKeyUsage();
    }

    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f20251a.getNonCriticalExtensionOIDs();
    }

    public Date getNotAfter() {
        return this.f20251a.getNotAfter();
    }

    public Date getNotBefore() {
        return this.f20251a.getNotBefore();
    }

    public PublicKey getPublicKey() {
        return this.f20251a.getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return this.f20251a.getSerialNumber();
    }

    public String getSigAlgName() {
        return this.f20251a.getSigAlgName();
    }

    public String getSigAlgOID() {
        return this.f20251a.getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return this.f20251a.getSigAlgParams();
    }

    public byte[] getSignature() {
        return this.f20251a.getSignature();
    }

    public Principal getSubjectDN() {
        return this.f20251a.getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return this.f20251a.getSubjectUniqueID();
    }

    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f20251a.getTBSCertificate();
    }

    public int getVersion() {
        return this.f20251a.getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return this.f20251a.hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return this.f20251a.toString();
    }

    public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f20251a.verify(publicKey);
    }

    public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f20251a.verify(publicKey, str);
    }
}
