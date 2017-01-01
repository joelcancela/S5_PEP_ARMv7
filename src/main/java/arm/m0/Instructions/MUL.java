package arm.m0.Instructions;

/**
 * Created by nikita on 01/01/2017.
 */
// A7-324 3args
public class MUL {

    String rn;
    String rdm;

    public MUL(String[] args){

        //args[1] 3 bits
        rn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

        //args[0] 3 bits
        rdm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
    }

    @Override
    public String toString() {
        return "0100001101"+rn+rdm;
    }

}
