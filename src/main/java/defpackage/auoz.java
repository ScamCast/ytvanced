package defpackage;

/* renamed from: auoz */
public final class auoz extends anxl implements anzf {
    public static final auoz h;
    private static volatile anzq j;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public aphj f;
    public arml g;
    private byte i = (byte) 2;

    private auoz() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001?\u0000\u0004Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\t>\u0000", new Object[]{"c", "b", "a", awnx.a(), "d", "e", "f", "g"});
            case 3:
                return new auoz();
            case 4:
                return new aupc();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (auoz.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auoz auoz = new auoz();
        h = auoz;
        anxl.registerDefaultInstance(auoz.class, auoz);
    }
}
