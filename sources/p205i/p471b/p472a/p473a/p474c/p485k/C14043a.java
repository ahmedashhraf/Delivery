package p205i.p471b.p472a.p473a.p474c.p485k;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15478d;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15479e;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15480f;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14041j;

/* renamed from: i.b.a.a.c.k.a */
/* compiled from: FileOutput */
public class C14043a implements C14044b {

    /* renamed from: a */
    private C14041j f41267a;

    /* renamed from: b */
    private File f41268b;

    /* renamed from: c */
    private boolean f41269c;

    /* renamed from: a */
    public final void mo44368a(C14030b bVar, C14041j jVar) throws IOException {
        this.f41267a = jVar;
        this.f41268b = new File(bVar.mo44334d()).getAbsoluteFile();
        this.f41269c = bVar.mo44330b();
        File parentFile = this.f41268b.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        m60596a().close();
    }

    public void shutdown() throws IOException {
    }

    /* renamed from: a */
    public void mo44369a(boolean z) throws IOException {
        OutputStream a = m60596a();
        try {
            C15478d dVar = new C15478d(a);
            this.f41267a.mo44363a((C15479e) dVar, (C15480f) dVar, z);
        } finally {
            a.close();
        }
    }

    /* renamed from: a */
    private OutputStream m60596a() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.f41268b, this.f41269c);
        fileOutputStream.getChannel().lock();
        return fileOutputStream;
    }
}
