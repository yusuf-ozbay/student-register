package org.yusuf.student_register.request;

import jakarta.annotation.Nullable;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupRequest {
    private String name;
    private UUID studentId;
    @Nullable
    private List<UUID> studentIds;
}
