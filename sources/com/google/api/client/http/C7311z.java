package com.google.api.client.http;

/* renamed from: com.google.api.client.http.z */
/* compiled from: HttpStatusCodes */
public class C7311z {

    /* renamed from: a */
    public static final int f20715a = 200;

    /* renamed from: b */
    public static final int f20716b = 201;

    /* renamed from: c */
    public static final int f20717c = 204;

    /* renamed from: d */
    public static final int f20718d = 300;

    /* renamed from: e */
    public static final int f20719e = 301;

    /* renamed from: f */
    public static final int f20720f = 302;

    /* renamed from: g */
    public static final int f20721g = 303;

    /* renamed from: h */
    public static final int f20722h = 304;

    /* renamed from: i */
    public static final int f20723i = 307;

    /* renamed from: j */
    public static final int f20724j = 400;

    /* renamed from: k */
    public static final int f20725k = 401;

    /* renamed from: l */
    public static final int f20726l = 403;

    /* renamed from: m */
    public static final int f20727m = 404;

    /* renamed from: n */
    public static final int f20728n = 405;

    /* renamed from: o */
    public static final int f20729o = 409;

    /* renamed from: p */
    public static final int f20730p = 412;

    /* renamed from: q */
    public static final int f20731q = 422;

    /* renamed from: r */
    public static final int f20732r = 500;

    /* renamed from: s */
    public static final int f20733s = 502;

    /* renamed from: t */
    public static final int f20734t = 503;

    /* renamed from: a */
    public static boolean m35405a(int i) {
        if (i != 307) {
            switch (i) {
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m35406b(int i) {
        return i >= 200 && i < 300;
    }
}
