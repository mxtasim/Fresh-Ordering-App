// main data class 
package fresh;



public class Login {
    
    private String Username;
    private String Password;
    private String Other;
    
    public Login (String Username, String Password) {
        
        this.Username = Username;
        this.Password = Password;  
    }
   
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String getOther() {
        return Other;
    }
    
    public void setOther(String Other) {
        this.Other = Other;
    }

}

    
