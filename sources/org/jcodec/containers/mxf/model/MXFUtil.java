package org.jcodec.containers.mxf.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MXFUtil {
    public static <T> List<T> findAllMeta(Collection<MXFMetadata> collection, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (MXFMetadata mXFMetadata : collection) {
            if (cls.isAssignableFrom(mXFMetadata.getClass())) {
                arrayList.add(mXFMetadata);
            }
        }
        return arrayList;
    }

    public static <T> T findMeta(Collection<MXFMetadata> collection, Class<T> cls) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            T t = (MXFMetadata) it.next();
            if (t.getClass().isAssignableFrom(cls)) {
                return t;
            }
        }
        return null;
    }

    public static <T> T resolveRef(List<MXFMetadata> list, C15568UL ul, Class<T> cls) {
        List resolveRefs = resolveRefs(list, new C15568UL[]{ul}, cls);
        if (resolveRefs.size() > 0) {
            return resolveRefs.get(0);
        }
        return null;
    }

    public static <T> List<T> resolveRefs(List<MXFMetadata> list, C15568UL[] ulArr, Class<T> cls) {
        ArrayList<MXFMetadata> arrayList = new ArrayList<>(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MXFMetadata mXFMetadata = (MXFMetadata) it.next();
            if (mXFMetadata.getUid() == null || !cls.isAssignableFrom(mXFMetadata.getClass())) {
                it.remove();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < ulArr.length; i++) {
            for (MXFMetadata mXFMetadata2 : arrayList) {
                if (mXFMetadata2.getUid().equals(ulArr[i])) {
                    arrayList2.add(mXFMetadata2);
                }
            }
        }
        return arrayList2;
    }
}
