package basic.final1;

public class FieldInit {

    static final int CONST_VALUE = 10;
    final int value = 20;

    // 컴파일 오류
    /*public FieldInit(int value) {
        this.value = value;
    }*/
}
