package com.amplitude.api;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.l */
/* compiled from: Revenue */
public class C2890l {

    /* renamed from: h */
    public static final String f10222h = "com.amplitude.api.Revenue";

    /* renamed from: i */
    private static C2875d f10223i = C2875d.m13566a();

    /* renamed from: a */
    protected String f10224a = null;

    /* renamed from: b */
    protected int f10225b = 1;

    /* renamed from: c */
    protected Double f10226c = null;

    /* renamed from: d */
    protected String f10227d = null;

    /* renamed from: e */
    protected String f10228e = null;

    /* renamed from: f */
    protected String f10229f = null;

    /* renamed from: g */
    protected JSONObject f10230g = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11438a() {
        if (this.f10226c != null) {
            return true;
        }
        f10223i.mo11299e(f10222h, "Invalid revenue, need to set price");
        return false;
    }

    /* renamed from: b */
    public C2890l mo11439b(String str) {
        this.f10227d = str;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2890l.class != obj.getClass()) {
            return false;
        }
        C2890l lVar = (C2890l) obj;
        if (this.f10225b != lVar.f10225b) {
            return false;
        }
        String str = this.f10224a;
        if (str == null ? lVar.f10224a != null : !str.equals(lVar.f10224a)) {
            return false;
        }
        Double d = this.f10226c;
        if (d == null ? lVar.f10226c != null : !d.equals(lVar.f10226c)) {
            return false;
        }
        String str2 = this.f10227d;
        if (str2 == null ? lVar.f10227d != null : !str2.equals(lVar.f10227d)) {
            return false;
        }
        String str3 = this.f10228e;
        if (str3 == null ? lVar.f10228e != null : !str3.equals(lVar.f10228e)) {
            return false;
        }
        String str4 = this.f10229f;
        if (str4 == null ? lVar.f10229f != null : !str4.equals(lVar.f10229f)) {
            return false;
        }
        JSONObject jSONObject = this.f10230g;
        JSONObject jSONObject2 = lVar.f10230g;
        if (jSONObject == null ? jSONObject2 != null : !C2892n.m13816a(jSONObject, jSONObject2)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f10224a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f10225b) * 31;
        Double d = this.f10226c;
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f10227d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10228e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f10229f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f10230g;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: b */
    public C2890l mo11440b(JSONObject jSONObject) {
        f10223i.mo11299e(f10222h, "setRevenueProperties is deprecated, please use setEventProperties instead");
        return mo11437a(jSONObject);
    }

    /* renamed from: a */
    public C2890l mo11435a(String str) {
        if (C2892n.m13815a(str)) {
            f10223i.mo11299e(f10222h, "Invalid empty productId");
            return this;
        }
        this.f10224a = str;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONObject mo11441b() {
        JSONObject jSONObject = this.f10230g;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(C2876e.f10102K, this.f10224a);
            jSONObject.put(C2876e.f10103L, this.f10225b);
            jSONObject.put(C2876e.f10104M, this.f10226c);
            jSONObject.put(C2876e.f10105N, this.f10227d);
            jSONObject.put(C2876e.f10106O, this.f10228e);
            jSONObject.put(C2876e.f10107P, this.f10229f);
        } catch (JSONException e) {
            f10223i.mo11292b(f10222h, String.format("Failed to convert revenue object to JSON: %s", new Object[]{e.toString()}));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public C2890l mo11434a(int i) {
        this.f10225b = i;
        return this;
    }

    /* renamed from: a */
    public C2890l mo11433a(double d) {
        this.f10226c = Double.valueOf(d);
        return this;
    }

    /* renamed from: a */
    public C2890l mo11436a(String str, String str2) {
        this.f10228e = str;
        this.f10229f = str2;
        return this;
    }

    /* renamed from: a */
    public C2890l mo11437a(JSONObject jSONObject) {
        this.f10230g = C2892n.m13813a(jSONObject);
        return this;
    }
}
