package com.instabug.library.util;

import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.settings.SettingsManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class PlaceHolderUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8411381948423716182L, "com/instabug/library/util/PlaceHolderUtils", 7);
        $jacocoData = a;
        return a;
    }

    public PlaceHolderUtils() {
        $jacocoInit()[0] = true;
    }

    public static String getPlaceHolder(Key key, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugCustomTextPlaceHolder customPlaceHolders = SettingsManager.getInstance().getCustomPlaceHolders();
        if (customPlaceHolders == null) {
            $jacocoInit[1] = true;
            return str;
        }
        String str2 = customPlaceHolders.get(key);
        $jacocoInit[2] = true;
        if (str2 == null) {
            $jacocoInit[3] = true;
        } else if (str2.trim().equals("")) {
            $jacocoInit[4] = true;
        } else {
            $jacocoInit[5] = true;
            return str2;
        }
        $jacocoInit[6] = true;
        return str;
    }
}
