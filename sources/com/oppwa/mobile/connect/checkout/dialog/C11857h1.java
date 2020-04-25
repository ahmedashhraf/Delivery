package com.oppwa.mobile.connect.checkout.dialog;

import androidx.annotation.C0193h0;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.h1 */
class C11857h1 {
    /* renamed from: a */
    static C11795a0 m53309a(@C0193h0 String str, boolean z) {
        if (z) {
            return new C11811d();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1727213164:
                if (str.equals("KLARNA_INSTALLMENTS")) {
                    c = 6;
                    break;
                }
                break;
            case -533832877:
                if (str.equals("KLARNA_INVOICE")) {
                    c = 5;
                    break;
                }
                break;
            case -6109378:
                if (str.equals("SOFORTUEBERWEISUNG")) {
                    c = 2;
                    break;
                }
                break;
            case 69511221:
                if (str.equals("IDEAL")) {
                    c = 3;
                    break;
                }
                break;
            case 73163034:
                if (str.equals("MBWAY")) {
                    c = 7;
                    break;
                }
                break;
            case 580579304:
                if (str.equals("IKANOOI_FI")) {
                    c = 10;
                    break;
                }
                break;
            case 580579558:
                if (str.equals("IKANOOI_NO")) {
                    c = 9;
                    break;
                }
                break;
            case 580579703:
                if (str.equals("IKANOOI_SE")) {
                    c = 8;
                    break;
                }
                break;
            case 756341129:
                if (str.equals("GIROPAY")) {
                    c = 4;
                    break;
                }
                break;
            case 1009940912:
                if (str.equals("CHINAUNIONPAY")) {
                    c = 1;
                    break;
                }
                break;
            case 1469416447:
                if (str.equals("DIRECTDEBIT_SEPA")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C11837g();
            case 1:
                return new C11834f();
            case 2:
                return new C11829e0();
            case 3:
                return new C11874n();
            case 4:
                return new C11858i();
            case 5:
            case 6:
                return new C11894r();
            case 7:
                return new C11904t();
            case 8:
            case 9:
            case 10:
                return new C11877o();
            default:
                return null;
        }
    }
}
