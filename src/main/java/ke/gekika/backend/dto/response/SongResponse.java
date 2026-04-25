package ke.gekika.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongResponse {

    private Long id;
    private String title;
    private String artist;
    private String songUrl;
    private String imageUrl;
    private LocalDateTime creatededAt;
    private Long appUserId;
    private String appUserName;
}
