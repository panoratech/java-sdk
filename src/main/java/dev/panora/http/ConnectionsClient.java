package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface ConnectionsClient {
  String handleOauthCallback(String state, String code, String location) throws ApiException;
  String getConnections() throws ApiException;
}
