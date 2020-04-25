package p212io.branch.referral.util;

import android.text.TextUtils;

/* renamed from: io.branch.referral.util.b */
/* compiled from: BranchContentSchema */
public enum C14193b {
    COMMERCE_AUCTION,
    COMMERCE_BUSINESS,
    COMMERCE_OTHER,
    COMMERCE_PRODUCT,
    COMMERCE_RESTAURANT,
    COMMERCE_SERVICE,
    COMMERCE_TRAVEL_FLIGHT,
    COMMERCE_TRAVEL_HOTEL,
    COMMERCE_TRAVEL_OTHER,
    GAME_STATE,
    MEDIA_IMAGE,
    MEDIA_MIXED,
    MEDIA_MUSIC,
    MEDIA_OTHER,
    MEDIA_VIDEO,
    OTHER,
    TEXT_ARTICLE,
    TEXT_BLOG,
    TEXT_OTHER,
    TEXT_RECIPE,
    TEXT_REVIEW,
    TEXT_SEARCH_RESULTS,
    TEXT_STORY,
    TEXT_TECHNICAL_DOC;

    /* renamed from: b */
    public static C14193b m61393b(String str) {
        C14193b[] values;
        if (!TextUtils.isEmpty(str)) {
            for (C14193b bVar : values()) {
                if (bVar.name().equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
        }
        return null;
    }
}
