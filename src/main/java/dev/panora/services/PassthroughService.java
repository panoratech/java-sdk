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

public class PassthroughService extends BaseService implements PassthroughClient {

  public PassthroughService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  public dev.panora.models.PassThroughResponse passthroughRequest(
    dev.panora.models.PassThroughRequestDto input,
    String integrationId,
    String linkedUserId
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("passthrough")
      .addRequiredQueryParameter("integrationId", integrationId)
      .addRequiredQueryParameter("linkedUserId", linkedUserId)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(input)),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    return ModelConverter.convert(
      response,
      new com.fasterxml.jackson.core.type.TypeReference<dev.panora.models.PassThroughResponse>() {}
    );
  }
}
