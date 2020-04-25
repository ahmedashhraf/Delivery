package p212io.branch.referral;

import androidx.core.app.C0770p;
import com.amplitude.api.C2876e;
import com.facebook.internal.NativeProtocol;
import com.facebook.places.model.PlaceFields;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import com.instabug.library.model.State;
import org.apache.http.cookie.C15222a;
import org.apache.http.p549j0.C15430e;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.jivesoftware.smackx.xhtmlim.packet.XHTMLExtension;
import p212io.branch.indexing.C14099c;

/* renamed from: io.branch.referral.s */
/* compiled from: Defines */
public class C14168s {

    /* renamed from: io.branch.referral.s$a */
    /* compiled from: Defines */
    public enum C14169a {
        IdentityID("identity_id"),
        Identity(C15430e.f44592s),
        DeviceFingerprintID("device_fingerprint_id"),
        SessionID(SessionEntry.COLUMN_ID),
        LinkClickID("link_click_id"),
        GoogleSearchInstallReferrer("google_search_install_referrer"),
        GooglePlayInstallReferrer("install_referrer_extras"),
        ClickedReferrerTimeStamp("clicked_referrer_ts"),
        InstallBeginTimeStamp("install_begin_ts"),
        FaceBookAppLinkChecked("facebook_app_link_checked"),
        BranchLinkUsed("branch_used"),
        ReferringBranchIdentity("referring_branch_identity"),
        BranchIdentity("branch_identity"),
        BranchKey("branch_key"),
        BranchData("branch_data"),
        Bucket("bucket"),
        DefaultBucket(C6009d.f17209I),
        Amount("amount"),
        CalculationType("calculation_type"),
        Location("location"),
        Type("type"),
        CreationSource("creation_source"),
        Prefix("prefix"),
        Expiration("expiration"),
        Event(C0770p.f3524g0),
        Metadata(MetaData.ELEMENT_NAME),
        CommerceData("commerce_data"),
        ReferralCode(C6009d.f17212L),
        Total("total"),
        Unique("unique"),
        Length("length"),
        Direction("direction"),
        BeginAfterID("begin_after_id"),
        Link("link"),
        ReferringData("referring_data"),
        ReferringLink("referring_link"),
        IsFullAppConv("is_full_app_conversion"),
        Data("data"),
        OS(State.KEY_OS),
        HardwareID("hardware_id"),
        AndroidID("android_id"),
        UnidentifiedDevice("unidentified_device"),
        HardwareIDType("hardware_id_type"),
        HardwareIDTypeVendor("vendor_id"),
        HardwareIDTypeRandom("random"),
        IsHardwareIDReal("is_hardware_id_real"),
        AppVersion(State.KEY_APP_VERSION),
        OSVersion(C2876e.f10123c0),
        Country("country"),
        Language("language"),
        IsReferrable("is_referrable"),
        Update(Item.UPDATE_ACTION),
        OriginalInstallTime("first_install_time"),
        FirstInstallTime("latest_install_time"),
        LastUpdateTime("latest_update_time"),
        PreviousUpdateTime("previous_update_time"),
        URIScheme("uri_scheme"),
        AppLinks(PlaceFields.APP_LINKS),
        AppIdentifier("app_identifier"),
        LinkIdentifier("link_identifier"),
        GoogleAdvertisingID("google_advertising_id"),
        AAID("aaid"),
        LATVal("lat_val"),
        LimitedAdTracking("limit_ad_tracking"),
        limitFacebookTracking("limit_facebook_tracking"),
        Debug("debug"),
        Brand("brand"),
        Model("model"),
        ScreenDpi("screen_dpi"),
        ScreenHeight("screen_height"),
        ScreenWidth("screen_width"),
        WiFi("wifi"),
        LocalIP("local_ip"),
        UserData(State.KEY_USER_DATA),
        DeveloperIdentity("developer_identity"),
        UserAgent("user_agent"),
        SDK("sdk"),
        SdkVersion(State.KEY_SDK_VERSION),
        UIMode("ui_mode"),
        InstallMetadata("install_metadata"),
        Clicked_Branch_Link("+clicked_branch_link"),
        IsFirstSession("+is_first_session"),
        AndroidDeepLinkPath("$android_deeplink_path"),
        DeepLinkPath(C6009d.f17226Z),
        AndroidAppLinkURL("android_app_link_url"),
        AndroidPushNotificationKey("branch"),
        AndroidPushIdentifier("push_identifier"),
        ForceNewBranchSession("branch_force_new_session"),
        CanonicalIdentifier("$canonical_identifier"),
        ContentTitle(C6009d.f17220T),
        ContentDesc(C6009d.f17221U),
        ContentImgUrl(C6009d.f17222V),
        CanonicalUrl("$canonical_url"),
        ContentType("$content_type"),
        PublicallyIndexable("$publicly_indexable"),
        LocallyIndexable("$locally_indexable"),
        ContentKeyWords("$keywords"),
        ContentExpiryTime("$exp_date"),
        Params(NativeProtocol.WEB_DIALOG_PARAMS),
        SharedLink("$shared_link"),
        ShareError("$share_error"),
        External_Intent_URI("external_intent_uri"),
        External_Intent_Extra("external_intent_extra"),
        Last_Round_Trip_Time("lrtt"),
        Branch_Round_Trip_Time("brtt"),
        Branch_Instrumentation("instrumentation"),
        Queue_Wait_Time("qwt"),
        InstantDeepLinkSession("instant_dl_session"),
        BranchViewData("branch_view_data"),
        BranchViewID("id"),
        BranchViewAction("action"),
        BranchViewNumOfUse("number_of_use"),
        BranchViewUrl("url"),
        BranchViewHtml(XHTMLExtension.ELEMENT),
        Path(C15222a.f44141w),
        ViewList("view_list"),
        ContentActionView("view"),
        ContentPath("content_path"),
        ContentNavPath("content_nav_path"),
        ReferralLink("referral_link"),
        ContentData("content_data"),
        ContentEvents("events"),
        ContentAnalyticsMode("content_analytics_mode"),
        ContentDiscovery(C14099c.f41438t),
        Environment("environment"),
        InstantApp("INSTANT_APP"),
        NativeApp("FULL_APP"),
        TransactionID(C5854b.f16897D),
        Currency(C5854b.f16923e),
        Revenue("revenue"),
        Shipping(C5854b.f16896C),
        Tax(C5854b.f16900G),
        Coupon(C5854b.f16924f),
        Affiliation("affiliation"),
        Description("description"),
        SearchQuery("search_query"),
        Name("name"),
        CustomData("custom_data"),
        EventData("event_data"),
        ContentItems("content_items"),
        ContentSchema("$content_schema"),
        Price(C2876e.f10104M),
        PriceCurrency("$currency"),
        Quantity(C2876e.f10103L),
        SKU("$sku"),
        ProductName("$product_name"),
        ProductBrand("$product_brand"),
        ProductCategory("$product_category"),
        ProductVariant("$product_variant"),
        Rating("$rating"),
        RatingAverage("$rating_average"),
        RatingCount("$rating_count"),
        RatingMax("$rating_max"),
        AddressStreet("$address_street"),
        AddressCity("$address_city"),
        AddressRegion("$address_region"),
        AddressCountry("$address_country"),
        AddressPostalCode("$address_postal_code"),
        Latitude("$latitude"),
        Longitude("$longitude"),
        ImageCaptions("$image_captions"),
        Condition("$condition"),
        CreationTimestamp("$creation_timestamp"),
        TrackingDisabled("tracking_disabled"),
        Instant("instant");
        
        private String key;

        private C14169a(String str) {
            this.key = "";
            this.key = str;
        }

        /* renamed from: d */
        public String mo44764d() {
            return this.key;
        }

        public String toString() {
            return this.key;
        }
    }

    /* renamed from: io.branch.referral.s$b */
    /* compiled from: Defines */
    public enum C14170b {
        Tags(State.KEY_TAGS),
        Alias("alias"),
        Type("type"),
        Duration("duration"),
        Channel("channel"),
        Feature("feature"),
        Stage("stage"),
        Campaign(C5854b.f16903J),
        Data("data"),
        URL("url");
        
        private String key;

        private C14170b(String str) {
            this.key = "";
            this.key = str;
        }

        /* renamed from: d */
        public String mo44766d() {
            return this.key;
        }

        public String toString() {
            return this.key;
        }
    }

    /* renamed from: io.branch.referral.s$c */
    /* compiled from: Defines */
    public enum C14171c {
        RedeemRewards("v1/redeem"),
        GetURL("v1/url"),
        GetApp("v1/app-link-settings"),
        RegisterInstall("v1/install"),
        RegisterClose("v1/close"),
        RegisterOpen("v1/open"),
        RegisterView("v1/register-view"),
        GetCredits("v1/credits/"),
        GetCreditHistory("v1/credithistory"),
        CompletedAction("v1/event"),
        IdentifyUser("v1/profile"),
        Logout("v1/logout"),
        GetReferralCode("v1/referralcode"),
        ValidateReferralCode("v1/referralcode/"),
        ApplyReferralCode("v1/applycode/"),
        DebugConnect("v1/debug/connect"),
        ContentEvent("v1/content-events"),
        TrackStandardEvent("v2/event/standard"),
        TrackCustomEvent("v2/event/custom");
        
        private String key;

        private C14171c(String str) {
            this.key = "";
            this.key = str;
        }

        /* renamed from: d */
        public String mo44768d() {
            return this.key;
        }

        public String toString() {
            return this.key;
        }
    }
}
