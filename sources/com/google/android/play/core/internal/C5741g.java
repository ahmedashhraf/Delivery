package com.google.android.play.core.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.g */
final class C5741g implements C5739e {
    C5741g() {
    }

    /* renamed from: a */
    static Object m25236a(ClassLoader classLoader) {
        return C5732a0.m25195a((Object) classLoader, "pathList", Object.class).mo23032a();
    }

    /* renamed from: a */
    static boolean m25237a(ClassLoader classLoader, File file, File file2, boolean z, C5747k kVar, String str, C5749l lVar) {
        ArrayList arrayList = new ArrayList();
        Object a = m25236a(classLoader);
        C5737c0 b = C5732a0.m25207b(a, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b.mo23032a());
        ArrayList arrayList2 = new ArrayList();
        for (Object a2 : asList) {
            arrayList2.add((File) C5732a0.m25195a(a2, str, File.class).mo23032a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        int i = 0;
        if (z || lVar.mo23048a(a, file2, file)) {
            b.mo23035a((T[]) kVar.mo23050a(a, new ArrayList(Collections.singleton(file2)), file, arrayList));
            if (arrayList.isEmpty()) {
                return true;
            }
            C5733aa aaVar = new C5733aa("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C5744i0.m25251a(aaVar, (IOException) obj);
            }
            C5732a0.m25207b(a, "dexElementsSuppressedExceptions", IOException.class).mo23034a((Collection<T>) arrayList);
            throw aaVar;
        }
        String str2 = "Should be optimized ";
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return false;
    }

    /* renamed from: b */
    static void m25238b(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                String str = "Adding native library parent directory: ";
                String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                hashSet.add(file.getParentFile());
            }
            C5737c0 b = C5732a0.m25207b(m25236a(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) b.mo23032a()));
            int size = hashSet.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("Adding directories ");
            sb.append(size);
            sb.toString();
            b.mo23036b((Collection<T>) hashSet);
        }
    }

    /* renamed from: a */
    public final void mo23039a(ClassLoader classLoader, Set<File> set) {
        m25238b(classLoader, set);
    }

    /* renamed from: a */
    public final boolean mo23040a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m25237a(classLoader, file, file2, z, new C5746j(), "zip", new C5743i());
    }
}
