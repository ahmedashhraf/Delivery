package com.google.api.client.googleapis.media;

import com.google.api.client.http.C7255b0;
import com.google.api.client.http.C7302r;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: com.google.api.client.googleapis.media.c */
/* compiled from: MediaUploadErrorHandler */
class C7250c implements C7255b0, C7302r {

    /* renamed from: d */
    static final Logger f20524d = Logger.getLogger(C7250c.class.getName());

    /* renamed from: a */
    private final MediaHttpUploader f20525a;

    /* renamed from: b */
    private final C7302r f20526b;

    /* renamed from: c */
    private final C7255b0 f20527c;

    public C7250c(MediaHttpUploader mediaHttpUploader, C7305u uVar) {
        this.f20525a = (MediaHttpUploader) C6381h0.m29663a(mediaHttpUploader);
        this.f20526b = uVar.mo29112j();
        this.f20527c = uVar.mo29125w();
        uVar.mo29088a((C7302r) this);
        uVar.mo29081a((C7255b0) this);
    }

    /* renamed from: a */
    public boolean mo28836a(C7305u uVar, boolean z) throws IOException {
        C7302r rVar = this.f20526b;
        boolean z2 = rVar != null && rVar.mo28836a(uVar, z);
        if (z2) {
            try {
                this.f20525a.mo28833n();
            } catch (IOException e) {
                f20524d.log(Level.WARNING, "exception thrown while calling server callback", e);
            }
        }
        return z2;
    }

    /* renamed from: a */
    public boolean mo25648a(C7305u uVar, C7309x xVar, boolean z) throws IOException {
        C7255b0 b0Var = this.f20527c;
        boolean z2 = b0Var != null && b0Var.mo25648a(uVar, xVar, z);
        if (z2 && z && xVar.mo29153j() / 100 == 5) {
            try {
                this.f20525a.mo28833n();
            } catch (IOException e) {
                f20524d.log(Level.WARNING, "exception thrown while calling server callback", e);
            }
        }
        return z2;
    }
}
