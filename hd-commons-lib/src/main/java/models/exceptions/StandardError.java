package models.exceptions;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardError {

    private LocalDateTime timestamp;
    private Integer status;
    private String  error;
    private String message;
    private String path;
}
