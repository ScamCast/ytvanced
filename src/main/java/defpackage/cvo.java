package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: cvo */
public abstract class cvo extends cvl implements Callback {
    public final Drawable a;

    protected cvo(Drawable drawable) {
        if (drawable instanceof cvl) {
            throw new IllegalArgumentException("drawable is already a ComparableDrawable");
        }
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        drawable.setCallback(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final void setChangingConfigurations(int i) {
        this.a.setChangingConfigurations(i);
    }

    public final void setDither(boolean z) {
        this.a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }

    public final boolean isStateful() {
        return this.a.isStateful();
    }

    public final boolean setState(int[] iArr) {
        return this.a.setState(iArr);
    }

    public final int[] getState() {
        return this.a.getState();
    }

    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.a.setVisible(z, z2);
    }

    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public final boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    public final boolean isAutoMirrored() {
        return this.a.isAutoMirrored();
    }

    public final void setAutoMirrored(boolean z) {
        this.a.setAutoMirrored(z);
    }

    public final void setTint(int i) {
        st.a(this.a, i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        st.a(this.a, colorStateList);
    }

    public final void setTintMode(Mode mode) {
        st.a(this.a, mode);
    }

    public final void setHotspot(float f, float f2) {
        st.a(this.a, f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        st.a(this.a, i, i2, i3, i4);
    }

    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}