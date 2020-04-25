package androidx.appcompat.p011d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;

/* renamed from: androidx.appcompat.d.d */
/* compiled from: ContextThemeWrapper */
public class C0341d extends ContextWrapper {

    /* renamed from: a */
    private int f1113a;

    /* renamed from: b */
    private Theme f1114b;

    /* renamed from: c */
    private LayoutInflater f1115c;

    /* renamed from: d */
    private Configuration f1116d;

    /* renamed from: e */
    private Resources f1117e;

    public C0341d() {
        super(null);
    }

    /* renamed from: b */
    private Resources m1900b() {
        if (this.f1117e == null) {
            Configuration configuration = this.f1116d;
            if (configuration == null) {
                this.f1117e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f1117e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f1117e;
    }

    /* renamed from: c */
    private void m1901c() {
        boolean z = this.f1114b == null;
        if (z) {
            this.f1114b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1114b.setTo(theme);
            }
        }
        mo1326a(this.f1114b, this.f1113a, z);
    }

    /* renamed from: a */
    public void mo1325a(Configuration configuration) {
        if (this.f1117e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f1116d == null) {
            this.f1116d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m1900b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1115c == null) {
            this.f1115c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1115c;
    }

    public Theme getTheme() {
        Theme theme = this.f1114b;
        if (theme != null) {
            return theme;
        }
        if (this.f1113a == 0) {
            this.f1113a = C0238R.style.Theme_AppCompat_Light;
        }
        m1901c();
        return this.f1114b;
    }

    public void setTheme(int i) {
        if (this.f1113a != i) {
            this.f1113a = i;
            m1901c();
        }
    }

    public C0341d(Context context, @C0216r0 int i) {
        super(context);
        this.f1113a = i;
    }

    public C0341d(Context context, Theme theme) {
        super(context);
        this.f1114b = theme;
    }

    /* renamed from: a */
    public int mo1324a() {
        return this.f1113a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1326a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }
}
