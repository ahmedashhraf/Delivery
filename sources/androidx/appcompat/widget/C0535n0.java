package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.C0238R;
import androidx.core.content.C0841b;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.analytics.FirebaseAnalytics.C5853a;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.webservice.C11687c;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p053b.p059b.p060b.C2097c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.n0 */
/* compiled from: SuggestionsAdapter */
class C0535n0 extends C2097c implements OnClickListener {

    /* renamed from: o0 */
    private static final boolean f2126o0 = false;

    /* renamed from: p0 */
    private static final String f2127p0 = "SuggestionsAdapter";

    /* renamed from: q0 */
    private static final int f2128q0 = 50;

    /* renamed from: r0 */
    static final int f2129r0 = 0;

    /* renamed from: s0 */
    static final int f2130s0 = 1;

    /* renamed from: t0 */
    static final int f2131t0 = 2;

    /* renamed from: u0 */
    static final int f2132u0 = -1;

    /* renamed from: Z */
    private final SearchManager f2133Z = ((SearchManager) this.f7965O.getSystemService(C5853a.f16884q));

    /* renamed from: a0 */
    private final SearchView f2134a0;

    /* renamed from: b0 */
    private final SearchableInfo f2135b0;

    /* renamed from: c0 */
    private final Context f2136c0;

    /* renamed from: d0 */
    private final WeakHashMap<String, ConstantState> f2137d0;

    /* renamed from: e0 */
    private final int f2138e0;

    /* renamed from: f0 */
    private boolean f2139f0 = false;

    /* renamed from: g0 */
    private int f2140g0 = 1;

    /* renamed from: h0 */
    private ColorStateList f2141h0;

    /* renamed from: i0 */
    private int f2142i0 = -1;

    /* renamed from: j0 */
    private int f2143j0 = -1;

    /* renamed from: k0 */
    private int f2144k0 = -1;

    /* renamed from: l0 */
    private int f2145l0 = -1;

    /* renamed from: m0 */
    private int f2146m0 = -1;

    /* renamed from: n0 */
    private int f2147n0 = -1;

    /* renamed from: androidx.appcompat.widget.n0$a */
    /* compiled from: SuggestionsAdapter */
    private static final class C0536a {

        /* renamed from: a */
        public final TextView f2148a;

        /* renamed from: b */
        public final TextView f2149b;

        /* renamed from: c */
        public final ImageView f2150c;

        /* renamed from: d */
        public final ImageView f2151d;

        /* renamed from: e */
        public final ImageView f2152e;

        public C0536a(View view) {
            this.f2148a = (TextView) view.findViewById(16908308);
            this.f2149b = (TextView) view.findViewById(16908309);
            this.f2150c = (ImageView) view.findViewById(16908295);
            this.f2151d = (ImageView) view.findViewById(16908296);
            this.f2152e = (ImageView) view.findViewById(C0238R.C0241id.edit_query);
        }
    }

    public C0535n0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2134a0 = searchView;
        this.f2135b0 = searchableInfo;
        this.f2138e0 = searchView.getSuggestionCommitIconResId();
        this.f2136c0 = context;
        this.f2137d0 = weakHashMap;
    }

    /* renamed from: f */
    private Drawable m2866f(Cursor cursor) {
        int i = this.f2146m0;
        if (i == -1) {
            return null;
        }
        return m2862b(cursor.getString(i));
    }

    /* renamed from: g */
    private void m2867g(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean(C11644i.f33334j3)) {
        }
    }

    /* renamed from: a */
    public Cursor mo2814a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2134a0.getVisibility() == 0 && this.f2134a0.getWindowVisibility() == 0) {
            try {
                Cursor a = mo2813a(this.f2135b0, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo2819b(Cursor cursor) {
        if (this.f2139f0) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo2819b(cursor);
            if (cursor != null) {
                this.f2142i0 = cursor.getColumnIndex("suggest_text_1");
                this.f2143j0 = cursor.getColumnIndex("suggest_text_2");
                this.f2144k0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f2145l0 = cursor.getColumnIndex("suggest_icon_1");
                this.f2146m0 = cursor.getColumnIndex("suggest_icon_2");
                this.f2147n0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo2820c(int i) {
        this.f2140g0 = i;
    }

    /* renamed from: d */
    public void mo2821d() {
        mo2819b((Cursor) null);
        this.f2139f0 = true;
    }

    /* renamed from: e */
    public int mo2822e() {
        return this.f2140g0;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View a = mo9084a(this.f7965O, this.f7964N, viewGroup);
            if (a != null) {
                ((C0536a) a.getTag()).f2148a.setText(e.toString());
            }
            return a;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View b = mo2818b(this.f7965O, this.f7964N, viewGroup);
            if (b != null) {
                ((C0536a) b.getTag()).f2148a.setText(e.toString());
            }
            return b;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2867g(mo9083a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2867g(mo9083a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2134a0.mo2204a((CharSequence) tag);
        }
    }

    /* renamed from: e */
    private Drawable m2865e(Cursor cursor) {
        int i = this.f2145l0;
        if (i == -1) {
            return null;
        }
        Drawable b = m2862b(cursor.getString(i));
        if (b != null) {
            return b;
        }
        return m2864d(cursor);
    }

    /* renamed from: d */
    private Drawable m2864d(Cursor cursor) {
        Drawable b = m2860b(this.f2135b0.getSearchActivity());
        if (b != null) {
            return b;
        }
        return this.f7965O.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    public void mo2817a(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0536a aVar = (C0536a) view.getTag();
        int i = this.f2147n0;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f2148a != null) {
            m2858a(aVar.f2148a, (CharSequence) m2855a(cursor, this.f2142i0));
        }
        if (aVar.f2149b != null) {
            String a = m2855a(cursor, this.f2144k0);
            if (a != null) {
                charSequence = m2863b((CharSequence) a);
            } else {
                charSequence = m2855a(cursor, this.f2143j0);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f2148a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2148a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2148a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2148a.setMaxLines(1);
                }
            }
            m2858a(aVar.f2149b, charSequence);
        }
        ImageView imageView = aVar.f2150c;
        if (imageView != null) {
            m2857a(imageView, m2865e(cursor), 4);
        }
        ImageView imageView2 = aVar.f2151d;
        if (imageView2 != null) {
            m2857a(imageView2, m2866f(cursor), 8);
        }
        int i3 = this.f2140g0;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f2152e.setVisibility(0);
            aVar.f2152e.setTag(aVar.f2148a.getText());
            aVar.f2152e.setOnClickListener(this);
            return;
        }
        aVar.f2152e.setVisibility(8);
    }

    /* renamed from: b */
    public View mo2818b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = super.mo2818b(context, cursor, viewGroup);
        b.setTag(new C0536a(b));
        ((ImageView) b.findViewById(C0238R.C0241id.edit_query)).setImageResource(this.f2138e0);
        return b;
    }

    /* renamed from: b */
    private CharSequence m2863b(CharSequence charSequence) {
        if (this.f2141h0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f7965O.getTheme().resolveAttribute(C0238R.attr.textColorSearchUrl, typedValue, true);
            this.f2141h0 = this.f7965O.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.f2141h0, null);
        spannableString.setSpan(textAppearanceSpan, 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: b */
    private Drawable m2862b(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                sb.append(this.f2136c0.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String sb2 = sb.toString();
                Drawable a = m2854a(sb2);
                if (a != null) {
                    return a;
                }
                Drawable c = C0841b.m4928c(this.f2136c0, parseInt);
                m2859a(sb2, c);
                return c;
            } catch (NumberFormatException unused) {
                Drawable a2 = m2854a(str);
                if (a2 != null) {
                    return a2;
                }
                drawable = m2861b(Uri.parse(str));
                m2859a(str, drawable);
            } catch (NotFoundException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Icon resource not found: ");
                sb3.append(str);
                sb3.toString();
                return null;
            }
        }
        return drawable;
    }

    /* renamed from: a */
    private void m2858a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Resource does not exist: ");
        r2.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0053=Splitter:B:22:0x0053, B:4:0x000f=Splitter:B:4:0x000f, B:16:0x003f=Splitter:B:16:0x003f} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2861b(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Error closing icon stream for "
            r1 = 0
            java.lang.String r2 = r5.getScheme()     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x0079 }
            if (r2 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r5 = r4.mo2815a(r5)     // Catch:{ NotFoundException -> 0x0014 }
            return r5
        L_0x0014:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0079 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x002b:
            android.content.Context r2 = r4.f2136c0     // Catch:{ FileNotFoundException -> 0x0079 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0079 }
            java.io.InputStream r2 = r2.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0079 }
            if (r2 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r1)     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x004d
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x004d:
            return r3
        L_0x004e:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0061
        L_0x0053:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x0061:
            throw r3     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x0062:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0079 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0079 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0079 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0079 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon not found: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0535n0.m2861b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private void m2857a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    public CharSequence mo2816a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m2856a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f2135b0.shouldRewriteQueryFromData()) {
            String a2 = m2856a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f2135b0.shouldRewriteQueryFromText()) {
            String a3 = m2856a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    /* renamed from: a */
    private Drawable m2854a(String str) {
        ConstantState constantState = (ConstantState) this.f2137d0.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.graphics.drawable.Drawable, android.graphics.drawable.Drawable$ConstantState]
      uses: [java.lang.Object, android.graphics.drawable.Drawable]
      mth insns count: 21
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2860b(android.content.ComponentName r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f2137d0
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f2137d0
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            android.content.Context r0 = r3.f2136c0
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L_0x0022:
            return r2
        L_0x0023:
            android.graphics.drawable.Drawable r4 = r3.m2853a(r4)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L_0x002e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f2137d0
            r1.put(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0535n0.m2860b(android.content.ComponentName):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private void m2859a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2137d0.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: a */
    private Drawable m2853a(ComponentName componentName) {
        PackageManager packageManager = this.f7965O.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            sb.toString();
            return null;
        } catch (NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: a */
    public static String m2856a(Cursor cursor, String str) {
        return m2855a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m2855a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Drawable mo2815a(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f7965O.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo2813a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder authority = new Builder().scheme("content").authority(suggestAuthority);
        String str2 = "";
        Builder fragment = authority.query(str2).fragment(str2);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter(C11687c.f33846v0, String.valueOf(i));
        }
        return this.f7965O.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }
}
