package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0649h;
import androidx.core.p033k.C0944i;
import androidx.lifecycle.C1484w;
import androidx.loader.p046a.C1492a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.e */
/* compiled from: FragmentController */
public class C1379e {

    /* renamed from: a */
    private final C1381g<?> f5415a;

    private C1379e(C1381g<?> gVar) {
        this.f5415a = gVar;
    }

    @C0193h0
    /* renamed from: a */
    public static C1379e m7218a(@C0193h0 C1381g<?> gVar) {
        return new C1379e((C1381g) C0944i.m5338a(gVar, (Object) "callbacks == null"));
    }

    @Deprecated
    /* renamed from: a */
    public void mo6184a(@SuppressLint({"UnknownNullness"}) C0649h<String, C1492a> hVar) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo6186a(@C0193h0 String str, @C0195i0 FileDescriptor fileDescriptor, @C0193h0 PrintWriter printWriter, @C0195i0 String[] strArr) {
    }

    /* renamed from: b */
    public void mo6190b() {
        this.f5415a.f5419P.mo6324n();
    }

    /* renamed from: c */
    public void mo6194c() {
        this.f5415a.f5419P.mo6326o();
    }

    @Deprecated
    /* renamed from: c */
    public void mo6195c(boolean z) {
    }

    /* renamed from: d */
    public void mo6196d() {
        this.f5415a.f5419P.mo6330p();
    }

    /* renamed from: e */
    public void mo6197e() {
        this.f5415a.f5419P.mo6332q();
    }

    /* renamed from: f */
    public void mo6198f() {
        this.f5415a.f5419P.mo6335r();
    }

    @Deprecated
    /* renamed from: g */
    public void mo6199g() {
    }

    /* renamed from: h */
    public void mo6200h() {
        this.f5415a.f5419P.mo6338t();
    }

    /* renamed from: i */
    public void mo6201i() {
        this.f5415a.f5419P.mo6341u();
    }

    /* renamed from: j */
    public void mo6202j() {
        this.f5415a.f5419P.mo6343v();
    }

    @Deprecated
    /* renamed from: k */
    public void mo6203k() {
    }

    @Deprecated
    /* renamed from: l */
    public void mo6204l() {
    }

    @Deprecated
    /* renamed from: m */
    public void mo6205m() {
    }

    /* renamed from: n */
    public boolean mo6206n() {
        return this.f5415a.f5419P.mo6345x();
    }

    /* renamed from: o */
    public int mo6207o() {
        return this.f5415a.f5419P.mo6346y();
    }

    @C0193h0
    /* renamed from: p */
    public C1382h mo6208p() {
        return this.f5415a.f5419P;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    /* renamed from: q */
    public C1492a mo6209q() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    /* renamed from: r */
    public void mo6210r() {
        this.f5415a.f5419P.mo6264C();
    }

    @Deprecated
    /* renamed from: s */
    public void mo6211s() {
    }

    @Deprecated
    @C0195i0
    /* renamed from: t */
    public C0649h<String, C1492a> mo6212t() {
        return null;
    }

    @Deprecated
    @C0195i0
    /* renamed from: u */
    public C1401j mo6213u() {
        return this.f5415a.f5419P.mo6266E();
    }

    @Deprecated
    @C0195i0
    /* renamed from: v */
    public List<Fragment> mo6214v() {
        C1401j E = this.f5415a.f5419P.mo6266E();
        if (E == null || E.mo6363b() == null) {
            return null;
        }
        return new ArrayList(E.mo6363b());
    }

    @C0195i0
    /* renamed from: w */
    public Parcelable mo6215w() {
        return this.f5415a.f5419P.mo6267F();
    }

    @C0195i0
    /* renamed from: a */
    public Fragment mo6176a(@C0193h0 String str) {
        return this.f5415a.f5419P.mo6291b(str);
    }

    /* renamed from: b */
    public void mo6191b(boolean z) {
        this.f5415a.f5419P.mo6304c(z);
    }

    @C0193h0
    /* renamed from: a */
    public List<Fragment> mo6177a(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f5415a.f5419P.mo6347z();
    }

    /* renamed from: b */
    public boolean mo6192b(@C0193h0 Menu menu) {
        return this.f5415a.f5419P.mo6298b(menu);
    }

    /* renamed from: a */
    public void mo6185a(@C0195i0 Fragment fragment) {
        C1381g<?> gVar = this.f5415a;
        gVar.f5419P.mo6285a((C1381g) gVar, (C1378d) gVar, fragment);
    }

    /* renamed from: b */
    public boolean mo6193b(@C0193h0 MenuItem menuItem) {
        return this.f5415a.f5419P.mo6299b(menuItem);
    }

    @C0195i0
    /* renamed from: a */
    public View mo6175a(@C0195i0 View view, @C0193h0 String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        return this.f5415a.f5419P.onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    /* renamed from: a */
    public void mo6182a(@C0195i0 Parcelable parcelable, @C0195i0 List<Fragment> list) {
        this.f5415a.f5419P.mo6275a(parcelable, new C1401j(list, null, null));
    }

    @Deprecated
    /* renamed from: a */
    public void mo6181a(@C0195i0 Parcelable parcelable, @C0195i0 C1401j jVar) {
        this.f5415a.f5419P.mo6275a(parcelable, jVar);
    }

    /* renamed from: a */
    public void mo6180a(@C0195i0 Parcelable parcelable) {
        C1381g<?> gVar = this.f5415a;
        if (gVar instanceof C1484w) {
            gVar.f5419P.mo6274a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: a */
    public void mo6178a() {
        this.f5415a.f5419P.mo6322m();
    }

    /* renamed from: a */
    public void mo6187a(boolean z) {
        this.f5415a.f5419P.mo6297b(z);
    }

    /* renamed from: a */
    public void mo6179a(@C0193h0 Configuration configuration) {
        this.f5415a.f5419P.mo6273a(configuration);
    }

    /* renamed from: a */
    public boolean mo6188a(@C0193h0 Menu menu, @C0193h0 MenuInflater menuInflater) {
        return this.f5415a.f5419P.mo6287a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo6189a(@C0193h0 MenuItem menuItem) {
        return this.f5415a.f5419P.mo6288a(menuItem);
    }

    /* renamed from: a */
    public void mo6183a(@C0193h0 Menu menu) {
        this.f5415a.f5419P.mo6276a(menu);
    }
}
