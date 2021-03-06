package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, Builder> {
    public static final Creator<ShareLinkContent> CREATOR = new Creator<ShareLinkContent>() {
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    };
    @Deprecated
    private final String contentDescription;
    @Deprecated
    private final String contentTitle;
    @Deprecated
    private final Uri imageUrl;
    private final String quote;

    public static final class Builder extends com.facebook.share.model.ShareContent.Builder<ShareLinkContent, Builder> {
        static final String TAG = "Builder";
        /* access modifiers changed from: private */
        @Deprecated
        public String contentDescription;
        /* access modifiers changed from: private */
        @Deprecated
        public String contentTitle;
        /* access modifiers changed from: private */
        @Deprecated
        public Uri imageUrl;
        /* access modifiers changed from: private */
        public String quote;

        @Deprecated
        public Builder setContentDescription(@C0195i0 String str) {
            return this;
        }

        @Deprecated
        public Builder setContentTitle(@C0195i0 String str) {
            return this;
        }

        @Deprecated
        public Builder setImageUrl(@C0195i0 Uri uri) {
            return this;
        }

        public Builder setQuote(@C0195i0 String str) {
            this.quote = str;
            return this;
        }

        public ShareLinkContent build() {
            return new ShareLinkContent(this);
        }

        public Builder readFrom(ShareLinkContent shareLinkContent) {
            if (shareLinkContent == null) {
                return this;
            }
            return ((Builder) super.readFrom(shareLinkContent)).setContentDescription(shareLinkContent.getContentDescription()).setImageUrl(shareLinkContent.getImageUrl()).setContentTitle(shareLinkContent.getContentTitle()).setQuote(shareLinkContent.getQuote());
        }
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getContentDescription() {
        return this.contentDescription;
    }

    @Deprecated
    @C0195i0
    public String getContentTitle() {
        return this.contentTitle;
    }

    @Deprecated
    @C0195i0
    public Uri getImageUrl() {
        return this.imageUrl;
    }

    @C0195i0
    public String getQuote() {
        return this.quote;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeString(this.quote);
    }

    private ShareLinkContent(Builder builder) {
        super((com.facebook.share.model.ShareContent.Builder) builder);
        this.contentDescription = builder.contentDescription;
        this.contentTitle = builder.contentTitle;
        this.imageUrl = builder.imageUrl;
        this.quote = builder.quote;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.quote = parcel.readString();
    }
}
