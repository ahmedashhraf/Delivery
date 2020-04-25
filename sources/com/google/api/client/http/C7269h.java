package com.google.api.client.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.http.h */
/* compiled from: FileContent */
public final class C7269h extends C7254b {

    /* renamed from: c */
    private final File f20571c;

    public C7269h(String str, File file) {
        super(str);
        this.f20571c = (File) C6381h0.m29663a(file);
    }

    /* renamed from: a */
    public boolean mo25633a() {
        return true;
    }

    /* renamed from: b */
    public long mo25634b() {
        return this.f20571c.length();
    }

    /* renamed from: d */
    public InputStream mo28864d() throws FileNotFoundException {
        return new FileInputStream(this.f20571c);
    }

    /* renamed from: e */
    public File mo28919e() {
        return this.f20571c;
    }

    /* renamed from: a */
    public C7269h m35086a(String str) {
        return (C7269h) super.mo28861a(str);
    }

    /* renamed from: a */
    public C7269h m35087a(boolean z) {
        return (C7269h) super.mo28862a(z);
    }
}
