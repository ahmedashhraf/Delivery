package com.instabug.survey.p400ui;

/* renamed from: com.instabug.survey.ui.g */
/* compiled from: ViewType */
public enum C10159g {
    PARTIAL,
    SECONDARY,
    PRIMARY;

    static {
        boolean[] e;
        e[9] = true;
    }

    /* renamed from: a */
    public static C10159g m47219a(int i, C10159g gVar) {
        boolean[] e = m47220e();
        if (i <= 0) {
            e[3] = true;
        } else if (i >= values().length) {
            e[4] = true;
        } else {
            e[5] = true;
            C10159g gVar2 = values()[i];
            e[6] = true;
            return gVar2;
        }
        e[7] = true;
        return gVar;
    }

    /* renamed from: d */
    public int mo36374d() {
        boolean[] e = m47220e();
        int ordinal = ordinal();
        e[8] = true;
        return ordinal;
    }
}
