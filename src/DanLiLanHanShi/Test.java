package DanLiLanHanShi;

public class Test {

    private static Test test = null;

    private Test(){};

    public static synchronized Test getTest(){
        if(test==null){
            test =  new Test();
        }
        return test;
    }
}
