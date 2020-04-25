package androidx.core.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: androidx.core.app.w */
/* compiled from: RemoteInput */
public final class C0807w {

    /* renamed from: g */
    private static final String f3856g = "RemoteInput";

    /* renamed from: h */
    public static final String f3857h = "android.remoteinput.results";

    /* renamed from: i */
    public static final String f3858i = "android.remoteinput.resultsData";

    /* renamed from: j */
    private static final String f3859j = "android.remoteinput.dataTypeResultsData";

    /* renamed from: k */
    private static final String f3860k = "android.remoteinput.resultsSource";

    /* renamed from: l */
    public static final int f3861l = 0;

    /* renamed from: m */
    public static final int f3862m = 1;

    /* renamed from: a */
    private final String f3863a;

    /* renamed from: b */
    private final CharSequence f3864b;

    /* renamed from: c */
    private final CharSequence[] f3865c;

    /* renamed from: d */
    private final boolean f3866d;

    /* renamed from: e */
    private final Bundle f3867e;

    /* renamed from: f */
    private final Set<String> f3868f;

    /* renamed from: androidx.core.app.w$a */
    /* compiled from: RemoteInput */
    public static final class C0808a {

        /* renamed from: a */
        private final String f3869a;

        /* renamed from: b */
        private final Set<String> f3870b = new HashSet();

        /* renamed from: c */
        private final Bundle f3871c = new Bundle();

        /* renamed from: d */
        private CharSequence f3872d;

        /* renamed from: e */
        private CharSequence[] f3873e;

        /* renamed from: f */
        private boolean f3874f = true;

        public C0808a(@C0193h0 String str) {
            if (str != null) {
                this.f3869a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @C0193h0
        /* renamed from: a */
        public C0808a mo4410a(@C0195i0 CharSequence charSequence) {
            this.f3872d = charSequence;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public Bundle mo4415b() {
            return this.f3871c;
        }

        @C0193h0
        /* renamed from: a */
        public C0808a mo4413a(@C0195i0 CharSequence[] charSequenceArr) {
            this.f3873e = charSequenceArr;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0808a mo4411a(@C0193h0 String str, boolean z) {
            if (z) {
                this.f3870b.add(str);
            } else {
                this.f3870b.remove(str);
            }
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0808a mo4412a(boolean z) {
            this.f3874f = z;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0808a mo4409a(@C0193h0 Bundle bundle) {
            if (bundle != null) {
                this.f3871c.putAll(bundle);
            }
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C0807w mo4414a() {
            C0807w wVar = new C0807w(this.f3869a, this.f3872d, this.f3873e, this.f3874f, this.f3871c, this.f3870b);
            return wVar;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.app.w$b */
    /* compiled from: RemoteInput */
    public @interface C0809b {
    }

    C0807w(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle, Set<String> set) {
        this.f3863a = str;
        this.f3864b = charSequence;
        this.f3865c = charSequenceArr;
        this.f3866d = z;
        this.f3867e = bundle;
        this.f3868f = set;
    }

    /* renamed from: a */
    public boolean mo4402a() {
        return this.f3866d;
    }

    /* renamed from: b */
    public Set<String> mo4403b() {
        return this.f3868f;
    }

    /* renamed from: c */
    public CharSequence[] mo4404c() {
        return this.f3865c;
    }

    /* renamed from: d */
    public Bundle mo4405d() {
        return this.f3867e;
    }

    /* renamed from: e */
    public CharSequence mo4406e() {
        return this.f3864b;
    }

    /* renamed from: f */
    public String mo4407f() {
        return this.f3863a;
    }

    /* renamed from: g */
    public boolean mo4408g() {
        return !mo4402a() && (mo4404c() == null || mo4404c().length == 0) && mo4403b() != null && !mo4403b().isEmpty();
    }

    /* renamed from: a */
    public static Map<String, Uri> m4698a(Intent intent, String str) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }
        if (i < 16) {
            return null;
        }
        Intent a = m4696a(intent);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : a.getExtras().keySet()) {
            if (str2.startsWith(f3859j)) {
                String substring = str2.substring(39);
                if (!substring.isEmpty()) {
                    String string = a.getBundleExtra(str2).getString(str);
                    if (string != null && !string.isEmpty()) {
                        hashMap.put(substring, Uri.parse(string));
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            hashMap = null;
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Bundle m4703b(Intent intent) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            return RemoteInput.getResultsFromIntent(intent);
        }
        if (i < 16) {
            return null;
        }
        Intent a = m4696a(intent);
        if (a == null) {
            return null;
        }
        return (Bundle) a.getExtras().getParcelable(f3858i);
    }

    /* renamed from: c */
    public static int m4704c(@C0193h0 Intent intent) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return RemoteInput.getResultsSource(intent);
        }
        if (i < 16) {
            return 0;
        }
        Intent a = m4696a(intent);
        if (a == null) {
            return 0;
        }
        return a.getExtras().getInt(f3860k, 0);
    }

    /* renamed from: a */
    public static void m4701a(C0807w[] wVarArr, Intent intent, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            RemoteInput.addResultsToIntent(m4702a(wVarArr), intent, bundle);
            return;
        }
        if (i >= 20) {
            Bundle b = m4703b(intent);
            int c = m4704c(intent);
            if (b != null) {
                b.putAll(bundle);
                bundle = b;
            }
            for (C0807w wVar : wVarArr) {
                Map a = m4698a(intent, wVar.mo4407f());
                RemoteInput.addResultsToIntent(m4702a(new C0807w[]{wVar}), intent, bundle);
                if (a != null) {
                    m4700a(wVar, intent, a);
                }
            }
            m4699a(intent, c);
        } else if (i >= 16) {
            Intent a2 = m4696a(intent);
            if (a2 == null) {
                a2 = new Intent();
            }
            String str = f3858i;
            Bundle bundleExtra = a2.getBundleExtra(str);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            for (C0807w wVar2 : wVarArr) {
                Object obj = bundle.get(wVar2.mo4407f());
                if (obj instanceof CharSequence) {
                    bundleExtra.putCharSequence(wVar2.mo4407f(), (CharSequence) obj);
                }
            }
            a2.putExtra(str, bundleExtra);
            intent.setClipData(ClipData.newIntent(f3857h, a2));
        }
    }

    /* renamed from: a */
    public static void m4700a(C0807w wVar, Intent intent, Map<String, Uri> map) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            RemoteInput.addDataResultToIntent(m4695a(wVar), intent, map);
        } else if (i >= 16) {
            Intent a = m4696a(intent);
            if (a == null) {
                a = new Intent();
            }
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Uri uri = (Uri) entry.getValue();
                if (str != null) {
                    Bundle bundleExtra = a.getBundleExtra(m4697a(str));
                    if (bundleExtra == null) {
                        bundleExtra = new Bundle();
                    }
                    bundleExtra.putString(wVar.mo4407f(), uri.toString());
                    a.putExtra(m4697a(str), bundleExtra);
                }
            }
            intent.setClipData(ClipData.newIntent(f3857h, a));
        }
    }

    /* renamed from: a */
    public static void m4699a(@C0193h0 Intent intent, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 28) {
            RemoteInput.setResultsSource(intent, i);
        } else if (i2 >= 16) {
            Intent a = m4696a(intent);
            if (a == null) {
                a = new Intent();
            }
            a.putExtra(f3860k, i);
            intent.setClipData(ClipData.newIntent(f3857h, a));
        }
    }

    /* renamed from: a */
    private static String m4697a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f3859j);
        sb.append(str);
        return sb.toString();
    }

    @RequiresApi(20)
    /* renamed from: a */
    static RemoteInput[] m4702a(C0807w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int i = 0; i < wVarArr.length; i++) {
            remoteInputArr[i] = m4695a(wVarArr[i]);
        }
        return remoteInputArr;
    }

    @RequiresApi(20)
    /* renamed from: a */
    static RemoteInput m4695a(C0807w wVar) {
        return new Builder(wVar.mo4407f()).setLabel(wVar.mo4406e()).setChoices(wVar.mo4404c()).setAllowFreeFormInput(wVar.mo4402a()).addExtras(wVar.mo4405d()).build();
    }

    @RequiresApi(16)
    /* renamed from: a */
    private static Intent m4696a(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().equals(f3857h)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }
}
