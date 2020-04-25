package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.C0195i0;
import androidx.core.p038os.C1072n;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1651o.C1654c;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.l */
/* compiled from: GapWorker */
final class C1740l implements Runnable {

    /* renamed from: P */
    static final ThreadLocal<C1740l> f6738P = new ThreadLocal<>();

    /* renamed from: Q */
    static Comparator<C1743c> f6739Q = new C1741a();

    /* renamed from: N */
    long f6740N;

    /* renamed from: O */
    private ArrayList<C1743c> f6741O = new ArrayList<>();

    /* renamed from: a */
    ArrayList<RecyclerView> f6742a = new ArrayList<>();

    /* renamed from: b */
    long f6743b;

    /* renamed from: androidx.recyclerview.widget.l$a */
    /* compiled from: GapWorker */
    static class C1741a implements Comparator<C1743c> {
        C1741a() {
        }

        /* renamed from: a */
        public int compare(C1743c cVar, C1743c cVar2) {
            int i = 1;
            if ((cVar.f6751d == null) != (cVar2.f6751d == null)) {
                if (cVar.f6751d != null) {
                    i = -1;
                }
                return i;
            }
            boolean z = cVar.f6748a;
            if (z != cVar2.f6748a) {
                if (z) {
                    i = -1;
                }
                return i;
            }
            int i2 = cVar2.f6749b - cVar.f6749b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f6750c - cVar2.f6750c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.l$b */
    /* compiled from: GapWorker */
    static class C1742b implements C1654c {

        /* renamed from: a */
        int f6744a;

        /* renamed from: b */
        int f6745b;

        /* renamed from: c */
        int[] f6746c;

        /* renamed from: d */
        int f6747d;

        C1742b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7916a(RecyclerView recyclerView, boolean z) {
            this.f6747d = 0;
            int[] iArr = this.f6746c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C1651o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.mo7397A()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo7686c()) {
                        oVar.mo6977a(recyclerView.mAdapter.mo7325b(), (C1654c) this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.mo6976a(this.f6744a, this.f6745b, recyclerView.mState, (C1654c) this);
                }
                int i = this.f6747d;
                if (i > oVar.f6336m) {
                    oVar.f6336m = i;
                    oVar.f6337n = z;
                    recyclerView.mRecycler.mo7582j();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7918b(int i, int i2) {
            this.f6744a = i;
            this.f6745b = i2;
        }

        /* renamed from: a */
        public void mo7517a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f6747d * 2;
                int[] iArr = this.f6746c;
                if (iArr == null) {
                    this.f6746c = new int[4];
                    Arrays.fill(this.f6746c, -1);
                } else if (i3 >= iArr.length) {
                    this.f6746c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f6746c, 0, iArr.length);
                }
                int[] iArr2 = this.f6746c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f6747d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7917a(int i) {
            if (this.f6746c != null) {
                int i2 = this.f6747d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f6746c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7915a() {
            int[] iArr = this.f6746c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6747d = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    /* compiled from: GapWorker */
    static class C1743c {

        /* renamed from: a */
        public boolean f6748a;

        /* renamed from: b */
        public int f6749b;

        /* renamed from: c */
        public int f6750c;

        /* renamed from: d */
        public RecyclerView f6751d;

        /* renamed from: e */
        public int f6752e;

        C1743c() {
        }

        /* renamed from: a */
        public void mo7919a() {
            this.f6748a = false;
            this.f6749b = 0;
            this.f6750c = 0;
            this.f6751d = null;
            this.f6752e = 0;
        }
    }

    C1740l() {
    }

    /* renamed from: a */
    public void mo7909a(RecyclerView recyclerView) {
        this.f6742a.add(recyclerView);
    }

    /* renamed from: b */
    public void mo7911b(RecyclerView recyclerView) {
        this.f6742a.remove(recyclerView);
    }

    public void run() {
        try {
            C1072n.m6199a("RV Prefetch");
            if (!this.f6742a.isEmpty()) {
                int size = this.f6742a.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f6742a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo7908a(TimeUnit.MILLISECONDS.toNanos(j) + this.f6740N);
                    this.f6743b = 0;
                    C1072n.m6198a();
                }
            }
        } finally {
            this.f6743b = 0;
            C1072n.m6198a();
        }
    }

    /* renamed from: b */
    private void m9391b(long j) {
        int i = 0;
        while (i < this.f6741O.size()) {
            C1743c cVar = (C1743c) this.f6741O.get(i);
            if (cVar.f6751d != null) {
                m9389a(cVar, j);
                cVar.mo7919a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7910a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f6743b == 0) {
            this.f6743b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo7918b(i, i2);
    }

    /* renamed from: a */
    private void m9387a() {
        C1743c cVar;
        int size = this.f6742a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f6742a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo7916a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f6747d;
            }
        }
        this.f6741O.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f6742a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1742b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f6744a) + Math.abs(bVar.f6745b);
                int i5 = i3;
                for (int i6 = 0; i6 < bVar.f6747d * 2; i6 += 2) {
                    if (i5 >= this.f6741O.size()) {
                        cVar = new C1743c();
                        this.f6741O.add(cVar);
                    } else {
                        cVar = (C1743c) this.f6741O.get(i5);
                    }
                    int i7 = bVar.f6746c[i6 + 1];
                    cVar.f6748a = i7 <= abs;
                    cVar.f6749b = abs;
                    cVar.f6750c = i7;
                    cVar.f6751d = recyclerView2;
                    cVar.f6752e = bVar.f6746c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f6741O, f6739Q);
    }

    /* renamed from: a */
    static boolean m9390a(RecyclerView recyclerView, int i) {
        int b = recyclerView.mChildHelper.mo7813b();
        for (int i2 = 0; i2 < b; i2++) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo7819d(i2));
            if (childViewHolderInt.f6281N == i && !childViewHolderInt.mo7283p()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C1635d0 m9386a(RecyclerView recyclerView, int i, long j) {
        if (m9390a(recyclerView, i)) {
            return null;
        }
        C1664w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            C1635d0 a = wVar.mo7549a(i, false, j);
            if (a != null) {
                if (!a.mo7282o() || a.mo7283p()) {
                    wVar.mo7558a(a, false);
                } else {
                    wVar.mo7565b(a.f6294a);
                }
            }
            return a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    private void m9388a(@C0195i0 RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mo7813b() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C1742b bVar = recyclerView.mPrefetchRegistry;
            bVar.mo7916a(recyclerView, true);
            if (bVar.f6747d != 0) {
                try {
                    C1072n.m6199a("RV Nested Prefetch");
                    recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.f6747d * 2; i += 2) {
                        m9386a(recyclerView, bVar.f6746c[i], j);
                    }
                } finally {
                    C1072n.m6198a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m9389a(C1743c cVar, long j) {
        C1635d0 a = m9386a(cVar.f6751d, cVar.f6752e, cVar.f6748a ? Long.MAX_VALUE : j);
        if (a != null && a.f6296b != null && a.mo7282o() && !a.mo7283p()) {
            m9388a((RecyclerView) a.f6296b.get(), j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7908a(long j) {
        m9387a();
        m9391b(j);
    }
}
