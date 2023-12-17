package dev.panora.services;

import dev.panora.exceptions.ApiException;
import dev.panora.http.*;
import dev.panora.http.util.HttpHeaders;
import dev.panora.http.util.HttpUrl;
import dev.panora.models.BaseModel;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ConnectionsService extends BaseService implements ConnectionsClient {

  public ConnectionsService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  public String handleOauthCallback(String state, String code, String location)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("connections")
      .addPathParameter("oauth")
      .addPathParameter("callback")
      .addRequiredQueryParameter("state", state)
      .addRequiredQueryParameter("code", code)
      .addRequiredQueryParameter("location", location)
      .build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public String getConnections() throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("connections").build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
