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

public class LinkedUsersService extends BaseService implements LinkedUsersClient {

  public LinkedUsersService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Add Linked User
   */
  public String addLinkedUser(dev.panora.models.CreateLinkedUserDto input) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("linked-users")
      .addPathParameter("create")
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
   * @summary Retrieve Linked Users
   */
  public String getLinkedUsers() throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("linked-users").build();
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
   * @summary Retrieve a Linked User
   * @param {String} id - Needed input variable
   */
  public String getLinkedUser(String id) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("linked-users")
      .addPathParameter("single")
      .addRequiredQueryParameter("id", id)
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
}
