package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface WebhookClient {
  String getWebhooksMetadata() throws ApiException;
  String createWebhookMetadata(dev.panora.models.WebhookDto input) throws ApiException;
  String updateWebhookStatus(String id) throws ApiException;
}
