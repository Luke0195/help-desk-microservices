package br.com.helpdesk.userserviceapi.controller;


import br.com.helpdesk.userserviceapi.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import models.exceptions.StandardError;
import models.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/users")
@Tag(name="UserController", description = "Controller responsible for user operations")
public interface UserController {

    @Operation(summary = "Responsable to find user by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found", content = @Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = User.class))),
            @ApiResponse(
             responseCode = "404",
             description = "User not found",
             content = @Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = StandardError.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping(value = "/{id}")
    ResponseEntity<UserResponse> findUserById(
            @Parameter(description = "User id", required = true, example ="669d11add324d81f0d3b8c92")
            @PathVariable final String id);
}
