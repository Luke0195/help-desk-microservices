package br.com.helpdesk.userserviceapi.mapper;

import br.com.helpdesk.userserviceapi.entity.User;
import models.responses.UserResponse;
import org.mapstruct.Mapper;


import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {



   @Mapping(target = "updatedAt", source = "updatedAt")
   @Mapping(target = "createdAt", source = "createdAt")
   @Mapping(target = "profiles", source = "profileEnum")
   UserResponse parseEntityToUserMapper(User user);
}
