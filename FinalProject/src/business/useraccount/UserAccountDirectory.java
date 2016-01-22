/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccounts;

    public UserAccountDirectory() {
        this.userAccounts = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public UserAccount createUserAccount() {
        UserAccount userAccount = new UserAccount();
        userAccounts.add(userAccount);
        return userAccount;
    }

    public void deleteUserAccount(UserAccount userAccount) {
        userAccounts.remove(userAccount);
    }

    public UserAccount authenticateUser(String userName, String password) {

        for (UserAccount account : userAccounts) {

            if (account.getUserName().equalsIgnoreCase(userName) && account.getPassword().equals(password)) {
                return account;
            }
        }
        return null;
    }

    public boolean isUserNameExist(String userName) {

        for (UserAccount account : userAccounts) {

            if (account.getUserName().equalsIgnoreCase(userName)) {
                return true;
            }
        }

        return false;
    }

}
