package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface LinkedUsersClient {
  String addLinkedUser(dev.panora.models.CreateLinkedUserDto input) throws ApiException;
  String getLinkedUsers() throws ApiException;
  String getLinkedUser(String id) throws ApiException;
}
