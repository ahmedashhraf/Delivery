package p212io.branch.referral.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p212io.branch.referral.C14158p0.C14159a;

/* renamed from: io.branch.referral.util.h */
/* compiled from: ShareSheetStyle */
public class C14200h {

    /* renamed from: a */
    private Drawable f41808a;

    /* renamed from: b */
    private String f41809b;

    /* renamed from: c */
    private Drawable f41810c;

    /* renamed from: d */
    private String f41811d;

    /* renamed from: e */
    private String f41812e;

    /* renamed from: f */
    private final String f41813f;

    /* renamed from: g */
    private final String f41814g;

    /* renamed from: h */
    private final ArrayList<C14159a> f41815h;

    /* renamed from: i */
    private String f41816i;

    /* renamed from: j */
    private int f41817j = -1;

    /* renamed from: k */
    private int f41818k = -1;

    /* renamed from: l */
    final Context f41819l;

    /* renamed from: m */
    private boolean f41820m;

    /* renamed from: n */
    private int f41821n = -1;

    /* renamed from: o */
    private int f41822o = 50;

    /* renamed from: p */
    private String f41823p = null;

    /* renamed from: q */
    private View f41824q = null;

    /* renamed from: r */
    private List<String> f41825r = new ArrayList();

    /* renamed from: s */
    private List<String> f41826s = new ArrayList();

    public C14200h(@C0193h0 Context context, @C0193h0 String str, @C0193h0 String str2) {
        this.f41819l = context;
        this.f41808a = null;
        this.f41809b = null;
        this.f41810c = null;
        this.f41811d = null;
        this.f41812e = null;
        this.f41815h = new ArrayList<>();
        this.f41816i = null;
        this.f41813f = str;
        this.f41814g = str2;
    }

    /* renamed from: a */
    public C14200h mo44890a(Drawable drawable, String str) {
        this.f41808a = drawable;
        this.f41809b = str;
        return this;
    }

    /* renamed from: b */
    public C14200h mo44900b(int i) {
        this.f41821n = i;
        return this;
    }

    /* renamed from: c */
    public C14200h mo44905c(String str) {
        this.f41816i = str;
        return this;
    }

    /* renamed from: d */
    public C14200h mo44908d(@C0216r0 int i) {
        this.f41817j = i;
        return this;
    }

    /* renamed from: e */
    public int mo44910e() {
        return this.f41821n;
    }

    /* renamed from: f */
    public List<String> mo44911f() {
        return this.f41826s;
    }

    /* renamed from: g */
    public int mo44912g() {
        return this.f41822o;
    }

    /* renamed from: h */
    public List<String> mo44913h() {
        return this.f41825r;
    }

    /* renamed from: i */
    public boolean mo44914i() {
        return this.f41820m;
    }

    /* renamed from: j */
    public String mo44915j() {
        return this.f41814g;
    }

    /* renamed from: k */
    public String mo44916k() {
        return this.f41813f;
    }

    /* renamed from: l */
    public Drawable mo44917l() {
        return this.f41808a;
    }

    /* renamed from: m */
    public String mo44918m() {
        return this.f41809b;
    }

    /* renamed from: n */
    public ArrayList<C14159a> mo44919n() {
        return this.f41815h;
    }

    /* renamed from: o */
    public String mo44920o() {
        return this.f41823p;
    }

    /* renamed from: p */
    public View mo44921p() {
        return this.f41824q;
    }

    /* renamed from: q */
    public int mo44922q() {
        return this.f41817j;
    }

    /* renamed from: r */
    public String mo44923r() {
        return this.f41812e;
    }

    /* renamed from: b */
    public C14200h mo44901b(@C0193h0 String str) {
        this.f41825r.add(str);
        return this;
    }

    /* renamed from: c */
    public C14200h mo44904c(int i) {
        this.f41822o = i;
        return this;
    }

    /* renamed from: d */
    public C14200h mo44909d(String str) {
        this.f41823p = str;
        return this;
    }

    /* renamed from: a */
    public C14200h mo44888a(@C0213q int i, @C0214q0 int i2) {
        this.f41808a = m61456a(this.f41819l, i);
        this.f41809b = this.f41819l.getResources().getString(i2);
        return this;
    }

    /* renamed from: b */
    public C14200h mo44903b(@C0193h0 String[] strArr) {
        this.f41825r.addAll(Arrays.asList(strArr));
        return this;
    }

    /* renamed from: c */
    public String mo44906c() {
        return this.f41816i;
    }

    /* renamed from: d */
    public int mo44907d() {
        return this.f41818k;
    }

    /* renamed from: b */
    public C14200h mo44902b(@C0193h0 List<String> list) {
        this.f41825r.addAll(list);
        return this;
    }

    /* renamed from: a */
    public C14200h mo44891a(Drawable drawable, String str, String str2) {
        this.f41810c = drawable;
        this.f41811d = str;
        this.f41812e = str2;
        return this;
    }

    /* renamed from: b */
    public Drawable mo44899b() {
        return this.f41810c;
    }

    /* renamed from: a */
    public C14200h mo44889a(@C0213q int i, @C0214q0 int i2, @C0214q0 int i3) {
        this.f41810c = m61456a(this.f41819l, i);
        this.f41811d = this.f41819l.getResources().getString(i2);
        this.f41812e = this.f41819l.getResources().getString(i3);
        return this;
    }

    /* renamed from: a */
    public C14200h mo44893a(C14159a aVar) {
        this.f41815h.add(aVar);
        return this;
    }

    /* renamed from: a */
    public C14200h mo44887a(@C0216r0 int i) {
        this.f41818k = i;
        return this;
    }

    /* renamed from: a */
    public C14200h mo44896a(boolean z) {
        this.f41820m = z;
        return this;
    }

    /* renamed from: a */
    public C14200h mo44892a(View view) {
        this.f41824q = view;
        return this;
    }

    /* renamed from: a */
    public C14200h mo44894a(@C0193h0 String str) {
        this.f41826s.add(str);
        return this;
    }

    /* renamed from: a */
    public C14200h mo44897a(@C0193h0 String[] strArr) {
        this.f41826s.addAll(Arrays.asList(strArr));
        return this;
    }

    /* renamed from: a */
    public C14200h mo44895a(@C0193h0 List<String> list) {
        this.f41826s.addAll(list);
        return this;
    }

    /* renamed from: a */
    public String mo44898a() {
        return this.f41811d;
    }

    /* renamed from: a */
    private Drawable m61456a(@C0193h0 Context context, @C0213q int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getResources().getDrawable(i, context.getTheme());
        }
        return context.getResources().getDrawable(i);
    }
}
