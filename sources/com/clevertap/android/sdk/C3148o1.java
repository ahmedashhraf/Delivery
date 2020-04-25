package com.clevertap.android.sdk;

import com.clevertap.android.sdk.C3211r0.C3213b;
import org.json.JSONArray;

/* renamed from: com.clevertap.android.sdk.o1 */
/* compiled from: QueueCursor */
final class C3148o1 {

    /* renamed from: a */
    private JSONArray f11227a;

    /* renamed from: b */
    private String f11228b;

    /* renamed from: c */
    private C3213b f11229c;

    C3148o1() {
    }

    /* renamed from: b */
    private void m15070b(C3213b bVar) {
        this.f11229c = bVar;
        this.f11227a = null;
        this.f11228b = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONArray mo12422a() {
        return this.f11227a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C3213b mo12427c() {
        return this.f11229c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Boolean mo12428d() {
        boolean z;
        if (this.f11228b != null) {
            JSONArray jSONArray = this.f11227a;
            if (jSONArray != null && jSONArray.length() > 0) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    public String toString() {
        String str = "tableName: ";
        if (mo12428d().booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f11229c);
            sb.append(" | numItems: 0");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f11229c);
        sb2.append(" | lastId: ");
        sb2.append(this.f11228b);
        sb2.append(" | numItems: ");
        sb2.append(this.f11227a.length());
        sb2.append(" | items: ");
        sb2.append(this.f11227a.toString());
        return sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12425a(JSONArray jSONArray) {
        this.f11227a = jSONArray;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12424a(String str) {
        this.f11228b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12423a(C3213b bVar) {
        this.f11229c = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo12426b() {
        return this.f11228b;
    }
}
