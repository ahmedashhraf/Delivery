package com.airbnb.lottie.model;

import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p033k.C0938f;
import com.fasterxml.jackson.core.p162w.C3868i;

@C0207n0({C0208a.LIBRARY})
public class MutablePair<T> {
    @C0195i0
    T first;
    @C0195i0
    T second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0938f)) {
            return false;
        }
        C0938f fVar = (C0938f) obj;
        if (objectsEqual(fVar.f4243a, this.first) && objectsEqual(fVar.f4244b, this.second)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        T t = this.first;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.second;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public void set(T t, T t2) {
        this.first = t;
        this.second = t2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.first));
        sb.append(C3868i.f12248b);
        sb.append(String.valueOf(this.second));
        sb.append("}");
        return sb.toString();
    }
}
