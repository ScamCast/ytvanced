package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;

/* renamed from: bafk */
public final class bafk implements bafx {
    private final /* synthetic */ long a;

    public bafk(long j) {
        this.a = j;
    }

    public final void a(int i, int i2, long j, float[] fArr) {
        ExternalSurfaceManager.nativeUpdateSurface(this.a, i, i2, j, fArr);
    }
}
