package defpackage;

/* renamed from: atgb */
public final class atgb extends anxl implements anzf {
    public static final atgb f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public int c;
    public String d;
    public String e;
    private byte g = (byte) 2;

    private atgb() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001Љ\u0000\u0002\f\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", atfx.a(), "d", "e"});
            case 3:
                return new atgb();
            case 4:
                return new atge();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atgb.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atgb atgb = new atgb();
        f = atgb;
        anxl.registerDefaultInstance(atgb.class, atgb);
    }
}
