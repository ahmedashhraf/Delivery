package org.jivesoftware.smackx.workgroup.util;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;

public final class ModelUtil {
    private ModelUtil() {
    }

    public static final boolean areBooleansDifferent(Boolean bool, Boolean bool2) {
        return !areBooleansEqual(bool, bool2);
    }

    public static final boolean areBooleansEqual(Boolean bool, Boolean bool2) {
        Boolean bool3 = Boolean.TRUE;
        if (!(bool == bool3 && bool2 == bool3)) {
            Boolean bool4 = Boolean.TRUE;
            if (bool == bool4 || bool2 == bool4) {
                return false;
            }
        }
        return true;
    }

    public static final boolean areDifferent(Object obj, Object obj2) {
        return !areEqual(obj, obj2);
    }

    public static final boolean areEqual(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static final String concat(String[] strArr) {
        return concat(strArr, C3868i.f12248b);
    }

    public static String getTimeFromLong(long j) {
        long j2 = j % 86400000;
        long j3 = j2 / 3600000;
        long j4 = j2 % 3600000;
        long j5 = j4 / 60000;
        long j6 = j4 % 60000;
        long j7 = j6 / 1000;
        long j8 = j6 % 1000;
        StringBuilder sb = new StringBuilder();
        String str = ", ";
        String str2 = C3868i.f12248b;
        if (j3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j3);
            sb2.append(str2);
            sb2.append(XHTMLText.f45021H);
            sb2.append(str);
            sb.append(sb2.toString());
        }
        if (j5 > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j5);
            sb3.append(str2);
            sb3.append("min");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(j7);
        sb4.append(str2);
        sb4.append("sec");
        sb.append(sb4.toString());
        return sb.toString();
    }

    public static final boolean hasLength(String str) {
        return str != null && str.length() > 0;
    }

    public static final boolean hasNonNullElement(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasStringChanged(String str, String str2) {
        if (str == null && str2 == null) {
            return false;
        }
        if ((str != null || str2 == null) && (str == null || str2 != null)) {
            return !str.equals(str2);
        }
        return true;
    }

    public static <T> List<T> iteratorAsList(Iterator<T> it) {
        ArrayList arrayList = new ArrayList(10);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final String nullifyIfEmpty(String str) {
        if (hasLength(str)) {
            return str;
        }
        return null;
    }

    public static final String nullifyingToString(Object obj) {
        if (obj != null) {
            return nullifyIfEmpty(obj.toString());
        }
        return null;
    }

    public static <T> Iterator<T> reverseListIterator(ListIterator<T> listIterator) {
        return new ReverseListIterator(listIterator);
    }

    public static final String concat(String[] strArr, String str) {
        if (strArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (str2 != null) {
                sb.append(str2);
                sb.append(str);
            }
        }
        int length = sb.length();
        if (length > 0) {
            sb.setLength(length - 1);
        }
        return sb.toString();
    }
}
