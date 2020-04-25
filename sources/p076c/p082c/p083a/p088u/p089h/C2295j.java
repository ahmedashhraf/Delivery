package p076c.p082c.p083a.p088u.p089h;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.c.a.u.h.j */
/* compiled from: StreamAssetPathFetcher */
public class C2295j extends C2277a<InputStream> {
    public C2295j(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m11956a(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9646a(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}
