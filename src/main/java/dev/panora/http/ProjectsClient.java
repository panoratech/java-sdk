package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface ProjectsClient {
  String getProjects() throws ApiException;
  String createProject(dev.panora.models.CreateProjectDto input) throws ApiException;
}
