package com.instabug.library.user;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public class UserEventParam {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private String key;
    private String value;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(765579048863997202L, "com/instabug/library/user/UserEventParam", 20);
        $jacocoData = a;
        return a;
    }

    public UserEventParam() {
        $jacocoInit()[0] = true;
    }

    public boolean equals(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (obj == null) {
            $jacocoInit[5] = true;
        } else if (!(obj instanceof UserEventParam)) {
            $jacocoInit[6] = true;
        } else {
            UserEventParam userEventParam = (UserEventParam) obj;
            $jacocoInit[7] = true;
            if (!String.valueOf(userEventParam.getKey()).equals(String.valueOf(getKey()))) {
                $jacocoInit[8] = true;
            } else {
                $jacocoInit[9] = true;
                if (!String.valueOf(userEventParam.getValue()).equals(String.valueOf(getValue()))) {
                    $jacocoInit[10] = true;
                } else {
                    $jacocoInit[11] = true;
                    z = true;
                    $jacocoInit[13] = true;
                    return z;
                }
            }
            $jacocoInit[12] = true;
            $jacocoInit[13] = true;
            return z;
        }
        $jacocoInit[14] = true;
        return false;
    }

    public String getKey() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.key;
        $jacocoInit[1] = true;
        return str;
    }

    public String getValue() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.value;
        $jacocoInit[3] = true;
        return str;
    }

    public int hashCode() {
        boolean[] $jacocoInit = $jacocoInit();
        if (getKey() == null) {
            $jacocoInit[15] = true;
        } else if (getValue() == null) {
            $jacocoInit[16] = true;
        } else {
            $jacocoInit[17] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(": ");
            sb.append(getValue());
            int hashCode = String.valueOf(sb.toString()).hashCode();
            $jacocoInit[18] = true;
            return hashCode;
        }
        $jacocoInit[19] = true;
        return -1;
    }

    public UserEventParam setKey(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.key = str;
        $jacocoInit[2] = true;
        return this;
    }

    public UserEventParam setValue(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.value = str;
        $jacocoInit[4] = true;
        return this;
    }
}
