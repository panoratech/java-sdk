package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface TicketingCommentClient {
  String getComments(String integrationId, String linkedUserId, Boolean remoteData)
    throws ApiException;
  String addComment(
    dev.panora.models.UnifiedCommentInput input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
  String updateComment(String id) throws ApiException;
  String getComment(String id, Boolean remoteData) throws ApiException;
  String addComments(
    java.util.List<dev.panora.models.UnifiedCommentInput> input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
}
