package exam.blankquizcontext.domain.shared;

public interface Entity<T> {
    boolean sameIdentityAs(T other);
}
