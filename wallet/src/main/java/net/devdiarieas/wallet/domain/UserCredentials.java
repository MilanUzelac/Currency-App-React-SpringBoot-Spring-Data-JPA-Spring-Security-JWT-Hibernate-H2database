package net.devdiarieas.wallet.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCredentials {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
