package defpackage;

/* renamed from: avgk */
public final class avgk extends anxl implements anzf {
    public static final avgk f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public axak d;
    public apxu e;
    private byte g = (byte) 2;

    private avgk() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new avgk();
            case 4:
                return new avgj();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avgk.class) {
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
        avgk avgk = new avgk();
        f = avgk;
        anxl.registerDefaultInstance(avgk.class, avgk);
    }
}
