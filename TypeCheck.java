/*
 *  A simple static class used to validate given values and desired types
 */
import javax.swing.JOptionPane;

/**
 * @author Chris_000
 * @version 1.0
 */

public class TypeCheck {
    // Validates whether the type given can be assigned from the desired type
    public static boolean checkType(Object givenType, Class<?> validType) {
        return givenType.getClass().isAssignableFrom(validType);
    }
    
    // Validates whether a number of given values can be assigned from the desired type
    public static boolean checkType(Object[] givenType, Class<?> validType){
        for (int i = 0; i < givenType.length; ++i){
            if (!checkType(givenType[i], validType))
                return false;
        }
        return true;
    }
    
    // Uses the checkType method to display Message dialog prompting error
    public static boolean displayCheckType(Object givenType, Class<?> validType){
        if (!checkType(givenType, validType)) {
            JOptionPane.showMessageDialog(null, "Please enter valid value");
            return false;
        }
        return true;
    }
}
