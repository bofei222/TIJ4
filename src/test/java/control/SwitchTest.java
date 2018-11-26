package test.java.control;


import static net.mindview.util.Print.print;

/**
 * @author bofei
 * @date 2018/8/30 13:57
 */
public class SwitchTest {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            switch(i) {
                case 0: print("zero"); break;
                case 1: print("isa"); break;
                case 2: print("dalawa"); break;
                case 3: print("tatlo"); break;
                case 4: print("apat"); break;
                case 5: print("lima"); break;
                case 6: print("anim"); break;
                case 7: print("pito"); break;
                case 8: print("walo"); break;
                case 9: print("siyam"); break;
                default: print("default");
            }
        }
    }
}
