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

public class TicketingCommentService extends BaseService implements TicketingCommentClient {

  public TicketingCommentService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary List a batch of Comments
   * @param {String} integrationId - Needed input variable
   * @param {String} linkedUserId - Needed input variable
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String getComments(String integrationId, String linkedUserId, Boolean remoteData)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("comment")
      .addOptionalQueryParameter("remoteData", remoteData)
      .build();
    Headers headers = HttpHeaders
      .builder()
      .addRequiredHeader("integrationId", integrationId)
      .addRequiredHeader("linkedUserId", linkedUserId)
      .build();
    Request request = new Request.Builder().url(url).headers(headers).get().build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Create a Comment
   * @param {String} integrationId - The integration ID
   * @param {String} linkedUserId - The linked user ID
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String addComment(
    dev.panora.models.UnifiedCommentInput input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("comment")
      .addOptionalQueryParameter("remoteData", remoteData)
      .build();
    Headers headers = HttpHeaders
      .builder()
      .addRequiredHeader("integrationId", integrationId)
      .addRequiredHeader("linkedUserId", linkedUserId)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).headers(headers).post(requestBody).build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Update a Comment
   * @param {String} id - Needed input variable
   */
  public String updateComment(String id) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("comment")
      .addRequiredQueryParameter("id", id)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).patch(requestBody).build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Retrieve a Comment
   * @param {String} id - id of the `ticket` you want to retrive.
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String getComment(String id, Boolean remoteData) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("comment")
      .addPathParameter(String.valueOf(id))
      .addOptionalQueryParameter("remoteData", remoteData)
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
   * @summary Add a batch of Comments
   * @param {String} integrationId - Needed input variable
   * @param {String} linkedUserId - Needed input variable
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String addComments(
    java.util.List<dev.panora.models.UnifiedCommentInput> input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("comment")
      .addPathParameter("batch")
      .addOptionalQueryParameter("remoteData", remoteData)
      .build();
    Headers headers = HttpHeaders
      .builder()
      .addRequiredHeader("integrationId", integrationId)
      .addRequiredHeader("linkedUserId", linkedUserId)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).headers(headers).post(requestBody).build();
    Response response = this.execute(request);

    try {
      return response.body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
