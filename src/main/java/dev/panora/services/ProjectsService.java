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

public class ProjectsService extends BaseService implements ProjectsClient {

  public ProjectsService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Retrieve projects
   */
  public String getProjects() throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("projects").build();
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
   * @summary Create a project
   */
  public String createProject(dev.panora.models.CreateProjectDto input) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("projects")
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
}
