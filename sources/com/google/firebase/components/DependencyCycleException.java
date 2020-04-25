package com.google.firebase.components;

import com.google.android.gms.common.annotation.C4056a;
import java.util.Arrays;
import java.util.List;

@C4056a
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class DependencyCycleException extends DependencyException {

    /* renamed from: a */
    private final List<C8641e<?>> f22665a;

    @C4056a
    public DependencyCycleException(List<C8641e<?>> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
        this.f22665a = list;
    }

    @C4056a
    /* renamed from: a */
    public List<C8641e<?>> mo31988a() {
        return this.f22665a;
    }
}
