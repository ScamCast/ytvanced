package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dhx */
public class dhx extends Binder implements IInterface {
    public static dhz globalInterceptor;

    public dhx(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        dhz dhz = globalInterceptor;
        if (dhz == null) {
            return dispatchTransaction(i, parcel, parcel2, i2);
        }
        return dhz.a();
    }
}
