package com.instabug.library.annotation.p380a;

import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PointF;
import android.graphics.RectF;
import com.instabug.library.annotation.p380a.C9742e.C9743a;
import com.instabug.library.annotation.p381d.C9761c;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.a.b */
/* compiled from: PathFactory */
public class C9738b {

    /* renamed from: a */
    private static List<C9741d> f25823a;

    /* renamed from: b */
    private static List<C9741d> f25824b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25825c;

    /* renamed from: a */
    public static Path m45394a() {
        boolean[] b = m45396b();
        PointF pointF = new PointF(0.0f, 14.0f);
        b[1] = true;
        PointF pointF2 = new PointF(28.0f, 14.0f);
        b[2] = true;
        float a = C9761c.m45517a(pointF2.x, pointF2.y, pointF.x, pointF.y);
        b[3] = true;
        PointF a2 = C9761c.m45519a(9.0f, 225.0f + a, pointF2);
        b[4] = true;
        PointF a3 = C9761c.m45519a(9.0f, a + 135.0f, pointF2);
        b[5] = true;
        Path path = new Path();
        b[6] = true;
        path.moveTo(pointF.x, pointF.y);
        b[7] = true;
        path.lineTo(pointF2.x, pointF2.y);
        b[8] = true;
        path.moveTo(a2.x, a2.y);
        b[9] = true;
        path.lineTo(pointF2.x, pointF2.y);
        b[10] = true;
        path.lineTo(a3.x, a3.y);
        b[11] = true;
        return path;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45396b() {
        boolean[] zArr = f25825c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-196760602641460025L, "com/instabug/library/annotation/recognition/PathFactory", 30);
        f25825c = a;
        return a;
    }

    /* renamed from: a */
    public static List<C9741d> m45395a(C9743a aVar) {
        boolean[] b = m45396b();
        if (aVar == C9743a.RECT) {
            List<C9741d> list = f25823a;
            if (list != null) {
                b[12] = true;
                return list;
            }
            f25823a = new ArrayList();
            b[13] = true;
        } else if (aVar != C9743a.OVAL) {
            b[14] = true;
        } else {
            List<C9741d> list2 = f25824b;
            if (list2 != null) {
                b[15] = true;
                return list2;
            }
            f25824b = new ArrayList();
            b[16] = true;
        }
        RectF rectF = new RectF(0.0f, 0.0f, 28.0f, 28.0f);
        int i = 0;
        b[17] = true;
        while (i < 12) {
            b[18] = true;
            C9741d dVar = new C9741d();
            rectF.left += 1.0f;
            rectF.right -= 1.0f;
            if (aVar == C9743a.RECT) {
                b[19] = true;
                dVar.f25832a.addRect(rectF, Direction.CW);
                b[20] = true;
                f25823a.add(dVar);
                b[21] = true;
            } else if (aVar != C9743a.OVAL) {
                b[22] = true;
            } else {
                b[23] = true;
                dVar.f25832a.addOval(rectF, Direction.CW);
                b[24] = true;
                f25824b.add(dVar);
                b[25] = true;
            }
            dVar.f25833b = rectF.left / 28.0f;
            i++;
            b[26] = true;
        }
        if (aVar == C9743a.RECT) {
            List<C9741d> list3 = f25823a;
            b[27] = true;
            return list3;
        } else if (aVar == C9743a.OVAL) {
            List<C9741d> list4 = f25824b;
            b[28] = true;
            return list4;
        } else {
            b[29] = true;
            return null;
        }
    }
}
