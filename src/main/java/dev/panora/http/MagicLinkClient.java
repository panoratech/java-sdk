package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface MagicLinkClient {
  String createMagicLink(dev.panora.models.CreateMagicLinkDto input) throws ApiException;
  String getMagicLinks() throws ApiException;
  String getMagicLink(String id) throws ApiException;
}
