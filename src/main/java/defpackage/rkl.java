package defpackage;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: rkl */
class rkl extends X509Certificate {
    private final X509Certificate a;

    public rkl(X509Certificate x509Certificate) {
        this.a = x509Certificate;
    }

    public final Set getCriticalExtensionOIDs() {
        return this.a.getCriticalExtensionOIDs();
    }

    public final byte[] getExtensionValue(String str) {
        return this.a.getExtensionValue(str);
    }

    public final Set getNonCriticalExtensionOIDs() {
        return this.a.getNonCriticalExtensionOIDs();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.a.hasUnsupportedCriticalExtension();
    }

    public final void checkValidity() {
        this.a.checkValidity();
    }

    public final void checkValidity(Date date) {
        this.a.checkValidity(date);
    }

    public final int getVersion() {
        return this.a.getVersion();
    }

    public final BigInteger getSerialNumber() {
        return this.a.getSerialNumber();
    }

    public final Principal getIssuerDN() {
        return this.a.getIssuerDN();
    }

    public final Principal getSubjectDN() {
        return this.a.getSubjectDN();
    }

    public final Date getNotBefore() {
        return this.a.getNotBefore();
    }

    public final Date getNotAfter() {
        return this.a.getNotAfter();
    }

    public final byte[] getTBSCertificate() {
        return this.a.getTBSCertificate();
    }

    public final byte[] getSignature() {
        return this.a.getSignature();
    }

    public final String getSigAlgName() {
        return this.a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.a.getSigAlgParams();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.a.getIssuerUniqueID();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.a.getSubjectUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.a.getKeyUsage();
    }

    public final int getBasicConstraints() {
        return this.a.getBasicConstraints();
    }

    public byte[] getEncoded() {
        return this.a.getEncoded();
    }

    public final void verify(PublicKey publicKey) {
        this.a.verify(publicKey);
    }

    public final void verify(PublicKey publicKey, String str) {
        this.a.verify(publicKey, str);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final PublicKey getPublicKey() {
        return this.a.getPublicKey();
    }
}
