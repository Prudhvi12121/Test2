package Utilities;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;

public class GenericMethods {


    public void editSet(Browser browser, EditFieldDescription editFieldDescription, String value) {
        try {
            EditField editField = browser.describe(EditField.class, editFieldDescription);
            editField.highlight();
            editField.setValue(value);
        } catch (GeneralLeanFtException e) {
            throw new RuntimeException(e);
        }
    }

    public void editClick(Browser browser, EditFieldDescription editFieldDescription) {
        try {
            EditField editField = browser.describe(EditField.class, editFieldDescription);
            editField.highlight();
            editField.click();
        } catch (GeneralLeanFtException e) {
            throw new RuntimeException(e);
        }
    }

    public void secureEdit(Browser browser, EditFieldDescription editFieldDescription, String value) {
        try {
            EditField editField = browser.describe(EditField.class, editFieldDescription);
            editField.highlight();
            editField.setSecure(value);
        } catch (GeneralLeanFtException e) {
            throw new RuntimeException(e);
        }
    }

    public void buttonClick(Browser browser, ButtonDescription buttonDescription) {
        try {
            Button button = browser.describe(Button.class, buttonDescription);
            button.highlight();
            button.click();
        } catch (GeneralLeanFtException e) {
            throw new RuntimeException(e);
        }
    }

    public void tabSelect(Browser browser, TabStripDescription TabStripDescription, String value){
        try {
            TabStrip tabStrip = browser.describe(TabStrip.class, TabStripDescription);
            tabStrip.select(value);
        }catch (GeneralLeanFtException e){
            throw new RuntimeException(e);
        }
    }

    public void menuSelect(Browser browser, MenuDescription menuDescription, String option) {
        try {
            Menu menu = browser.describe(Menu.class, menuDescription);
            menu.highlight();
            menu.select(option);
        } catch (GeneralLeanFtException e) {
            throw new RuntimeException(e);
        }
    }

    public void webElementClick(Browser browser, WebElementDescription webElementDescription){
        try {
            WebElement element = browser.describe(WebElement.class, webElementDescription);
            element.highlight();
            element.click();
        }catch (GeneralLeanFtException e){
            throw new RuntimeException(e);
        }
    }

    public ListBox listBox(Browser browser, ListBoxDescription listBoxDescription){
        ListBox listBox;
        try {
            listBox  = browser.describe(ListBox.class, listBoxDescription);
            listBox.highlight();
        } catch (GeneralLeanFtException e) {
            throw new RuntimeException(e);
        }
        return listBox;
    }

}
