package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.C0214q0;
import androidx.core.content.C0844c;
import java.util.ArrayList;
import org.jivesoftware.smack.util.StringUtils;

/* renamed from: androidx.core.app.y */
/* compiled from: ShareCompat */
public final class C0812y {

    /* renamed from: a */
    public static final String f3878a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b */
    public static final String f3879b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c */
    public static final String f3880c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d */
    public static final String f3881d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e */
    private static final String f3882e = ".sharecompat_";

    /* renamed from: androidx.core.app.y$a */
    /* compiled from: ShareCompat */
    public static class C0813a {

        /* renamed from: a */
        private Activity f3883a;

        /* renamed from: b */
        private Intent f3884b = new Intent().setAction("android.intent.action.SEND");

        /* renamed from: c */
        private CharSequence f3885c;

        /* renamed from: d */
        private ArrayList<String> f3886d;

        /* renamed from: e */
        private ArrayList<String> f3887e;

        /* renamed from: f */
        private ArrayList<String> f3888f;

        /* renamed from: g */
        private ArrayList<Uri> f3889g;

        private C0813a(Activity activity) {
            this.f3883a = activity;
            this.f3884b.putExtra(C0812y.f3878a, activity.getPackageName());
            this.f3884b.putExtra(C0812y.f3879b, activity.getPackageName());
            this.f3884b.putExtra(C0812y.f3880c, activity.getComponentName());
            this.f3884b.putExtra(C0812y.f3881d, activity.getComponentName());
            this.f3884b.addFlags(524288);
        }

        /* renamed from: a */
        public static C0813a m4724a(Activity activity) {
            return new C0813a(activity);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Activity mo4422b() {
            return this.f3883a;
        }

        /* renamed from: c */
        public Intent mo4427c() {
            ArrayList<String> arrayList = this.f3886d;
            if (arrayList != null) {
                m4725a("android.intent.extra.EMAIL", arrayList);
                this.f3886d = null;
            }
            ArrayList<String> arrayList2 = this.f3887e;
            if (arrayList2 != null) {
                m4725a("android.intent.extra.CC", arrayList2);
                this.f3887e = null;
            }
            ArrayList<String> arrayList3 = this.f3888f;
            if (arrayList3 != null) {
                m4725a("android.intent.extra.BCC", arrayList3);
                this.f3888f = null;
            }
            ArrayList<Uri> arrayList4 = this.f3889g;
            boolean z = true;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                z = false;
            }
            String str = "android.intent.action.SEND_MULTIPLE";
            boolean equals = this.f3884b.getAction().equals(str);
            String str2 = "android.intent.extra.STREAM";
            if (!z && equals) {
                this.f3884b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f3889g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f3884b.removeExtra(str2);
                } else {
                    this.f3884b.putExtra(str2, (Parcelable) this.f3889g.get(0));
                }
                this.f3889g = null;
            }
            if (z && !equals) {
                this.f3884b.setAction(str);
                ArrayList<Uri> arrayList6 = this.f3889g;
                if (arrayList6 == null || arrayList6.isEmpty()) {
                    this.f3884b.removeExtra(str2);
                } else {
                    this.f3884b.putParcelableArrayListExtra(str2, this.f3889g);
                }
            }
            return this.f3884b;
        }

        /* renamed from: d */
        public void mo4432d() {
            this.f3883a.startActivity(mo4416a());
        }

        /* renamed from: e */
        public C0813a mo4434e(String[] strArr) {
            this.f3884b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        /* renamed from: f */
        public C0813a mo4435f(String str) {
            this.f3884b.setType(str);
            return this;
        }

        /* renamed from: a */
        private void m4725a(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f3884b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f3884b.putExtra(str, strArr);
        }

        /* renamed from: b */
        public C0813a mo4424b(CharSequence charSequence) {
            this.f3884b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        /* renamed from: d */
        public C0813a mo4430d(String str) {
            this.f3884b.putExtra(C0844c.f3986a, str);
            if (!this.f3884b.hasExtra("android.intent.extra.TEXT")) {
                mo4424b((CharSequence) Html.fromHtml(str));
            }
            return this;
        }

        /* renamed from: e */
        public C0813a mo4433e(String str) {
            this.f3884b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        /* renamed from: f */
        public C0813a mo4436f(String[] strArr) {
            if (this.f3886d != null) {
                this.f3886d = null;
            }
            this.f3884b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        /* renamed from: b */
        public C0813a mo4423b(Uri uri) {
            String str = "android.intent.action.SEND";
            if (!this.f3884b.getAction().equals(str)) {
                this.f3884b.setAction(str);
            }
            this.f3889g = null;
            this.f3884b.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        /* renamed from: d */
        public C0813a mo4431d(String[] strArr) {
            this.f3884b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        /* renamed from: b */
        public C0813a mo4425b(String str) {
            if (this.f3887e == null) {
                this.f3887e = new ArrayList<>();
            }
            this.f3887e.add(str);
            return this;
        }

        /* renamed from: a */
        private void m4726a(String str, String[] strArr) {
            Intent c = mo4427c();
            String[] stringArrayExtra = c.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[(strArr.length + length)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            c.putExtra(str, strArr2);
        }

        /* renamed from: b */
        public C0813a mo4426b(String[] strArr) {
            m4726a("android.intent.extra.CC", strArr);
            return this;
        }

        /* renamed from: a */
        public Intent mo4416a() {
            return Intent.createChooser(mo4427c(), this.f3885c);
        }

        /* renamed from: a */
        public C0813a mo4419a(CharSequence charSequence) {
            this.f3885c = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0813a mo4417a(@C0214q0 int i) {
            return mo4419a(this.f3883a.getText(i));
        }

        /* renamed from: a */
        public C0813a mo4418a(Uri uri) {
            String str = "android.intent.extra.STREAM";
            Uri uri2 = (Uri) this.f3884b.getParcelableExtra(str);
            if (this.f3889g == null && uri2 == null) {
                return mo4423b(uri);
            }
            if (this.f3889g == null) {
                this.f3889g = new ArrayList<>();
            }
            if (uri2 != null) {
                this.f3884b.removeExtra(str);
                this.f3889g.add(uri2);
            }
            this.f3889g.add(uri);
            return this;
        }

        /* renamed from: c */
        public C0813a mo4428c(String str) {
            if (this.f3886d == null) {
                this.f3886d = new ArrayList<>();
            }
            this.f3886d.add(str);
            return this;
        }

        /* renamed from: c */
        public C0813a mo4429c(String[] strArr) {
            m4726a("android.intent.extra.EMAIL", strArr);
            return this;
        }

        /* renamed from: a */
        public C0813a mo4420a(String str) {
            if (this.f3888f == null) {
                this.f3888f = new ArrayList<>();
            }
            this.f3888f.add(str);
            return this;
        }

        /* renamed from: a */
        public C0813a mo4421a(String[] strArr) {
            m4726a("android.intent.extra.BCC", strArr);
            return this;
        }
    }

    /* renamed from: androidx.core.app.y$b */
    /* compiled from: ShareCompat */
    public static class C0814b {

        /* renamed from: f */
        private static final String f3890f = "IntentReader";

        /* renamed from: a */
        private Activity f3891a;

        /* renamed from: b */
        private Intent f3892b;

        /* renamed from: c */
        private String f3893c;

        /* renamed from: d */
        private ComponentName f3894d;

        /* renamed from: e */
        private ArrayList<Uri> f3895e;

        private C0814b(Activity activity) {
            this.f3891a = activity;
            this.f3892b = activity.getIntent();
            this.f3893c = C0812y.m4723b(activity);
            this.f3894d = C0812y.m4720a(activity);
        }

        /* renamed from: a */
        public static C0814b m4748a(Activity activity) {
            return new C0814b(activity);
        }

        /* renamed from: b */
        public Drawable mo4439b() {
            if (this.f3894d == null) {
                return null;
            }
            try {
                return this.f3891a.getPackageManager().getActivityIcon(this.f3894d);
            } catch (NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public Drawable mo4440c() {
            if (this.f3893c == null) {
                return null;
            }
            try {
                return this.f3891a.getPackageManager().getApplicationIcon(this.f3893c);
            } catch (NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: d */
        public CharSequence mo4441d() {
            if (this.f3893c == null) {
                return null;
            }
            PackageManager packageManager = this.f3891a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f3893c, 0));
            } catch (NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: e */
        public String mo4442e() {
            return this.f3893c;
        }

        /* renamed from: f */
        public String[] mo4443f() {
            return this.f3892b.getStringArrayExtra("android.intent.extra.BCC");
        }

        /* renamed from: g */
        public String[] mo4444g() {
            return this.f3892b.getStringArrayExtra("android.intent.extra.CC");
        }

        /* renamed from: h */
        public String[] mo4445h() {
            return this.f3892b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        /* renamed from: i */
        public String mo4446i() {
            String stringExtra = this.f3892b.getStringExtra(C0844c.f3986a);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence m = mo4450m();
            if (m instanceof Spanned) {
                return Html.toHtml((Spanned) m);
            }
            if (m == null) {
                return stringExtra;
            }
            if (VERSION.SDK_INT >= 16) {
                return Html.escapeHtml(m);
            }
            StringBuilder sb = new StringBuilder();
            m4749a(sb, m, 0, m.length());
            return sb.toString();
        }

        /* renamed from: j */
        public Uri mo4447j() {
            return (Uri) this.f3892b.getParcelableExtra("android.intent.extra.STREAM");
        }

        /* renamed from: k */
        public int mo4448k() {
            String str = "android.intent.extra.STREAM";
            if (this.f3895e == null && mo4452o()) {
                this.f3895e = this.f3892b.getParcelableArrayListExtra(str);
            }
            ArrayList<Uri> arrayList = this.f3895e;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.f3892b.hasExtra(str) ? 1 : 0;
        }

        /* renamed from: l */
        public String mo4449l() {
            return this.f3892b.getStringExtra("android.intent.extra.SUBJECT");
        }

        /* renamed from: m */
        public CharSequence mo4450m() {
            return this.f3892b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        /* renamed from: n */
        public String mo4451n() {
            return this.f3892b.getType();
        }

        /* renamed from: o */
        public boolean mo4452o() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f3892b.getAction());
        }

        /* renamed from: p */
        public boolean mo4453p() {
            String action = this.f3892b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        /* renamed from: q */
        public boolean mo4454q() {
            return "android.intent.action.SEND".equals(this.f3892b.getAction());
        }

        /* renamed from: a */
        private static void m4749a(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '<') {
                    sb.append(StringUtils.LT_ENCODE);
                } else if (charAt == '>') {
                    sb.append(StringUtils.GT_ENCODE);
                } else if (charAt == '&') {
                    sb.append(StringUtils.AMP_ENCODE);
                } else if (charAt > '~' || charAt < ' ') {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("&#");
                    sb2.append(charAt);
                    sb2.append(";");
                    sb.append(sb2.toString());
                } else if (charAt == ' ') {
                    while (true) {
                        int i3 = i + 1;
                        if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                            sb.append(' ');
                        } else {
                            sb.append("&nbsp;");
                            i = i3;
                        }
                    }
                    sb.append(' ');
                } else {
                    sb.append(charAt);
                }
                i++;
            }
        }

        /* renamed from: a */
        public Uri mo4438a(int i) {
            String str = "android.intent.extra.STREAM";
            if (this.f3895e == null && mo4452o()) {
                this.f3895e = this.f3892b.getParcelableArrayListExtra(str);
            }
            ArrayList<Uri> arrayList = this.f3895e;
            if (arrayList != null) {
                return (Uri) arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.f3892b.getParcelableExtra(str);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Stream items available: ");
            sb.append(mo4448k());
            sb.append(" index requested: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        /* renamed from: a */
        public ComponentName mo4437a() {
            return this.f3894d;
        }
    }

    private C0812y() {
    }

    /* renamed from: a */
    public static ComponentName m4720a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            return callingActivity;
        }
        ComponentName componentName = (ComponentName) activity.getIntent().getParcelableExtra(f3880c);
        return componentName == null ? (ComponentName) activity.getIntent().getParcelableExtra(f3881d) : componentName;
    }

    /* renamed from: b */
    public static String m4723b(Activity activity) {
        String callingPackage = activity.getCallingPackage();
        if (callingPackage != null) {
            return callingPackage;
        }
        String stringExtra = activity.getIntent().getStringExtra(f3878a);
        return stringExtra == null ? activity.getIntent().getStringExtra(f3879b) : stringExtra;
    }

    /* renamed from: a */
    public static void m4722a(MenuItem menuItem, C0813a aVar) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(aVar.mo4422b());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f3882e);
        sb.append(aVar.mo4422b().getClass().getName());
        shareActionProvider.setShareHistoryFileName(sb.toString());
        shareActionProvider.setShareIntent(aVar.mo4427c());
        menuItem.setActionProvider(shareActionProvider);
        if (VERSION.SDK_INT < 16 && !menuItem.hasSubMenu()) {
            menuItem.setIntent(aVar.mo4416a());
        }
    }

    /* renamed from: a */
    public static void m4721a(Menu menu, int i, C0813a aVar) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            m4722a(findItem, aVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find menu item with id ");
        sb.append(i);
        sb.append(" in the supplied menu");
        throw new IllegalArgumentException(sb.toString());
    }
}
