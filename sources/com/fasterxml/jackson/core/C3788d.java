package com.fasterxml.jackson.core;

/* renamed from: com.fasterxml.jackson.core.d */
/* compiled from: JsonEncoding */
public enum C3788d {
    UTF8("UTF-8", false),
    UTF16_BE("UTF-16BE", true),
    UTF16_LE("UTF-16LE", false),
    UTF32_BE("UTF-32BE", true),
    UTF32_LE("UTF-32LE", false);
    
    protected final boolean _bigEndian;
    protected final String _javaName;

    private C3788d(String str, boolean z) {
        this._javaName = str;
        this._bigEndian = z;
    }

    /* renamed from: d */
    public String mo16509d() {
        return this._javaName;
    }

    /* renamed from: e */
    public boolean mo16510e() {
        return this._bigEndian;
    }
}
