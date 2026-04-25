package ke.gekika.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongAiInsightsResponse {

    private String analysis;
    private List<String> moods;
    private String genre;
    private Integer tempo;
    private String key;
    private Integer energy;
    private List<String> similarArtists;
    private String recommendedFor;
}
