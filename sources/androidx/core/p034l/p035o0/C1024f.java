package androidx.core.p034l.p035o0;

import android.os.Build.VERSION;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.C0193h0;
import java.util.List;

/* renamed from: androidx.core.l.o0.f */
/* compiled from: AccessibilityRecordCompat */
public class C1024f {

    /* renamed from: a */
    private final AccessibilityRecord f4650a;

    @Deprecated
    public C1024f(Object obj) {
        this.f4650a = (AccessibilityRecord) obj;
    }

    @Deprecated
    /* renamed from: a */
    public static C1024f m5984a(C1024f fVar) {
        return new C1024f(AccessibilityRecord.obtain(fVar.f4650a));
    }

    @Deprecated
    /* renamed from: y */
    public static C1024f m5989y() {
        return new C1024f(AccessibilityRecord.obtain());
    }

    @Deprecated
    /* renamed from: b */
    public void mo5074b(boolean z) {
        this.f4650a.setEnabled(z);
    }

    @Deprecated
    /* renamed from: c */
    public void mo5078c(boolean z) {
        this.f4650a.setFullScreen(z);
    }

    @Deprecated
    /* renamed from: d */
    public void mo5081d(boolean z) {
        this.f4650a.setPassword(z);
    }

    @Deprecated
    /* renamed from: e */
    public void mo5084e(boolean z) {
        this.f4650a.setScrollable(z);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1024f.class != obj.getClass()) {
            return false;
        }
        C1024f fVar = (C1024f) obj;
        AccessibilityRecord accessibilityRecord = this.f4650a;
        if (accessibilityRecord == null) {
            if (fVar.f4650a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(fVar.f4650a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: f */
    public int mo5086f() {
        return this.f4650a.getFromIndex();
    }

    @Deprecated
    /* renamed from: g */
    public Object mo5088g() {
        return this.f4650a;
    }

    @Deprecated
    /* renamed from: h */
    public int mo5090h() {
        return this.f4650a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f4650a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public void mo5094i(int i) {
        this.f4650a.setScrollY(i);
    }

    @Deprecated
    /* renamed from: j */
    public void mo5096j(int i) {
        this.f4650a.setToIndex(i);
    }

    @Deprecated
    /* renamed from: k */
    public Parcelable mo5097k() {
        return this.f4650a.getParcelableData();
    }

    @Deprecated
    /* renamed from: l */
    public int mo5098l() {
        return this.f4650a.getRemovedCount();
    }

    @Deprecated
    /* renamed from: m */
    public int mo5099m() {
        return this.f4650a.getScrollX();
    }

    @Deprecated
    /* renamed from: n */
    public int mo5100n() {
        return this.f4650a.getScrollY();
    }

    @Deprecated
    /* renamed from: o */
    public C1016d mo5101o() {
        return C1016d.m5810c((Object) this.f4650a.getSource());
    }

    @Deprecated
    /* renamed from: p */
    public List<CharSequence> mo5102p() {
        return this.f4650a.getText();
    }

    @Deprecated
    /* renamed from: q */
    public int mo5103q() {
        return this.f4650a.getToIndex();
    }

    @Deprecated
    /* renamed from: r */
    public int mo5104r() {
        return this.f4650a.getWindowId();
    }

    @Deprecated
    /* renamed from: s */
    public boolean mo5105s() {
        return this.f4650a.isChecked();
    }

    @Deprecated
    /* renamed from: t */
    public boolean mo5106t() {
        return this.f4650a.isEnabled();
    }

    @Deprecated
    /* renamed from: u */
    public boolean mo5107u() {
        return this.f4650a.isFullScreen();
    }

    @Deprecated
    /* renamed from: v */
    public boolean mo5108v() {
        return this.f4650a.isPassword();
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo5109w() {
        return this.f4650a.isScrollable();
    }

    @Deprecated
    /* renamed from: x */
    public void mo5110x() {
        this.f4650a.recycle();
    }

    @Deprecated
    /* renamed from: a */
    public void mo5067a(View view) {
        this.f4650a.setSource(view);
    }

    @Deprecated
    /* renamed from: b */
    public void mo5072b(int i) {
        this.f4650a.setCurrentItemIndex(i);
    }

    @Deprecated
    /* renamed from: c */
    public void mo5076c(int i) {
        this.f4650a.setFromIndex(i);
    }

    @Deprecated
    /* renamed from: d */
    public void mo5080d(int i) {
        this.f4650a.setItemCount(i);
    }

    @Deprecated
    /* renamed from: e */
    public int mo5082e() {
        return this.f4650a.getCurrentItemIndex();
    }

    @Deprecated
    /* renamed from: f */
    public void mo5087f(int i) {
        m5988b(this.f4650a, i);
    }

    @Deprecated
    /* renamed from: g */
    public void mo5089g(int i) {
        this.f4650a.setRemovedCount(i);
    }

    @Deprecated
    /* renamed from: h */
    public void mo5091h(int i) {
        this.f4650a.setScrollX(i);
    }

    @Deprecated
    /* renamed from: i */
    public int mo5093i() {
        return m5983a(this.f4650a);
    }

    @Deprecated
    /* renamed from: j */
    public int mo5095j() {
        return m5987b(this.f4650a);
    }

    /* renamed from: b */
    public static int m5987b(AccessibilityRecord accessibilityRecord) {
        if (VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollY();
        }
        return 0;
    }

    @Deprecated
    /* renamed from: a */
    public void mo5068a(View view, int i) {
        m5986a(this.f4650a, view, i);
    }

    @Deprecated
    /* renamed from: c */
    public CharSequence mo5075c() {
        return this.f4650a.getClassName();
    }

    @Deprecated
    /* renamed from: d */
    public CharSequence mo5079d() {
        return this.f4650a.getContentDescription();
    }

    @Deprecated
    /* renamed from: e */
    public void mo5083e(int i) {
        m5985a(this.f4650a, i);
    }

    /* renamed from: a */
    public static void m5986a(@C0193h0 AccessibilityRecord accessibilityRecord, View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo5077c(CharSequence charSequence) {
        this.f4650a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public static void m5988b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo5070a(boolean z) {
        this.f4650a.setChecked(z);
    }

    /* renamed from: a */
    public static int m5983a(AccessibilityRecord accessibilityRecord) {
        if (VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollX();
        }
        return 0;
    }

    @Deprecated
    /* renamed from: b */
    public void mo5073b(CharSequence charSequence) {
        this.f4650a.setClassName(charSequence);
    }

    @Deprecated
    /* renamed from: b */
    public CharSequence mo5071b() {
        return this.f4650a.getBeforeText();
    }

    /* renamed from: a */
    public static void m5985a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    @Deprecated
    /* renamed from: a */
    public int mo5064a() {
        return this.f4650a.getAddedCount();
    }

    @Deprecated
    /* renamed from: a */
    public void mo5065a(int i) {
        this.f4650a.setAddedCount(i);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5069a(CharSequence charSequence) {
        this.f4650a.setBeforeText(charSequence);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5066a(Parcelable parcelable) {
        this.f4650a.setParcelableData(parcelable);
    }
}
