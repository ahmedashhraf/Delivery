package p212io.fabric.sdk.android.p493p.p497d;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;

/* renamed from: io.fabric.sdk.android.p.d.b */
/* compiled from: FileStoreImpl */
public class C14300b implements C14299a {

    /* renamed from: a */
    private final Context f42152a;

    /* renamed from: b */
    private final String f42153b;

    /* renamed from: c */
    private final String f42154c;

    public C14300b(C14225i iVar) {
        if (iVar.getContext() != null) {
            this.f42152a = iVar.getContext();
            this.f42153b = iVar.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append("Android/");
            sb.append(this.f42152a.getPackageName());
            this.f42154c = sb.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: a */
    public File mo45242a() {
        File file;
        if (!mo45247e()) {
            file = null;
        } else if (VERSION.SDK_INT >= 8) {
            file = this.f42152a.getExternalCacheDir();
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f42154c);
            sb.append("/cache/");
            sb.append(this.f42153b);
            file = new File(externalStorageDirectory, sb.toString());
        }
        return mo45246a(file);
    }

    @TargetApi(8)
    /* renamed from: b */
    public File mo45243b() {
        File file = null;
        if (mo45247e()) {
            if (VERSION.SDK_INT >= 8) {
                file = this.f42152a.getExternalFilesDir(null);
            } else {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f42154c);
                sb.append("/files/");
                sb.append(this.f42153b);
                file = new File(externalStorageDirectory, sb.toString());
            }
        }
        return mo45246a(file);
    }

    /* renamed from: c */
    public File mo45244c() {
        return mo45246a(this.f42152a.getFilesDir());
    }

    /* renamed from: d */
    public File mo45245d() {
        return mo45246a(this.f42152a.getCacheDir());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo45247e() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return true;
        }
        C14215d.m61672j().mo45051w(C14215d.f41919m, "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo45246a(File file) {
        String str = C14215d.f41919m;
        if (file == null) {
            C14215d.m61672j().mo45042d(str, "Null File");
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C14215d.m61672j().mo45051w(str, "Couldn't create file");
        }
        return null;
    }
}
