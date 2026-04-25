package ke.gekika.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistWithSongsResponse {

    private Long id;
    private String name;
    private String description;
    private Boolean isPublic;
    private String imageUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long appUserId;
    private String appUserName;
    private Integer songCount;
    private List<SongInPlaylistResponse> songs;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SongInPlaylistResponse {
        private Long songId;
        private String title;
        private String artist;
        private String songUrl;
        private String imageUrl;
        private Integer position;
        private LocalDateTime addededAt;

    }
}
