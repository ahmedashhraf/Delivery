package androidx.core.p034l;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;

/* renamed from: androidx.core.l.e */
/* compiled from: DragStartHelper */
public class C0958e {

    /* renamed from: a */
    private final View f4292a;

    /* renamed from: b */
    private final C0961c f4293b;

    /* renamed from: c */
    private int f4294c;

    /* renamed from: d */
    private int f4295d;

    /* renamed from: e */
    private boolean f4296e;

    /* renamed from: f */
    private final OnLongClickListener f4297f = new C0959a();

    /* renamed from: g */
    private final OnTouchListener f4298g = new C0960b();

    /* renamed from: androidx.core.l.e$a */
    /* compiled from: DragStartHelper */
    class C0959a implements OnLongClickListener {
        C0959a() {
        }

        public boolean onLongClick(View view) {
            return C0958e.this.mo4786a(view);
        }
    }

    /* renamed from: androidx.core.l.e$b */
    /* compiled from: DragStartHelper */
    class C0960b implements OnTouchListener {
        C0960b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return C0958e.this.mo4787a(view, motionEvent);
        }
    }

    /* renamed from: androidx.core.l.e$c */
    /* compiled from: DragStartHelper */
    public interface C0961c {
        /* renamed from: a */
        boolean mo4791a(View view, C0958e eVar);
    }

    public C0958e(View view, C0961c cVar) {
        this.f4292a = view;
        this.f4293b = cVar;
    }

    /* renamed from: a */
    public void mo4784a() {
        this.f4292a.setOnLongClickListener(this.f4297f);
        this.f4292a.setOnTouchListener(this.f4298g);
    }

    /* renamed from: b */
    public void mo4788b() {
        this.f4292a.setOnLongClickListener(null);
        this.f4292a.setOnTouchListener(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 != 3) goto L_0x004f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4787a(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L_0x004b
            r4 = 1
            if (r2 == r4) goto L_0x0048
            r5 = 2
            if (r2 == r5) goto L_0x001b
            r7 = 3
            if (r2 == r7) goto L_0x0048
            goto L_0x004f
        L_0x001b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.p034l.C1007o.m5787f(r8, r2)
            if (r2 == 0) goto L_0x004f
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L_0x002b
            goto L_0x004f
        L_0x002b:
            boolean r8 = r6.f4296e
            if (r8 == 0) goto L_0x0030
            goto L_0x004f
        L_0x0030:
            int r8 = r6.f4294c
            if (r8 != r0) goto L_0x0039
            int r8 = r6.f4295d
            if (r8 != r1) goto L_0x0039
            goto L_0x004f
        L_0x0039:
            r6.f4294c = r0
            r6.f4295d = r1
            androidx.core.l.e$c r8 = r6.f4293b
            boolean r7 = r8.mo4791a(r7, r6)
            r6.f4296e = r7
            boolean r7 = r6.f4296e
            return r7
        L_0x0048:
            r6.f4296e = r3
            goto L_0x004f
        L_0x004b:
            r6.f4294c = r0
            r6.f4295d = r1
        L_0x004f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p034l.C0958e.mo4787a(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public boolean mo4786a(View view) {
        return this.f4293b.mo4791a(view, this);
    }

    /* renamed from: a */
    public void mo4785a(Point point) {
        point.set(this.f4294c, this.f4295d);
    }
}
