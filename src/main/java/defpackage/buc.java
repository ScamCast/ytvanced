package defpackage;

/* renamed from: buc */
final class buc extends RuntimeException {
    public static final long serialVersionUID = -7530898992688511851L;

    buc(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
