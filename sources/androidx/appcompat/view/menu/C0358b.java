package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o.C0389a;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.b */
/* compiled from: BaseMenuPresenter */
public abstract class C0358b implements C0386n {

    /* renamed from: N */
    protected C0370g f1259N;

    /* renamed from: O */
    protected LayoutInflater f1260O;

    /* renamed from: P */
    protected LayoutInflater f1261P;

    /* renamed from: Q */
    private C0387a f1262Q;

    /* renamed from: R */
    private int f1263R;

    /* renamed from: S */
    private int f1264S;

    /* renamed from: T */
    protected C0388o f1265T;

    /* renamed from: U */
    private int f1266U;

    /* renamed from: a */
    protected Context f1267a;

    /* renamed from: b */
    protected Context f1268b;

    public C0358b(Context context, int i, int i2) {
        this.f1267a = context;
        this.f1260O = LayoutInflater.from(context);
        this.f1263R = i;
        this.f1264S = i2;
    }

    /* renamed from: a */
    public void mo1484a(Context context, C0370g gVar) {
        this.f1268b = context;
        this.f1261P = LayoutInflater.from(this.f1268b);
        this.f1259N = gVar;
    }

    /* renamed from: a */
    public abstract void mo1487a(C0375j jVar, C0389a aVar);

    /* renamed from: a */
    public boolean mo1490a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1491a(int i, C0375j jVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo1493a(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: b */
    public C0387a mo1495b() {
        return this.f1262Q;
    }

    /* renamed from: b */
    public boolean mo1497b(C0370g gVar, C0375j jVar) {
        return false;
    }

    public int getId() {
        return this.f1266U;
    }

    /* renamed from: b */
    public C0389a mo1496b(ViewGroup viewGroup) {
        return (C0389a) this.f1260O.inflate(this.f1264S, viewGroup, false);
    }

    /* renamed from: a */
    public C0388o mo1482a(ViewGroup viewGroup) {
        if (this.f1265T == null) {
            this.f1265T = (C0388o) this.f1260O.inflate(this.f1263R, viewGroup, false);
            this.f1265T.mo1411a(this.f1259N);
            mo1489a(true);
        }
        return this.f1265T;
    }

    /* renamed from: a */
    public void mo1489a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1265T;
        if (viewGroup != null) {
            C0370g gVar = this.f1259N;
            int i = 0;
            if (gVar != null) {
                gVar.mo1585c();
                ArrayList o = this.f1259N.mo1615o();
                int size = o.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0375j jVar = (C0375j) o.get(i3);
                    if (mo1491a(i2, jVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0375j itemData = childAt instanceof C0389a ? ((C0389a) childAt).getItemData() : null;
                        View a = mo1481a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo1485a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo1492a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1485a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1265T).addView(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1492a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void mo1488a(C0387a aVar) {
        this.f1262Q = aVar;
    }

    /* renamed from: a */
    public View mo1481a(C0375j jVar, View view, ViewGroup viewGroup) {
        C0389a aVar;
        if (view instanceof C0389a) {
            aVar = (C0389a) view;
        } else {
            aVar = mo1496b(viewGroup);
        }
        mo1487a(jVar, aVar);
        return (View) aVar;
    }

    /* renamed from: a */
    public void mo1486a(C0370g gVar, boolean z) {
        C0387a aVar = this.f1262Q;
        if (aVar != null) {
            aVar.mo872a(gVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo1494a(C0395s sVar) {
        C0387a aVar = this.f1262Q;
        if (aVar != null) {
            return aVar.mo873a(sVar);
        }
        return false;
    }

    /* renamed from: a */
    public void mo1483a(int i) {
        this.f1266U = i;
    }
}
