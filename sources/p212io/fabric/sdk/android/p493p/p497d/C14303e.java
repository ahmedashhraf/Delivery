package p212io.fabric.sdk.android.p493p.p497d;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import p212io.fabric.sdk.android.C14225i;

/* renamed from: io.fabric.sdk.android.p.d.e */
/* compiled from: PreferenceStoreImpl */
public class C14303e implements C14302d {

    /* renamed from: a */
    private final SharedPreferences f42155a;

    /* renamed from: b */
    private final String f42156b;

    /* renamed from: c */
    private final Context f42157c;

    public C14303e(Context context, String str) {
        if (context != null) {
            this.f42157c = context;
            this.f42156b = str;
            this.f42155a = this.f42157c.getSharedPreferences(this.f42156b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: a */
    public Editor mo45251a() {
        return this.f42155a.edit();
    }

    public SharedPreferences get() {
        return this.f42155a;
    }

    @TargetApi(9)
    /* renamed from: a */
    public boolean mo45252a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    @Deprecated
    public C14303e(C14225i iVar) {
        this(iVar.getContext(), iVar.getClass().getName());
    }
}
