package p212io.branch.referral.util;

/* renamed from: io.branch.referral.util.a */
/* compiled from: BRANCH_STANDARD_EVENT */
public enum C14192a {
    ADD_TO_CART(r2),
    ADD_TO_WISHLIST(r3),
    VIEW_CART(r4),
    INITIATE_PURCHASE(r5),
    ADD_PAYMENT_INFO(r6),
    PURCHASE(r7),
    SPEND_CREDITS(r8),
    SEARCH(r8),
    VIEW_ITEM("VIEW_ITEM"),
    VIEW_ITEMS("VIEW_ITEMS"),
    RATE("RATE"),
    SHARE("SHARE"),
    COMPLETE_REGISTRATION("COMPLETE_REGISTRATION"),
    COMPLETE_TUTORIAL("COMPLETE_TUTORIAL"),
    ACHIEVE_LEVEL("ACHIEVE_LEVEL"),
    UNLOCK_ACHIEVEMENT("UNLOCK_ACHIEVEMENT");
    
    private final String name;

    private C14192a(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
