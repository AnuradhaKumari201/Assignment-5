import java.util.List;

@FunctionalInterface
public interface GetDistinctStrings {
    List<String> distinctStrings(List<String> l) throws NullPointerException;

}
