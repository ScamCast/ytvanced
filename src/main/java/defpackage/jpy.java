package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: jpy */
public final class jpy implements ezu {
    private final aysr a;
    private final aaas b;

    public jpy(aysr aysr, aaas aaas) {
        amqw.a((Object) aysr);
        amqw.b((aysr.a & 2) != 0);
        this.a = aysr;
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final int a() {
        return R.id.menu_upload;
    }

    public final void a(MenuItem menuItem) {
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return R.menu.upload_menu;
    }

    public final ezx d() {
        return null;
    }

    public final boolean b(MenuItem menuItem) {
        aaas aaas = this.b;
        apxu apxu = this.a.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, null);
        return true;
    }
}
