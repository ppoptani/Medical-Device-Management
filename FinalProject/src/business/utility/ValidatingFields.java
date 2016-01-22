/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.utility;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author pu
 */
public class ValidatingFields {

    public static boolean isStringTextFieldValid(JTextField jTextField) {
        return jTextField.getText().isEmpty() || !(jTextField.getText().matches("^(?=.{2,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._/]+(?<![_.-])$"));
    }

    public static boolean isStringTextFieldValid(JTextArea jTextArea) {
        return jTextArea.getText().isEmpty() || !(jTextArea.getText().matches("^(?=.{2,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._/]+(?<![_.-])$"));
    }

    public static boolean isNumberTextFieldValid(JTextField jTextField) {
        return !(jTextField.getText().matches("^\\d+$")) || jTextField.getText().length() == 0;
    }

    public static boolean isIntegerTextFieldValid(JTextField jTextField) {
        return !(jTextField.getText().matches("^\\d+(\\.\\d+)*$")) || jTextField.getText().length() == 0;
    }

    public static boolean isPhoneNoTextFieldValid(JTextField jTextField) {
        return jTextField.getText().isEmpty() || !(jTextField.getText().matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$"));
    }

    public static boolean isEmailIdTextFieldValid(JTextField jTextField) {
        return jTextField.getText().isEmpty() || !(jTextField.getText().matches("^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.[a-z]{2,3}$"));
    }

    public static boolean isComboBoxValid(JComboBox jComboBox) {
        return jComboBox.getSelectedIndex() == -1;
    }

    public static boolean isValidStartDate(Date startDate, Date endDate) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 6);

        if ((startDate.compareTo(cal.getTime()) > 0 || startDate.compareTo(cal.getTime()) == 0)
                && (startDate.compareTo(endDate) < 0 || startDate.compareTo(endDate) == 0)) {
            return true;
        }
        return false;
    }

    public static boolean isValidEndDate(Date startDate, Date endDate) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 6);

        if ((endDate.compareTo(startDate) > 0 || endDate.compareTo(startDate) == 0)
                && (startDate.compareTo(cal.getTime()) > 0 || startDate.compareTo(cal.getTime()) == 0)) {
            return true;
        }

        return false;
    }

    public static boolean isValidStartDateForMaintenance(Date startDate, Date endDate) {
        Calendar cal = Calendar.getInstance();

        if ((startDate.compareTo(cal.getTime()) > 0 || startDate.compareTo(cal.getTime()) == 0)
                && (startDate.compareTo(endDate) < 0 || startDate.compareTo(endDate) == 0)) {
            return true;
        }
        return false;
    }

    public static boolean isValidEndDateForMaintenance(Date startDate, Date endDate) {
        Calendar cal = Calendar.getInstance();

        if ((endDate.compareTo(startDate) > 0 || endDate.compareTo(startDate) == 0)
                && (startDate.compareTo(cal.getTime()) > 0 || startDate.compareTo(cal.getTime()) == 0)) {
            return true;
        }

        return false;
    }
    
    public static boolean isDateTextFieldValid(JTextField jTextField) {
        return jTextField.getText().isEmpty() || !(jTextField.getText().matches("^\\s*[a-zA-Z0-9,\\s]+\\s*$"));
    }

}
