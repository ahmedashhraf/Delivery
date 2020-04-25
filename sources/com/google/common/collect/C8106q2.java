package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.q2 */
/* compiled from: ImmutableAsList */
abstract class C8106q2<E> extends C8257x2<E> {

    @C2777c("serialization")
    /* renamed from: com.google.common.collect.q2$a */
    /* compiled from: ImmutableAsList */
    static class C8107a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C8175t2<?> f21910a;

        C8107a(C8175t2<?> t2Var) {
            this.f21910a = t2Var;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return this.f21910a.mo30933e();
        }
    }

    C8106q2() {
    }

    @C2777c("serialization")
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public boolean contains(Object obj) {
        return mo29826n().contains(obj);
    }

    public boolean isEmpty() {
        return mo29826n().isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return mo29826n().mo29686j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public abstract C8175t2<E> mo29826n();

    public int size() {
        return mo29826n().size();
    }

    /* access modifiers changed from: 0000 */
    @C2777c("serialization")
    public Object writeReplace() {
        return new C8107a(mo29826n());
    }
}
