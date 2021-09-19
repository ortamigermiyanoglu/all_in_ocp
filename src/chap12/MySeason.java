package chap12;

public enum MySeason {
    WINTER("Low"){
        public String getHours(){
            return "10am-3pm";
        }
    }, SUMMER("High"){
        public String getHours(){
            return "9am-7pm";
        }
    }, FALL("Medium") {
        public String getHours() {
            return "9am-5pm";
        }
    },

    SPRING("Medium")
        {
        public String getHours(){
            return "9am-5pm";
        }
    };

    private final String expectedVisitors;

    private MySeason(String expectedVisitors) {
        System.out.println("constructing" + expectedVisitors);
        this.expectedVisitors = expectedVisitors;
    }
    public String getExpectedVisitors(){
        return this.expectedVisitors;
    }
    public abstract String getHours();

}
