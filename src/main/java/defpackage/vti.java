package defpackage;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vti */
public final class vti extends vsr {
    private vti() {
        super(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "unresolvedPlaceholder";
    }

    public vti(vtg vtg) {
        super(vtg);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new vtg(afns.a(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), afns.a(jSONObject, "contentPlayerAdParams"), afns.a(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), aajj.b, afns.a(jSONObject, "adCpn"), jSONObject.getLong("expirationTimeMillis"), (byte) 0);
        }
        throw new JSONException("Unsupported version");
    }
}
