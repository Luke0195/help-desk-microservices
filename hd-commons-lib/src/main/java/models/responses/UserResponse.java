package models.responses;

import models.enums.ProfileEnum;

import java.io.Serializable;
import java.util.Set;

public record UserResponse(String id, String name, String email, String password, Set<ProfileEnum> profiles, String createdAt, String updatedAt) implements Serializable {
}
