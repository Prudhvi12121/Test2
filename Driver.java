package Utilities;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;

public class Driver {

    public static Browser browser;

    public static Browser getInstance(){

        try {
            if (browser == null) {
                browser=  BrowserFactory.launch(BrowserType.CHROME);
            }
        }catch (GeneralLeanFtException exception){
            exception.getErrorCode();
        }
        return browser;
    }

}
