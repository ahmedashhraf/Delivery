package com.instabug.library.internal.module;

import com.mrsool.utils.C11644i;

public enum InstabugLocale {
    ENGLISH(C11644i.f33183R5),
    ARABIC(C11644i.f33191S5),
    GERMAN("de"),
    SPANISH("es"),
    FRENCH("fr"),
    ITALIAN("it"),
    JAPANESE("ja"),
    KOREAN("ko"),
    POLISH("pl"),
    PORTUGUESE_BRAZIL(r11, "BR"),
    PORTUGUESE_PORTUGAL(r11, "PT"),
    RUSSIAN("ru"),
    SWEDISH("sv"),
    TURKISH("tr"),
    SIMPLIFIED_CHINESE("zh", "CN"),
    TRADITIONAL_CHINESE("zh", "TW"),
    CZECH("cs"),
    PERSIAN("fa"),
    INDONESIAN("in"),
    DANISH("da"),
    SLOVAK("sk"),
    NETHERLANDS("nl");
    
    private final String code;
    private final String country;

    static {
        boolean[] $jacocoInit;
        $jacocoInit[10] = true;
    }

    private InstabugLocale(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.code = str;
        this.country = "";
        $jacocoInit[2] = true;
    }

    public String getCode() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.code;
        $jacocoInit[4] = true;
        return str;
    }

    public String getCountry() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.country;
        $jacocoInit[5] = true;
        return str;
    }

    private InstabugLocale(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.code = str;
        this.country = str2;
        $jacocoInit[3] = true;
    }
}
