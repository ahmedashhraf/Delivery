package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.l6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4862l6 extends C4875m6<FieldDescriptorType, Object> {
    C4862l6(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo19268a() {
        if (!mo19299b()) {
            for (int i = 0; i < mo19300c(); i++) {
                Entry a = mo19298a(i);
                if (((C5071z3) a.getKey()).zzd()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Entry entry : mo19303d()) {
                if (((C5071z3) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo19268a();
    }
}
