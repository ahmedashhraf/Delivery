package com.google.api.client.googleapis.media;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7307v;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6423t;

public final class MediaHttpDownloader {

    /* renamed from: j */
    public static final int f20486j = 33554432;

    /* renamed from: a */
    private final C7307v f20487a;

    /* renamed from: b */
    private final C7253a0 f20488b;

    /* renamed from: c */
    private boolean f20489c = false;

    /* renamed from: d */
    private C7248a f20490d;

    /* renamed from: e */
    private int f20491e = f20486j;

    /* renamed from: f */
    private long f20492f;

    /* renamed from: g */
    private DownloadState f20493g = DownloadState.NOT_STARTED;

    /* renamed from: h */
    private long f20494h;

    /* renamed from: i */
    private long f20495i = -1;

    public enum DownloadState {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpDownloader(C7253a0 a0Var, C7308w wVar) {
        this.f20488b = (C7253a0) C6381h0.m29663a(a0Var);
        this.f20487a = wVar == null ? a0Var.mo28859b() : a0Var.mo28858a(wVar);
    }

    /* renamed from: b */
    private void m34899b(String str) {
        if (str != null && this.f20492f == 0) {
            this.f20492f = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    /* renamed from: a */
    public void mo28803a(C7274j jVar, OutputStream outputStream) throws IOException {
        mo28802a(jVar, null, outputStream);
    }

    /* renamed from: c */
    public long mo28805c() {
        return this.f20495i;
    }

    /* renamed from: d */
    public long mo28806d() {
        return this.f20494h;
    }

    /* renamed from: e */
    public double mo28807e() {
        long j = this.f20492f;
        if (j == 0) {
            return 0.0d;
        }
        double d = (double) this.f20494h;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: f */
    public C7248a mo28808f() {
        return this.f20490d;
    }

    /* renamed from: g */
    public C7253a0 mo28809g() {
        return this.f20488b;
    }

    /* renamed from: h */
    public boolean mo28810h() {
        return this.f20489c;
    }

    /* renamed from: a */
    public void mo28802a(C7274j jVar, C7299q qVar, OutputStream outputStream) throws IOException {
        C6381h0.m29666a(this.f20493g == DownloadState.NOT_STARTED);
        jVar.put("alt", "media");
        if (this.f20489c) {
            m34898a(DownloadState.MEDIA_IN_PROGRESS);
            this.f20492f = m34897a(this.f20495i, jVar, qVar, outputStream).mo29150g().mo29036n().longValue();
            this.f20494h = this.f20492f;
            m34898a(DownloadState.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long j = (this.f20494h + ((long) this.f20491e)) - 1;
            long j2 = this.f20495i;
            if (j2 != -1) {
                j = Math.min(j2, j);
            }
            String p = m34897a(j, jVar, qVar, outputStream).mo29150g().mo29040p();
            long a = m34896a(p);
            m34899b(p);
            long j3 = this.f20492f;
            if (j3 <= a) {
                this.f20494h = j3;
                m34898a(DownloadState.MEDIA_COMPLETE);
                return;
            }
            this.f20494h = a;
            m34898a(DownloadState.MEDIA_IN_PROGRESS);
        }
    }

    /* renamed from: b */
    public DownloadState mo28804b() {
        return this.f20493g;
    }

    /* renamed from: a */
    private C7309x m34897a(long j, C7274j jVar, C7299q qVar, OutputStream outputStream) throws IOException {
        C7305u b = this.f20487a.mo29135b(jVar);
        if (qVar != null) {
            b.mo29111i().putAll(qVar);
        }
        if (!(this.f20494h == 0 && j == -1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(this.f20494h);
            sb.append("-");
            if (j != -1) {
                sb.append(j);
            }
            b.mo29111i().mo29055x(sb.toString());
        }
        C7309x a = b.mo29092a();
        try {
            C6423t.m29817a(a.mo29145b(), outputStream);
            return a;
        } finally {
            a.mo29143a();
        }
    }

    /* renamed from: a */
    private long m34896a(String str) {
        if (str == null) {
            return 0;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    /* renamed from: a */
    public MediaHttpDownloader mo28798a(long j) {
        C6381h0.m29666a(j >= 0);
        this.f20494h = j;
        return this;
    }

    /* renamed from: a */
    public MediaHttpDownloader mo28799a(long j, int i) {
        long j2 = (long) i;
        C6381h0.m29666a(j2 >= j);
        mo28798a(j);
        this.f20495i = j2;
        return this;
    }

    /* renamed from: a */
    public MediaHttpDownloader mo28801a(boolean z) {
        this.f20489c = z;
        return this;
    }

    /* renamed from: a */
    public MediaHttpDownloader mo28800a(C7248a aVar) {
        this.f20490d = aVar;
        return this;
    }

    /* renamed from: a */
    public MediaHttpDownloader mo28797a(int i) {
        C6381h0.m29666a(i > 0 && i <= 33554432);
        this.f20491e = i;
        return this;
    }

    /* renamed from: a */
    public int mo28796a() {
        return this.f20491e;
    }

    /* renamed from: a */
    private void m34898a(DownloadState downloadState) throws IOException {
        this.f20493g = downloadState;
        C7248a aVar = this.f20490d;
        if (aVar != null) {
            aVar.mo28834a(this);
        }
    }
}
