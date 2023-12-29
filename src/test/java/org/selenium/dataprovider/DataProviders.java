package org.selenium.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name="InvalidUserCredentials")
    public Object[][] userCredentialsData(){
        Object[][] data=new Object[3][3];
        data[0][0]="praisyprasad12345@gmail.com";
        data[0][1]="Automation@202345";

        data[1][0]="praisyprasad12345@gmail.com";
        data[1][1]="Automation@2023";

        data[2][0]="praisyprasad123@gmail.com";
        data[2][1]="Automation@202345";
        return data;

    }
}
