package defpackage;

import com.google.android.libraries.stitch.sslguard.SslGuardContextImpl;
import java.security.Provider;

/* renamed from: uhr */
public final class uhr extends Provider {
    public uhr() {
        super("Ssl_Guard", 1.01d, "Makes SSL Connections wait for security patches.");
        String name = SslGuardContextImpl.class.getName();
        put("SSLContext.SSL", name);
        put("SSLContext.SSLv3", name);
        put("SSLContext.TLS", name);
        put("SSLContext.TLSv1", name);
        put("SSLContext.TLSv1.1", name);
        put("SSLContext.TLSv1.2", name);
        put("SSLContext.Default", name);
    }
}
