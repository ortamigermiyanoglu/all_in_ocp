package chap12.reviewquestions;

public class Bear {
    enum FOOD {
        FERRIES, INSECTS{
            public boolean isHealthy(){return true;}
        },
        COOKIES, HONEY{
            public boolean isHealthy() {
                return false;
            }
        };

        /* if we add abstract method  ferries and  cookies gives compile error
        public abstract boolean isHealthy();
         */
    }

    enum Season{
        WINTER {
            public String getHours(){return "10am-3pm";};
        },
        SUMMER{
            public String getHours(){return "9am-7pm";};
        },
        SPRING, FALL;
            public String getHours(){return "9am-5pm";};
    }

    public static void main(String[] args) {
        FOOD food = FOOD.COOKIES;

        var s = 3>5? "s":"k";

        /* gives compile error since cookies doesn't have isHealthy method
        System.out.println(food.isHealthy());
         */
    }



}
