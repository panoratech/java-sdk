package dev.panora.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
  builder = MapFieldToProviderDto.Builder.class
)
public class MapFieldToProviderDto extends dev.panora.models.BaseModel {

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
        new java.lang.String[] {
          "attributeId",
          "linkedUserId",
          "sourceCustomFieldId",
          "sourceProvider",
        },
      };

      REQUIRED_FIELDS_GROUPS =
        java.util.Arrays
          .stream(requiredFieldsGroups)
          .map(group -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
          .collect(java.util.stream.Collectors.toSet());
    }

    @com.fasterxml.jackson.annotation.JsonProperty("attributeId")
    private java.lang.String attributeId;

    @com.fasterxml.jackson.annotation.JsonProperty("linked_user_id")
    private java.lang.String linkedUserId;

    @com.fasterxml.jackson.annotation.JsonProperty("source_custom_field_id")
    private java.lang.String sourceCustomFieldId;

    @com.fasterxml.jackson.annotation.JsonProperty("source_provider")
    private java.lang.String sourceProvider;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public MapFieldToProviderDto build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new dev.panora.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public MapFieldToProviderDto buildWithoutValidation() {
      return new MapFieldToProviderDto(this);
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

  @com.fasterxml.jackson.annotation.JsonProperty("attributeId")
  private final java.lang.String attributeId;

  @com.fasterxml.jackson.annotation.JsonProperty("linked_user_id")
  private final java.lang.String linkedUserId;

  @com.fasterxml.jackson.annotation.JsonProperty("source_custom_field_id")
  private final java.lang.String sourceCustomFieldId;

  @com.fasterxml.jackson.annotation.JsonProperty("source_provider")
  private final java.lang.String sourceProvider;

  MapFieldToProviderDto(Builder builder) {
    super(builder);
    this.attributeId = builder.getAttributeId();
    this.linkedUserId = builder.getLinkedUserId();
    this.sourceCustomFieldId = builder.getSourceCustomFieldId();
    this.sourceProvider = builder.getSourceProvider();
  }
}
