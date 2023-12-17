package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface PassthroughClient {
  dev.panora.models.PassThroughResponse passthroughRequest(
    dev.panora.models.PassThroughRequestDto input,
    String integrationId,
    String linkedUserId
  ) throws ApiException;
}
