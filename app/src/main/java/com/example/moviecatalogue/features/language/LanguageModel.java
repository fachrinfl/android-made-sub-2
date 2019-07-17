package com.example.moviecatalogue.features.language;

import android.os.Parcel;
import android.os.Parcelable;

public class LanguageModel implements Parcelable {
    String langName;
    String langImage;
    String langCode;

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getLangImage() {
        return langImage;
    }

    public void setLangImage(String langImage) {
        this.langImage = langImage;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.langName);
        dest.writeString(this.langImage);
        dest.writeString(this.langCode);
    }

    public LanguageModel() {
    }

    protected LanguageModel(Parcel in) {
        this.langName = in.readString();
        this.langImage = in.readString();
        this.langCode = in.readString();
    }

    public static final Creator<LanguageModel> CREATOR = new Creator<LanguageModel>() {
        @Override
        public LanguageModel createFromParcel(Parcel source) {
            return new LanguageModel(source);
        }

        @Override
        public LanguageModel[] newArray(int size) {
            return new LanguageModel[size];
        }
    };
}
