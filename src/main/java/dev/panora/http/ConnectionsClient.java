package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface ConnectionsClient {
  String handleOAuthCallback(String state, String code, String location) throws ApiException;
  String getConnections() throws ApiException;
}
