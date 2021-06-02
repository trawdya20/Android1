package com.uty.arffestofoodandbeverages;

import android.os.Parcel;
import android.os.Parcelable;

public class DataListMinum implements Parcelable {
    private int imageId;
    private String title;
    private String price;
    private String bahan;
    private String manfaat;

    public DataListMinum(int imageId, String title, String price, String bahan, String manfaat) {
        this.imageId = imageId;
        this.title = title;
        this.price = price;
        this.bahan = bahan;
        this.manfaat = manfaat;
    }

    protected DataListMinum(Parcel in) {
        imageId = in.readInt();
        title = in.readString();
        price = in.readString();
        bahan = in.readString();
        manfaat = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageId);
        dest.writeString(title);
        dest.writeString(price);
        dest.writeString(bahan);
        dest.writeString(manfaat);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DataListMinum> CREATOR = new Creator<DataListMinum>() {
        @Override
        public DataListMinum createFromParcel(Parcel in) {
            return new DataListMinum(in);
        }

        @Override
        public DataListMinum[] newArray(int size) {
            return new DataListMinum[size];
        }
    };

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getManfaat() {
        return manfaat;
    }

    public void setManfaat(String manfaat) {
        this.manfaat = manfaat;
    }
}
