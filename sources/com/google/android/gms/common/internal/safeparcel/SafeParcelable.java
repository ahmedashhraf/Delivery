package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;

public interface SafeParcelable extends Parcelable {
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$a */
    public @interface C4392a {
        String creator();

        boolean validate() default false;
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$b */
    public @interface C4393b {
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$c */
    public @interface C4394c {
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo18384id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$d */
    public @interface C4395d {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$e */
    public @interface C4396e {
        /* renamed from: id */
        int mo18387id();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$f */
    public @interface C4397f {
        int[] value();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$g */
    public @interface C4398g {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo18390id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
