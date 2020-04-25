package com.google.android.material.p179a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.annotation.C0180b;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0218s0;
import androidx.collection.C0649h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.a.h */
/* compiled from: MotionSpec */
public class C5594h {

    /* renamed from: c */
    private static final String f15942c = "MotionSpec";

    /* renamed from: a */
    private final C0649h<String, C5595i> f15943a = new C0649h<>();

    /* renamed from: b */
    private final C0649h<String, PropertyValuesHolder[]> f15944b = new C0649h<>();

    /* renamed from: a */
    public void mo22049a(String str, @C0195i0 C5595i iVar) {
        this.f15943a.put(str, iVar);
    }

    /* renamed from: b */
    public C5595i mo22052b(String str) {
        if (mo22054d(str)) {
            return (C5595i) this.f15943a.get(str);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public boolean mo22053c(String str) {
        return this.f15944b.get(str) != null;
    }

    /* renamed from: d */
    public boolean mo22054d(String str) {
        return this.f15943a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5594h)) {
            return false;
        }
        return this.f15943a.equals(((C5594h) obj).f15943a);
    }

    public int hashCode() {
        return this.f15943a.hashCode();
    }

    @C0193h0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(C5594h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.f15943a);
        sb.append("}\n");
        return sb.toString();
    }

    @C0193h0
    /* renamed from: a */
    public PropertyValuesHolder[] mo22051a(String str) {
        if (mo22053c(str)) {
            return m24267a((PropertyValuesHolder[]) this.f15944b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo22050a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f15944b.put(str, propertyValuesHolderArr);
    }

    @C0193h0
    /* renamed from: a */
    private PropertyValuesHolder[] m24267a(@C0193h0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    @C0193h0
    /* renamed from: a */
    public <T> ObjectAnimator mo22048a(@C0193h0 String str, @C0193h0 T t, @C0193h0 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo22051a(str));
        ofPropertyValuesHolder.setProperty(property);
        mo22052b(str).mo22059a((Animator) ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public long mo22047a() {
        int size = this.f15943a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C5595i iVar = (C5595i) this.f15943a.mo3367d(i);
            j = Math.max(j, iVar.mo22058a() + iVar.mo22060b());
        }
        return j;
    }

    @C0195i0
    /* renamed from: a */
    public static C5594h m24264a(@C0193h0 Context context, @C0193h0 TypedArray typedArray, @C0218s0 int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return m24263a(context, resourceId);
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: a */
    public static C5594h m24263a(@C0193h0 Context context, @C0180b int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m24265a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m24265a((List<Animator>) arrayList);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            sb.toString();
            return null;
        }
    }

    @C0193h0
    /* renamed from: a */
    private static C5594h m24265a(@C0193h0 List<Animator> list) {
        C5594h hVar = new C5594h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m24266a(hVar, (Animator) list.get(i));
        }
        return hVar;
    }

    /* renamed from: a */
    private static void m24266a(@C0193h0 C5594h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo22050a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo22049a(objectAnimator.getPropertyName(), C5595i.m24276a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }
}
