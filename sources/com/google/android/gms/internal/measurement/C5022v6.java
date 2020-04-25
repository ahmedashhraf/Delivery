package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5022v6 {
    /* renamed from: a */
    static String m21697a(C5070z2 z2Var) {
        C5061y6 y6Var = new C5061y6(z2Var);
        StringBuilder sb = new StringBuilder(y6Var.mo19750a());
        for (int i = 0; i < y6Var.mo19750a(); i++) {
            byte a = y6Var.mo19749a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
