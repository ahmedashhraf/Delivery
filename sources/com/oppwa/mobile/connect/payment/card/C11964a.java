package com.oppwa.mobile.connect.payment.card;

/* renamed from: com.oppwa.mobile.connect.payment.card.a */
class C11964a {

    /* renamed from: a */
    private static int[] f34528a = {0, 2, 4, 6, 8, 1, 3, 5, 7, 9};

    /* renamed from: a */
    static boolean m53987a(String str) {
        String replaceAll = str.replaceAll("[^0-9]", "");
        boolean z = false;
        if (replaceAll.length() == 0) {
            return false;
        }
        String stringBuffer = new StringBuffer(replaceAll).reverse().toString();
        int i = 0;
        for (int i2 = 0; i2 < stringBuffer.length(); i2++) {
            int digit = Character.digit(stringBuffer.charAt(i2), 10);
            if (i2 % 2 == 1) {
                digit = f34528a[digit];
            }
            i += digit;
        }
        if (i % 10 == 0) {
            z = true;
        }
        return z;
    }
}
