package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface FieldMappingClient {
  String getFieldMappingsEntities() throws ApiException;
  String getFieldMappings() throws ApiException;
  String getFieldMappingValues() throws ApiException;
  String defineTargetField(dev.panora.models.DefineTargetFieldDto input) throws ApiException;
  String mapField(dev.panora.models.MapFieldToProviderDto input) throws ApiException;
  String getCustomProviderProperties(String linkedUserId, String providerId) throws ApiException;
}
