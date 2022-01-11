package chapter14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class HandleNullWhenComparing implements Comparable<HandleNullWhenComparing> {
    private Integer age;
    private String name;


    public HandleNullWhenComparing(){}

    public HandleNullWhenComparing(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    class Product implements Comparable<Product>{
        private Integer id;
        private String name;

        public Product(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false; //o instanceof Product control
            Product product = (Product) o;
            return Objects.equals(id, product.id) && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }


        @Override
        public int compareTo(Product o) {
            return name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        HandleNullWhenComparing mainObj1 = new HandleNullWhenComparing();
        HandleNullWhenComparing mainObj2 = new HandleNullWhenComparing();

        HandleNullWhenComparing.Product product1 = mainObj1.new Product(11,"Ali Reeza");
        HandleNullWhenComparing.Product product2 = mainObj2.new Product(31,"Ali Reeza");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        System.out.println(product1.equals(product2));


        Comparator<Product> productComparator = Comparator.comparing(HandleNullWhenComparing.Product::getName)
                .thenComparingInt(HandleNullWhenComparing.Product::getId);

        productList.sort(productComparator);
        System.out.println(productList);


        Comparator<Product> productComparatorReverseSweep = productComparator.reversed();


        productList.sort(productComparatorReverseSweep);

        System.out.println(productList);

    }

    @Override
    public int compareTo(HandleNullWhenComparing o) {
        if (age==null && o.age==null) return 0;
        else if (age==null) return -1;
        else if (o.age==null) return 1;
        return age.compareTo(o.age);
    }
}
