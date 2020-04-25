package androidx.core.content.p019g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.annotation.RequiresApi;
import androidx.core.app.C0805v;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.core.content.g.d */
/* compiled from: ShortcutInfoCompat */
public class C0856d {

    /* renamed from: m */
    private static final String f3995m = "extraPersonCount";

    /* renamed from: n */
    private static final String f3996n = "extraPerson_";

    /* renamed from: o */
    private static final String f3997o = "extraLongLived";

    /* renamed from: a */
    Context f3998a;

    /* renamed from: b */
    String f3999b;

    /* renamed from: c */
    Intent[] f4000c;

    /* renamed from: d */
    ComponentName f4001d;

    /* renamed from: e */
    CharSequence f4002e;

    /* renamed from: f */
    CharSequence f4003f;

    /* renamed from: g */
    CharSequence f4004g;

    /* renamed from: h */
    IconCompat f4005h;

    /* renamed from: i */
    boolean f4006i;

    /* renamed from: j */
    C0805v[] f4007j;

    /* renamed from: k */
    Set<String> f4008k;

    /* renamed from: l */
    boolean f4009l;

    /* renamed from: androidx.core.content.g.d$a */
    /* compiled from: ShortcutInfoCompat */
    public static class C0857a {

        /* renamed from: a */
        private final C0856d f4010a = new C0856d();

        public C0857a(@C0193h0 Context context, @C0193h0 String str) {
            C0856d dVar = this.f4010a;
            dVar.f3998a = context;
            dVar.f3999b = str;
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4519a(@C0193h0 CharSequence charSequence) {
            this.f4010a.f4004g = charSequence;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C0857a mo4525b(@C0193h0 CharSequence charSequence) {
            this.f4010a.f4003f = charSequence;
            return this;
        }

        @C0193h0
        /* renamed from: c */
        public C0857a mo4527c(@C0193h0 CharSequence charSequence) {
            this.f4010a.f4002e = charSequence;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4516a(@C0193h0 Intent intent) {
            return mo4521a(new Intent[]{intent});
        }

        @C0193h0
        /* renamed from: b */
        public C0857a mo4524b() {
            this.f4010a.f4006i = true;
            return this;
        }

        @C0193h0
        /* renamed from: c */
        public C0857a mo4526c() {
            this.f4010a.f4009l = true;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4521a(@C0193h0 Intent[] intentArr) {
            this.f4010a.f4000c = intentArr;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4518a(IconCompat iconCompat) {
            this.f4010a.f4005h = iconCompat;
            return this;
        }

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        public C0857a(@C0193h0 C0856d dVar) {
            C0856d dVar2 = this.f4010a;
            dVar2.f3998a = dVar.f3998a;
            dVar2.f3999b = dVar.f3999b;
            Intent[] intentArr = dVar.f4000c;
            dVar2.f4000c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            C0856d dVar3 = this.f4010a;
            dVar3.f4001d = dVar.f4001d;
            dVar3.f4002e = dVar.f4002e;
            dVar3.f4003f = dVar.f4003f;
            dVar3.f4004g = dVar.f4004g;
            dVar3.f4005h = dVar.f4005h;
            dVar3.f4006i = dVar.f4006i;
            dVar3.f4009l = dVar.f4009l;
            C0805v[] vVarArr = dVar.f4007j;
            if (vVarArr != null) {
                dVar3.f4007j = (C0805v[]) Arrays.copyOf(vVarArr, vVarArr.length);
            }
            Set<String> set = dVar.f4008k;
            if (set != null) {
                this.f4010a.f4008k = new HashSet(set);
            }
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4515a(@C0193h0 ComponentName componentName) {
            this.f4010a.f4001d = componentName;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4517a(@C0193h0 C0805v vVar) {
            return mo4522a(new C0805v[]{vVar});
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4522a(@C0193h0 C0805v[] vVarArr) {
            this.f4010a.f4007j = vVarArr;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0857a mo4520a(@C0193h0 Set<String> set) {
            this.f4010a.f4008k = set;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0856d mo4523a() {
            if (!TextUtils.isEmpty(this.f4010a.f4002e)) {
                C0856d dVar = this.f4010a;
                Intent[] intentArr = dVar.f4000c;
                if (intentArr != null && intentArr.length != 0) {
                    return dVar;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @RequiresApi(25)
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        public C0857a(@C0193h0 Context context, @C0193h0 ShortcutInfo shortcutInfo) {
            C0856d dVar = this.f4010a;
            dVar.f3998a = context;
            dVar.f3999b = shortcutInfo.getId();
            Intent[] intents = shortcutInfo.getIntents();
            this.f4010a.f4000c = (Intent[]) Arrays.copyOf(intents, intents.length);
            this.f4010a.f4001d = shortcutInfo.getActivity();
            this.f4010a.f4002e = shortcutInfo.getShortLabel();
            this.f4010a.f4003f = shortcutInfo.getLongLabel();
            this.f4010a.f4004g = shortcutInfo.getDisabledMessage();
            this.f4010a.f4008k = shortcutInfo.getCategories();
            this.f4010a.f4007j = C0856d.m4952b(shortcutInfo.getExtras());
        }
    }

    C0856d() {
    }

    @RequiresApi(22)
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    private PersistableBundle m4953k() {
        PersistableBundle persistableBundle = new PersistableBundle();
        C0805v[] vVarArr = this.f4007j;
        if (vVarArr != null && vVarArr.length > 0) {
            persistableBundle.putInt(f3995m, vVarArr.length);
            int i = 0;
            while (i < this.f4007j.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(f3996n);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.f4007j[i].mo4394j());
                i = i2;
            }
        }
        persistableBundle.putBoolean(f3997o, this.f4009l);
        return persistableBundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Intent mo4505a(Intent intent) {
        Intent[] intentArr = this.f4000c;
        String str = "android.intent.extra.shortcut.NAME";
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra(str, this.f4002e.toString());
        if (this.f4005h != null) {
            Drawable drawable = null;
            if (this.f4006i) {
                PackageManager packageManager = this.f3998a.getPackageManager();
                ComponentName componentName = this.f4001d;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f3998a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f4005h.mo4578a(intent, drawable, this.f3998a);
        }
        return intent;
    }

    @C0195i0
    /* renamed from: b */
    public Set<String> mo4506b() {
        return this.f4008k;
    }

    @C0195i0
    /* renamed from: c */
    public CharSequence mo4507c() {
        return this.f4004g;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public IconCompat mo4508d() {
        return this.f4005h;
    }

    @C0193h0
    /* renamed from: e */
    public String mo4509e() {
        return this.f3999b;
    }

    @C0193h0
    /* renamed from: f */
    public Intent mo4510f() {
        Intent[] intentArr = this.f4000c;
        return intentArr[intentArr.length - 1];
    }

    @C0193h0
    /* renamed from: g */
    public Intent[] mo4511g() {
        Intent[] intentArr = this.f4000c;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    @C0195i0
    /* renamed from: h */
    public CharSequence mo4512h() {
        return this.f4003f;
    }

    @C0193h0
    /* renamed from: i */
    public CharSequence mo4513i() {
        return this.f4002e;
    }

    @RequiresApi(25)
    /* renamed from: j */
    public ShortcutInfo mo4514j() {
        Builder intents = new Builder(this.f3998a, this.f3999b).setShortLabel(this.f4002e).setIntents(this.f4000c);
        IconCompat iconCompat = this.f4005h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.mo4587n());
        }
        if (!TextUtils.isEmpty(this.f4003f)) {
            intents.setLongLabel(this.f4003f);
        }
        if (!TextUtils.isEmpty(this.f4004g)) {
            intents.setDisabledMessage(this.f4004g);
        }
        ComponentName componentName = this.f4001d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f4008k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setExtras(m4953k());
        return intents.build();
    }

    @RequiresApi(25)
    @C0195i0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0224v0
    /* renamed from: b */
    static C0805v[] m4952b(@C0193h0 PersistableBundle persistableBundle) {
        if (persistableBundle != null) {
            String str = f3995m;
            if (persistableBundle.containsKey(str)) {
                int i = persistableBundle.getInt(str);
                C0805v[] vVarArr = new C0805v[i];
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f3996n);
                    int i3 = i2 + 1;
                    sb.append(i3);
                    vVarArr[i2] = C0805v.m4677a(persistableBundle.getPersistableBundle(sb.toString()));
                    i2 = i3;
                }
                return vVarArr;
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: a */
    public ComponentName mo4504a() {
        return this.f4001d;
    }

    @RequiresApi(25)
    @C0195i0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0224v0
    /* renamed from: a */
    static boolean m4951a(@C0193h0 PersistableBundle persistableBundle) {
        if (persistableBundle != null) {
            String str = f3997o;
            if (persistableBundle.containsKey(str)) {
                return persistableBundle.getBoolean(str);
            }
        }
        return false;
    }
}
