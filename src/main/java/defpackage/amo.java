package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: amo */
final class amo extends AnimatorListenerAdapter {
    private final /* synthetic */ amr a;
    private final /* synthetic */ ViewPropertyAnimator b;
    private final /* synthetic */ View c;
    private final /* synthetic */ amg d;

    amo(amg amg, amr amr, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = amg;
        this.a = amr;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.f(this.a.b);
        this.d.g.remove(this.a.b);
        this.d.c();
    }
}
