package com.instabug.library.util;

import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class StringUtility {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2076801036283976054L, "com/instabug/library/util/StringUtility", 42);
        $jacocoData = a;
        return a;
    }

    public StringUtility() {
        $jacocoInit()[0] = true;
    }

    public static int compareVersion(String str, String str2) throws NumberFormatException {
        boolean[] $jacocoInit = $jacocoInit();
        String str3 = "\\.";
        String[] split = str.split(str3);
        $jacocoInit[12] = true;
        String[] split2 = str2.split(str3);
        $jacocoInit[13] = true;
        int i = 0;
        while (true) {
            if (i < split.length) {
                $jacocoInit[14] = true;
            } else if (i < split2.length) {
                $jacocoInit[15] = true;
            } else {
                $jacocoInit[30] = true;
                return 0;
            }
            if (i >= split.length) {
                $jacocoInit[16] = true;
            } else if (i >= split2.length) {
                $jacocoInit[17] = true;
            } else {
                $jacocoInit[18] = true;
                if (Integer.parseInt(split[i]) < Integer.parseInt(split2[i])) {
                    $jacocoInit[19] = true;
                    return -1;
                } else if (Integer.parseInt(split[i]) <= Integer.parseInt(split2[i])) {
                    $jacocoInit[20] = true;
                    i++;
                    $jacocoInit[29] = true;
                } else {
                    $jacocoInit[21] = true;
                    return 1;
                }
            }
            if (i < split.length) {
                $jacocoInit[22] = true;
                if (Integer.parseInt(split[i]) == 0) {
                    $jacocoInit[23] = true;
                } else {
                    $jacocoInit[24] = true;
                    return 1;
                }
            } else if (i >= split2.length) {
                $jacocoInit[25] = true;
            } else {
                $jacocoInit[26] = true;
                if (Integer.parseInt(split2[i]) == 0) {
                    $jacocoInit[27] = true;
                } else {
                    $jacocoInit[28] = true;
                    return -1;
                }
            }
            i++;
            $jacocoInit[29] = true;
        }
    }

    public static boolean isNumeric(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean matches = str.matches("\\d+(?:\\.\\d+)?");
        $jacocoInit[11] = true;
        return matches;
    }

    public static String removeExtension(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        String replaceFirst = str.replaceFirst("[.][^.]+$", "");
        $jacocoInit[31] = true;
        return replaceFirst;
    }

    public static String toCommaSeparated(List<String> list) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        $jacocoInit[32] = true;
        if (list == null) {
            $jacocoInit[33] = true;
        } else if (list.size() == 0) {
            $jacocoInit[34] = true;
        } else {
            int i = 0;
            $jacocoInit[36] = true;
            while (i < list.size() - 1) {
                $jacocoInit[37] = true;
                sb.append((String) list.get(i));
                $jacocoInit[38] = true;
                sb.append(",");
                i++;
                $jacocoInit[39] = true;
            }
            sb.append((String) list.get(list.size() - 1));
            $jacocoInit[40] = true;
            String sb2 = sb.toString();
            $jacocoInit[41] = true;
            return sb2;
        }
        String sb3 = sb.toString();
        $jacocoInit[35] = true;
        return sb3;
    }

    public static String trimString(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        String trimString = trimString(str, 4096);
        $jacocoInit[1] = true;
        return trimString;
    }

    public static String[] trimStrings(String[] strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[7] = true;
        int i = 0;
        while (i < strArr.length) {
            $jacocoInit[8] = true;
            strArr[i] = trimString(strArr[i]);
            i++;
            $jacocoInit[9] = true;
        }
        $jacocoInit[10] = true;
        return strArr;
    }

    public static String trimString(String str, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (str == null) {
            $jacocoInit[2] = true;
            return "null";
        }
        if (str.length() <= i) {
            $jacocoInit[3] = true;
        } else {
            $jacocoInit[4] = true;
            str = str.substring(0, i);
            $jacocoInit[5] = true;
        }
        $jacocoInit[6] = true;
        return str;
    }
}
