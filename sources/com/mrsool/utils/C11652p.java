package com.mrsool.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import java.util.ArrayList;

/* renamed from: com.mrsool.utils.p */
/* compiled from: LoadMore */
public class C11652p {

    /* renamed from: a */
    private int f33486a = 1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f33487b = 1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f33488c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f33489d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f33490e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f33491f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f33492g = this.f33486a;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f33493h = 1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public RecyclerView f33494i;

    /* renamed from: j */
    private C11656d f33495j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ArrayList<?> f33496k;

    /* renamed from: com.mrsool.utils.p$a */
    /* compiled from: LoadMore */
    class C11653a extends C1660t {

        /* renamed from: a */
        final /* synthetic */ LinearLayoutManager f33497a;

        C11653a(LinearLayoutManager linearLayoutManager) {
            this.f33497a = linearLayoutManager;
        }

        /* renamed from: a */
        public void mo7532a(RecyclerView recyclerView, int i, int i2) {
            super.mo7532a(recyclerView, i, i2);
            C11652p.this.f33491f = this.f33497a.mo7483j();
            C11652p.this.f33490e = this.f33497a.mo6961P();
            if (C11652p.this.f33492g <= C11652p.this.f33493h && !C11652p.this.f33489d && !C11652p.this.f33488c && C11652p.this.f33491f <= C11652p.this.f33490e + C11652p.this.f33487b) {
                C11652p.this.mo40008j();
            }
        }
    }

    /* renamed from: com.mrsool.utils.p$b */
    /* compiled from: LoadMore */
    class C11654b implements Runnable {
        C11654b() {
        }

        public void run() {
            C11652p.this.f33494i.getAdapter().mo7342e(C11652p.this.f33496k.size() - 1);
        }
    }

    /* renamed from: com.mrsool.utils.p$c */
    /* compiled from: LoadMore */
    class C11655c implements Runnable {
        C11655c() {
        }

        public void run() {
            C11652p.this.f33494i.getAdapter().mo7343f(C11652p.this.f33496k.size());
        }
    }

    /* renamed from: com.mrsool.utils.p$d */
    /* compiled from: LoadMore */
    public interface C11656d {
        /* renamed from: a */
        void mo38990a();

        /* renamed from: a */
        void mo38991a(int i);
    }

    public C11652p(RecyclerView recyclerView, ArrayList<?> arrayList) {
        this.f33494i = recyclerView;
        this.f33496k = arrayList;
        mo40003e();
    }

    /* renamed from: j */
    public void mo40008j() {
        this.f33488c = true;
        mo40007i();
        this.f33495j.mo38991a(this.f33492g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo40001c() {
        this.f33492g = this.f33486a;
        this.f33488c = false;
        this.f33489d = true;
        C11656d dVar = this.f33495j;
        if (dVar != null) {
            dVar.mo38990a();
        }
    }

    /* renamed from: d */
    public int mo40002d() {
        return this.f33492g;
    }

    /* renamed from: e */
    public void mo40003e() {
        if (this.f33494i.getLayoutManager() instanceof LinearLayoutManager) {
            this.f33494i.addOnScrollListener(new C11653a((LinearLayoutManager) this.f33494i.getLayoutManager()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo40004f() {
        return this.f33489d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo40005g() {
        if (this.f33486a < this.f33492g && this.f33496k.size() > 1) {
            ArrayList<?> arrayList = this.f33496k;
            arrayList.remove(arrayList.size() - 1);
            this.f33494i.post(new C11655c());
        }
    }

    /* renamed from: h */
    public void mo40006h() {
        this.f33492g = this.f33486a;
        this.f33493h = 1;
        this.f33488c = false;
        this.f33489d = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo40007i() {
        if (this.f33486a < this.f33492g && this.f33496k.size() > 1) {
            this.f33496k.add(null);
            this.f33494i.post(new C11654b());
        }
    }

    /* renamed from: a */
    public void mo39998a(C11656d dVar) {
        this.f33495j = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40000b(int i) {
        this.f33492g = i;
    }

    /* renamed from: a */
    public void mo39997a(int i) {
        this.f33493h = i;
        mo40005g();
    }

    /* renamed from: b */
    public void mo39999b() {
        mo40005g();
        this.f33488c = false;
        C11656d dVar = this.f33495j;
        if (dVar != null) {
            dVar.mo38990a();
        }
    }

    /* renamed from: a */
    public void mo39996a() {
        this.f33489d = (this.f33486a == 0 ? this.f33492g + 1 : this.f33492g) >= this.f33493h;
        this.f33492g++;
        this.f33488c = false;
        C11656d dVar = this.f33495j;
        if (dVar != null) {
            dVar.mo38990a();
        }
    }
}
