package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.io.d0 */
/* compiled from: PatternFilenameFilter */
public final class C8351d0 implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f22246a;

    public C8351d0(String str) {
        this(Pattern.compile(str));
    }

    public boolean accept(@C5952h File file, String str) {
        return this.f22246a.matcher(str).matches();
    }

    public C8351d0(Pattern pattern) {
        this.f22246a = (Pattern) C7397x.m35664a(pattern);
    }
}
