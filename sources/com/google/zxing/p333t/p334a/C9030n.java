package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.n */
/* compiled from: GeoResultParser */
public final class C9030n extends C9037u {

    /* renamed from: f */
    private static final Pattern f23644f = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    /* renamed from: a */
    public C9029m m42231a(C8985n nVar) {
        Matcher matcher = f23644f.matcher(C9037u.m42253b(nVar));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d) {
                if (parseDouble >= -90.0d) {
                    double parseDouble2 = Double.parseDouble(matcher.group(2));
                    if (parseDouble2 <= 180.0d) {
                        if (parseDouble2 >= -180.0d) {
                            double d = 0.0d;
                            if (matcher.group(3) != null) {
                                double parseDouble3 = Double.parseDouble(matcher.group(3));
                                if (parseDouble3 < 0.0d) {
                                    return null;
                                }
                                d = parseDouble3;
                            }
                            C9029m mVar = new C9029m(parseDouble, parseDouble2, d, group);
                            return mVar;
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
