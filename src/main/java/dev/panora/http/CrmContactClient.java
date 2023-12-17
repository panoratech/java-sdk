package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface CrmContactClient {
  dev.panora.models.GetContactsResponse getContacts(
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
  dev.panora.models.AddContactResponse addContact(
    dev.panora.models.UnifiedContactInput input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
  String updateContact(String id) throws ApiException;
  dev.panora.models.GetContactResponse getContact(String id, Boolean remoteData)
    throws ApiException;
  dev.panora.models.AddContactsResponse addContacts(
    java.util.List<dev.panora.models.UnifiedContactInput> input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
}
