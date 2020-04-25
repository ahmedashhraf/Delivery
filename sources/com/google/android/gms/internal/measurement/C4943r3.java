package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4805d;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;

/* renamed from: com.google.android.gms.internal.measurement.r3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4943r3 implements C5036w7 {

    /* renamed from: a */
    private final zzek f14384a;

    private C4943r3(zzek zzek) {
        this.f14384a = (zzek) C4819j4.m20396a(zzek, C14030b.f41237l);
    }

    /* renamed from: a */
    public static C4943r3 m21040a(zzek zzek) {
        C4943r3 r3Var = zzek.f14566a;
        if (r3Var != null) {
            return r3Var;
        }
        return new C4943r3(zzek);
    }

    /* renamed from: b */
    public final void mo19416b(int i, long j) throws IOException {
        this.f14384a.mo19783a(i, j);
    }

    /* renamed from: c */
    public final void mo19421c(int i, int i2) throws IOException {
        this.f14384a.mo19808e(i, i2);
    }

    /* renamed from: d */
    public final void mo19425d(int i, long j) throws IOException {
        this.f14384a.mo19804c(i, j);
    }

    /* renamed from: e */
    public final void mo19428e(int i, int i2) throws IOException {
        this.f14384a.mo19808e(i, i2);
    }

    /* renamed from: f */
    public final void mo19431f(int i, int i2) throws IOException {
        this.f14384a.mo19803c(i, i2);
    }

    /* renamed from: g */
    public final void mo19433g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21952g(((Integer) list.get(i4)).intValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19796b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19803c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo19434h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21963j(((Integer) list.get(i4)).intValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19806d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19808e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo19435i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21955g(((Long) list.get(i4)).longValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19805c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19804c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo19436j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21951f(((Long) list.get(i4)).longValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19800b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19798b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo19437k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21947e(((Long) list.get(i4)).longValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19789a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19783a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo19438l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21956h(((Integer) list.get(i4)).intValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19802c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19807d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo19439m(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21924b(((Double) list.get(i4)).doubleValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19777a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19780a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo19440n(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21925b(((Float) list.get(i4)).floatValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19778a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19781a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo19415b(int i, int i2) throws IOException {
        this.f14384a.mo19797b(i, i2);
    }

    /* renamed from: d */
    public final void mo19424d(int i, int i2) throws IOException {
        this.f14384a.mo19807d(i, i2);
    }

    /* renamed from: e */
    public final void mo19429e(int i, long j) throws IOException {
        this.f14384a.mo19798b(i, j);
    }

    /* renamed from: f */
    public final void mo19432f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21960i(((Integer) list.get(i4)).intValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19806d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19808e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final int mo19400a() {
        return C4805d.f14198l;
    }

    /* renamed from: b */
    public final void mo19417b(int i, Object obj, C4790h6 h6Var) throws IOException {
        this.f14384a.mo19785a(i, (C4945r5) obj, h6Var);
    }

    /* renamed from: c */
    public final void mo19422c(int i, long j) throws IOException {
        this.f14384a.mo19783a(i, j);
    }

    /* renamed from: d */
    public final void mo19426d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21944d(((Long) list.get(i4)).longValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19789a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19783a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo19427e(int i) throws IOException {
        this.f14384a.mo19782a(i, 4);
    }

    /* renamed from: a */
    public final void mo19405a(int i, long j) throws IOException {
        this.f14384a.mo19804c(i, j);
    }

    /* renamed from: b */
    public final void mo19420b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21948f(((Integer) list.get(i4)).intValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19779a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19797b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo19430e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21959h(((Long) list.get(i4)).longValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19805c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19804c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo19423c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21965k(((Integer) list.get(i4)).intValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19779a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19797b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo19403a(int i, float f) throws IOException {
        this.f14384a.mo19781a(i, f);
    }

    /* renamed from: a */
    public final void mo19402a(int i, double d) throws IOException {
        this.f14384a.mo19780a(i, d);
    }

    /* renamed from: a */
    public final void mo19404a(int i, int i2) throws IOException {
        this.f14384a.mo19797b(i, i2);
    }

    /* renamed from: a */
    public final void mo19414a(int i, boolean z) throws IOException {
        this.f14384a.mo19788a(i, z);
    }

    /* renamed from: a */
    public final void mo19410a(int i, String str) throws IOException {
        this.f14384a.mo19787a(i, str);
    }

    /* renamed from: a */
    public final void mo19407a(int i, C5070z2 z2Var) throws IOException {
        this.f14384a.mo19786a(i, z2Var);
    }

    /* renamed from: b */
    public final void mo19418b(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C5046x4) {
            C5046x4 x4Var = (C5046x4) list;
            while (i2 < list.size()) {
                Object e = x4Var.mo18921e(i2);
                if (e instanceof String) {
                    this.f14384a.mo19787a(i, (String) e);
                } else {
                    this.f14384a.mo19786a(i, (C5070z2) e);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19787a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo19409a(int i, Object obj, C4790h6 h6Var) throws IOException {
        zzek zzek = this.f14384a;
        C4945r5 r5Var = (C4945r5) obj;
        zzek.mo19782a(i, 3);
        h6Var.mo19031a(r5Var, (C5036w7) zzek.f14566a);
        zzek.mo19782a(i, 4);
    }

    /* renamed from: a */
    public final void mo19401a(int i) throws IOException {
        this.f14384a.mo19782a(i, 3);
    }

    /* renamed from: a */
    public final void mo19408a(int i, Object obj) throws IOException {
        if (obj instanceof C5070z2) {
            this.f14384a.mo19799b(i, (C5070z2) obj);
        } else {
            this.f14384a.mo19784a(i, (C4945r5) obj);
        }
    }

    /* renamed from: a */
    public final void mo19413a(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f14384a.mo19782a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzek.m21936b(((Boolean) list.get(i4)).booleanValue());
            }
            this.f14384a.mo19796b(i3);
            while (i2 < list.size()) {
                this.f14384a.mo19794a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f14384a.mo19788a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo19419b(int i, List<?> list, C4790h6 h6Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo19409a(i, list.get(i2), h6Var);
        }
    }

    /* renamed from: a */
    public final void mo19411a(int i, List<C5070z2> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f14384a.mo19786a(i, (C5070z2) list.get(i2));
        }
    }

    /* renamed from: a */
    public final void mo19412a(int i, List<?> list, C4790h6 h6Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo19417b(i, list.get(i2), h6Var);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo19406a(int i, C4807i5<K, V> i5Var, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.f14384a.mo19782a(i, 2);
            this.f14384a.mo19796b(C4820j5.m20401a(i5Var, entry.getKey(), entry.getValue()));
            C4820j5.m20402a(this.f14384a, i5Var, entry.getKey(), entry.getValue());
        }
    }
}
