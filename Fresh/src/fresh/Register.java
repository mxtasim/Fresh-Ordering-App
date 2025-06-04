// Login Class Inheritance
package fresh;


public class Register extends Login {
    
    private String Phone;
    
    public Register(String Phone, String Username, String Password) {
        super(Username, Password);
        this.Phone = Phone;  
    }
    
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
}
