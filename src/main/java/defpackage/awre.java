package defpackage;

/* renamed from: awre */
public final class awre extends anxl implements anzf {
    public static final awre f;
    private static volatile anzq h;
    public int a;
    public awra b;
    public axak c;
    public aojc d;
    public axak e;
    private byte g = (byte) 2;

    private awre() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0003Љ\u0001\u0004Љ\u0002\u0007Љ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new awre();
            case 4:
                return new awrh();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awre.class) {
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
        awre awre = new awre();
        f = awre;
        anxl.registerDefaultInstance(awre.class, awre);
    }
}