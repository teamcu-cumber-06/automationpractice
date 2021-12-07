package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "IdandPassword")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"", "123456", "An email address required."},
                {"abcd@gmail.com", "", "Password is required."},
                {"adfdfgfg", "123456", "Invalid email address."},
                {"abcd@gmail.com", "123456", "Authentication failed."},
        };
        return data;

    }

    @DataProvider(name = "validCredentials")
    public Object[][] validData() {
        Object[][] valid = new Object[][]{
                {"prime123@gmail.com", "jayati9710",}

        };
        return valid;

    }
    @DataProvider(name = "validCredential")
    public Object[][] Data() {
        Object[][] valid = new Object[][]{
                {"prime123@gmail.com", "jayati9710",}

        };
        return valid;

    }
    @DataProvider(name = "createnewaccount")
    public Object[][] info() {
        Object[][] valid = new Object[][]{
                {"primeQA1000@gmail.com","Prime","tester","123456","35 wholefood","Shrewsbury","21","01545","21","3501236565"}

        };
        return valid;

    }
    @DataProvider(name = "womenpagetest1")
    public Object[][] women() {
        Object[][] valid = new Object[][]{
                {"WOMEN"}

        };
        return valid;

    }

    @DataProvider(name = "womenpagetest2")
    public Object[][] women1() {
        Object[][] valid = new Object[][]{
                {"2","2","Product successfully added to your shopping cart"},
//                {"3","2","Product successfully added to your shopping cart"},
//                {"4","1","Product successfully added to your shopping cart"},
//                {"2","2","Product successfully added to your shopping cart"},

        };
        return valid;

    }



}
