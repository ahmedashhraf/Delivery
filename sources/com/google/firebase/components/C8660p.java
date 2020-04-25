package com.google.firebase.components;

import com.google.firebase.p314i.C8671a;
import com.google.firebase.p314i.C8672b;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.p */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
final /* synthetic */ class C8660p implements Runnable {

    /* renamed from: a */
    private final Entry f22703a;

    /* renamed from: b */
    private final C8671a f22704b;

    private C8660p(Entry entry, C8671a aVar) {
        this.f22703a = entry;
        this.f22704b = aVar;
    }

    /* renamed from: a */
    public static Runnable m40704a(Entry entry, C8671a aVar) {
        return new C8660p(entry, aVar);
    }

    public void run() {
        ((C8672b) this.f22703a.getKey()).mo31978a(this.f22704b);
    }
}
