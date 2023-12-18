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

public class FieldMappingService extends BaseService implements FieldMappingClient {

  public FieldMappingService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Retrieve field mapping entities
   */
  public String getFieldMappingsEntities() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("field-mapping")
      .addPathParameter("entities")
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
   * @summary Retrieve field mappings
   */
  public String getFieldMappings() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("field-mapping")
      .addPathParameter("attribute")
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
   * @summary Retrieve field mappings values
   */
  public String getFieldMappingValues() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("field-mapping")
      .addPathParameter("value")
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
   * @summary Define target Field
   */
  public String defineTargetField(dev.panora.models.DefineTargetFieldDto input)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("field-mapping")
      .addPathParameter("define")
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
   * @summary Map Custom Field
   */
  public String mapField(dev.panora.models.MapFieldToProviderDto input) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("field-mapping")
      .addPathParameter("map")
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
   * @summary Retrieve Custom Properties
   * @param {String} linkedUserId - Needed input variable
   * @param {String} providerId - Needed input variable
   */
  public String getCustomProviderProperties(String linkedUserId, String providerId)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("field-mapping")
      .addPathParameter("properties")
      .addRequiredQueryParameter("linkedUserId", linkedUserId)
      .addRequiredQueryParameter("providerId", providerId)
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
