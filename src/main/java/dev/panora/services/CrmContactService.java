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

public class CrmContactService extends BaseService implements CrmContactClient {

  public CrmContactService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  public dev.panora.models.GetContactsResponse getContacts(
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("crm")
      .addPathParameter("contact")
      .addRequiredQueryParameter("integrationId", integrationId)
      .addRequiredQueryParameter("linkedUserId", linkedUserId)
      .addOptionalQueryParameter("remote_data", remoteData)
      .build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<dev.panora.models.GetContactsResponse>() {}
    );
  }

  /**
   * @summary Create CRM Contact
   * @param {String} integrationId - Needed input variable
   * @param {String} linkedUserId - Needed input variable
   * @param {Boolean} [remoteData] - Needed input variable
   */
  public dev.panora.models.AddContactResponse addContact(
    dev.panora.models.UnifiedContactInput input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("crm")
      .addPathParameter("contact")
      .addRequiredQueryParameter("integrationId", integrationId)
      .addRequiredQueryParameter("linkedUserId", linkedUserId)
      .addOptionalQueryParameter("remote_data", remoteData)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<dev.panora.models.AddContactResponse>() {}
    );
  }

  public String updateContact(String id) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("crm")
      .addPathParameter("contact")
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
   * @summary Retrive a CRM Contact
   * @param {String} id - Needed input variable
   * @param {Boolean} [remoteData] - Needed input variable
   */
  public dev.panora.models.GetContactResponse getContact(String id, Boolean remoteData)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("crm")
      .addPathParameter("contact")
      .addPathParameter(String.valueOf(id))
      .addOptionalQueryParameter("remote_data", remoteData)
      .build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<dev.panora.models.GetContactResponse>() {}
    );
  }

  public dev.panora.models.AddContactsResponse addContacts(
    java.util.List<dev.panora.models.UnifiedContactInput> input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("crm")
      .addPathParameter("contact")
      .addPathParameter("batch")
      .addRequiredQueryParameter("integrationId", integrationId)
      .addRequiredQueryParameter("linkedUserId", linkedUserId)
      .addOptionalQueryParameter("remote_data", remoteData)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<dev.panora.models.AddContactsResponse>() {}
    );
  }
}
