package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: roy */
public final class roy extends riy implements rov {
    roy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public final String a() {
        Parcel a = a(3, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List b() {
        Parcel a = a(4, aX_());
        ArrayList b = rjz.b(a);
        a.recycle();
        return b;
    }

    public final String c() {
        Parcel a = a(5, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final roo d() {
        roo roq;
        Parcel a = a(6, aX_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            roq = queryLocalInterface instanceof roo ? (roo) queryLocalInterface : new roq(readStrongBinder);
        } else {
            roq = null;
        }
        a.recycle();
        return roq;
    }

    public final String e() {
        Parcel a = a(7, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final double f() {
        Parcel a = a(8, aX_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final String g() {
        Parcel a = a(9, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String h() {
        Parcel a = a(10, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final rmt i() {
        Parcel a = a(13, aX_());
        rmt a2 = rmw.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final roj j() {
        roj rom;
        Parcel a = a(17, aX_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            rom = queryLocalInterface instanceof roj ? (roj) queryLocalInterface : new rom(readStrongBinder);
        } else {
            rom = null;
        }
        a.recycle();
        return rom;
    }
}
