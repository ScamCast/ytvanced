package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baiq */
public final class baiq extends baih {
    public static final Creator CREATOR = new bait();
    public float a;
    public float b;
    public float c;

    public final int describeContents() {
        return 0;
    }

    public baiq(Parcel parcel) {
        a(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
}