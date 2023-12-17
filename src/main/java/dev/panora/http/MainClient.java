package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface MainClient {
  String appControllerGetHello() throws ApiException;
}
