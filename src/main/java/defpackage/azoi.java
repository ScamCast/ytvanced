package defpackage;

/* renamed from: azoi */
public final class azoi extends anxl implements anzf {
    public static final azoi g;
    private static volatile anzq i;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private azoi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006\n\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new azoi();
            case 4:
                return new azol();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azoi.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return g.getParserForType();
    }

    static {
        azoi azoi = new azoi();
        g = azoi;
        anxl.registerDefaultInstance(azoi.class, azoi);
    }
}
