package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface CrmContactClient {
  String getContacts(String integrationId, String linkedUserId, Boolean remoteData)
    throws ApiException;
  String addContact(
    dev.panora.models.UnifiedContactInput input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
  String updateContact(String id) throws ApiException;
  String getContact(String id, Boolean remoteData) throws ApiException;
  String addContacts(
    java.util.List<dev.panora.models.UnifiedContactInput> input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
}
