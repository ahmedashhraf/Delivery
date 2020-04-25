package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class zzfn extends IOException {

    /* renamed from: a */
    private C4945r5 f14571a = null;

    public zzfn(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzfn m22028a() {
        return new zzfn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: d */
    static zzfn m22029d() {
        return new zzfn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static zzfn m22030e() {
        return new zzfn("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static zzfn m22031f() {
        return new zzfn("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: g */
    static zzfn m22032g() {
        return new zzfn("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: h */
    static zzfm m22033h() {
        return new zzfm("Protocol message tag had invalid wire type.");
    }

    /* renamed from: i */
    static zzfn m22034i() {
        return new zzfn("Failed to parse the message.");
    }

    /* renamed from: j */
    static zzfn m22035j() {
        return new zzfn("Protocol message had invalid UTF-8.");
    }
}
