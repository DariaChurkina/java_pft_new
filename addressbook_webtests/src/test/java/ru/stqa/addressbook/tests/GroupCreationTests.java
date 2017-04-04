package ru.stqa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("ttt1", "ttt2", "ttt3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
