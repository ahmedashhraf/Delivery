package com.google.zxing.p346y;

import com.google.zxing.p333t.p334a.C9026k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.y.m */
/* compiled from: EANManufacturerOrgSupport */
final class C9147m {

    /* renamed from: a */
    private final List<int[]> f23995a = new ArrayList();

    /* renamed from: b */
    private final List<String> f23996b = new ArrayList();

    C9147m() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo33192a(String str) {
        m42747a();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.f23995a.size();
        for (int i = 0; i < size; i++) {
            int[] iArr = (int[]) this.f23995a.get(i);
            int i2 = iArr[0];
            if (parseInt < i2) {
                return null;
            }
            if (iArr.length != 1) {
                i2 = iArr[1];
            }
            if (parseInt <= i2) {
                return (String) this.f23996b.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m42748a(int[] iArr, String str) {
        this.f23995a.add(iArr);
        this.f23996b.add(str);
    }

    /* renamed from: a */
    private synchronized void m42747a() {
        if (this.f23995a.isEmpty()) {
            m42748a(new int[]{0, 19}, "US/CA");
            m42748a(new int[]{30, 39}, "US");
            m42748a(new int[]{60, 139}, "US/CA");
            m42748a(new int[]{300, 379}, "FR");
            m42748a(new int[]{380}, "BG");
            m42748a(new int[]{383}, "SI");
            m42748a(new int[]{385}, "HR");
            m42748a(new int[]{387}, "BA");
            m42748a(new int[]{400, 440}, "DE");
            m42748a(new int[]{450, 459}, "JP");
            m42748a(new int[]{460, 469}, "RU");
            m42748a(new int[]{471}, "TW");
            m42748a(new int[]{474}, "EE");
            m42748a(new int[]{475}, "LV");
            m42748a(new int[]{476}, "AZ");
            m42748a(new int[]{477}, "LT");
            m42748a(new int[]{478}, "UZ");
            m42748a(new int[]{479}, "LK");
            m42748a(new int[]{480}, "PH");
            m42748a(new int[]{481}, "BY");
            m42748a(new int[]{482}, "UA");
            m42748a(new int[]{484}, "MD");
            m42748a(new int[]{485}, "AM");
            m42748a(new int[]{486}, "GE");
            m42748a(new int[]{487}, "KZ");
            m42748a(new int[]{489}, "HK");
            m42748a(new int[]{490, 499}, "JP");
            m42748a(new int[]{500, 509}, "GB");
            m42748a(new int[]{520}, "GR");
            m42748a(new int[]{528}, C9026k.f23624r);
            m42748a(new int[]{529}, "CY");
            m42748a(new int[]{531}, "MK");
            m42748a(new int[]{535}, "MT");
            m42748a(new int[]{539}, "IE");
            m42748a(new int[]{540, 549}, "BE/LU");
            m42748a(new int[]{560}, "PT");
            m42748a(new int[]{569}, "IS");
            m42748a(new int[]{570, 579}, "DK");
            m42748a(new int[]{590}, "PL");
            m42748a(new int[]{594}, "RO");
            m42748a(new int[]{599}, "HU");
            m42748a(new int[]{600, 601}, "ZA");
            m42748a(new int[]{603}, "GH");
            m42748a(new int[]{608}, "BH");
            m42748a(new int[]{609}, "MU");
            m42748a(new int[]{611}, "MA");
            m42748a(new int[]{613}, "DZ");
            m42748a(new int[]{616}, "KE");
            m42748a(new int[]{618}, "CI");
            m42748a(new int[]{619}, "TN");
            m42748a(new int[]{621}, "SY");
            m42748a(new int[]{622}, "EG");
            m42748a(new int[]{624}, "LY");
            m42748a(new int[]{625}, "JO");
            m42748a(new int[]{626}, "IR");
            m42748a(new int[]{627}, "KW");
            m42748a(new int[]{628}, "SA");
            m42748a(new int[]{629}, "AE");
            m42748a(new int[]{640, 649}, "FI");
            m42748a(new int[]{690, 695}, "CN");
            m42748a(new int[]{700, 709}, "NO");
            m42748a(new int[]{729}, "IL");
            m42748a(new int[]{730, 739}, "SE");
            m42748a(new int[]{740}, "GT");
            m42748a(new int[]{741}, "SV");
            m42748a(new int[]{742}, "HN");
            m42748a(new int[]{743}, "NI");
            m42748a(new int[]{744}, "CR");
            m42748a(new int[]{745}, "PA");
            m42748a(new int[]{746}, "DO");
            m42748a(new int[]{750}, "MX");
            m42748a(new int[]{754, 755}, "CA");
            m42748a(new int[]{759}, "VE");
            m42748a(new int[]{760, 769}, "CH");
            m42748a(new int[]{770}, "CO");
            m42748a(new int[]{773}, "UY");
            m42748a(new int[]{775}, "PE");
            m42748a(new int[]{777}, "BO");
            m42748a(new int[]{779}, "AR");
            m42748a(new int[]{780}, "CL");
            m42748a(new int[]{784}, "PY");
            m42748a(new int[]{785}, "PE");
            m42748a(new int[]{786}, "EC");
            m42748a(new int[]{789, 790}, "BR");
            m42748a(new int[]{800, 839}, "IT");
            m42748a(new int[]{840, 849}, "ES");
            m42748a(new int[]{850}, "CU");
            m42748a(new int[]{858}, "SK");
            m42748a(new int[]{859}, "CZ");
            m42748a(new int[]{860}, "YU");
            m42748a(new int[]{865}, "MN");
            m42748a(new int[]{867}, "KP");
            m42748a(new int[]{868, 869}, "TR");
            m42748a(new int[]{870, 879}, "NL");
            m42748a(new int[]{880}, "KR");
            m42748a(new int[]{885}, "TH");
            m42748a(new int[]{888}, "SG");
            m42748a(new int[]{890}, "IN");
            m42748a(new int[]{893}, "VN");
            m42748a(new int[]{896}, "PK");
            m42748a(new int[]{899}, "ID");
            m42748a(new int[]{900, 919}, "AT");
            m42748a(new int[]{930, 939}, "AU");
            m42748a(new int[]{940, 949}, "AZ");
            m42748a(new int[]{955}, "MY");
            m42748a(new int[]{958}, "MO");
        }
    }
}
