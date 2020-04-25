package com.google.android.play.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.m */
final class C5751m implements C5739e {
    C5751m() {
    }

    /* renamed from: a */
    public static void m25258a(ClassLoader classLoader, Set<File> set, C5759r rVar) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object a = C5741g.m25236a(classLoader);
            List list = (List) C5732a0.m25195a(a, "nativeLibraryDirectories", List.class).mo23032a();
            hashSet.removeAll(list);
            list.addAll(hashSet);
            ArrayList arrayList = new ArrayList();
            Object[] a2 = rVar.mo23054a(a, new ArrayList(hashSet), null, arrayList);
            if (!arrayList.isEmpty()) {
                C5733aa aaVar = new C5733aa("Error in makePathElements");
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C5744i0.m25251a(aaVar, (IOException) obj);
                }
                throw aaVar;
            }
            C5732a0.m25207b(a, "nativeLibraryPathElements", Object.class).mo23037b((T[]) a2);
        }
    }

    /* renamed from: a */
    public static boolean m25259a(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return C5741g.m25237a(classLoader, file, file2, z, new C5757p(), str, new C5743i());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Object[] m25261b(Object obj, List<File> list, File file, List<IOException> list2) {
        return (Object[]) C5732a0.m25200a(obj, "makePathElements", Object[].class, List.class, list, File.class, file, List.class, list2);
    }

    /* renamed from: a */
    public final void mo23039a(ClassLoader classLoader, Set<File> set) {
        m25258a(classLoader, set, new C5755o());
    }

    /* renamed from: a */
    public final boolean mo23040a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m25259a(classLoader, file, file2, z, "zip");
    }
}
