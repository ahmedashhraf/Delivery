package p212io.branch.referral.util;

import android.text.TextUtils;
import p053b.p063d.p064b.C2108a;

/* renamed from: io.branch.referral.util.g */
/* compiled from: ProductCategory */
public enum C14199g {
    ANIMALS_AND_PET_SUPPLIES("Animals & Pet Supplies"),
    APPAREL_AND_ACCESSORIES("Apparel & Accessories"),
    ARTS_AND_ENTERTAINMENT("Arts & Entertainment"),
    BABY_AND_TODDLER("Baby & Toddler"),
    BUSINESS_AND_INDUSTRIAL("Business & Industrial"),
    CAMERAS_AND_OPTICS("Cameras & Optics"),
    ELECTRONICS("Electronics"),
    FOOD_BEVERAGES_AND_TOBACCO("Food, Beverages & Tobacco"),
    FURNITURE("Furniture"),
    HARDWARE("Hardware"),
    HEALTH_AND_BEAUTY("Health & Beauty"),
    HOME_AND_GARDEN("Home & Garden"),
    LUGGAGE_AND_BAGS("Luggage & Bags"),
    MATURE("Mature"),
    MEDIA("Media"),
    OFFICE_SUPPLIES("Office Supplies"),
    RELIGIOUS_AND_CEREMONIAL("Religious & Ceremonial"),
    SOFTWARE(C2108a.f8154U),
    SPORTING_GOODS("Sporting Goods"),
    TOYS_AND_GAMES("Toys & Games"),
    VEHICLES_AND_PARTS("Vehicles & Parts");
    
    private String name;

    private C14199g(String str) {
        this.name = str;
    }

    /* renamed from: b */
    public static C14199g m61455b(String str) {
        C14199g[] values;
        if (!TextUtils.isEmpty(str)) {
            for (C14199g gVar : values()) {
                if (gVar.name.equalsIgnoreCase(str)) {
                    return gVar;
                }
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }
}
