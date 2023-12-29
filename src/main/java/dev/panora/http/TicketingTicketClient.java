package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface TicketingTicketClient {
  String getTickets(String integrationId, String linkedUserId, Boolean remoteData)
    throws ApiException;
  String addTicket(
    dev.panora.models.UnifiedTicketInput input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
  String updateTicket(String id) throws ApiException;
  String getTicket(String id, Boolean remoteData) throws ApiException;
  String addTickets(
    java.util.List<dev.panora.models.UnifiedTicketInput> input,
    String integrationId,
    String linkedUserId,
    Boolean remoteData
  ) throws ApiException;
}
