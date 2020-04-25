package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.k5 */
/* compiled from: Serialization */
final class C7984k5 {

    /* renamed from: com.google.common.collect.k5$b */
    /* compiled from: Serialization */
    static final class C7986b<T> {

        /* renamed from: a */
        private final Field f21744a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30742a(T t, Object obj) {
            try {
                this.f21744a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        private C7986b(Field field) {
            this.f21744a = field;
            field.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30741a(T t, int i) {
            try {
                this.f21744a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    private C7984k5() {
    }

    /* renamed from: a */
    static int m38238a(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* renamed from: a */
    static <K, V> void m38248a(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    static <K, V> void m38246a(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m38247a(map, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: a */
    static <K, V> void m38247a(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: a */
    static <E> void m38245a(C7982k4<E> k4Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(k4Var.entrySet().size());
        for (C7983a aVar : k4Var.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }

    /* renamed from: a */
    static <E> void m38243a(C7982k4<E> k4Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m38244a(k4Var, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: a */
    static <E> void m38244a(C7982k4<E> k4Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            k4Var.mo29893b(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: a */
    static <K, V> void m38242a(C7886h4<K, V> h4Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(h4Var.mo29703j().size());
        for (Entry entry : h4Var.mo29703j().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: a */
    static <K, V> void m38240a(C7886h4<K, V> h4Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m38241a(h4Var, objectInputStream, objectInputStream.readInt());
    }

    /* renamed from: a */
    static <K, V> void m38241a(C7886h4<K, V> h4Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = h4Var.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: a */
    static <T> C7986b<T> m38239a(Class<T> cls, String str) {
        try {
            return new C7986b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }
}
