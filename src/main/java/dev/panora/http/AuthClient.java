package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface AuthClient {
  String signUp(dev.panora.models.CreateUserDto input) throws ApiException;
  String signIn(dev.panora.models.LoginDto input) throws ApiException;
  String getUsers() throws ApiException;
  String getApiKeys() throws ApiException;
  String generateApiKey(dev.panora.models.ApiKeyDto input) throws ApiException;
}
