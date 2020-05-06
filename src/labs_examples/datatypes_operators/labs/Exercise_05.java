package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

          boolean b1 = true;
          boolean b2 = false;
        
          System.out.println("b1 & b2: " + (b1&&b2));
          System.out.println("b1 && b2: " + (b1&&b2));
          System.out.println("b1 | b2: " + (b1||b2));
          System.out.println("b1 || b2: " + (b1||b2));
          System.out.println("b1 ^ b2: " + (b1||b2));
          System.out.println("!(b1 && b2): " + !(b1&&b2));

    }

}

