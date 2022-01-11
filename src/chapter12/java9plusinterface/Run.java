package chapter12.java9plusinterface;

public interface Run {
    default int getSpeed(){
        return 10;
    }
}
