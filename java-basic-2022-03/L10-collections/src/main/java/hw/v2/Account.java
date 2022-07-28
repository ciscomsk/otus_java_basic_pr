package hw.v2;

import lombok.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Account {
    private Long number;
    private Long amount;
}
