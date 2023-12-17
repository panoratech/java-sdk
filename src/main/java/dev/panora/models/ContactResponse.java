package dev.panora.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ContactResponse.Builder.class)
public class ContactResponse extends dev.panora.models.BaseModel {

  @lombok.Getter
  @lombok.EqualsAndHashCode(callSuper = false)
  @lombok.ToString
  @com.fasterxml.jackson.annotation.JsonInclude(
    com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
  )
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContactResponse.RemoteData.Builder.class
  )
  public static class RemoteData extends dev.panora.models.BaseModel {

    @lombok.Getter
    @lombok.Setter
    @lombok.experimental.Accessors(chain = true)
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(
      buildMethodName = "buildWithoutValidation",
      withPrefix = "set"
    )
    public static class Builder extends dev.panora.models.BaseModel.Builder {

      static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

      static {
        java.lang.String[][] requiredFieldsGroups = new java.lang.String[][] {};

        REQUIRED_FIELDS_GROUPS =
          java.util.Arrays
            .stream(requiredFieldsGroups)
            .map(group ->
              java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet())
            )
            .collect(java.util.stream.Collectors.toSet());
      }

      public Builder() {
        super(ValidationType.ALL_OF);
      }

      protected Builder(BaseModel.Builder.ValidationType validationType) {
        super(validationType);
      }

      public ContactResponse.RemoteData build() {
        String validateMsg = validate();

        if (validateMsg != null) {
          throw new dev.panora.exceptions.ApiException(validateMsg);
        }

        return buildWithoutValidation();
      }

      public ContactResponse.RemoteData buildWithoutValidation() {
        return new ContactResponse.RemoteData(this);
      }

      @Override
      protected java.util.Set<String> getNonNullInstanceFieldNames() {
        // Introspect the class to get a list of all declared fields.
        return java.util.Arrays
          .asList(this.getClass().getDeclaredFields())
          .stream()
          .filter(field -> {
            try {
              // Filter fields that are non-static and have values that are not null.
              return (
                !java.lang.reflect.Modifier.isStatic(field.getModifiers()) &&
                field.get(this) != null
              );
            } catch (IllegalArgumentException | IllegalAccessException e) {
              // This should never happen...

              throw new dev.panora.exceptions.ApiException(
                "Unexpected exception thrown while accessing instance fields.",
                e
              );
            }
          })
          .map(java.lang.reflect.Field::getName)
          .collect(java.util.stream.Collectors.toSet());
      }

      @Override
      protected java.util.Set<java.util.Set<String>> getRequiredFieldsGroups() {
        return REQUIRED_FIELDS_GROUPS;
      }
    }

    RemoteData(Builder builder) {
      super(builder);
    }
  }

  @lombok.Getter
  @lombok.Setter
  @lombok.experimental.Accessors(chain = true)
  @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(
    buildMethodName = "buildWithoutValidation",
    withPrefix = "set"
  )
  public static class Builder extends dev.panora.models.BaseModel.Builder {

    static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

    static {
      java.lang.String[][] requiredFieldsGroups = new java.lang.String[][] {
        new java.lang.String[] { "contacts", "remoteData" },
      };

      REQUIRED_FIELDS_GROUPS =
        java.util.Arrays
          .stream(requiredFieldsGroups)
          .map(group -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
          .collect(java.util.stream.Collectors.toSet());
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contacts")
    private java.util.List<java.lang.String> contacts;

    @com.fasterxml.jackson.annotation.JsonProperty("remote_data")
    private ContactResponse.RemoteData remoteData;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public ContactResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new dev.panora.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public ContactResponse buildWithoutValidation() {
      return new ContactResponse(this);
    }

    @Override
    protected java.util.Set<String> getNonNullInstanceFieldNames() {
      // Introspect the class to get a list of all declared fields.
      return java.util.Arrays
        .stream(this.getClass().getDeclaredFields())
        .filter(field -> {
          try {
            // Filter fields that are non-static and have values that are not null.
            return (
              !java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.get(this) != null
            );
          } catch (IllegalArgumentException | IllegalAccessException e) {
            // This should never happen...

            throw new dev.panora.exceptions.ApiException(
              "Unexpected exception thrown while accessing instance fields.",
              e
            );
          }
        })
        .map(java.lang.reflect.Field::getName)
        .collect(java.util.stream.Collectors.toSet());
    }

    @Override
    protected java.util.Set<java.util.Set<String>> getRequiredFieldsGroups() {
      return REQUIRED_FIELDS_GROUPS;
    }
  }

  @com.fasterxml.jackson.annotation.JsonProperty("contacts")
  private final java.util.List<java.lang.String> contacts;

  @com.fasterxml.jackson.annotation.JsonProperty("remote_data")
  private final ContactResponse.RemoteData remoteData;

  ContactResponse(Builder builder) {
    super(builder);
    this.contacts = builder.getContacts();
    this.remoteData = builder.getRemoteData();
  }
}
