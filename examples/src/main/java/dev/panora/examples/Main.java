package dev.panora.examples;

import dev.panora.PanoraSDK;
import dev.panora.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    PanoraSDK client = new PanoraSDK(System.getenv("PANORASDK_BEARER_TOKEN"));
    try {
      Object response = client.mainService.appControllerGetHello();
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
