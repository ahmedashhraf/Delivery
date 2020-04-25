package org.jacoco.agent.p551rt.internal_8ff85ea.core.data;

import java.io.IOException;

/* renamed from: org.jacoco.agent.rt.internal_8ff85ea.core.data.IncompatibleExecDataVersionException */
public class IncompatibleExecDataVersionException extends IOException {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final int f44693a;

    public IncompatibleExecDataVersionException(int i) {
        super(String.format("Cannot read execution data version 0x%x. This version of JaCoCo uses execution data version 0x%x.", new Object[]{Integer.valueOf(i), Integer.valueOf(C15478d.f44703b)}));
        this.f44693a = i;
    }

    /* renamed from: a */
    public int mo47802a() {
        return this.f44693a;
    }

    /* renamed from: d */
    public int mo47803d() {
        return C15478d.f44703b;
    }
}
