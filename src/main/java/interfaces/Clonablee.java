package interfaces;

public interface Clonablee<T>
        extends Comparablee<T> {
    default String bananas(){
        return "i've gone BANANAS";
    }
}
