package defpackage;

import android.os.Parcel;

/* renamed from: qow */
public final class qow extends RuntimeException {
    public qow(String str, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
        stringBuilder.append(str);
        stringBuilder.append(" Parcel: pos=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" size=");
        stringBuilder.append(dataSize);
        super(stringBuilder.toString());
    }
}
