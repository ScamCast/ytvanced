package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: vgw */
public final class vgw implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;

    private vgw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
    }

    public static vgw a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        return new vgw(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8);
    }

    public final /* synthetic */ Object get() {
        bcaa bcaa = this.a;
        bctz bctz = (bctz) this.b.get();
        this.c.get();
        return new vgv(bcaa, bctz, (ScheduledExecutorService) this.d.get(), (Executor) this.e.get(), (vdj) this.f.get(), (CopyOnWriteArrayList) this.g.get(), (zzl) this.h.get());
    }
}
