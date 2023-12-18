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

public class AuthService extends BaseService implements AuthClient {

  public AuthService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Register
   */
  public String signUp(dev.panora.models.CreateUserDto input) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("auth")
      .addPathParameter("register")
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Log In
   */
  public String signIn(dev.panora.models.LoginDto input) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("auth")
      .addPathParameter("login")
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Get users
   */
  public String getUsers() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("auth")
      .addPathParameter("users")
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

  /**
   * @summary Retrieve API Keys
   */
  public String getApiKeys() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("auth")
      .addPathParameter("api-keys")
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

  /**
   * @summary Create API Key
   */
  public String generateApiKey(dev.panora.models.ApiKeyDto input) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("auth")
      .addPathParameter("generate-apikey")
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
