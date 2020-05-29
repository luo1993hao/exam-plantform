package exam.blankquizcontext.domain.shared;

public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
