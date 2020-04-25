package com.mrsool.newBean;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.File;

public class UploadImageBean implements Parcelable {
    public static final Creator<UploadImageBean> CREATOR = new Creator<UploadImageBean>() {
        public UploadImageBean createFromParcel(Parcel parcel) {
            return new UploadImageBean(parcel);
        }

        public UploadImageBean[] newArray(int i) {
            return new UploadImageBean[i];
        }
    };
    private Bitmap imageBitmap;
    private File imageFile;
    private String imagePath;

    public UploadImageBean() {
    }

    public int describeContents() {
        return 0;
    }

    public File getImageFile() {
        return this.imageFile;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.imageBitmap = bitmap;
    }

    public void setImageFile(File file) {
        this.imageFile = file;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imagePath);
        parcel.writeSerializable(this.imageFile);
        parcel.writeParcelable(this.imageBitmap, i);
    }

    protected UploadImageBean(Parcel parcel) {
        this.imagePath = parcel.readString();
        this.imageFile = (File) parcel.readSerializable();
        this.imageBitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }
}
