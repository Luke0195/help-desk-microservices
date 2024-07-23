package models.enums;

import java.util.Arrays;

public enum ProfileEnum {
  ROLE_ADMIN("ROLE_ADMIN"),
  ROLE_CUSTOMER("ROLE_CUSTOMER"),
  ROLE_TECHNICIAN("ROLE_TECHNICIAN");
  private final String description;
  ProfileEnum(String description) {
   this.description = description;
  }

  public String getDescription() {
        return description;
    }

  public static models.enums.ProfileEnum toEnum(String description) throws IllegalAccessException {
    return Arrays.stream(models.enums.ProfileEnum.values())
           .filter(profileEnum -> profileEnum.getDescription()
           .equals(description)).findFirst()
           .orElseThrow(() -> new IllegalAccessException("Invalid description: " + description));
    }


}
