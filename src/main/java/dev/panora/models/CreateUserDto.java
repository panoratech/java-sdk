package dev.panora.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateUserDto.Builder.class)
public class CreateUserDto extends dev.panora.models.BaseModel {

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
        new java.lang.String[] { "email", "firstName", "lastName", "passwordHash" },
      };

      REQUIRED_FIELDS_GROUPS =
        java.util.Arrays
          .stream(requiredFieldsGroups)
          .map(group -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
          .collect(java.util.stream.Collectors.toSet());
    }

    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private java.lang.String email;

    @com.fasterxml.jackson.annotation.JsonProperty("first_name")
    private java.lang.String firstName;

    @com.fasterxml.jackson.annotation.JsonProperty("last_name")
    private java.lang.String lastName;

    @com.fasterxml.jackson.annotation.JsonProperty("password_hash")
    private java.lang.String passwordHash;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public CreateUserDto build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new dev.panora.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public CreateUserDto buildWithoutValidation() {
      return new CreateUserDto(this);
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

  @com.fasterxml.jackson.annotation.JsonProperty("email")
  private final java.lang.String email;

  @com.fasterxml.jackson.annotation.JsonProperty("first_name")
  private final java.lang.String firstName;

  @com.fasterxml.jackson.annotation.JsonProperty("last_name")
  private final java.lang.String lastName;

  @com.fasterxml.jackson.annotation.JsonProperty("password_hash")
  private final java.lang.String passwordHash;

  CreateUserDto(Builder builder) {
    super(builder);
    this.email = builder.getEmail();
    this.firstName = builder.getFirstName();
    this.lastName = builder.getLastName();
    this.passwordHash = builder.getPasswordHash();
  }
}
