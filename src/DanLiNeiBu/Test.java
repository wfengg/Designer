package DanLiNeiBu;

public class Test {

    private Test(){}

    private static class TestHolder{

        private static Test test = new Test();
    }

    public static Test getTest(){
        return TestHolder.test;
    }
}
