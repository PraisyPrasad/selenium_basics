package utilities;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppUtility {
    public static Boolean selectValueFromRadioButton(List<WebElement> values, String valueToSelect) {
        boolean status = false;
        for (WebElement value : values) {
            String text = value.getText();
            if (text.equals(valueToSelect)) {
                value.click();
                status = WebElementUtility.isElementSelected(value);
                break;

            }
        }
        return status;
    }
    public static Boolean selectGender(List<WebElement> genderselection, String gendertext) {
        boolean status = false;
        for (WebElement maleorfemale : genderselection) {
            String text = maleorfemale.getText();
            if (text.equals(gendertext)) {
                maleorfemale.click();
                status = WebElementUtility.isElementSelected(maleorfemale);
                break;

            }
        }
        return status;
    }
}


