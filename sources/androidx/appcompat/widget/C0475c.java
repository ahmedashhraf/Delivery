package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.appcompat.widget.c */
/* compiled from: ActivityChooserModel */
class C0475c extends DataSetObservable {

    /* renamed from: A */
    private static final Object f1889A = new Object();

    /* renamed from: B */
    private static final Map<String, C0475c> f1890B = new HashMap();

    /* renamed from: n */
    static final boolean f1891n = false;

    /* renamed from: o */
    static final String f1892o = C0475c.class.getSimpleName();

    /* renamed from: p */
    static final String f1893p = "historical-records";

    /* renamed from: q */
    static final String f1894q = "historical-record";

    /* renamed from: r */
    static final String f1895r = "activity";

    /* renamed from: s */
    static final String f1896s = "time";

    /* renamed from: t */
    static final String f1897t = "weight";

    /* renamed from: u */
    public static final String f1898u = "activity_choser_model_history.xml";

    /* renamed from: v */
    public static final int f1899v = 50;

    /* renamed from: w */
    private static final int f1900w = 5;

    /* renamed from: x */
    private static final float f1901x = 1.0f;

    /* renamed from: y */
    private static final String f1902y = ".xml";

    /* renamed from: z */
    private static final int f1903z = -1;

    /* renamed from: a */
    private final Object f1904a = new Object();

    /* renamed from: b */
    private final List<C0477b> f1905b = new ArrayList();

    /* renamed from: c */
    private final List<C0480e> f1906c = new ArrayList();

    /* renamed from: d */
    final Context f1907d;

    /* renamed from: e */
    final String f1908e;

    /* renamed from: f */
    private Intent f1909f;

    /* renamed from: g */
    private C0478c f1910g = new C0479d();

    /* renamed from: h */
    private int f1911h = 50;

    /* renamed from: i */
    boolean f1912i = true;

    /* renamed from: j */
    private boolean f1913j = false;

    /* renamed from: k */
    private boolean f1914k = true;

    /* renamed from: l */
    private boolean f1915l = false;

    /* renamed from: m */
    private C0481f f1916m;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* compiled from: ActivityChooserModel */
    public interface C0476a {
        void setActivityChooserModel(C0475c cVar);
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* compiled from: ActivityChooserModel */
    public static final class C0477b implements Comparable<C0477b> {

        /* renamed from: a */
        public final ResolveInfo f1917a;

        /* renamed from: b */
        public float f1918b;

        public C0477b(ResolveInfo resolveInfo) {
            this.f1917a = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(C0477b bVar) {
            return Float.floatToIntBits(bVar.f1918b) - Float.floatToIntBits(this.f1918b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0477b.class != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f1918b) == Float.floatToIntBits(((C0477b) obj).f1918b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1918b) + 31;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.f1917a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f1918b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* compiled from: ActivityChooserModel */
    public interface C0478c {
        /* renamed from: a */
        void mo2508a(Intent intent, List<C0477b> list, List<C0480e> list2);
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* compiled from: ActivityChooserModel */
    private static final class C0479d implements C0478c {

        /* renamed from: b */
        private static final float f1919b = 0.95f;

        /* renamed from: a */
        private final Map<ComponentName, C0477b> f1920a = new HashMap();

        C0479d() {
        }

        /* renamed from: a */
        public void mo2508a(Intent intent, List<C0477b> list, List<C0480e> list2) {
            Map<ComponentName, C0477b> map = this.f1920a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C0477b bVar = (C0477b) list.get(i);
                bVar.f1918b = 0.0f;
                map.put(new ComponentName(bVar.f1917a.activityInfo.packageName, bVar.f1917a.activityInfo.name), bVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                C0480e eVar = (C0480e) list2.get(size2);
                C0477b bVar2 = (C0477b) map.get(eVar.f1921a);
                if (bVar2 != null) {
                    bVar2.f1918b += eVar.f1923c * f;
                    f *= f1919b;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    /* compiled from: ActivityChooserModel */
    public static final class C0480e {

        /* renamed from: a */
        public final ComponentName f1921a;

        /* renamed from: b */
        public final long f1922b;

        /* renamed from: c */
        public final float f1923c;

        public C0480e(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0480e.class != obj.getClass()) {
                return false;
            }
            C0480e eVar = (C0480e) obj;
            ComponentName componentName = this.f1921a;
            if (componentName == null) {
                if (eVar.f1921a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f1921a)) {
                return false;
            }
            return this.f1922b == eVar.f1922b && Float.floatToIntBits(this.f1923c) == Float.floatToIntBits(eVar.f1923c);
        }

        public int hashCode() {
            ComponentName componentName = this.f1921a;
            int hashCode = ((componentName == null ? 0 : componentName.hashCode()) + 31) * 31;
            long j = this.f1922b;
            return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f1923c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.f1921a);
            sb.append("; time:");
            sb.append(this.f1922b);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f1923c));
            sb.append("]");
            return sb.toString();
        }

        public C0480e(ComponentName componentName, long j, float f) {
            this.f1921a = componentName;
            this.f1922b = j;
            this.f1923c = f;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* compiled from: ActivityChooserModel */
    public interface C0481f {
        /* renamed from: a */
        boolean mo2512a(C0475c cVar, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.c$g */
    /* compiled from: ActivityChooserModel */
    private final class C0482g extends AsyncTask<Object, Void, Void> {
        C0482g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
            if (r15 != null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0073, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0 = androidx.appcompat.widget.C0475c.f1892o;
            r0 = new java.lang.StringBuilder();
            r0.append(r2);
            r0.append(r14.f1924a.f1908e);
            r0.toString();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0 = androidx.appcompat.widget.C0475c.f1892o;
            r0 = new java.lang.StringBuilder();
            r0.append(r2);
            r0.append(r14.f1924a.f1908e);
            r0.toString();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
            r14.f1924a.f1912i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a8, code lost:
            if (r15 == null) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r0 = androidx.appcompat.widget.C0475c.f1892o;
            r0 = new java.lang.StringBuilder();
            r0.append(r2);
            r0.append(r14.f1924a.f1908e);
            r0.toString();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bf, code lost:
            r14.f1924a.f1912i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
            if (r15 == null) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
            r14.f1924a.f1912i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cb, code lost:
            if (r15 != null) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x0075, B:18:0x0090, B:22:0x00ab] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00ab */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.c r7 = androidx.appcompat.widget.C0475c.this     // Catch:{ FileNotFoundException -> 0x00d1 }
                android.content.Context r7 = r7.f1907d     // Catch:{ FileNotFoundException -> 0x00d1 }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00d1 }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r9 = 0
            L_0x0031:
                if (r9 >= r8) goto L_0x0063
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                androidx.appcompat.widget.c$e r10 = (androidx.appcompat.widget.C0475c.C0480e) r10     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.f1921a     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                java.lang.String r12 = r12.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                java.lang.String r11 = "time"
                long r12 = r10.f1922b     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                java.lang.String r11 = "weight"
                float r10 = r10.f1923c     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                int r9 = r9 + 1
                goto L_0x0031
            L_0x0063:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x00ab, IllegalStateException -> 0x0090, IOException -> 0x0075 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0475c.this
                r0.f1912i = r5
                if (r15 == 0) goto L_0x00c6
            L_0x006f:
                r15.close()     // Catch:{ IOException -> 0x00c6 }
                goto L_0x00c6
            L_0x0073:
                r0 = move-exception
                goto L_0x00c7
            L_0x0075:
                java.lang.String r0 = androidx.appcompat.widget.C0475c.f1892o     // Catch:{ all -> 0x0073 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r0.<init>()     // Catch:{ all -> 0x0073 }
                r0.append(r2)     // Catch:{ all -> 0x0073 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0475c.this     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.f1908e     // Catch:{ all -> 0x0073 }
                r0.append(r1)     // Catch:{ all -> 0x0073 }
                r0.toString()     // Catch:{ all -> 0x0073 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0475c.this
                r0.f1912i = r5
                if (r15 == 0) goto L_0x00c6
                goto L_0x006f
            L_0x0090:
                java.lang.String r0 = androidx.appcompat.widget.C0475c.f1892o     // Catch:{ all -> 0x0073 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r0.<init>()     // Catch:{ all -> 0x0073 }
                r0.append(r2)     // Catch:{ all -> 0x0073 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0475c.this     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.f1908e     // Catch:{ all -> 0x0073 }
                r0.append(r1)     // Catch:{ all -> 0x0073 }
                r0.toString()     // Catch:{ all -> 0x0073 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0475c.this
                r0.f1912i = r5
                if (r15 == 0) goto L_0x00c6
                goto L_0x006f
            L_0x00ab:
                java.lang.String r0 = androidx.appcompat.widget.C0475c.f1892o     // Catch:{ all -> 0x0073 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
                r0.<init>()     // Catch:{ all -> 0x0073 }
                r0.append(r2)     // Catch:{ all -> 0x0073 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0475c.this     // Catch:{ all -> 0x0073 }
                java.lang.String r1 = r1.f1908e     // Catch:{ all -> 0x0073 }
                r0.append(r1)     // Catch:{ all -> 0x0073 }
                r0.toString()     // Catch:{ all -> 0x0073 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.C0475c.this
                r0.f1912i = r5
                if (r15 == 0) goto L_0x00c6
                goto L_0x006f
            L_0x00c6:
                return r6
            L_0x00c7:
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.C0475c.this
                r1.f1912i = r5
                if (r15 == 0) goto L_0x00d0
                r15.close()     // Catch:{ IOException -> 0x00d0 }
            L_0x00d0:
                throw r0
            L_0x00d1:
                java.lang.String r0 = androidx.appcompat.widget.C0475c.f1892o
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r15)
                r0.toString()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0475c.C0482g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private C0475c(Context context, String str) {
        this.f1907d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str)) {
            String str2 = f1902y;
            if (!str.endsWith(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                this.f1908e = sb.toString();
                return;
            }
        }
        this.f1908e = str;
    }

    /* renamed from: a */
    public static C0475c m2615a(Context context, String str) {
        C0475c cVar;
        synchronized (f1889A) {
            cVar = (C0475c) f1890B.get(str);
            if (cVar == null) {
                cVar = new C0475c(context, str);
                f1890B.put(str, cVar);
            }
        }
        return cVar;
    }

    /* renamed from: f */
    private void m2617f() {
        boolean g = m2618g() | m2621j();
        m2620i();
        if (g) {
            m2623l();
            notifyChanged();
        }
    }

    /* renamed from: g */
    private boolean m2618g() {
        if (!this.f1915l || this.f1909f == null) {
            return false;
        }
        this.f1915l = false;
        this.f1905b.clear();
        List queryIntentActivities = this.f1907d.getPackageManager().queryIntentActivities(this.f1909f, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1905b.add(new C0477b((ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: h */
    private void m2619h() {
        if (!this.f1913j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1914k) {
            this.f1914k = false;
            if (!TextUtils.isEmpty(this.f1908e)) {
                new C0482g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f1906c), this.f1908e});
            }
        }
    }

    /* renamed from: i */
    private void m2620i() {
        int size = this.f1906c.size() - this.f1911h;
        if (size > 0) {
            this.f1914k = true;
            for (int i = 0; i < size; i++) {
                C0480e eVar = (C0480e) this.f1906c.remove(0);
            }
        }
    }

    /* renamed from: j */
    private boolean m2621j() {
        if (!this.f1912i || !this.f1914k || TextUtils.isEmpty(this.f1908e)) {
            return false;
        }
        this.f1912i = false;
        this.f1913j = true;
        m2622k();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r1 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0086 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2622k() {
        /*
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.f1907d     // Catch:{ FileNotFoundException -> 0x00b3 }
            java.lang.String r2 = r10.f1908e     // Catch:{ FileNotFoundException -> 0x00b3 }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x00b3 }
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            r3 = 0
        L_0x0014:
            r4 = 1
            if (r3 == r4) goto L_0x001f
            r5 = 2
            if (r3 == r5) goto L_0x001f
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            goto L_0x0014
        L_0x001f:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            if (r3 == 0) goto L_0x007c
            java.util.List<androidx.appcompat.widget.c$e> r3 = r10.f1906c     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            r3.clear()     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
        L_0x0030:
            int r5 = r2.next()     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            if (r5 != r4) goto L_0x003d
            if (r1 == 0) goto L_0x00ac
        L_0x0038:
            r1.close()     // Catch:{ IOException -> 0x00ac }
            goto L_0x00ac
        L_0x003d:
            r6 = 3
            if (r5 == r6) goto L_0x0030
            r6 = 4
            if (r5 != r6) goto L_0x0044
            goto L_0x0030
        L_0x0044:
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            androidx.appcompat.widget.c$e r9 = new androidx.appcompat.widget.c$e     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            r9.<init>(r5, r7, r6)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            r3.add(r9)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            goto L_0x0030
        L_0x0074:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
        L_0x007c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0086 }
        L_0x0084:
            r0 = move-exception
            goto L_0x00ad
        L_0x0086:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r2.<init>()     // Catch:{ all -> 0x0084 }
            r2.append(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r10.f1908e     // Catch:{ all -> 0x0084 }
            r2.append(r0)     // Catch:{ all -> 0x0084 }
            r2.toString()     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x00ac
            goto L_0x0038
        L_0x0099:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r2.<init>()     // Catch:{ all -> 0x0084 }
            r2.append(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r10.f1908e     // Catch:{ all -> 0x0084 }
            r2.append(r0)     // Catch:{ all -> 0x0084 }
            r2.toString()     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x00ac
            goto L_0x0038
        L_0x00ac:
            return
        L_0x00ad:
            if (r1 == 0) goto L_0x00b2
            r1.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            throw r0
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0475c.m2622k():void");
    }

    /* renamed from: l */
    private boolean m2623l() {
        if (this.f1910g == null || this.f1909f == null || this.f1905b.isEmpty() || this.f1906c.isEmpty()) {
            return false;
        }
        this.f1910g.mo2508a(this.f1909f, this.f1905b, Collections.unmodifiableList(this.f1906c));
        return true;
    }

    /* renamed from: b */
    public ResolveInfo mo2497b(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1904a) {
            m2617f();
            resolveInfo = ((C0477b) this.f1905b.get(i)).f1917a;
        }
        return resolveInfo;
    }

    /* renamed from: c */
    public void mo2499c(int i) {
        synchronized (this.f1904a) {
            m2617f();
            C0477b bVar = (C0477b) this.f1905b.get(i);
            C0477b bVar2 = (C0477b) this.f1905b.get(0);
            m2616a(new C0480e(new ComponentName(bVar.f1917a.activityInfo.packageName, bVar.f1917a.activityInfo.name), System.currentTimeMillis(), bVar2 != null ? (bVar2.f1918b - bVar.f1918b) + 5.0f : 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2501d(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1904a
            monitor-enter(r0)
            int r1 = r2.f1911h     // Catch:{ all -> 0x0019 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0009:
            r2.f1911h = r3     // Catch:{ all -> 0x0019 }
            r2.m2620i()     // Catch:{ all -> 0x0019 }
            boolean r3 = r2.m2623l()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            r2.notifyChanged()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0475c.mo2501d(int):void");
    }

    /* renamed from: e */
    public Intent mo2502e() {
        Intent intent;
        synchronized (this.f1904a) {
            intent = this.f1909f;
        }
        return intent;
    }

    /* renamed from: b */
    public ResolveInfo mo2496b() {
        synchronized (this.f1904a) {
            m2617f();
            if (this.f1905b.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C0477b) this.f1905b.get(0)).f1917a;
            return resolveInfo;
        }
    }

    /* renamed from: a */
    public void mo2493a(Intent intent) {
        synchronized (this.f1904a) {
            if (this.f1909f != intent) {
                this.f1909f = intent;
                this.f1915l = true;
                m2617f();
            }
        }
    }

    /* renamed from: d */
    public int mo2500d() {
        int size;
        synchronized (this.f1904a) {
            m2617f();
            size = this.f1906c.size();
        }
        return size;
    }

    /* renamed from: c */
    public int mo2498c() {
        int i;
        synchronized (this.f1904a) {
            i = this.f1911h;
        }
        return i;
    }

    /* renamed from: a */
    public int mo2490a() {
        int size;
        synchronized (this.f1904a) {
            m2617f();
            size = this.f1905b.size();
        }
        return size;
    }

    /* renamed from: a */
    public int mo2491a(ResolveInfo resolveInfo) {
        synchronized (this.f1904a) {
            m2617f();
            List<C0477b> list = this.f1905b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C0477b) list.get(i)).f1917a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public Intent mo2492a(int i) {
        synchronized (this.f1904a) {
            if (this.f1909f == null) {
                return null;
            }
            m2617f();
            C0477b bVar = (C0477b) this.f1905b.get(i);
            ComponentName componentName = new ComponentName(bVar.f1917a.activityInfo.packageName, bVar.f1917a.activityInfo.name);
            Intent intent = new Intent(this.f1909f);
            intent.setComponent(componentName);
            if (this.f1916m != null) {
                if (this.f1916m.mo2512a(this, new Intent(intent))) {
                    return null;
                }
            }
            m2616a(new C0480e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: a */
    public void mo2495a(C0481f fVar) {
        synchronized (this.f1904a) {
            this.f1916m = fVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2494a(androidx.appcompat.widget.C0475c.C0478c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1904a
            monitor-enter(r0)
            androidx.appcompat.widget.c$c r1 = r2.f1910g     // Catch:{ all -> 0x0016 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            r2.f1910g = r3     // Catch:{ all -> 0x0016 }
            boolean r3 = r2.m2623l()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            r2.notifyChanged()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0475c.mo2494a(androidx.appcompat.widget.c$c):void");
    }

    /* renamed from: a */
    private boolean m2616a(C0480e eVar) {
        boolean add = this.f1906c.add(eVar);
        if (add) {
            this.f1914k = true;
            m2620i();
            m2619h();
            m2623l();
            notifyChanged();
        }
        return add;
    }
}
