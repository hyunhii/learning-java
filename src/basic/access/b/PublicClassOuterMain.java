package basic.access.b;

import basic.access.a.PublicClass;
//import basic.access.a.DefaultClass1;
//import basic.access.a.DefaultClass2;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
