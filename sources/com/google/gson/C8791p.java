package com.google.gson;

import com.google.gson.p321x.C8806a;
import com.google.gson.p321x.C8829f;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.gson.p */
/* compiled from: JsonPrimitive */
public final class C8791p extends C8787l {

    /* renamed from: b */
    private static final Class<?>[] f23034b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f23035a;

    public C8791p(Boolean bool) {
        mo32425a((Object) bool);
    }

    /* renamed from: E */
    public boolean mo32422E() {
        return this.f23035a instanceof Boolean;
    }

    /* renamed from: F */
    public boolean mo32423F() {
        return this.f23035a instanceof Number;
    }

    /* renamed from: G */
    public boolean mo32424G() {
        return this.f23035a instanceof String;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo32425a(Object obj) {
        if (obj instanceof Character) {
            this.f23035a = String.valueOf(((Character) obj).charValue());
            return;
        }
        C8806a.m41345a((obj instanceof Number) || m41242c(obj));
        this.f23035a = obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8791p m41248b() {
        return this;
    }

    /* renamed from: c */
    public BigDecimal mo32370c() {
        Object obj = this.f23035a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(obj.toString());
    }

    /* renamed from: e */
    public BigInteger mo32372e() {
        Object obj = this.f23035a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return new BigInteger(obj.toString());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8791p.class != obj.getClass()) {
            return false;
        }
        C8791p pVar = (C8791p) obj;
        if (this.f23035a == null) {
            if (pVar.f23035a != null) {
                z = false;
            }
            return z;
        } else if (m41241a(this) && m41241a(pVar)) {
            if (mo32386w().longValue() != pVar.mo32386w().longValue()) {
                z = false;
            }
            return z;
        } else if (!(this.f23035a instanceof Number) || !(pVar.f23035a instanceof Number)) {
            return this.f23035a.equals(pVar.f23035a);
        } else {
            double doubleValue = mo32386w().doubleValue();
            double doubleValue2 = pVar.mo32386w().doubleValue();
            if (doubleValue != doubleValue2 && (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2))) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: f */
    public boolean mo32374f() {
        if (mo32422E()) {
            return mo32394l().booleanValue();
        }
        return Boolean.parseBoolean(mo32388y());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f23035a == null) {
            return 31;
        }
        if (m41241a(this)) {
            doubleToLongBits = mo32386w().longValue();
        } else {
            Object obj = this.f23035a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo32386w().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Boolean mo32394l() {
        return (Boolean) this.f23035a;
    }

    /* renamed from: m */
    public byte mo32378m() {
        return mo32423F() ? mo32386w().byteValue() : Byte.parseByte(mo32388y());
    }

    /* renamed from: n */
    public char mo32379n() {
        return mo32388y().charAt(0);
    }

    /* renamed from: o */
    public double mo32380o() {
        return mo32423F() ? mo32386w().doubleValue() : Double.parseDouble(mo32388y());
    }

    /* renamed from: p */
    public float mo32381p() {
        return mo32423F() ? mo32386w().floatValue() : Float.parseFloat(mo32388y());
    }

    /* renamed from: q */
    public int mo32382q() {
        return mo32423F() ? mo32386w().intValue() : Integer.parseInt(mo32388y());
    }

    /* renamed from: v */
    public long mo32385v() {
        return mo32423F() ? mo32386w().longValue() : Long.parseLong(mo32388y());
    }

    /* renamed from: w */
    public Number mo32386w() {
        Object obj = this.f23035a;
        return obj instanceof String ? new C8829f((String) obj) : (Number) obj;
    }

    /* renamed from: x */
    public short mo32387x() {
        return mo32423F() ? mo32386w().shortValue() : Short.parseShort(mo32388y());
    }

    /* renamed from: y */
    public String mo32388y() {
        if (mo32423F()) {
            return mo32386w().toString();
        }
        if (mo32422E()) {
            return mo32394l().toString();
        }
        return (String) this.f23035a;
    }

    /* renamed from: c */
    private static boolean m41242c(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class<?> isAssignableFrom : f23034b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public C8791p(Number number) {
        mo32425a((Object) number);
    }

    public C8791p(String str) {
        mo32425a((Object) str);
    }

    public C8791p(Character ch) {
        mo32425a((Object) ch);
    }

    /* renamed from: a */
    private static boolean m41241a(C8791p pVar) {
        Object obj = pVar.f23035a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    C8791p(Object obj) {
        mo32425a(obj);
    }
}
