package defpackage;

/* renamed from: lay */
public final class lay {
    public final bcaa a;
    public final bcaa b;

    public lay(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) lay.a(bcaa, 1);
        this.b = (bcaa) lay.a(bcaa2, 2);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
