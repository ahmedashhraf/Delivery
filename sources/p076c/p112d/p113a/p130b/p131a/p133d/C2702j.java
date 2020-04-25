package p076c.p112d.p113a.p130b.p131a.p133d;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: c.d.a.b.a.d.j */
final class C2702j implements C2704l {

    /* renamed from: a */
    private final /* synthetic */ Set f9827a;

    /* renamed from: b */
    private final /* synthetic */ C2711s f9828b;

    /* renamed from: c */
    private final /* synthetic */ ZipFile f9829c;

    C2702j(Set set, C2711s sVar, ZipFile zipFile) {
        this.f9827a = set;
        this.f9828b = sVar;
        this.f9829c = zipFile;
    }

    /* renamed from: a */
    public final void mo10381a(C2706n nVar, File file, boolean z) throws IOException {
        this.f9827a.add(file);
        if (!z) {
            String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{this.f9828b.mo10360b(), nVar.f9833a, this.f9828b.mo10359a().getAbsolutePath(), nVar.f9834b.getName(), file.getAbsolutePath()});
            C2698f.m13091b(this.f9829c, nVar.f9834b, file);
        }
    }
}
