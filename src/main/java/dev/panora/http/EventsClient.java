package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface EventsClient {
  String getEvents() throws ApiException;
}
