package com.google.gson;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.lang.reflect.Field;
import java.util.Locale;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.google.gson.d */
/* compiled from: FieldNamingPolicy */
public enum C8768d implements C8774e {
    IDENTITY {
        /* renamed from: a */
        public String mo32302a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo32302a(Field field) {
            return C8768d.m41084b(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo32302a(Field field) {
            return C8768d.m41084b(C8768d.m41085b(field.getName(), C3868i.f12248b));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo32302a(Field field) {
            return C8768d.m41085b(field.getName(), C14282d.ROLL_OVER_FILE_NAME_SEPARATOR).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo32302a(Field field) {
            return C8768d.m41085b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    private static String m41083a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str.substring(i));
        return sb.toString();
    }

    /* renamed from: b */
    static String m41085b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: b */
    static String m41084b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m41083a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }
}
