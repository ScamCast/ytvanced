package defpackage;

import android.os.Handler;

/* renamed from: aisu */
public final class aisu implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private aisu(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static aisu a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new aisu(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public final /* synthetic */ Object get() {
        return new aiss(this.a, (Handler) this.b.get(), (zzf) this.c.get(), (aitk) this.d.get(), this.e);
    }
}
