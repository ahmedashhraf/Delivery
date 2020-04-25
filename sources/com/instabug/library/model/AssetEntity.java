package com.instabug.library.model;

import java.io.File;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AssetEntity implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private File file;
    private String key;
    private AssetType type;
    private String url;

    public enum AssetType {
        IMAGE,
        AUDIO,
        VIDEO;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-73025008035930778L, "com/instabug/library/model/AssetEntity", 5);
        $jacocoData = a;
        return a;
    }

    public AssetEntity(String str, AssetType assetType, String str2, File file2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.key = str;
        this.type = assetType;
        this.url = str2;
        this.file = file2;
        $jacocoInit[0] = true;
    }

    public File getFile() {
        boolean[] $jacocoInit = $jacocoInit();
        File file2 = this.file;
        $jacocoInit[4] = true;
        return file2;
    }

    public String getKey() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.key;
        $jacocoInit[1] = true;
        return str;
    }

    public AssetType getType() {
        boolean[] $jacocoInit = $jacocoInit();
        AssetType assetType = this.type;
        $jacocoInit[2] = true;
        return assetType;
    }

    public String getUrl() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.url;
        $jacocoInit[3] = true;
        return str;
    }
}
