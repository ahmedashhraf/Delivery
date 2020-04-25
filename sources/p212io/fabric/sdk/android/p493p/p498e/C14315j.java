package p212io.fabric.sdk.android.p493p.p498e;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p497d.C14300b;

/* renamed from: io.fabric.sdk.android.p.e.j */
/* compiled from: DefaultCachedSettingsIo */
class C14315j implements C14313h {

    /* renamed from: a */
    private final C14225i f42217a;

    public C14315j(C14225i iVar) {
        this.f42217a = iVar;
    }

    /* renamed from: a */
    public JSONObject mo45259a() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        String str = "Error while closing settings cache file.";
        C14228l j = C14215d.m61672j();
        String str2 = C14215d.f41919m;
        j.mo45042d(str2, "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new C14300b(this.f42217a).mo45244c(), C14323r.f42260e);
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(C14248i.m61823b((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C14215d.m61672j().mo45045e(str2, "Failed to fetch cached settings", e);
                        C14248i.m61815a((Closeable) fileInputStream, str);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        C14248i.m61815a((Closeable) fileInputStream2, str);
                        throw th;
                    }
                }
            } else {
                C14215d.m61672j().mo45042d(str2, "No cached settings found.");
                jSONObject = null;
            }
            C14248i.m61815a((Closeable) fileInputStream2, str);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C14215d.m61672j().mo45045e(str2, "Failed to fetch cached settings", e);
            C14248i.m61815a((Closeable) fileInputStream, str);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C14248i.m61815a((Closeable) fileInputStream2, str);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo45260a(long j, JSONObject jSONObject) {
        String str = "Failed to close settings writer.";
        C14228l j2 = C14215d.m61672j();
        String str2 = C14215d.f41919m;
        j2.mo45042d(str2, "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put(C14330v.f42311a, j);
                FileWriter fileWriter2 = new FileWriter(new File(new C14300b(this.f42217a).mo45244c(), C14323r.f42260e));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C14248i.m61815a((Closeable) fileWriter2, str);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C14215d.m61672j().mo45045e(str2, "Failed to cache settings", e);
                        C14248i.m61815a((Closeable) fileWriter, str);
                    } catch (Throwable th) {
                        th = th;
                        C14248i.m61815a((Closeable) fileWriter, str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C14248i.m61815a((Closeable) fileWriter, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C14215d.m61672j().mo45045e(str2, "Failed to cache settings", e);
                C14248i.m61815a((Closeable) fileWriter, str);
            }
        }
    }
}
