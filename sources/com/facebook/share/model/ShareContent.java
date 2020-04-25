package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.C0195i0;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends Builder> implements ShareModel {
    private final Uri contentUrl;
    private final ShareHashtag hashtag;
    private final String pageId;
    private final List<String> peopleIds;
    private final String placeId;
    private final String ref;

    public static abstract class Builder<P extends ShareContent, E extends Builder> implements ShareModelBuilder<P, E> {
        /* access modifiers changed from: private */
        public Uri contentUrl;
        /* access modifiers changed from: private */
        public ShareHashtag hashtag;
        /* access modifiers changed from: private */
        public String pageId;
        /* access modifiers changed from: private */
        public List<String> peopleIds;
        /* access modifiers changed from: private */
        public String placeId;
        /* access modifiers changed from: private */
        public String ref;

        public E setContentUrl(@C0195i0 Uri uri) {
            this.contentUrl = uri;
            return this;
        }

        public E setPageId(@C0195i0 String str) {
            this.pageId = str;
            return this;
        }

        public E setPeopleIds(@C0195i0 List<String> list) {
            this.peopleIds = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        public E setPlaceId(@C0195i0 String str) {
            this.placeId = str;
            return this;
        }

        public E setRef(@C0195i0 String str) {
            this.ref = str;
            return this;
        }

        public E setShareHashtag(@C0195i0 ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
            return this;
        }

        public E readFrom(P p) {
            if (p == null) {
                return this;
            }
            return setContentUrl(p.getContentUrl()).setPeopleIds(p.getPeopleIds()).setPlaceId(p.getPlaceId()).setPageId(p.getPageId()).setRef(p.getRef());
        }
    }

    protected ShareContent(Builder builder) {
        this.contentUrl = builder.contentUrl;
        this.peopleIds = builder.peopleIds;
        this.placeId = builder.placeId;
        this.pageId = builder.pageId;
        this.ref = builder.ref;
        this.hashtag = builder.hashtag;
    }

    private List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    @C0195i0
    public Uri getContentUrl() {
        return this.contentUrl;
    }

    @C0195i0
    public String getPageId() {
        return this.pageId;
    }

    @C0195i0
    public List<String> getPeopleIds() {
        return this.peopleIds;
    }

    @C0195i0
    public String getPlaceId() {
        return this.placeId;
    }

    @C0195i0
    public String getRef() {
        return this.ref;
    }

    @C0195i0
    public ShareHashtag getShareHashtag() {
        return this.hashtag;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.pageId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.hashtag, 0);
    }

    protected ShareContent(Parcel parcel) {
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = readUnmodifiableStringList(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.hashtag = new com.facebook.share.model.ShareHashtag.Builder().readFrom(parcel).build();
    }
}
