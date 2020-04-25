package com.facebook.soloader;

import p201f.p202a.C5952h;

class MergedSoMapping {
    MergedSoMapping() {
    }

    static void invokeJniOnload(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown library: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @C5952h
    static String mapLibName(String str) {
        return null;
    }
}
