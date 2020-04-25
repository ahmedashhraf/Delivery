package com.mrsool.utils.webservice;

import com.mrsool.C10832k;
import com.mrsool.bean.AnnouncementMainBean;
import com.mrsool.bean.CallOptionsMainBean;
import com.mrsool.bean.CancelReasonMainBean;
import com.mrsool.bean.CardListMainBean;
import com.mrsool.bean.ChangeCourierMainBean;
import com.mrsool.bean.ChangeLanguage;
import com.mrsool.bean.ChatInitModel;
import com.mrsool.bean.CheckDiscountBean;
import com.mrsool.bean.CheckinOut;
import com.mrsool.bean.ComplaintDetailMainBean;
import com.mrsool.bean.ComplaintListMainBean;
import com.mrsool.bean.ComplaintTokenBean;
import com.mrsool.bean.CouponDetailMainBean;
import com.mrsool.bean.CourierBadgeBean;
import com.mrsool.bean.CourierLastLocationMainBean;
import com.mrsool.bean.DeeplinkBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.DefaultBeanOffer;
import com.mrsool.bean.DefaultBeanUrl;
import com.mrsool.bean.DefaultBeanWithhalalahError;
import com.mrsool.bean.DeliveryTimeWindowBean;
import com.mrsool.bean.GoogleShareUrlBean;
import com.mrsool.bean.LastAnnouncementRating;
import com.mrsool.bean.LocationData;
import com.mrsool.bean.MinMaxBean;
import com.mrsool.bean.MyCouponsMainBean;
import com.mrsool.bean.MyOrders;
import com.mrsool.bean.NotificationBean;
import com.mrsool.bean.NotificationList;
import com.mrsool.bean.OrderDeliveredBean;
import com.mrsool.bean.PaymentMethodListMainBean;
import com.mrsool.bean.PaymentOptionsList;
import com.mrsool.bean.PaymentSaveMainBean;
import com.mrsool.bean.PaymentStatusBean;
import com.mrsool.bean.PaymentStatusMainBean;
import com.mrsool.bean.PendingOrderListBean;
import com.mrsool.bean.PostOrder;
import com.mrsool.bean.RatingReasonMainBean;
import com.mrsool.bean.ReasonMainBean;
import com.mrsool.bean.ReverseGeocodeBean;
import com.mrsool.bean.SavedBookmarkedBean;
import com.mrsool.bean.ServiceManualDefaultBean;
import com.mrsool.bean.ServiceManualMainBean;
import com.mrsool.bean.ShopBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.bean.SingInBean;
import com.mrsool.bean.StaticLabelBean;
import com.mrsool.bean.TrackingHistoryMainBean;
import com.mrsool.bean.TrackingHistoryParamBean;
import com.mrsool.bean.UpdateInfoBean;
import com.mrsool.bean.UpdateProfile;
import com.mrsool.bean.UseCouponBean;
import com.mrsool.bean.UserDetail;
import com.mrsool.bean.UserFeedback;
import com.mrsool.bean.VerifyOTP;
import com.mrsool.newBean.DeleteReview;
import com.mrsool.newBean.GetBranchList;
import com.mrsool.newBean.GetReviews;
import com.mrsool.newBean.GetStores;
import com.mrsool.newBean.SubmitRatingBean;
import com.mrsool.newBean.VoteReview;
import com.mrsool.shopmenu.bean.GetBusinessIdBean;
import com.mrsool.shopmenu.bean.GetMenuBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p468g.C13817d0;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface APIInterface {
    @FormUrlEncoded
    @POST("orders/{order_id}/accept_reject_offer")
    Call<ServiceManualDefaultBean> AccpetRejectOffer(@Path("order_id") String str, @FieldMap HashMap<String, String> hashMap);

    @POST("users/{user_id}/add_coupon")
    Call<UseCouponBean> AddCoupon(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @PATCH("users/{user_id}")
    Call<ChangeLanguage> ChangeLanguage(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @PATCH("orders/{order_id}")
    Call<ServiceManualDefaultBean> ChangeOffer(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("shops/check_in_out")
    Call<CheckinOut> CheckInShop(@QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/payment_status")
    Call<PaymentStatusBean> CheckPaymentStatus(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/complaint")
    @Multipart
    Call<ServiceManualDefaultBean> CreateCompaint(@PartMap HashMap<String, C13817d0> hashMap, @Part C13875b bVar, @Part C13875b bVar2, @Part C13875b bVar3);

    @PATCH("users/{user_id}/logout")
    Call<DefaultBean> LogOut(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("shops")
    Call<GetStores> MostActiveShops(@QueryMap(encoded = true) Map<String, String> map);

    @FormUrlEncoded
    @POST("users/give_ratings")
    Call<ServiceManualDefaultBean> RateNReview(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("users/give_ratings")
    Call<SubmitRatingBean> RateNReviewNew(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("shops/{shopId}/rating_reviews")
    Call<SubmitRatingBean> RateNReviewShop(@Path("shopId") String str, @FieldMap HashMap<String, String> hashMap);

    @POST("users/{user_id}/replace_coupon")
    Call<DefaultBean> ReplaceCoupon(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("shops/search")
    Call<ShopBean> SearchShop(@QueryMap(encoded = true) Map<String, String> map);

    @FormUrlEncoded
    @POST("auth/signin")
    Call<SingInBean> SignInApi(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @PATCH("users/{user_id}")
    Call<SingInBean> SignInSocialMediaApi(@Path("user_id") String str, @FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("users/update_device_info")
    Call<UpdateInfoBean> UpdateDeviceInfo(@FieldMap HashMap<String, String> hashMap);

    @PATCH("users/{user_id}")
    @Multipart
    Call<UpdateProfile> UpdateUserProfile(@Path("user_id") String str, @PartMap HashMap<String, C13817d0> hashMap, @Part C13875b bVar);

    @FormUrlEncoded
    @PATCH("users/{userid}/verify_code")
    Call<VerifyOTP> VerifyOTPApi(@Path("userid") String str, @FieldMap HashMap<String, String> hashMap);

    @PUT("users/{user_id}/add_courier_sponser")
    Call<DefaultBean> addCourierSponsor(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("shops/manual_read")
    Call<DefaultBean> callAddManualLog(@QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/delete_location_bookmark")
    Call<DefaultBean> callDeleteLocationBookmark(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("cash_out_options/optin_for_payment")
    Call<DefaultBeanWithhalalahError> callOptinPayment(@QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/save_location_bookmark")
    Call<SavedBookmarkedBean> callSaveLocationBookmark(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("reverse_geocode")
    Call<ReverseGeocodeBean> callgetAddressFromLatLng(@QueryMap(encoded = true) Map<String, String> map);

    @POST("shops/get_manual")
    Call<ServiceManualMainBean> callgetShopManual(@QueryMap(encoded = true) Map<String, String> map);

    @GET("cancel_reasons")
    Call<CancelReasonMainBean> cancelReason(@QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/change_payment")
    Call<DefaultBean> changePaymentMethod(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/check_discount_options")
    Call<CheckDiscountBean> checkDiscountOptions(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/delete_notification")
    Call<DefaultBean> deleteNotification(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @DELETE("shops/rating_reviews/{id}")
    Call<DeleteReview> deleteReview(@Path("id") String str);

    @PATCH("orders/edit_complaint")
    @Multipart
    Call<ComplaintDetailMainBean> editCompaint(@PartMap HashMap<String, C13817d0> hashMap, @Part C13875b bVar, @Part C13875b bVar2, @Part C13875b bVar3);

    @GET("users/{user_id}/my_complaints")
    Call<ComplaintListMainBean> getAllComplaints(@Path("user_id") String str);

    @POST("announcements/{id}/details")
    Call<AnnouncementMainBean> getAnnouncementDetail(@Path("id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("announcements/{id}/update_view_count")
    Call<DefaultBean> getAnnouncementView(@Path("id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("shops/get_nearby_branches")
    Call<GetBranchList> getBranchList(@QueryMap(encoded = true) Map<String, String> map);

    @POST("business_orders/validate")
    Call<GetBusinessIdBean> getBusinessID(@Body C13817d0 d0Var, @QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/buyer_payment_options")
    Call<PaymentOptionsList> getBuyerPaymentOptions(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/payment_status")
    Call<PaymentStatusMainBean> getBuyerPaymentStatus(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/card_list")
    Call<CardListMainBean> getCardList(@Path("user_id") String str);

    @GET("orders/{order_id}")
    Call<ChatInitModel> getChatMessage(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("orders/complaint_details")
    Call<ComplaintDetailMainBean> getComplaintDetail(@QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/coupon_list")
    Call<MyCouponsMainBean> getCouponList(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("users/{user_id}/courier_badge")
    Call<CourierBadgeBean> getCourierBadgeBean(@Path("user_id") String str);

    @GET("users/{user_id}/courier_notifications_v2")
    Call<PendingOrderListBean> getCourierPendingOrders2(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/get_courier_weblink_token")
    Call<ComplaintTokenBean> getCourierWeblinkToken(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("shops/get_deeplink")
    Call<DeeplinkBean> getDeepLink(@QueryMap(encoded = true) Map<String, String> map);

    @POST("get_delivery_time_windows")
    Call<DeliveryTimeWindowBean> getDeliveryTimeWindow(@QueryMap(encoded = true) Map<String, String> map);

    @POST("all_histories")
    Call<TrackingHistoryMainBean> getHistory(@Body TrackingHistoryParamBean trackingHistoryParamBean);

    @POST("inapt_order_reasons")
    Call<CancelReasonMainBean> getInAppropriateReasons(@QueryMap(encoded = true) Map<String, String> map);

    @POST("announcements/latest_announcement")
    Call<AnnouncementMainBean> getLastAnnouncement(@QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/latest_unnoticed_changes")
    Call<LastAnnouncementRating> getLastAnnouncementRating(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("get_last_location")
    Call<CourierLastLocationMainBean> getLastCourierLocation(@Body C10832k kVar);

    @POST("parse_short_mapurl")
    Call<GoogleShareUrlBean> getLatlngFromUrl(@QueryMap(encoded = false) Map<String, String> map);

    @POST("business_orders")
    Call<GetMenuBean> getMenuForBusinessOrder(@QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/get_min_max_offer")
    Call<MinMaxBean> getMinMaxOffer(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("cash_out_options")
    Call<PaymentMethodListMainBean> getPayemntMethods(@QueryMap(encoded = true) Map<String, String> map);

    @GET("complaint_reasons")
    Call<ReasonMainBean> getReason(@QueryMap(encoded = true) Map<String, String> map);

    @GET("orders/{order_id}/other_offers")
    Call<ChangeCourierMainBean> getRejectedOffers(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("shops/{id}/rating_reviews")
    Call<GetReviews> getReviewList(@Path("id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("static_labels")
    Call<StaticLabelBean> getStaticLabels(@QueryMap(encoded = true) Map<String, String> map);

    @GET("users/{iUserId}/show_profile_updates")
    Call<UserDetail> getUserDetail(@Path("iUserId") String str);

    @GET("users/{id}/feedbacks")
    Call<UserFeedback> getUserFeedback(@Path("id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("users/{id}/service_rating_reviews")
    Call<GetReviews> getUserReviewList(@Path("id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("users/{user_id}")
    Call<UserDetail> getUserUpdatedDetail(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("call_options")
    Call<CallOptionsMainBean> getcallOption(@QueryMap(encoded = true) Map<String, String> map);

    @FormUrlEncoded
    @POST("orders/{order_id}/issue_offer")
    Call<DefaultBeanOffer> isseuOffer(@Path("order_id") String str, @FieldMap HashMap<String, String> hashMap);

    @POST("orders/{order_id}/issue_bill")
    @Multipart
    Call<ServiceManualDefaultBean> issueBill(@Path("order_id") String str, @PartMap HashMap<String, C13817d0> hashMap, @Part C13875b bVar);

    @POST("orders/{order_id}/mark_inappropriate")
    Call<ServiceManualDefaultBean> markInAppropriate(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("users/{user_id}/my_deliveries")
    Call<MyOrders> myDeliveries(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("users/{user_id}/my_orders")
    Call<MyOrders> myOrders(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @GET("users/{user_id}/notifications")
    Call<NotificationList> notificationList(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("orders")
    @Multipart
    Call<PostOrder> placeNewOrderNew(@PartMap HashMap<String, C13817d0> hashMap, @Part List<C13875b> list);

    @POST("coordinates")
    Call<DefaultBean> pushMessage(@Body LocationData locationData);

    @POST("rating_reasons")
    Call<RatingReasonMainBean> ratingReason(@QueryMap(encoded = true) Map<String, String> map);

    @FormUrlEncoded
    @POST("orders/{order_id}/read_message")
    Call<DefaultBean> readChatMessage(@Path("order_id") String str, @FieldMap HashMap<String, String> hashMap);

    @PATCH("users/{user_id}/read_notification")
    Call<DefaultBean> readNotification(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/register_payment_card")
    Call<PaymentSaveMainBean> registerPaymentCard(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("report_error")
    Call<DefaultBean> reportError(@QueryMap(encoded = true) Map<String, String> map);

    @FormUrlEncoded
    @POST("orders/{order_id}/save_message")
    Call<DefaultBeanUrl> saveMessage(@Path("order_id") String str, @FieldMap HashMap<String, String> hashMap);

    @POST("orders/{order_id}/save_message")
    @Multipart
    Call<DefaultBeanUrl> saveMessage1(@Path("order_id") String str, @PartMap HashMap<String, C13817d0> hashMap, @Part C13875b bVar);

    @POST("users/{id}/promotion_seen")
    Call<DefaultBean> seenPromotion(@Path("id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("business_orders/submit")
    Call<DefaultBean> sendOrder(@QueryMap(encoded = true) Map<String, String> map);

    @FormUrlEncoded
    @POST("shops")
    Call<ShopDetails> shopDetails(@FieldMap HashMap<String, String> hashMap);

    @POST("orders/{order_id}/update_cancel_request")
    Call<ServiceManualDefaultBean> updateCancelRequest(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/update_notification_status")
    Call<NotificationBean> updateNotificationStatus(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/update_order_state")
    Call<ServiceManualDefaultBean> updateOrderState(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("users/{user_id}/update_payment_card")
    Call<CardListMainBean> updatePaymentCard(@Path("user_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/update_payment_process")
    Call<PaymentStatusMainBean> updatePaymentProcess(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("orders/{order_id}/update_tracking_status")
    Call<DefaultBean> updateTrackingStatus(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @POST("coupon_details")
    Call<CouponDetailMainBean> viewCouponDetail(@QueryMap(encoded = true) Map<String, String> map);

    @POST("shops/rating_reviews/{id}/upvote_downvote")
    Call<VoteReview> voteReview(@Path("id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @PATCH("orders/{order_id}")
    Call<OrderDeliveredBean> withdrawOrder(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);

    @PATCH("orders/{order_id}/withdraw_offer")
    Call<ServiceManualDefaultBean> withdrawOrderBeforeAccept(@Path("order_id") String str, @QueryMap(encoded = true) Map<String, String> map);
}
