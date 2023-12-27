package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface ProtectedClient {
  String appControllerGetHello2() throws ApiException;
}
