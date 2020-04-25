package com.crashlytics.android.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;

final class ProcMapEntryParser {
    private static final Pattern MAP_REGEX = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    private ProcMapEntryParser() {
    }

    public static ProcMapEntry parse(String str) {
        Matcher matcher = MAP_REGEX.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            ProcMapEntry procMapEntry = new ProcMapEntry(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            return procMapEntry;
        } catch (Exception unused) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not parse map entry: ");
            sb.append(str);
            j.mo45042d(CrashlyticsCore.TAG, sb.toString());
            return null;
        }
    }
}
