package dev.panora.http;

import dev.panora.exceptions.ApiException;
import java.util.List;

public interface OrganisationsClient {
  String getOrganisations() throws ApiException;
  String createOrganisation(dev.panora.models.CreateOrganizationDto input) throws ApiException;
}
