package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: qev */
public final class qev implements Callable {
    private final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Long c;

    public qev(SharedPreferences sharedPreferences, String str, Long l) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.a.getLong(this.b, this.c.longValue()));
    }
}
