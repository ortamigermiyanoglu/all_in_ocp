package chapter14.genericsrevisited;

public interface Shippable <T>{
    void ship(T t);
    <U> int weight(U u);
}
