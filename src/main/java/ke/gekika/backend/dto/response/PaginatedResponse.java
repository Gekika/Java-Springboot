package ke.gekika.backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedResponse<T> {

    private List<T> content;
    private int page;
    private int size;
    private int totalElements;
    private int totalPages;
    private boolean last;
    private boolean first;
}
