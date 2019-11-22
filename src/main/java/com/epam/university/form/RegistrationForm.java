package com.epam.university.form;


import javax.validation.constraints.NotNull;

public class RegistrationForm {
    @NotNull
    private String first_name;
    @NotNull
    private String last_name;
    @NotNull
    private String login;
    @NotNull
    private String password;
    private String password_confirm;

    public RegistrationForm() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_confirm() {
        return password_confirm;
    }

    public void setPassword_confirm(String password_confirm) {
        this.password_confirm = password_confirm;
    }
}
