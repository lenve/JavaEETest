package org.sang;

/**
 * Created by sang on 16-12-14.
 */
public class WindowsListService implements ListService{
    public String showListCmd() {
        return "dir";
    }
}
