package org.jcodec.common;

import java.util.ArrayList;

public class StringUtils {
    public static String capitaliseAllWords(String str) {
        return capitalize(str);
    }

    public static String capitalize(String str) {
        return capitalize(str, null);
    }

    private static boolean isDelimiter(char c, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(c);
        }
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static String join(Object[] objArr) {
        return join(objArr, (String) null);
    }

    public static String[] split(String str) {
        return split(str, null, -1);
    }

    private static String[] splitWorker(String str, String str2, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            int i4 = 0;
            boolean z5 = false;
            boolean z6 = false;
            int i5 = 0;
            int i6 = 1;
            while (i4 < length) {
                if (Character.isWhitespace(str.charAt(i4))) {
                    if (z5 || z) {
                        int i7 = i6 + 1;
                        if (i6 == i) {
                            i4 = length;
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        arrayList.add(str.substring(i5, i4));
                        i6 = i7;
                        z5 = false;
                    }
                    i5 = i4 + 1;
                    i4 = i5;
                } else {
                    i4++;
                    z5 = true;
                    z6 = false;
                }
            }
            i2 = i5;
            z2 = z6;
            z3 = z5;
            i3 = i4;
        } else if (str2.length() == 1) {
            char charAt = str2.charAt(0);
            i3 = 0;
            z3 = false;
            z2 = false;
            i2 = 0;
            int i8 = 1;
            while (i3 < length) {
                if (str.charAt(i3) == charAt) {
                    if (z3 || z) {
                        int i9 = i8 + 1;
                        if (i8 == i) {
                            i3 = length;
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        arrayList.add(str.substring(i2, i3));
                        i8 = i9;
                        z3 = false;
                    }
                    i2 = i3 + 1;
                    i3 = i2;
                } else {
                    i3++;
                    z3 = true;
                    z2 = false;
                }
            }
        } else {
            int i10 = 0;
            z3 = false;
            z2 = false;
            i2 = 0;
            int i11 = 1;
            while (i3 < length) {
                if (str2.indexOf(str.charAt(i3)) >= 0) {
                    if (z3 || z) {
                        int i12 = i11 + 1;
                        if (i11 == i) {
                            i3 = length;
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        arrayList.add(str.substring(i2, i3));
                        i11 = i12;
                        z3 = false;
                    }
                    i2 = i3 + 1;
                    i10 = i2;
                } else {
                    i10 = i3 + 1;
                    z3 = true;
                    z2 = false;
                }
            }
        }
        if (z3 || (z && z2)) {
            arrayList.add(str.substring(i2, i3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String capitalize(String str, char[] cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (str == null || str.length() == 0 || length == 0) {
            return str;
        }
        int length2 = str.length();
        StringBuffer stringBuffer = new StringBuffer(length2);
        boolean z = true;
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (isDelimiter(charAt, cArr)) {
                stringBuffer.append(charAt);
                z = true;
            } else if (z) {
                stringBuffer.append(Character.toTitleCase(charAt));
                z = false;
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static String join(Object[] objArr, char c) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, c, 0, objArr.length);
    }

    public static String[] split(String str, String str2) {
        return splitWorker(str, str2, -1, false);
    }

    public static String join(Object[] objArr, char c, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(i3 * ((objArr[i] == null ? 16 : objArr[i].toString().length()) + 1));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                stringBuffer.append(c);
            }
            if (objArr[i4] != null) {
                stringBuffer.append(objArr[i4]);
            }
        }
        return stringBuffer.toString();
    }

    public static String[] split(String str, String str2, int i) {
        return splitWorker(str, str2, i, false);
    }

    public static String[] split(String str, char c) {
        return splitWorker(str, c, false);
    }

    public static String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    public static String join(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return str2;
        }
        StringBuffer stringBuffer = new StringBuffer(i3 * ((objArr[i] == null ? 16 : objArr[i].toString().length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                stringBuffer.append(str);
            }
            if (objArr[i4] != null) {
                stringBuffer.append(objArr[i4]);
            }
        }
        return stringBuffer.toString();
    }

    private static String[] splitWorker(String str, char c, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == c) {
                if (z2 || z) {
                    arrayList.add(str.substring(i2, i));
                    z2 = false;
                    z3 = true;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                z2 = true;
                z3 = false;
            }
        }
        if (z2 || (z && z3)) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
