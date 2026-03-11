
package za.ac.tut.model;

public class AccessChecker {
    
    public String checkAccess(boolean mask, boolean sanitize, double temp) {
    String message = "";
    
    if (mask == true && sanitize == true && temp < 38) {
        message = "Access granted";
    } else {
         message = "Access denied:";
        if (!mask) {
            message = message + " No mask.";
        }
        if (!sanitize) {
            message = message + " No hand sanitizer.";
        }
        if (temp >= 38) {
            message = message + " Temperature too high (" + temp + "°C).";
        }
        
       
    }
    
    return message;
}

}
