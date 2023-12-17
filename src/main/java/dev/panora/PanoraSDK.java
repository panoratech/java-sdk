package dev.panora;

import dev.panora.Environment;
import dev.panora.http.interceptors.BearerTokenInterceptor;
import dev.panora.http.interceptors.DefaultHeadersInterceptor;
import dev.panora.http.interceptors.RetryInterceptor;
import dev.panora.services.*;
import java.util.Map;
import okhttp3.OkHttpClient;

public class PanoraSDK {

  public AuthService authService;
  public ConnectionsService connectionsService;
  public CrmContactService crmcontactService;
  public EventsService eventsService;
  public FieldMappingService fieldmappingService;
  public LinkedUsersService linkedusersService;
  public MagicLinkService magiclinkService;
  public MainService mainService;
  public OrganisationsService organisationsService;
  public PassthroughService passthroughService;
  public ProjectsService projectsService;
  public WebhookService webhookService;

  private final BearerTokenInterceptor bearerTokenInterceptor = new BearerTokenInterceptor();

  public PanoraSDK() {
    final String serverUrl = Environment.DEFAULT.getUrl();
    final OkHttpClient httpClient = new OkHttpClient.Builder()
      .addInterceptor(new DefaultHeadersInterceptor())
      .addInterceptor(new RetryInterceptor())
      .addInterceptor(bearerTokenInterceptor)
      .build();

    this.authService = new AuthService(httpClient, serverUrl);
    this.connectionsService = new ConnectionsService(httpClient, serverUrl);
    this.crmcontactService = new CrmContactService(httpClient, serverUrl);
    this.eventsService = new EventsService(httpClient, serverUrl);
    this.fieldmappingService = new FieldMappingService(httpClient, serverUrl);
    this.linkedusersService = new LinkedUsersService(httpClient, serverUrl);
    this.magiclinkService = new MagicLinkService(httpClient, serverUrl);
    this.mainService = new MainService(httpClient, serverUrl);
    this.organisationsService = new OrganisationsService(httpClient, serverUrl);
    this.passthroughService = new PassthroughService(httpClient, serverUrl);
    this.projectsService = new ProjectsService(httpClient, serverUrl);
    this.webhookService = new WebhookService(httpClient, serverUrl);
  }

  public PanoraSDK(String bearerToken) {
    this();
    setBearerToken(bearerToken);
  }

  public void setBaseUrl(String url) {
    this.authService.setBaseUrl(url);
    this.connectionsService.setBaseUrl(url);
    this.crmcontactService.setBaseUrl(url);
    this.eventsService.setBaseUrl(url);
    this.fieldmappingService.setBaseUrl(url);
    this.linkedusersService.setBaseUrl(url);
    this.magiclinkService.setBaseUrl(url);
    this.mainService.setBaseUrl(url);
    this.organisationsService.setBaseUrl(url);
    this.passthroughService.setBaseUrl(url);
    this.projectsService.setBaseUrl(url);
    this.webhookService.setBaseUrl(url);
  }

  public void setBearerToken(String token) {
    this.bearerTokenInterceptor.setBearerToken(token);
  }
}
