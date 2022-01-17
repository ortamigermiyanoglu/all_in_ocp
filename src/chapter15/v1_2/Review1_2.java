package chapter15.v1_2;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Review1_2 {



    /*      CONVENIENCE METHODS
    * Predicate and(Predicate other){   return (t) -> test(t) && other.test(t);    }
    * Predicate negate(){   return (t) -> !test(t);     }
    * Predicate or(Predicate other){    return (t) -> test(t) || other.test(t);     }
    * Function compose(Function before){            return (V v) -> apply(before.apply(v));     }
    * Function andThen(Function after){     return (T t) -> after.apply(apply(t));      }
    * Consumer andThen(Consumer after){     return (T t) -> { accept(t); after.accept(t); };        }
    * */


    /*      OPTIONAL INSTANCE METHODS
    * T get() throws NoSuchElementException {   return value;   }
    * ifPresent(Consumer action){    action.accept(value)    }
    * isPresent() {     return value != null;       }
    * orElse(T other){      return value != null ? value : other;   }
    * orElseGet(Supplier supplier){  return value != null ? value : supplier.get();  }
    * orElseThrow() throw new NoSuchElementException("No value present");
    * orElseThrow(Supplier supplier) {
     if (value != null) {
            return value;
        } else {
            throw exceptionSupplier.get();
        }
    }
    *
    *
    * */

    public static void main(String[] args) {

    }
}
