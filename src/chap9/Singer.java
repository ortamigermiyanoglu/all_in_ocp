package chap9;

public interface Singer extends Song{
     //extends oldugu icin inheritance kurallari gecerli
     // Song getName String, Singer getName CharSequence donduremez
     String getName();

}
