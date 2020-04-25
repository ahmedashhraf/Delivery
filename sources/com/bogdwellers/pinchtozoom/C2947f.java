package com.bogdwellers.pinchtozoom;

import android.graphics.Point;
import android.graphics.PointF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bogdwellers.pinchtozoom.f */
/* compiled from: MultiTouchListener */
public class C2947f implements OnTouchListener {

    /* renamed from: N */
    private static final String f10444N = C2947f.class.getSimpleName();

    /* renamed from: a */
    private List<Integer> f10445a = new ArrayList(40);

    /* renamed from: b */
    private SparseArray<PointF> f10446b = new SparseArray<>();

    /* renamed from: c */
    private void mo11695c() {
        this.f10445a.clear();
    }

    /* renamed from: a */
    public int mo11723a() {
        return this.f10445a.size();
    }

    /* renamed from: b */
    public boolean mo11728b() {
        return !this.f10445a.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r4 != 6) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            int r4 = r5.getActionMasked()
            int r0 = r5.getActionIndex()
            if (r4 == 0) goto L_0x0037
            r1 = 1
            if (r4 == r1) goto L_0x0020
            r1 = 3
            if (r4 == r1) goto L_0x0017
            r1 = 5
            if (r4 == r1) goto L_0x0037
            r1 = 6
            if (r4 == r1) goto L_0x0020
            goto L_0x005a
        L_0x0017:
            r3.mo11695c()
            android.util.SparseArray<android.graphics.PointF> r4 = r3.f10446b
            r4.clear()
            goto L_0x005a
        L_0x0020:
            int r4 = r5.getPointerId(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.List<java.lang.Integer> r5 = r3.f10445a
            r5.remove(r4)
            android.util.SparseArray<android.graphics.PointF> r5 = r3.f10446b
            int r4 = r4.intValue()
            r5.remove(r4)
            goto L_0x005a
        L_0x0037:
            int r4 = r5.getPointerId(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r5.getX(r0)
            float r5 = r5.getY(r0)
            r1.<init>(r2, r5)
            android.util.SparseArray<android.graphics.PointF> r5 = r3.f10446b
            int r0 = r4.intValue()
            r5.put(r0, r1)
            java.util.List<java.lang.Integer> r5 = r3.f10445a
            r5.add(r4)
        L_0x005a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bogdwellers.pinchtozoom.C2947f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public int mo11724a(int i) {
        return ((Integer) this.f10445a.get(i)).intValue();
    }

    /* renamed from: b */
    public PointF mo11727b(int i) {
        return (PointF) this.f10446b.get(mo11724a(i));
    }

    /* renamed from: b */
    private static final float m14116b(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i) - motionEvent.getX(i2);
        float y = motionEvent.getY(i) - motionEvent.getY(i2);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: a */
    public void mo11725a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            Integer valueOf = Integer.valueOf(motionEvent.getPointerId(i));
            this.f10446b.put(valueOf.intValue(), new PointF(motionEvent.getX(i), motionEvent.getY(i)));
        }
    }

    /* renamed from: a */
    public Integer[] mo11726a(Integer[] numArr) {
        return (Integer[]) this.f10445a.toArray(numArr);
    }

    /* renamed from: a */
    public static final void m14112a(Point point, MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        point.x = Math.round(motionEvent.getX(findPointerIndex));
        point.y = Math.round(motionEvent.getY(findPointerIndex));
    }

    /* renamed from: a */
    public static final float m14109a(MotionEvent motionEvent, int i, int i2) {
        return m14116b(motionEvent, motionEvent.findPointerIndex(i), motionEvent.findPointerIndex(i2));
    }

    /* renamed from: a */
    public static final float m14110a(MotionEvent motionEvent, int i, int i2, long j) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        int findPointerIndex2 = motionEvent.findPointerIndex(i2);
        long eventTime = motionEvent.getEventTime();
        float b = m14116b(motionEvent, findPointerIndex, findPointerIndex2);
        int historySize = motionEvent.getHistorySize();
        long j2 = 0;
        float f = 1.0f;
        int i3 = 0;
        while (i3 < historySize && j2 < j) {
            int i4 = (historySize - 1) - i3;
            float historicalX = motionEvent.getHistoricalX(findPointerIndex, i4) - motionEvent.getHistoricalX(findPointerIndex2, i4);
            float historicalY = motionEvent.getHistoricalY(findPointerIndex, i4) - motionEvent.getHistoricalY(findPointerIndex2, i4);
            float sqrt = (float) Math.sqrt((double) ((historicalX * historicalX) + (historicalY * historicalY)));
            f *= b / sqrt;
            i3++;
            b = sqrt;
            j2 = eventTime - motionEvent.getHistoricalEventTime(i4);
        }
        double d = (double) f;
        double d2 = (double) j;
        Double.isNaN(d2);
        return (float) Math.pow(Math.pow(d, 1.0d / d2), 1000.0d);
    }

    /* renamed from: a */
    public static final void m14113a(Point point, MotionEvent motionEvent, int i, int i2) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        int findPointerIndex2 = motionEvent.findPointerIndex(i2);
        point.set(Math.round((motionEvent.getX(findPointerIndex) + motionEvent.getX(findPointerIndex2)) / 2.0f), Math.round((motionEvent.getY(findPointerIndex) + motionEvent.getY(findPointerIndex2)) / 2.0f));
    }

    /* renamed from: a */
    public static final void m14114a(PointF pointF, MotionEvent motionEvent, int i, int i2) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        int findPointerIndex2 = motionEvent.findPointerIndex(i2);
        pointF.set((motionEvent.getX(findPointerIndex) + motionEvent.getX(findPointerIndex2)) / 2.0f, (motionEvent.getY(findPointerIndex) + motionEvent.getY(findPointerIndex2)) / 2.0f);
    }

    /* renamed from: a */
    public static final float m14111a(MotionEvent motionEvent, int i, int i2, boolean z) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        int findPointerIndex2 = motionEvent.findPointerIndex(i2);
        float x = motionEvent.getX(findPointerIndex) - motionEvent.getX(findPointerIndex2);
        float y = motionEvent.getY(findPointerIndex) - motionEvent.getY(findPointerIndex2);
        double atan = Math.atan((double) (x / y));
        if ((y < 0.0f && z) || (y > 0.0f && !z)) {
            atan += 3.141592653589793d;
        }
        return (float) Math.toDegrees(atan);
    }

    /* renamed from: a */
    public static final boolean m14115a(PointF pointF, PointF pointF2) {
        return pointF.y < pointF2.y;
    }
}
