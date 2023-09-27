package at.fhtw.be_webeng_23ws.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Order {
    private UUID id = UUID.randomUUID();
    @NotBlank
    @Pattern(regexp = "^\\w+$")
    private String meal;

    @Positive
    private int amount;
}
