package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baip */
final class baip implements Creator {
    baip() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baim[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new baim(parcel);
    }
}
