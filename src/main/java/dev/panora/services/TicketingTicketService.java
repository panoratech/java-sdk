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

public class TicketingTicketService extends BaseService implements TicketingTicketClient {

  public TicketingTicketService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary List a batch of Tickets
   * @param {String} integrationId - Needed input variable
   * @param {String} linkedUserId - Needed input variable
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String getTickets(String integrationId, String linkedUserId, Boolean remoteData)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("ticket")
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
   * @summary Create a Ticket
   * @param {String} integrationId - The integration ID
   * @param {String} linkedUserId - The linked user ID
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String addTicket(
    dev.panora.models.UnifiedTicketInput input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("ticket")
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
   * @summary Update a Ticket
   * @param {String} id - Needed input variable
   */
  public String updateTicket(String id) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("ticket")
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
   * @summary Retrieve a Ticket
   * @param {String} id - id of the `ticket` you want to retrive.
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String getTicket(String id, Boolean remoteData) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("ticket")
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
   * @summary Add a batch of Tickets
   * @param {String} integrationId - Needed input variable
   * @param {String} linkedUserId - Needed input variable
   * @param {Boolean} [remoteData] - Set to true to include data from the original Ticketing software.
   */
  public String addTickets(
    java.util.List<dev.panora.models.UnifiedTicketInput> input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("ticketing")
      .addPathParameter("ticket")
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
