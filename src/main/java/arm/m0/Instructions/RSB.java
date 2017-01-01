package arm.m0.Instructions;

/**
 * Created by nikita on 01/01/2017.
 */
// A7-372 2args
public class RSB {

    String rd;
    String rn;

    public RSB(String[] args){

        //args[1] 3 bits
        rn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

        //args[0] 3 bits
        rd = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
    }

    @Override
    public String toString() {
        return "0100001001"+rn+rd;
    }

}
