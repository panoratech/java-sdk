package dev.panora;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Environment {
  DEFAULT("https://api-demo.panora.dev");

  private final String url;

  public String getUrl() {
    return this.url;
  }
}
