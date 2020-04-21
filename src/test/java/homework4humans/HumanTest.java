package homework4humans;

import org.junit.Test;

public class HumanTest {
    @Test
    public void testMan() {
        Man man = new Man(1.8, 92);

        System.out.println(man);
        System.out.println("Ideal weight: " + man.idealWeight());
        System.out.println(man.weightEstimation());
    }

    @Test
    public void testWoman() {
        Woman woman = new Woman(1.64, 64.300);

        System.out.println(woman);
        System.out.println("Ideal weight: " + woman.idealWeight());
        System.out.println(woman.weightEstimation());
    }

    @Test
    public void testBoy() {
        Boy boy = new Boy(1.5, 50);

        System.out.println(boy);
        System.out.println("Ideal weight: " + boy.idealWeight());
        System.out.println(boy.weightEstimation());
    }

    @Test
    public void testGirl() {
        Girl girl = new Girl(1.1, 20, 7);

        System.out.println(girl);
        System.out.println("Ideal weight: " + girl.idealWeight());
        System.out.println(girl.weightEstimation());
    }
}
