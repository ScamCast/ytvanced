package defpackage;

import android.content.Context;

/* renamed from: uti */
public final class uti implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    private uti(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    public static uti a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        return new uti(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6);
    }

    public final /* synthetic */ Object get() {
        return new utf((ute) this.a.get(), (Context) this.b.get(), (tem) this.c.get(), (aott) this.d.get(), (tbg) this.e.get(), (uzn) this.f.get());
    }
}