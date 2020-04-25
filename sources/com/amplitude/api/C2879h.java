package com.amplitude.api;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.amplitude.api.h */
/* compiled from: DeviceInfo */
public class C2879h {

    /* renamed from: d */
    public static final String f10169d = "com.amplitude.api.DeviceInfo";

    /* renamed from: e */
    public static final String f10170e = "android";

    /* renamed from: f */
    private static final String f10171f = "limit_ad_tracking";

    /* renamed from: g */
    private static final String f10172g = "advertising_id";

    /* renamed from: a */
    private boolean f10173a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f10174b;

    /* renamed from: c */
    private C2881b f10175c;

    /* renamed from: com.amplitude.api.h$b */
    /* compiled from: DeviceInfo */
    private class C2881b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f10176a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f10177b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f10178c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f10179d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f10180e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f10181f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f10182g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f10183h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f10184i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f10185j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f10186k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f10187l;

        /* renamed from: m */
        private String m13670m() {
            return Build.MODEL;
        }

        /* renamed from: n */
        private String m13671n() {
            return "android";
        }

        /* renamed from: o */
        private String m13672o() {
            return VERSION.RELEASE;
        }

        /* renamed from: p */
        private String m13673p() {
            try {
                return C2879h.this.f10174b.getPackageManager().getPackageInfo(C2879h.this.f10174b.getPackageName(), 0).versionName;
            } catch (NameNotFoundException e) {
                C2882i.m13675c().mo11353a("Failed to get version name", e);
                return null;
            }
        }

        private C2881b() {
            this.f10176a = m13648b();
            this.f10178c = m13673p();
            this.f10179d = m13671n();
            this.f10180e = m13672o();
            this.f10181f = m13654e();
            this.f10182g = m13668l();
            this.f10183h = m13670m();
            this.f10184i = m13656f();
            this.f10177b = m13658g();
            this.f10185j = m13666k();
            this.f10187l = m13647a();
        }

        /* renamed from: a */
        private boolean m13647a() {
            String str = "Google Play Services Util not found!";
            String str2 = "Google Play Services not available";
            String str3 = "Failed to check GPS enabled";
            String str4 = C2879h.f10169d;
            boolean z = false;
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{C2879h.this.f10174b});
                if (num != null && num.intValue() == 0) {
                    z = true;
                }
                return z;
            } catch (NoClassDefFoundError e) {
                C2875d.m13566a().mo11299e(str4, str);
                C2882i.m13675c().mo11353a(str3, e);
                return false;
            } catch (ClassNotFoundException e2) {
                C2875d.m13566a().mo11299e(str4, str);
                C2882i.m13675c().mo11353a(str3, e2);
                return false;
            } catch (NoSuchMethodException e3) {
                C2875d.m13566a().mo11299e(str4, str2);
                C2882i.m13675c().mo11353a(str3, e3);
                return false;
            } catch (InvocationTargetException e4) {
                C2875d.m13566a().mo11299e(str4, str2);
                C2882i.m13675c().mo11353a(str3, e4);
                return false;
            } catch (IllegalAccessException e5) {
                C2875d.m13566a().mo11299e(str4, str2);
                C2882i.m13675c().mo11353a(str3, e5);
                return false;
            } catch (Exception e6) {
                C2875d a = C2875d.m13566a();
                StringBuilder sb = new StringBuilder();
                sb.append("Error when checking for Google Play Services: ");
                sb.append(e6);
                a.mo11299e(str4, sb.toString());
                C2882i.m13675c().mo11353a(str3, e6);
                return false;
            }
        }

        /* renamed from: b */
        private String m13648b() {
            if ("Amazon".equals(m13668l())) {
                return m13650c();
            }
            return m13652d();
        }

        /* renamed from: c */
        private String m13650c() {
            ContentResolver contentResolver = C2879h.this.f10174b.getContentResolver();
            boolean z = false;
            if (Secure.getInt(contentResolver, C2879h.f10171f, 0) == 1) {
                z = true;
            }
            this.f10186k = z;
            this.f10176a = Secure.getString(contentResolver, C2879h.f10172g);
            return this.f10176a;
        }

        /* renamed from: d */
        private String m13652d() {
            String str = "Failed to get ADID";
            String str2 = C2879h.f10169d;
            try {
                boolean z = true;
                Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{C2879h.this.f10174b});
                Boolean bool = (Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.f10186k = z;
                this.f10176a = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            } catch (ClassNotFoundException e) {
                C2875d.m13566a().mo11299e(str2, "Google Play Services SDK not found!");
                C2882i.m13675c().mo11353a(str, e);
            } catch (InvocationTargetException e2) {
                C2875d.m13566a().mo11299e(str2, "Google Play Services not available");
                C2882i.m13675c().mo11353a(str, e2);
            } catch (Exception e3) {
                C2875d.m13566a().mo11293b(str2, "Encountered an error connecting to Google Play Services", e3);
                C2882i.m13675c().mo11353a(str, e3);
            }
            return this.f10176a;
        }

        /* renamed from: e */
        private String m13654e() {
            return Build.BRAND;
        }

        /* renamed from: f */
        private String m13656f() {
            try {
                return ((TelephonyManager) C2879h.this.f10174b.getSystemService(PlaceFields.PHONE)).getNetworkOperatorName();
            } catch (Exception e) {
                C2882i.m13675c().mo11353a("Failed to get carrier", e);
                return null;
            }
        }

        /* renamed from: g */
        private String m13658g() {
            String i = m13662i();
            if (!C2892n.m13815a(i)) {
                return i;
            }
            String j = m13664j();
            if (!C2892n.m13815a(j)) {
                return j;
            }
            return m13660h();
        }

        /* renamed from: h */
        private String m13660h() {
            return Locale.getDefault().getCountry();
        }

        /* renamed from: i */
        private String m13662i() {
            String str = "Failed to get country from location";
            if (!C2879h.this.mo11347o()) {
                return null;
            }
            Location i = C2879h.this.mo11341i();
            if (i != null) {
                try {
                    if (Geocoder.isPresent()) {
                        List<Address> fromLocation = C2879h.this.mo11337e().getFromLocation(i.getLatitude(), i.getLongitude(), 1);
                        if (fromLocation != null) {
                            for (Address address : fromLocation) {
                                if (address != null) {
                                    return address.getCountryCode();
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    C2882i.m13675c().mo11353a(str, e);
                } catch (NullPointerException e2) {
                    C2882i.m13675c().mo11353a(str, e2);
                } catch (NoSuchMethodError e3) {
                    C2882i.m13675c().mo11353a(str, e3);
                } catch (IllegalArgumentException e4) {
                    C2882i.m13675c().mo11353a(str, e4);
                } catch (IllegalStateException e5) {
                    C2882i.m13675c().mo11353a(str, e5);
                }
            }
            return null;
        }

        /* renamed from: j */
        private String m13664j() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C2879h.this.f10174b.getSystemService(PlaceFields.PHONE);
                if (telephonyManager.getPhoneType() != 2) {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (networkCountryIso != null) {
                        return networkCountryIso.toUpperCase(Locale.US);
                    }
                }
            } catch (Exception e) {
                C2882i.m13675c().mo11353a("Failed to get country from network", e);
            }
            return null;
        }

        /* renamed from: k */
        private String m13666k() {
            return Locale.getDefault().getLanguage();
        }

        /* renamed from: l */
        private String m13668l() {
            return Build.MANUFACTURER;
        }
    }

    public C2879h(Context context) {
        this.f10174b = context;
    }

    /* renamed from: q */
    public static String m13627q() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: r */
    private C2881b m13628r() {
        if (this.f10175c == null) {
            this.f10175c = new C2881b();
        }
        return this.f10175c;
    }

    /* renamed from: b */
    public String mo11334b() {
        return m13628r().f10181f;
    }

    /* renamed from: c */
    public String mo11335c() {
        return m13628r().f10184i;
    }

    /* renamed from: d */
    public String mo11336d() {
        return m13628r().f10177b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Geocoder mo11337e() {
        return new Geocoder(this.f10174b, Locale.ENGLISH);
    }

    /* renamed from: f */
    public String mo11338f() {
        return m13628r().f10185j;
    }

    /* renamed from: g */
    public String mo11339g() {
        return m13628r().f10182g;
    }

    /* renamed from: h */
    public String mo11340h() {
        return m13628r().f10183h;
    }

    /* renamed from: i */
    public Location mo11341i() {
        List<String> list;
        Object obj;
        String str = "Failed to get most recent location";
        Location location = null;
        if (!mo11347o()) {
            return null;
        }
        LocationManager locationManager = (LocationManager) this.f10174b.getSystemService("location");
        if (locationManager == null) {
            return null;
        }
        try {
            list = locationManager.getProviders(true);
        } catch (SecurityException e) {
            C2882i.m13675c().mo11353a(str, e);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList<Location> arrayList = new ArrayList<>();
        for (String lastKnownLocation : list) {
            try {
                obj = locationManager.getLastKnownLocation(lastKnownLocation);
            } catch (Exception e2) {
                C2875d.m13566a().mo11299e(f10169d, str);
                C2882i.m13675c().mo11353a(str, e2);
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        long j = -1;
        for (Location location2 : arrayList) {
            if (location2.getTime() > j) {
                j = location2.getTime();
                location = location2;
            }
        }
        return location;
    }

    /* renamed from: j */
    public String mo11342j() {
        return m13628r().f10179d;
    }

    /* renamed from: k */
    public String mo11343k() {
        return m13628r().f10180e;
    }

    /* renamed from: l */
    public String mo11344l() {
        return m13628r().f10178c;
    }

    /* renamed from: m */
    public boolean mo11345m() {
        return m13628r().f10187l;
    }

    /* renamed from: n */
    public boolean mo11346n() {
        return m13628r().f10186k;
    }

    /* renamed from: o */
    public boolean mo11347o() {
        return this.f10173a;
    }

    /* renamed from: p */
    public void mo11348p() {
        m13628r();
    }

    /* renamed from: a */
    public String mo11332a() {
        return m13628r().f10176a;
    }

    /* renamed from: a */
    public void mo11333a(boolean z) {
        this.f10173a = z;
    }
}
