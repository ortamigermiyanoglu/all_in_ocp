package chap13;

@TargetlessAnnotation
public class TargetlessAnnotationUsage {

    @TargetlessAnnotation
    private TargetlessAnnotationUsage(){
        /*
        String abc = new @TargetlessAnnotation String();
         */
        /*
        int aws = (@TargetlessAnnotation int) 11.0;
         */
    }

}
