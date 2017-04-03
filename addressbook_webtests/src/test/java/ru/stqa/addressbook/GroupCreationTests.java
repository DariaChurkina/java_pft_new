package ru.stqa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("ttt1", "ttt2", "ttt3"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
