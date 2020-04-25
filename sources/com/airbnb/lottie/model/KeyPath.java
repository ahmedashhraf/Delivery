package com.airbnb.lottie.model;

import androidx.annotation.C0195i0;
import androidx.annotation.C0196j;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p205i.p489f.C14069f;

public class KeyPath {
    private final List<String> keys;
    @C0195i0
    private KeyPathElement resolvedElement;

    public KeyPath(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }

    private boolean endsWithGlobstar() {
        List<String> list = this.keys;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    @C0196j
    @C0207n0({C0208a.LIBRARY})
    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    @C0207n0({C0208a.LIBRARY})
    public boolean fullyResolvesTo(String str, int i) {
        boolean z = false;
        if (i >= this.keys.size()) {
            return false;
        }
        boolean z2 = i == this.keys.size() - 1;
        String str2 = (String) this.keys.get(i);
        if (!str2.equals("**")) {
            boolean z3 = str2.equals(str) || str2.equals(C14069f.f41343G);
            if ((z2 || (i == this.keys.size() - 2 && endsWithGlobstar())) && z3) {
                z = true;
            }
            return z;
        }
        if (!z2 && ((String) this.keys.get(i + 1)).equals(str)) {
            if (i == this.keys.size() - 2 || (i == this.keys.size() - 3 && endsWithGlobstar())) {
                z = true;
            }
            return z;
        } else if (z2) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.keys.size() - 1) {
                return false;
            }
            return ((String) this.keys.get(i2)).equals(str);
        }
    }

    @C0207n0({C0208a.LIBRARY})
    @C0195i0
    public KeyPathElement getResolvedElement() {
        return this.resolvedElement;
    }

    @C0207n0({C0208a.LIBRARY})
    public int incrementDepthBy(String str, int i) {
        if (isContainer(str)) {
            return 0;
        }
        if (!((String) this.keys.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.keys.size() - 1 && ((String) this.keys.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    public String keysToString() {
        return this.keys.toString();
    }

    @C0207n0({C0208a.LIBRARY})
    public boolean matches(String str, int i) {
        if (isContainer(str)) {
            return true;
        }
        if (i >= this.keys.size()) {
            return false;
        }
        if (((String) this.keys.get(i)).equals(str) || ((String) this.keys.get(i)).equals("**") || ((String) this.keys.get(i)).equals(C14069f.f41343G)) {
            return true;
        }
        return false;
    }

    @C0207n0({C0208a.LIBRARY})
    public boolean propagateToChildren(String str, int i) {
        boolean z = true;
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.keys.size() - 1 && !((String) this.keys.get(i)).equals("**")) {
            z = false;
        }
        return z;
    }

    @C0207n0({C0208a.LIBRARY})
    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.resolvedElement = keyPathElement;
        return keyPath;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.keys);
        sb.append(",resolved=");
        sb.append(this.resolvedElement != null);
        sb.append('}');
        return sb.toString();
    }

    private KeyPath(KeyPath keyPath) {
        this.keys = new ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }
}
