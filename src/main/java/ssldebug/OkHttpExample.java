package ssldebug;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpExample{
	OkHttpClient client = new OkHttpClient();

	String run(String url) throws IOException {
		Request request = new Request.Builder().url(url).build();
		try (Response resp = client.newCall(request).execute()){
			return resp.body().string();
		}
	}
}