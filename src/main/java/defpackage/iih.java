package defpackage;

/* renamed from: iih */
public final class iih {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;

    public iih(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) iih.a(bcaa, 1);
        this.b = (bcaa) iih.a(bcaa2, 2);
        this.c = (bcaa) iih.a(bcaa3, 3);
        this.d = (bcaa) iih.a(bcaa4, 4);
        this.e = (bcaa) iih.a(bcaa5, 5);
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
