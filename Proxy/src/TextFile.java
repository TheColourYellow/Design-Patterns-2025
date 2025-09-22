import java.time.LocalDate;

public interface TextFile {
    String getContent(Integer id, User user) throws AccessException;
    LocalDate getCreatioDate();
}
