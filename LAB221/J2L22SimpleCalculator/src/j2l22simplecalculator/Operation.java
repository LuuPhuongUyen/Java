/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2l22simplecalculator;

import static java.lang.Math.sqrt;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Luu Phuong Uyen
 */
public class Operation {

    SimpleCalculator c;
    Double result = new Double("0");
    Double memoryValue = new Double("0");
    String operator = "";
    Boolean newNumber = true;

    public Operation() {
    }

    public Operation(SimpleCalculator c) {
        this.c = c;
    }

    public void MC() {
        memoryValue = new Double("0");
        newNumber = true;
    }

    public String MR() {
        result = memoryValue;
        newNumber = true;
        return (FormatNumber(memoryValue));
    }

    public void MAdd(String s) {
        if (!s.equals("Error")) {
            memoryValue += Double.parseDouble(s);
            newNumber = true;
        }
    }

    public void MSub(String s) {
        if (!s.equals("Error")) {
            memoryValue -= Double.parseDouble(s);
            newNumber = true;
        }
    }

    public String Clear() {
        newNumber = true;
        return ("0");
    }

    public String Sqrt() {
        if (result < 0) {
            return "Error";
        } else {
            result = sqrt(result);
            newNumber = true;
            return (FormatNumber(result));
        }
    }

    public String Percent() {
        result = result / 100;
        newNumber = true;
        return (FormatNumber(result));
    }

    public String Inverse() {
        if (result == 0) {
            return "Error";
        } else {
            result = 1 / result;
            newNumber = true;
            return (FormatNumber(result));
        }
    }

    public String Dot(String s) {
        if (!newNumber) {
            if (s.contains(".")) {
                return s;
            }
            return s + '.';
        } else {
            newNumber = false;
            return "0.";
        }
    }

    public String PlusMinus() {
        result = -result;
        newNumber = true;
        return (FormatNumber(result));
    }

    public String InputDigit(String text, String s) {//input digit will replace current text
        if (newNumber) {
            //after operator "=" result will be reset so that next operations won't take previous result
            if (operator.equals("=")) {
                result = 0.0;
            }
            newNumber = false;
            return (FormatNumber(new Double(s)));
        } else if (text.equals("0")) {//the input digit will replace 0 if the current text is 0
            return (FormatNumber(new Double(s)));
        } else {//add digit s to the last of text
            return (text + s);//add digit s to the last of text
        }
    }

//return interger format if input is integer
    public String FormatNumber(Double currentNum) {
        String s = currentNum.toString();
        //find dot
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '.') {
//                String newString = "";
//                int length = s.length();
//                //Delete all last useless 0 digit after dot               
//                for (int j = s.length() - 1; j > 1; j--) {
//                    if (s.charAt(j) == '0') //if last digit is 0
//                    {
//                        length = j;//update new length of s
//                    } else {//next is real number
//                        break;
//                    }
//                }
//                if (s.charAt(length - 1) == '.') { //all digit after dot is 0
//                    length--;
//                }
//                //Save new string
//                for (int j = 0; j < length; j++) {
//                    newString += s.charAt(j);
//                }
//                s = newString;
//                break;
//            }
//        }
        DecimalFormat df = new DecimalFormat("#.##########");
        df.setRoundingMode(RoundingMode.HALF_UP);
        s = df.format(Double.parseDouble(s));
        return s;
    }

    public String Calculate(String s, String opt) {
        String output = s;
        if (!newNumber) {//There is an input number
            Double num = new Double(s);
            switch (operator) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "x":
                    result *= num;
                    break;
                case "/":
                    if (num == 0) {
                        output = "Error";
                    } else {
                        result /= num;
                    }
                    break;
                default:
                    result = new Double(s);
                    break;
            }
            if (!output.equals("Error")) {
                output = FormatNumber(result);
            }
        }
        //save new result to calculate next operations
        operator = opt;
        newNumber = true;
        return output;
    }
}
